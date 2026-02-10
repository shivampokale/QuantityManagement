package com.apps.quantitymeasurement;

public class Length{

    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0),
        YARD(36.0),
        CM(1/2.54);

        private final double conversionFactor;
        LengthUnit(double conversionFactor){
            this.conversionFactor = conversionFactor;
        }
        public double getConversionFactor(){
            return conversionFactor;
        }
    }

    public Length(double value, LengthUnit unit){
        this.value = value;
        this.unit = unit;
    }

    // convert to inches
    double convertToBaseUnit(){
        return this.value * this.unit.getConversionFactor();
    }


    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }

    public Length convertTo(LengthUnit toUnit){

        double inches = convertToBaseUnit();
        double result = inches / toUnit.getConversionFactor();

        return new Length(result, toUnit);
    }

    public static Length demonstrateLengthConversion(Length fromUnit ,LengthUnit toUnit){
        return fromUnit.convertTo(toUnit);
    }
    @Override
    public  boolean equals(Object obj){

        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        // typecasting
        Length other = (Length) obj;
        return Double.compare(this.convertToBaseUnit(), other.convertToBaseUnit()) == 0;
    }

    public static Length addition(Length Length1, Length Length2){
        Length convertedLength2 = demonstrateLengthConversion(Length2,Length1.unit);
        double combinedValue = Length1.value + convertedLength2.value;
        return new Length(combinedValue,Length1.unit);
    }
    public static Length addition(Length length1, Length length2, LengthUnit targetUnit){
        if (length1 == null || length2 == null) {
            throw new IllegalArgumentException("Length inputs cannot be null");
        }
        if (targetUnit == null) {
            throw new IllegalArgumentException("Target unit cannot be null");
        }
        Length AdditionLength = addition(length1,length2);
        Length convertedLength = demonstrateLengthConversion(AdditionLength, targetUnit);
        return convertedLength;
    }
}

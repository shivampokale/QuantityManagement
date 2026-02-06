package com.apps.quantitymeasurement;

public class Length{

    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0),
        YARD(36.0),
        CM(0.393701);

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
    private double convertToBaseUnit(){
        return this.value * this.unit.getConversionFactor();
    }

/*    public static double convertToBaseUnit(Length source){

        if (source == null) {
            throw new IllegalArgumentException("Source Length cannot be null");
        }
        return source.value*source.unit.getConversionFactor();
    }*/

    @Override
    public String toString() {
        return String.format("%.2f %s", value, unit);
    }

    public Length convertTo(LengthUnit toUnit){

        double inches = convertToBaseUnit();
        double convertedValue=inches/toUnit.getConversionFactor();
        return new Length(convertedValue, toUnit);
    }

    public static Length demonstrateLengthConversion(Length fromUnit ,LengthUnit toUnit){
        return fromUnit.convertTo(toUnit);
    }
    @Override
    public  boolean equals(Object obj){
        boolean boolResult = false;

        if (obj == null) return false;
        if (this == obj) return true;
        if (!(obj instanceof Length)) return false;

        // typecasting
        Length val2 = (Length) obj;
        double value1 = this.convertToBaseUnit();
        double value2 = val2.convertToBaseUnit();
        int result = Double.compare(value1,value2);

        if(result == 0){
            boolResult = true;
        }
        return boolResult;
    }

    public static Length Addition(Length Length1, Length Length2){
        Length convertedLength2 = demonstrateLengthConversion(Length2,Length1.unit);
        double combinedValue = Length1.value + convertedLength2.value;
        return new Length(combinedValue,Length1.unit);
    }
}

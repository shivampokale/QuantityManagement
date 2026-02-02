package com.apps.quantitymeasurement;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0), INCHES(1.0);

        private final double conversionFactor;

        LengthUnit(double conversionFactor){
            this.conversionFactor=conversionFactor;
        }
        public double getConversionFactor(){
            return conversionFactor;
        }
    }
    public Length(double value,LengthUnit unit){
        this.value=value;
        this.unit=unit;
    }
    private double convertToBaseUnit(){
        return this.value * this.unit.getConversionFactor();
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null ||getClass()!= obj.getClass() ){
            return false;
        }
        Length other = (Length) obj;

        return Double.compare(
                this.convertToBaseUnit(),
                other.convertToBaseUnit() )==0;
    }
}
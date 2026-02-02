package com.apps.quantitymeasurement;

public class Length {
    private double value;
    private LengthUnit unit;

    public enum LengthUnit{
        FEET(12.0),
        INCHES(1.0),
        YARDS(36.0),
        CENTIMETERS(0.393701);

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
    private double convertToInches(){

        return this.value * this.unit.getConversionFactor();
    }
    public boolean compare(Length other){
        return Double.compare(
                this.convertToInches(),
                other.convertToInches() )==0;
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        if (obj == null ||getClass()!= obj.getClass() ){
            return false;
        }
        Length length = (Length) obj;
        return this.compare(length);
    }
}
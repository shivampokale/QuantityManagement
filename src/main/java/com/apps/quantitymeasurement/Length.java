package com.apps.quantitymeasurement;

public class Length{

    private final double value;
    private final LengthUnit unit;

    public Length(double value, LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }

    public enum LengthUnit {
        FEET(12.0),          // 1 foot = 12 inches
        INCHES(1.0),         // Base unit
        YARDS(36.0),         // 1 yard = 36 inches
        CENTIMETERS(0.393701); // 1 cm = 0.393701 inches

        private final double conversionFactor;
        LengthUnit(double conversionFactor) {
            this.conversionFactor = conversionFactor;
        }

        public double getConversionFactor() {
            return conversionFactor;
        }
    }

    private double convertToInches() {
        return value * unit.getConversionFactor();
    }

    public Length convertTo(LengthUnit targetUnit) {
        double inches = convertToInches();
        double convertedValue = inches / targetUnit.getConversionFactor();
        return new Length(convertedValue, targetUnit);
    }

    public boolean compare(Length other) {
        return Double.compare(
                this.convertToInches(),
                other.convertToInches() )==0;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Length length = (Length) obj;
        return this.compare(length);
    }

    public double getValue() {
        return value;
    }
    public LengthUnit getUnit() {
        return unit;
    }
}
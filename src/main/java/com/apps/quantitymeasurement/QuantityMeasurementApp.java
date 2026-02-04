package com.apps.quantitymeasurement;
import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthEquality(Length l1, Length l2) {
        return l1.equals(l2);
    }

    public static boolean demonstrateLengthComparison(
            double value1, LengthUnit unit1,
            double value2, LengthUnit unit2) {
        Length l1 = new Length(value1, unit1);
        Length l2 = new Length(value2, unit2);
        return l1.equals(l2);
    }

    public static Length demonstrateLengthConversion(
            double value, LengthUnit fromUnit, LengthUnit toUnit) {
        Length length = new Length(value, fromUnit);
        return length.convertTo(toUnit);
    }

    public static Length demonstrateLengthConversion(
            Length length, LengthUnit toUnit) {
        return length.convertTo(toUnit);
    }

    public static void main(String[] args) {
        System.out.println(
                demonstrateLengthConversion(1.0, LengthUnit.FEET, LengthUnit.INCHES)
        );
        System.out.println(
                demonstrateLengthConversion(3.0, LengthUnit.YARDS, LengthUnit.FEET)
        );
        System.out.println(
                demonstrateLengthConversion(36.0, LengthUnit.INCHES, LengthUnit.YARDS)
        );
        Length l1 = new Length(12, LengthUnit.INCHES);
        Length l2 = new Length(1, LengthUnit.FEET);
        System.out.println("Equality Check: " + demonstrateLengthEquality(l1, l2));
    }
}
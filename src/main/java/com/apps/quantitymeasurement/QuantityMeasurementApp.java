package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.Length.LengthUnit;
import static com.apps.quantitymeasurement.Length.addition;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Length len1 = new Length(100, LengthUnit.CM);
        Length len2 = new Length(36.0, LengthUnit.INCHES);

        System.out.println("Equal? " + len1.equals(len2));

        Length res = Length.demonstrateLengthConversion(len1, LengthUnit.YARD);
        System.out.println(len1.toString() + " is " + res.toString());

        System.out.println();
        System.out.println("Addition of 2 lengths:");
        Length result = addition(len1, len2);
        System.out.println("Result = " + result.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + result.toString());

        System.out.println();
        System.out.println("Addition of 2 lengths with target unit:");
        Length resultWithTargetUnit = addition(len1, len2);
        System.out.println("Result = " + resultWithTargetUnit.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + resultWithTargetUnit.toString());
    }
}
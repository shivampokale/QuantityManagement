package com.apps.quantitymeasurement;

import static com.apps.quantitymeasurement.Length.Addition;

public class QuantityMeasurementApp {

    public static void main(String[] args) {

        Length len1 = new Length(100, com.apps.quantitymeasurement.LengthUnit.CM);
        Length len2 = new Length(36.0, com.apps.quantitymeasurement.LengthUnit.Inches);

        //check if length is equal
        System.out.println("Equal? " + len1.equals(len2));

        // conversion of length unit
        Length res = Length.DemonstrateLengthConversion(len1, com.apps.quantitymeasurement.LengthUnit.YARD);
        System.out.println(len1.toString() + " is " + res.toString());

        // addition of 2 lengths
        System.out.println();
        System.out.println("Addition of 2 lengths:");
        Length result = Addition(len1, len2);
        System.out.println("Result = " + result.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + result.toString());

        // addition of 2 length with target Unit
        System.out.println();
        System.out.println("Addition of 2 lengths with target unit:");
        Length resultWithTargetUnit = Addition(len1, len2, com.apps.quantitymeasurement.LengthUnit.CM);
        System.out.println("Result = " + resultWithTargetUnit.toString());
        System.out.println(len1.toString() + " + " + len2.toString() + " is : " + resultWithTargetUnit.toString());
    }
}
package com.apps.quantitymeasurement;

import java.util.Scanner;

public class QuantityMeasurementApp {

    public static boolean demonstrateLengthComparison(
            double v1, Length.LengthUnit u1,
            double v2, Length.LengthUnit u2){
        Length l1= new Length(v1, u1);
        Length l2= new Length(v2,u2);

        return l1.equals(l2);
    }
    public static void main(String[] args) {

        System.out.println(demonstrateLengthComparison(
                1.0, Length.LengthUnit.YARDS,
                3.0, Length.LengthUnit.FEET));
        System.out.println(demonstrateLengthComparison(
                1.0, Length.LengthUnit.YARDS,
                36.0, Length.LengthUnit.INCHES));
        System.out.println(demonstrateLengthComparison(
                2.0, Length.LengthUnit.YARDS,
                2.0, Length.LengthUnit.YARDS));
        System.out.println(demonstrateLengthComparison(
                2.0, Length.LengthUnit.CENTIMETERS,
                2.0, Length.LengthUnit.CENTIMETERS));
        System.out.println(demonstrateLengthComparison(
                1.0, Length.LengthUnit.CENTIMETERS,
                0.393701, Length.LengthUnit.INCHES));

    }
}

package com.apps.quantitymeasurement;

import java.util.Scanner;

public class QuantityMeasurementApp {

    public static class Feet{
        private final double value;

        public Feet(double value){
            this.value = value;
        }
        @Override
        public boolean equals(Object obj){
           if (this == obj) {
               return true;
           }
           if (obj == null ||getClass()!= obj.getClass() ){
               return false;
           }
           Feet other = (Feet) obj;

           return Double.compare(this.value,other.value)==0;
        }
    }
    public  static class Inches{
        private final double value;

        public Inches(double value){
            this.value = value;
        }
        @Override
        public boolean equals(Object obj){
            if (this == obj) {
                return true;
            }
            if (obj == null ||getClass()!= obj.getClass() ){
                return false;
            }
            Inches other = (Inches) obj;
            return Double.compare(this.value,other.value)==0;
        }
    }
    public static void demonstrateFeetEquality(double v1, double v2){
        Feet f1= new Feet(v1);
        Feet f2= new Feet(v2);
        System.out.println(f1.equals(f2));
    }
    public static void demonstrateInchesEquality(double v1, double v2){
        Inches i1= new Inches(v1);
        Inches i2= new Inches(v2);
        System.out.println(i1.equals(i2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Feet check");
        System.out.println("2. Convert feet into inches ");
        System.out.println("3. Inches check ");
        System.out.print("Choose on: ");
        int ip= sc.nextInt();
        switch (ip){
            case 1:
            {
                System.out.println("Enter 1st value in feet: ");
                double v1= sc.nextDouble();
                System.out.println("Enter 2nd value in feet: ");
                double v2= sc.nextDouble();
                demonstrateFeetEquality(v1,v2);
                break;
            }
            case 2:
            {
                System.out.println("Enter value in feet: ");
                double v1= sc.nextDouble();
                System.out.println("Enter value in inches: ");
                double v2= sc.nextDouble();
                double convertInches= v1 * 12;
                System.out.println(convertInches == v2);
                break;
            }
            case 3:
            {
                System.out.println("Enter 1st value in Inch: ");
                double v1= sc.nextDouble();
                System.out.println("Enter 2nd value in Inch: ");
                double v2= sc.nextDouble();
                demonstrateInchesEquality(v1,v2);
                break;
            }
            default:
                System.out.println();
                break;
        }

    }
}

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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st value in feet: ");
        double value1= sc.nextDouble();
        System.out.println("Enter 2nd value in feet: ");
        double value2= sc.nextDouble();

        Feet feet1= new Feet(value1);
        Feet feet2= new Feet(value2);

        boolean result= feet1.equals(feet2);

        System.out.println(result);

    }
}

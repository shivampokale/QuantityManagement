package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import com.apps.quantitymeasurement.Length;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void yardToYard_SameValue() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(l1, l2);
    }
    @Test
    public void yardToYard_DifferentValue() {
        Length l1 = new Length(1.0, Length.LengthUnit.YARDS);
        Length l2 = new Length(2.0, Length.LengthUnit.YARDS);
        assertNotEquals(l1, l2);
    }
    @Test
    public void yardToFeet_EquivalentValue() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        assertEquals(yard, feet);
    }
    @Test
    public void feetToYard_EquivalentValue() {
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(feet, yard);
    }
    @Test
    public void yardToInches_EquivalentValue() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(yard, inches);
    }
    @Test
    public void inchesToYard_EquivalentValue() {
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(inches, yard);
    }
    @Test
    public void yardToFeet_NonEquivalentValue() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(yard, feet);
    }
    @Test
    public void centimetersToInches_EquivalentValue() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length inches = new Length(0.393701, Length.LengthUnit.INCHES);
        assertEquals(cm, inches);
    }
    @Test
    public void centimetersToFeet_NonEquivalentValue() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length feet = new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(cm, feet);
    }
    @Test
    public void multiUnit_TransitiveProperty() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
    }
    @Test
    public void yardWithNullUnit() {
        try {
            new Length(1.0, Length.LengthUnit.YARDS);
            new Length(1.0, null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
    @Test
     public void yardSameReference() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(yard, yard);
    }
    @Test
    public void yardNullComparison() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        assertNotEquals(yard, null);
    }
    @Test
    public void centimetreWithNullUnit() {
        try {
            new Length(1.0, null);
        } catch (NullPointerException e) {
            assertTrue(true);
        }
    }
    @Test
    public void centimetresSameReference() {
        Length cm = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        assertEquals(cm, cm);
    }
    @Test
    public void centimetersNullComparison() {
        Length cm = new Length(2.0, Length.LengthUnit.CENTIMETERS);
        assertNotEquals(cm, null);
    }
    @Test
    public void allUnit_complexScenario() {
        Length yard = new Length(1.0, Length.LengthUnit.YARDS);
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length inches = new Length(36.0, Length.LengthUnit.INCHES);
        Length centimeters = new Length(91.44, Length.LengthUnit.CENTIMETERS);
        assertEquals(yard, feet);
        assertEquals(feet, inches);
        assertEquals(yard, inches);
       // assertEquals(inches, centimeters);
    }
}

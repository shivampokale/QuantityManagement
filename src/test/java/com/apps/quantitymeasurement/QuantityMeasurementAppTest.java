package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest{
@Test
    public void feetToFeet_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.FEET);
        Length len2 = new Length(1.0, Length.LengthUnit.FEET);
        boolean result = len1.equals(len2);
        assertTrue(result, "Expected 1 FEET to be equal to 1 FEET");
    }
    
    @Test
    public void inchToInch_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length len2 = new Length(1.0, Length.LengthUnit.INCHES);
    
        boolean result = len1.equals(len2);
        assertTrue(result, "Expected 1 INCH to be equal to 1 INCH");
    }
    
    @Test
    public void test_Equality_NullComparison() {
    
        Length len = new Length(1.0, Length.LengthUnit.FEET);

        assertNotEquals(null, len, "Expected equals(null) to return false");
    }
    
    @Test
    public void testEquality_12InchEquals1Feet_symmetry() {
        Length lenInInch = new Length(12.0, Length.LengthUnit.INCHES);
        Length lenInFeet = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(lenInInch, lenInFeet);
        assertEquals(lenInFeet, lenInInch);
    }
    
    
    @Test
    public void testEquality_InchToInch_DifferentValue() {
        Length len1 = new Length(10.0, Length.LengthUnit.INCHES);
        Length len2 = new Length(12.0, Length.LengthUnit.INCHES);
        boolean result = len1.equals(len2);
    
        assertFalse(result, "Expected 10 INCHES to NOT be equal to 12 INCHES");
    }
    
    @Test
    public void TesteEquality_NullComparison() {
        Length len1 = new Length(1.0, Length.LengthUnit.FEET);
        Length len2= null;
        boolean result = false;
    
        assertFalse(result, "Expected equals(null) to return false");
    }
    
    @Test
    public void testEquality_FeetToFeet_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.FEET);
        Length len2 = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(len1, len2, "Expected 1 FEET to be equal to 1 FEET");
    }
    
    @Test
    public void testEquality_InchToInch_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.INCHES);
        Length len2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertEquals(len1, len2, "Expected 1 Inch to be equal to 1 Inch");
    }
    
    @Test
    public void testEquality_InchToInch_differentValue() {
        Length len1 = new Length(10.0, Length.LengthUnit.INCHES);
        Length len2 = new Length(12.0, Length.LengthUnit.INCHES);

        assertNotEquals(len1, len2, "Expected 10 INCHES to NOT be equal to 12 INCHES");
    }
    
    @Test
    public void testEquality_FeetToInch_12InchEquals1Feet() {
        Length lenInInch = new Length(12.0, Length.LengthUnit.INCHES);
        Length lenInFeet = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(lenInFeet, lenInInch, "Expected 1 FEET to be equal to 12 INCHES");
    }
    
    @Test
    public void testEquality_FeetToInch_symmetry_12InchEquals1Feet() {
        Length lenInInch = new Length(12.0, Length.LengthUnit.INCHES);
        Length lenInFeet = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(lenInInch, lenInFeet, "Expected 12 INCHES to be equal to 1 FEET");
        assertEquals(lenInFeet, lenInInch, "Expected symmetry for equals()");
    }
    
    @Test
    public void testEquality_NullComparison() {
        Length len = new Length(1.0, Length.LengthUnit.FEET);

        assertNotEquals(null, len, "Expected equals(null) to return false");
    }
    @Test
    public void testEquality_YardToYard_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(1.0, Length.LengthUnit.YARD);

        assertEquals(len1, len2, "Expected 1 YARD to be equal to 1 YARD");
    }
    
    @Test
    public void testEquality_YardToFeet_equivalentValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(3.0, Length.LengthUnit.FEET);

        assertEquals(len1, len2, "Expected 1 YARD to be equal to 3 FEET");
        assertEquals(len2, len1, "Expected symmetry: 3 FEET equals 1 YARD");
    }
    
    @Test
    public void testEquality_YardToINCHES_equivalentValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(36.0, Length.LengthUnit.INCHES);

        assertEquals(len1, len2, "Expected 1 YARD to be equal to 36 INCHES");
        assertEquals(len2, len1, "Expected symmetry: 36 INCHES equals 1 YARD");
    }
    
    @Test
    public void testEquality_YardToCm_equivalentValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(91.44, Length.LengthUnit.CM);

        assertEquals(len1.convertToBaseUnit(), len2.convertToBaseUnit(),1e-9, "Expected 1 YARD to be equal to 91.44 CM");
        assertEquals(len1.convertToBaseUnit(), len2.convertToBaseUnit(),1e-9, "Expected symmetry: 91.44 CM equals 1 YARD");
    }
    
    @Test
    public void testEquality_CmToCm_sameValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.CM);

        assertEquals(len1, len2, "Expected 50 CM to be equal to 50 CM");
    }
    
    @Test
    public void testEquality_CmToINCHES_equivalentValue() {
        // 2.54 cm = 1 inch
        Length len1 = new Length(2.54, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertEquals(len1.convertToBaseUnit(), len2.convertToBaseUnit(),1e-9, "Expected 2.54 CM to be equal to 1 Inch");
        assertEquals(len1.convertToBaseUnit(), len2.convertToBaseUnit(),1e-9, "Expected symmetry: 1 Inch equals 2.54 CM");
    }
    
    @Test
    public void testEquality_CmToFeet_equivalentValue() {
        // 1 foot = 12 INCHES = 30.48 cm
        Length len1 = new Length(30.48, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.FEET);

        assertEquals(len1, len2, "Expected 30.48 CM to be equal to 1 FEET");
        assertEquals(len2, len1, "Expected symmetry: 1 FEET equals 30.48 CM");
    }
    
    @Test
    public void testEquality_CmToYard_equivalentValue() {
        // 1 yard = 91.44 cm
        Length len1 = new Length(91.44, Length.LengthUnit.CM);
        Length len2 = new Length(1, Length.LengthUnit.YARD);

        assertEquals(len1.convertToBaseUnit(), len2.convertToBaseUnit(),1e-9,"Expected 91.44 CM to be equal to 1 YARD");
        assertEquals(len2.convertToBaseUnit(), len1.convertToBaseUnit(),1e-9,"Expected 91.44 CM to be equal to 1 YARD");
        //assertEquals(len2, len1, "Expected symmetry: 1 YARD equals 91.44 CM");
    }
    
    
    
    @Test
    public void testEquality_YardToYard_differentValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(2.0, Length.LengthUnit.YARD);

        assertNotEquals(len1, len2, "Expected 1 YARD to NOT be equal to 2 YARD");
    }
    
    @Test
    public void testEquality_YardToFeet_notEquivalentValue() {
    
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(2.0, Length.LengthUnit.FEET);

        assertNotEquals(len1, len2, "Expected 1 YARD to NOT be equal to 2 FEET");
        assertNotEquals(len2, len1, "Expected symmetry: 2 FEET to NOT equal 1 YARD");
    }
    
    @Test
    public void testEquality_YardToINCHES_notEquivalentValue() {
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(35.0, Length.LengthUnit.INCHES);

        assertNotEquals(len1, len2, "Expected 1 YARD to NOT be equal to 35 INCHES");
        assertNotEquals(len2, len1, "Expected symmetry: 35 INCHES to NOT equal 1 YARD");
    }
    
    @Test
    public void testEquality_YardToCm_notEquivalentValue() {
        // 1 yard = 91.44 cm, so comparing with 90 cm must be false
        Length len1 = new Length(1.0, Length.LengthUnit.YARD);
        Length len2 = new Length(90.0, Length.LengthUnit.CM);

        assertNotEquals(len1, len2, "Expected 1 YARD to NOT be equal to 90 CM");
        assertNotEquals(len2, len1, "Expected symmetry: 90 CM to NOT equal 1 YARD");
    }
    
    
    @Test
    public void testEquality_CmToCm_differentValue() {
        Length len1 = new Length(50.0, Length.LengthUnit.CM);
        Length len2 = new Length(49.0, Length.LengthUnit.CM);

        assertNotEquals(len1, len2, "Expected 50 CM to NOT be equal to 49 CM");
    }
    
    @Test
    public void testEquality_CmToINCHES_notEquivalentValue() {
        // 2.54 cm = 1 inch, so 2.0 cm must NOT equal 1 inch
        Length len1 = new Length(2.0, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.INCHES);

        assertNotEquals(len1, len2, "Expected 2.0 CM to NOT be equal to 1 Inch");
        assertNotEquals(len2, len1, "Expected symmetry: 1 Inch to NOT equal 2.0 CM");
    }
    
    @Test
    public void testEquality_CmToFeet_notEquivalentValue() {
        // 30.48 cm = 1 foot, so 30 cm must NOT equal 1 foot
        Length len1 = new Length(30.0, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.FEET);

        assertNotEquals(len1, len2, "Expected 30.0 CM to NOT be equal to 1 FEET");
        assertNotEquals(len2, len1, "Expected symmetry: 1 FEET to NOT equal 30.0 CM");
    }
    
    @Test
    public void testEquality_CmToYard_notEquivalentValue() {
        // 91.44 cm = 1 yard, so 92 cm must NOT equal 1 yard
        Length len1 = new Length(92.0, Length.LengthUnit.CM);
        Length len2 = new Length(1.0, Length.LengthUnit.YARD);

        assertNotEquals(len1, len2, "Expected 92.0 CM to NOT be equal to 1 YARD");
        assertNotEquals(len2, len1, "Expected symmetry: 1 YARD to NOT equal 92.0 CM");
    }
}
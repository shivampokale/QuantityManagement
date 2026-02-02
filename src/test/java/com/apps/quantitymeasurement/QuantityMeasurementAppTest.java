package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import com.apps.quantitymeasurement.Length;

import static org.junit.jupiter.api.Assertions.*;

public class QuantityMeasurementAppTest {

    @Test
    public void testFeetToFeet_SameValue(){
        Length l1=new Length(1.0, Length.LengthUnit.FEET);
        Length l2=new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(l1, l2);
    }
    @Test
    public void testInchesToInches_SameValue(){
        Length i1=new Length(1.0, Length.LengthUnit.INCHES);
        Length i2=new Length(1.0, Length.LengthUnit.INCHES);
        assertEquals(i1, i2);
    }
    @Test
    public void testFeetToInches_EquivalentValue(){
        Length l1=new Length(1.0, Length.LengthUnit.FEET);
        Length l2=new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(l1, l2);
    }

    @Test
    public void testFeetToFeet_DifferentValue(){
        Length l1=new Length(1.0, Length.LengthUnit.FEET);
        Length l2=new Length(2.0, Length.LengthUnit.FEET);
        assertNotEquals(l1, l2);
    }
    @Test
    public void testInchesToInches_DifferentValue(){
        Length i1=new Length(1.0, Length.LengthUnit.INCHES);
        Length i2=new Length(2.0, Length.LengthUnit.INCHES);
        assertNotEquals(i1, i2);
    }

    @Test
    public void testNullComparison(){
        Length feet=new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals(null, feet);
    }

    @Test
    public void testLengthEquality_NonNumericInput(){
        Length feet=new Length(1.0, Length.LengthUnit.FEET);
        assertNotEquals("one", feet);
    }

    @Test
    public void testSameReferance(){
        Length feet=new Length(1.0, Length.LengthUnit.FEET);
        assertEquals(feet, feet);
    }

}

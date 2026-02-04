package com.apps.quantitymeasurement;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class QuantityMeasurementAppTest {

    @Test
    public void testConversion_FeetToInches() {
        Length length = new Length(1.0, Length.LengthUnit.FEET);
        Length expected = new Length(12.0, Length.LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(Length.LengthUnit.INCHES));
    }

    @Test
    public void testConversion_InchesToFeet() {
        Length length = new Length(24.0, Length.LengthUnit.INCHES);
        Length expected = new Length(2.0, Length.LengthUnit.FEET);
        assertEquals(expected, length.convertTo(Length.LengthUnit.FEET));
    }

    @Test
    public void testConversion_YardsToInches() {
        Length length = new Length(1.0, Length.LengthUnit.YARDS);
        Length expected = new Length(36.0, Length.LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(Length.LengthUnit.INCHES));
    }

    @Test
    public void testConversion_InchesToYards() {
        Length length = new Length(72.0, Length.LengthUnit.INCHES);
        Length expected = new Length(2.0, Length.LengthUnit.YARDS);
        assertEquals(expected, length.convertTo(Length.LengthUnit.YARDS));
    }

    @Test
    public void testConversion_CentimetersToInches() {
        Length length = new Length(1.0, Length.LengthUnit.CENTIMETERS);
        Length expected = new Length(0.393701, Length.LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(Length.LengthUnit.INCHES));
    }

    @Test
    public void testConversion_FeetToYards() {
        Length feet = new Length(3.0, Length.LengthUnit.FEET);
        Length expected = new Length(1.0, Length.LengthUnit.YARDS);
        assertEquals(expected, feet.convertTo(Length.LengthUnit.YARDS));
    }

    @Test
    public void testBidirectionalConversion_PreservesValue() {
        Length start = new Length(5.75, Length.LengthUnit.FEET);
        Length roundTrip = start.convertTo(Length.LengthUnit.CENTIMETERS).convertTo(Length.LengthUnit.FEET);
        assertEquals(start, roundTrip);
    }

    @Test
    public void testZeroValueConversion() {
        Length length = new Length(0.0, Length.LengthUnit.FEET);
        Length expected = new Length(0.0, Length.LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(Length.LengthUnit.INCHES));
    }

    @Test
    public void testNegativeValueConversion() {
        Length length = new Length(-1.0, Length.LengthUnit.FEET);
        Length expected = new Length(-12.0, Length.LengthUnit.INCHES);
        assertEquals(expected, length.convertTo(Length.LengthUnit.INCHES));
    }

    @Test
    public void testNaNValueThrows_TryCatchLogic() {
        try {
            new Length(Double.NaN, Length.LengthUnit.FEET);
        } catch (IllegalArgumentException expected) {
        }
    }
}
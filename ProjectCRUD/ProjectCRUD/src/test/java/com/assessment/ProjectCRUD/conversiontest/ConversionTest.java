package com.assessment.ProjectCRUD.conversiontest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.assessment.ProjectCRUD.junit.Conversion;

public class ConversionTest {
	@Test

	public void testTempCoversion() throws Throwable {
// Given
		Conversion underTest = new Conversion();
// When
		double temperature = 80.0d;
		String unit = "";
		double result = underTest.tempConversion(temperature, unit);
// Then
		assertEquals(176.0d, result);
	}
}
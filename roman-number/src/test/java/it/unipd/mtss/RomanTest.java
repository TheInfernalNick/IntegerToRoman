package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RomanTest{

  @Test
  public void testConversion() {
    IntegerToRoman itr = new IntegerToRoman();

    String converted999 = itr.convert(999);
    assertEquals("cmxcix", converted999);

    String converted4 = itr.convert(4);
    assertEquals("iv", converted4);
  }
}
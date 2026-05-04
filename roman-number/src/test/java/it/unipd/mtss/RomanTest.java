package it.unipd.mtss;

import org.junit.Test;
import java.util.Map;
import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RomanTest{

  @Test
  public void testConversion() {
    IntegerToRoman itr = new IntegerToRoman();

    String converted3999 = itr.convert(3999);
    assertEquals("mmmcmxcix", converted3999);

    String converted999 = itr.convert(999);
    assertEquals("cmxcix", converted999);

    String converted650 = itr.convert(650);
    assertEquals("dcl", converted650);

    String converted451 = itr.convert(451);
    assertEquals("cdli", converted451);

    String converted42 = itr.convert(42);
    assertEquals("xlii", converted42);

    String converted4 = itr.convert(4);
    assertEquals("iv", converted4);

    String error = itr.convert(0);
    assertEquals("error", error);
  }

  @Test
  public void testPrint(){
    RomanPrinter rp = new RomanPrinter();

    Map<String,String> TestOutput = new HashMap<>();
    TestOutput.put("i","  _____ \n |_   _|\n   | |  \n   | |  \n  _| |_ \n |_____|");
    String out = rp.print(1);
    assertEquals(TestOutput.get("i"),out);     

    TestOutput.put("v","  __      __ \n  \\ \\    / / \n   \\ \\  / /  \n    \\ \\/ /   \n     \\  /    \n      \\/     ");                 
    out = rp.print(5);
    assertEquals(TestOutput.get("v"),out); 

    TestOutput.put("x","  __   __ \n  \\ \\ / / \n   \\ V /  \n    > <   \n   / . \\  \n  /_/ \\_\\ ");                 
    out = rp.print(10);
    assertEquals(TestOutput.get("x"),out); 

    TestOutput.put("l","  _      \n | |     \n | |     \n | |     \n | |___  \n |_____| ");                 
    out = rp.print(50);
    assertEquals(TestOutput.get("l"),out); 

    TestOutput.put("c","   _____   \n  / ____|  \n | |       \n | |       \n | |____   \n  \\_____|  ");                 
    out = rp.print(100);
    assertEquals(TestOutput.get("c"),out); 

    TestOutput.put("d","  _____   \n | __  \\  \n | |  | | \n | |  | | \n | |__| | \n |_____/  ");                 
    out = rp.print(500);
    assertEquals(TestOutput.get("d"),out); 

    TestOutput.put("m","  __  __  \n |  \\/  | \n | \\  / | \n | |\\/| | \n | |  | | \n |_|  |_| ");                 
    out = rp.print(1000);
    assertEquals(TestOutput.get("m"),out); 

  }
}
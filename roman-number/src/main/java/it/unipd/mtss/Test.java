import static org.junit.Assert.assertEquals;
import org.junit.Test;

class Test{
    @Test
    void testConversion(){
        IntegerToRoman itr = new IntegerToRoman();
        String converted = itr.convert(999);
        assertEquals("cmxcix", converted);
        String converted = itr.convert(4);
        assertEquals("iv", converted);
    }
}
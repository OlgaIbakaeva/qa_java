package testsClassFeline;

import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassFelineMethodGetKittensWithoutParameters {

    @Test
    public void testMethodGetKittensWithoutParameters() {
        Feline feline = new Feline();
        assertEquals(1,feline.getKittens());
        System.out.println("Если параметр не задан, в кошачьем семействе " + feline.getKittens() + " котёнок");
    }
}


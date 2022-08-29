package testsclassfeline;

import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassFelineMethodGetKittensWithoutParameters {

    @Test
    public void testMethodGetKittensWithoutParameters() {
        Feline feline = new Feline();
        assertEquals(1,feline.getKittens());
    }
}


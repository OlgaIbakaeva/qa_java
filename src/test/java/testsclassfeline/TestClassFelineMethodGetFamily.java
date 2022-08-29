package testsclassfeline;

import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestClassFelineMethodGetFamily {

    @Test
    public void testMethodGetFamily() throws Exception {
        Feline feline = new Feline();
        if (!(feline.getFamily().equals("Кошачьи"))) {
            throw new Exception();
        }
    }
}

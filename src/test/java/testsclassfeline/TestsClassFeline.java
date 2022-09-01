package testsclassfeline;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.List;

public class TestsClassFeline {

    @Test
    public void testMethodGetKittensWithoutParameters() {
        Feline feline = new Feline();
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void testMethodGetFamily() throws Exception {
        Feline feline = new Feline();
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testMethodEatMeat() throws Exception {
        Feline feline = new Feline();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

    @Test(expected = Exception.class)
    public  void TestMethodGetFoodException() throws Exception {
        Feline feline = new Feline();
        try {
            feline.getFood("Не определено");
        } catch (Exception exception) {
            throw new Exception();
        }
    }
}


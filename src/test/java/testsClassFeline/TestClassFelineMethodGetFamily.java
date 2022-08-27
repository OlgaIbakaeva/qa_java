package testsClassFeline;

import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassFelineMethodGetFamily {

    @Test
    public void testMethodGetFamily() throws Exception {
        Feline feline = new Feline();
        System.out.println("Проверка метода getFamily(), возвращает название класса  " + feline.getFamily());
        assertEquals("Кошачьи", feline.getFamily());
        if (feline.getFamily() != "Кошачьи") {
            throw new Exception();
        }
    }
}

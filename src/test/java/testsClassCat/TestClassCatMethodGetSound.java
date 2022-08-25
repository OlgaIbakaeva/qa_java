package testsClassCat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClassCatMethodGetSound {
    @Mock
    Feline feline;

    @Test
    public void testMethodGetSound() {
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
        System.out.println("Кошка говорит " + cat.getSound());
    }
}

package testsClassCat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestClassCatMethodGetFood {
    @Mock
    Feline feline;

    @Test
    public void testMethodGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println("Кошка питается, как хищник: " + cat.getFood());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
        if (cat.getFood() == null) {
            throw new Exception();
        }
    }
}
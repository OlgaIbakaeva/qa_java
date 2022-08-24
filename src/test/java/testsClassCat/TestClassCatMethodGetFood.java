package testsClassCat;

import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestClassCatMethodGetFood {
    @Mock
    Feline feline;

    @Test
    public void testMethodGetFood() throws Exception {
        Cat cat = new Cat(feline);
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Рыбы", "Птицы"));
        System.out.println("Кошка питается, как хищник: " + cat.getFood());
    }
}

package testsclasscat;

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
        // Заглушка метода eatMeat() из родительского класса feline
        Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        // Проверка, что метод cat.getFood() возвращает нужный список еды
        if (!(cat.getFood().equals(List.of("Животные", "Птицы", "Рыба")))) {
            throw new Exception();
        }
    }
}
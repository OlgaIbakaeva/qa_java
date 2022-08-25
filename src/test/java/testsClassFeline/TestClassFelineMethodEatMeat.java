package testsClassFeline;

import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestClassFelineMethodEatMeat {

    @Mock
    Animal feline;

    @Test
    public void testMethodEatMeat() throws Exception {
        System.out.println("Мок feline в методе getFood " + feline.getFood("Хищник"));
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        System.out.println("Заглушка метода getFood " + feline.getFood("Хищник"));
        Feline feline = new Feline();
        System.out.println("Проверка возвращаемой строки метода eatMeat() " + feline.eatMeat());
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
        if (feline.eatMeat() == null) {
            throw new Exception();
        }
    }
}

package testsclassfeline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestClassFelineMethodEatMeat {

    @Test
    public void testMethodEatMeat() throws Exception {
        Feline feline = new Feline();
        if (!(feline.eatMeat().equals(List.of("Животные", "Птицы", "Рыба")))) {
            throw new Exception();
        }
    }
}

package testsclasslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TestClassLionMethodGetFood {

    @Mock
    Feline feline;

    @Test
    public void TestMethodGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        if (!(lion.getFood().equals(List.of("Животные", "Птицы", "Рыба")))) {
            throw new Exception();
        }
    }
}

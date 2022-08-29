package testsclasslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClassLionMethodGetKittens {

    @Mock
    Feline feline;

    @Test
    public void TestMethodGetKittens() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        if (lion.getKittens() != 1) {
            throw new Exception();
        }
    }
}

package testsClassFeline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class TestClassFelineMethodGetKittensWithParameterVerify {

    @Mock
    Feline feline;

    @Test
    public void TestMethodGetKittensWithParameterVerify() {
        feline.getKittens(5);
        Mockito.verify(feline, Mockito.times(1)).getKittens(Mockito.anyInt());
        System.out.println("Метод getKittens(int i) вызывается с любым целым параметром и выполняется 1 раз");
    }

}

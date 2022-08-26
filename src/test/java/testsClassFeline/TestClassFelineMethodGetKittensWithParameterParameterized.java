package testsClassFeline;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestClassFelineMethodGetKittensWithParameterParameterized {

    private final int checkedNumber;
    private final int expectedNumber;

    public TestClassFelineMethodGetKittensWithParameterParameterized(int checkedNumber, int expectedNumber) {
        this.checkedNumber = checkedNumber;
        this.expectedNumber = expectedNumber;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {5, 5},
                {0, 0},
                {100, 100},
                {-1, -1},
                {-100, -100}
        };
    }

    @Test
    public void TestMethodGetKittensWithParameterParameterized() {
        Feline feline = new Feline();
        assertEquals(expectedNumber,feline.getKittens(checkedNumber));
        System.out.println("При параметре " + feline.getKittens(checkedNumber) + " в семействе кошачьих " + expectedNumber + " котят");
    }
}

package testsclasslion;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestClassLionMethodDoesHaveManeParameterized {

    private final String checkedSex;
    private final boolean expectedIs;

    public TestClassLionMethodDoesHaveManeParameterized(String checkedSex, boolean expectedIs) {
        this.checkedSex = checkedSex;
        this.expectedIs = expectedIs;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public  void TestMethodDoesHaveManeParameterized() throws Exception {
        Feline feline = new Feline();
        Lion lion = new Lion(checkedSex, feline);
        if (lion.doesHaveMane() != expectedIs) {
            throw new Exception();
        }
    }
}

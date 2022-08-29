package testsclassanimal;

import com.example.Animal;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import java.util.List;

@RunWith(Parameterized.class)
public class TestClassAnimalMethodGetFoodParameterized {

    private final String checkedAnimalKind;
    private final List<String> expectedListFood;

    public TestClassAnimalMethodGetFoodParameterized(String checkedAnimalKind, List<String> expectedListFood) {
        this.checkedAnimalKind = checkedAnimalKind;
        this.expectedListFood = expectedListFood;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }

    @Test
    public void TestMethodGetFoodParameterized() throws Exception {
        Animal animal = new Animal();
        assertEquals(expectedListFood, animal.getFood(checkedAnimalKind));
    }
}


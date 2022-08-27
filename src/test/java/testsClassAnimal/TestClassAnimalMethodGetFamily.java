package testsClassAnimal;

import com.example.Animal;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestClassAnimalMethodGetFamily {

    @Test
    public void testMethodGetSound() {
        Animal animal = new Animal();
        assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
        System.out.println(animal.getFamily());
    }
}

import com.example.Animal;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void testGetFoodHerbivore() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = List.of("Трава", "Различные растения");
        List<String> actualFood = animal.getFood("Травоядное");
        assertEquals(expectedFood, actualFood);
    }

    @Test
    public void testGetFoodCarnivore() throws Exception {
        Animal animal = new Animal();
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = animal.getFood("Хищник");
        assertEquals(expectedFood, actualFood);
    }

    @Test(expected = Exception.class)
    public void testGetFoodUnknown() throws Exception {
        Animal animal = new Animal();
        animal.getFood("Unknown");
    }

    @Test
    public void testGetFamily() {
        Animal animal = new Animal();
        String expectedFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualFamily = animal.getFamily();
        assertEquals(expectedFamily, actualFamily);
    }
}
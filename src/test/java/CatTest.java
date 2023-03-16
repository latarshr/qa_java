import com.example.Cat;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Predator predator;
    @Test
    public void getSoundCat(){
        Cat cat = new Cat(predator);
        String actualSound = "Мяу";
        assertEquals(cat.getSound(),actualSound);
    }
    @Test
    public void getFoodTest() throws Exception{
        Cat cat = new Cat(predator);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualFood = cat.getFood();
        assertEquals(expectedFood, actualFood);
    }
}
import com.example.Lion;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionParamsTest {
    @Mock
    Predator predator;
    @Test
    public void getFamilyLion() throws Exception {
        Lion lion = new Lion("Самец", predator);
        String actualFamily = "Кошачьи";
        assertEquals(lion.getFamily(), actualFamily);
    }
    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самка", predator);
        int actualKittens = 1;
        assertEquals(actualKittens, lion.getKittens());
    }
    @Test
    public void getFoodTest()throws Exception{
        Lion lion = new Lion("Самец", predator);
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(predator.eatMeat()).thenReturn(expectedMeat);
        List<String> actualMeat = lion.getFood();
        assertEquals(expectedMeat, actualMeat);
    }
}
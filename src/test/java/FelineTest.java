import com.example.Animal;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    Animal animal;
    @Test
    public void getFamilyFeline(){
        Feline feline = new Feline(animal);
        String actualFamily = "Кошачьи";
        assertEquals( feline.getFamily(),actualFamily);
    }
    @Test
    public void eatMeatTest()throws Exception{
        Feline feline = new Feline(animal);
        List<String> expectedMeat = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(animal.getFood("Хищник")).thenReturn(expectedMeat);
        List<String> actualMeat = feline.eatMeat();
        assertEquals(expectedMeat, actualMeat);
    }
    @Test
    public void getKittensTest(){
        Feline feline = new Feline(animal);
        int actualKittens = 1;
        assertEquals(actualKittens, feline.getKittens());
    }
}
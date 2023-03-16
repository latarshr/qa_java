import com.example.Animal;
import com.example.Feline;
import com.example.Lion;
import com.example.Predator;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;




import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)

public class LionTest {
    @Mock
    Predator predator;
    @Mock
    Animal animal;
    Lion lion;
    Feline feline;@Before
    public void setUp() throws Exception {
        when(animal.getFood(Mockito.anyString())).thenReturn(List.of("meat"));
        feline = new Feline(animal);
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getKittens_withDefaultCount_returns1() {
        assertEquals(1, lion.getKittens());
    }

    @Test
    public void getKittens_withGivenCount_returnsGivenCount() {
        assertEquals(3, lion.getKittens(3));
    }

    @Test
    public void getFood_returnsMeat() throws Exception {
        assertEquals(List.of("meat"), lion.getFood());
    }

    @Test(expected = Exception.class)
    public void constructor_withInvalidSex_throwsException() throws Exception {
        Lion invalidLion = new Lion("InvalidSex", feline);
    }

    @Test
    public void getFamily_returnsFelineFamily() {
        assertEquals("Кошачьи", lion.getFamily());
    }
}
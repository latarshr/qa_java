import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionParamsTest {
    private final String sexTest;
    private final boolean hasManeTest;

    @Mock
    Feline feline;

    public LionParamsTest(String sexTest, boolean hasManeTest){
        this.sexTest = sexTest;
        this.hasManeTest = hasManeTest;
    }
    @Parameterized.Parameters
    public static Object [][] LionParams(){
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }
    @Test
    public void LionSexTest()throws Exception{
        Lion lion = new Lion(sexTest,feline);
        Assert.assertEquals(hasManeTest, lion.doesHaveMane());
    }
}

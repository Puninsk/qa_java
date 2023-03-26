import com.example.Feline;
import org.junit.Test;
import com.example.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    @Test
    public void testCatFood() throws Exception {
        Feline feline = new Feline();
        Cat cat = new Cat(feline);
        System.out.println(cat.getFood());
    }

    @Mock
    Cat cat;
    @Test
    public void testCatSound() {
        Mockito.when(cat.getSound()).thenReturn("Мяу");
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        assertEquals(expectedResult, actualResult);
    }
}

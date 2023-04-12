import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import com.example.*;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class TestCat {

    static Feline feline;

    @Before
    public void createFelineObjectForTestCat() {
        feline = new Feline();
    }

    @Test
    public void testCatFood() throws Exception {
        Cat cat = new Cat(feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = cat.getFood();
        assertEquals(expectedResult, actualResult);
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

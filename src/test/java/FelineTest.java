import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

   private Feline feline;

    @Before
    public void createFelineObject() {
        feline = new Feline();
    }
    @Test
    public void testFelineEatMeat() throws Exception {
        List<String> actualResult = feline.eatMeat();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFelineFood() throws Exception {
        List<String> actualResult = feline.getFood();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFelineFamily() {
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testKittenNumbers() {
        int expectedKittensNumber = 1;
        int actualKittensNumber = feline.getKittens();
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

    @Test
    public void testKittenNumbersTwo() {
        int expectedKittensNumber = 2;
        int actualKittensNumber = feline.getKittens(2);
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

}

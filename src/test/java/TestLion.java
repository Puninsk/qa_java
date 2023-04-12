import com.example.*;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {
    private final String sex;
    static Feline feline;

    public TestLion(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @BeforeClass
    public static void createFelineObjectForTest() {
        feline = new Feline();
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLionForDifferentSexes() throws InterruptedException {
        Lion lion = new Lion(sex, feline);
     boolean expectedResult;
     if (sex == "Самец") {
           expectedResult = true;
      }
     else  {
          expectedResult = false;
     }
       boolean actualResult = lion.doesHaveMane();
       assertEquals(expectedResult, actualResult);
    }

    @Test(expected = InterruptedException.class)
    public void testLionForSexNegative() throws InterruptedException {
        Lion lion = new Lion("Неизвестно", feline);
    }

    @Test
    public void testLionFamily() throws InterruptedException {
        Lion lion = new Lion(sex, feline);
        String expectedResult = "Кошачьи";
        String actualResult = lion.getFamily();
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testgetKittensNumberDefault() throws InterruptedException {
        Lion lion = new Lion(sex, feline);
        int expectedResult = 1;
        int actualResult = lion.getKittensNumber();
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testgetKittensNumberTwo() throws InterruptedException {
        Lion lion = new Lion(sex, feline);
        int expectedKittensNumber = 2;
        int actualKittensNumber = lion.getKittensNumber(2);
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

    @Test
    public void testLionFood() throws Exception {
        Lion lion = new Lion(sex, feline);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = lion.getFood();
        assertEquals(expectedResult, actualResult);
    }

}


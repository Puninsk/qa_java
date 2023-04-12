import com.example.Animal;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestAnimal {
    private final String animalKind;
    private Animal animal;

    public TestAnimal(String animalKind) {
        this.animalKind = animalKind;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalKind() {
        return new Object[][]{
                {"Хищник"},
                {"Травоядное"},
        };
        }
    @Before
    public void createObjectAnimal() {
        animal = new Animal();
    }
    @Test
    public void testFoodForDifferentFamilies() throws Exception {
        List<String> expectedResult;
        if (animalKind == "Хищник") {
            expectedResult = List.of("Животные", "Птицы", "Рыба");
        }
        else  {
            expectedResult = List.of("Трава", "Различные растения");
        }
        List<String> actualResult = animal.getFood(animalKind);
        assertEquals(expectedResult, actualResult);
    }

    @Test(expected = InterruptedException.class)
    public void testLionForSexNegative() throws InterruptedException {
        System.out.println(animal.getFood("Неизвестно"));
    }

    @Test
    public void testAnimalFamiily() {
        String expectedResult = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
        String actualResult = animal.getFamily();
        assertEquals(expectedResult, actualResult);
    }
}

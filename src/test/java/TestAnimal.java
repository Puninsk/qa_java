import com.example.Animal;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Test;
@RunWith(Parameterized.class)
public class TestAnimal {
    private final String animalKind;


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
    @Test
    public void testFoodForDifferentFamilies() throws Exception {
        Animal animal = new Animal();
        System.out.println(animal.getFood(animalKind));
    }

    @Test(expected = InterruptedException.class)
    public void testLionForSexNegative() throws InterruptedException {
        Animal animal = new Animal();
        System.out.println(animal.getFood("Неизвестно"));
    }

    @Test
    public void testAnimalFamiily() {
        Animal animal = new Animal();
        System.out.println(animal.getFamily());
    }
}

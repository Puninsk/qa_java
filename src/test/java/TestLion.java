import com.example.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestLion {
    private final String animalSex;

    public TestLion(String animalSex) {
        this.animalSex = animalSex;
    }

    @Parameterized.Parameters
    public static Object[][] getAnimalSex() {
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testLionForDifferentSexes() throws InterruptedException {
        Lion lion = new Lion(animalSex);
        System.out.println(lion.doesHaveMane());
    }

    @Test(expected = InterruptedException.class)
    public void testLionForSexNegative() throws InterruptedException {
        Lion lion = new Lion("Неизвестно");
        System.out.println(lion.doesHaveMane());
    }
    @Mock
    AnimalFamily feline;
    @Test
    public void testLionFamily() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");
        String expectedResult = "Кошачьи";
        String actualResult = lion.getFamily();
        assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testgetKittensNumberDefault() {
        AnimalFamily feline = new Feline();
        Lion lion = new Lion(feline);
        System.out.println(lion.getKittensNumber());
    }

    @Test
    public void testgetKittensNumberTwo() {
        AnimalFamily feline = new Feline();
        Lion lion = new Lion(feline);
        int expectedKittensNumber = 2;
        int actualKittensNumber = lion.getKittensNumber(2);
        System.out.println(lion.getKittensNumber(2));
        assertEquals(expectedKittensNumber, actualKittensNumber);
    }

    @Test
    public void testLionFood() throws Exception {
        AnimalFood feline = new Feline();
        Lion lion = new Lion(feline);
        System.out.println(lion.getFood());
    }

}


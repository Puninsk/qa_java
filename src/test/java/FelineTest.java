import com.example.Feline;
import org.junit.Test;

public class FelineTest {

    @Test
    public void testFelineEatMeat() throws Exception {
        Feline feline = new Feline();
        System.out.println(feline.eatMeat());
    }
    @Test
    public void testFelineFood() throws Exception {
        Feline feline = new Feline();
        System.out.println(feline.getFood());
    }

    @Test
    public void testFelineFamily() {
        Feline feline = new Feline();
        System.out.println(feline.getFamily());
    }
    @Test
    public void testKittenNumbers() {
        Feline feline = new Feline();
        System.out.println(feline.getKittens());
    }

    @Test
    public void testKittenNumbersTwo() {
        Feline feline = new Feline();
        System.out.println(feline.getKittens(2));
    }

}

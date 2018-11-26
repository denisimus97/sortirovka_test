
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CocktailTest {
    @Before
    public void init() {}

    @Test
    public void notNegative() {
        int[] a = {2, 3, 65, 7, 8, 93};
        int[] b = {2, 3, -65, 7, -8, 93};

        assertFalse(Cocktail.hasNegative(a));
        assertTrue(Cocktail.hasNegative(b));
    }

    @Test
    public void trueSort() {
        int[] a = {2, 3, 65, 7, 8, 93};
        int[] trueSorted = {2, 3, 7, 8, 65, 93};

        assertArrayEquals(Cocktail.sort(a), trueSorted);
    }

    @Test
    public void notDublicates() {
        int[] a = {2, 3, 65, 7, 8, 93};
        int[] b = {2, 2, -65, 7, 93, 93};

        assertFalse(Cocktail.hasDublicates(a));
        assertTrue(Cocktail.hasDublicates(b));
    }

    @After
    public void tearDown() {}
}

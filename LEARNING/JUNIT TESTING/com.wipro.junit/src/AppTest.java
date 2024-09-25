import org.junit.Test;

public class AppTest {

    @Test
    public void testAdd() {
        int result = App.Add(2, 3);
        assertEquals(5, result);
    }

    @Test
    public void testSub() {
        int result = App.Sub(5, 3);
        assertEquals(2, result);
    }
}

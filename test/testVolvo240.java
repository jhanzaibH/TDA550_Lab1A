import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class testVolvo240 {
    Volvo240 volvo = new Volvo240();

    @Test
    public void testConstructor(){
        assertEquals("Volvo240", volvo.getModelName());
    }
}

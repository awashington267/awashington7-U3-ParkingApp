import com.company.Garage;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Garage_Test {
    Garage garage;

    @Before
    public void setUp()
    {
        String name = "tonysgarage";
    }
    @Test
    public void getName()
    {
        assertEquals("tonysgarage", garage.getName());
    }
}

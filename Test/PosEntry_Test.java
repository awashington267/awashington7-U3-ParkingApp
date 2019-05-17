import com.company.Ticket;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PosEntry_Test {
    String ticket;
    Ticket t;

    @Before
    public void setUp()
    {

        Date date1 = new Date();

        t = new Ticket(date1);
    }

    @Test
    public void getDate(){
        assertNotNull(t.getTimeIn());
    }
}

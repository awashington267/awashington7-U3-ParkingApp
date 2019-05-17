import com.company.Ticket;
import org.junit.Before;
import org.junit.Test;

public class Ticket_Test {
    Ticket ticket;
    @Before
    public void setUp()
    {
        ticket = new Ticket();
    }
    @Test

    public void getTicketID()
    {
        ticket.getTicketID();
    }
}

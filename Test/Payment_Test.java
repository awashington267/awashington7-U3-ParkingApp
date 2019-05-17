import com.company.Payment;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Payment_Test {
    @Before
    public void setUp()
    {
        String custID = "1";
        String payType = "Leaving";
        Float charge = 25f;
        payment = new Payment(custID, payType, charge);

    }

    private Payment payment;
    @Test
    public void getCustID()
    {
        assertEquals("1", payment.getCustID());
    }
}

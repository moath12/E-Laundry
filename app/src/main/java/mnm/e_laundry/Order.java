package mnm.e_laundry;

import java.sql.Date;

/**
 * Created by MOATH on 20 فبر، 2017 م.
 */
public class Order {
    public Item[] itemses;
    public String Location;
    public Date pickUpTime;
    public Date deliveryTime;
    public double totalPrice;
    public String instructions;
    public Date dateOfOrder;
    public String status;
    public String orderID;
    public double discount;
    public int invoicePoints;
    public String quarter;
}

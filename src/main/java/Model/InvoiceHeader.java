
package Model;
public class InvoiceHeader {
    InvoiceLine IL = new InvoiceLine();
    public String invoiceNum1 = new String();
    public String invoiceNum2 = new String();
    public String invoiceNum3 = new String();
    public int invoiceDate;
    //                             First Items Columns (0)                       Second Items Column (1)                      Third Items Columns(2)
    public Object[][] arraylist = {{IL.itemName ,IL.itemPrice ,IL.count} ,{IL.itemName2,IL.itemPrice2,IL.count2} , {IL.itemName3,IL.itemPrice3,IL.count3}};
    public String invoicetotalprice1 = new String();
    public String invoicetotalprice2 = new String();
    public String invoicetotalprice3 = new String();
}


public class Invoice implements IPayable
{
    private final String invoiceNumber;
    private final int quantity;
    private final double pricePerItem;
    
    Invoice(String invoiceNumber, int quantity, double pricePerItem)
    {
        this.invoiceNumber = invoiceNumber;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
    
    @Override
    public double getPaymentAmount()
    {
        System.out.println("Invoice number:" + invoiceNumber);
        System.out.print("Amount:");
        return quantity * pricePerItem;
    }
    
    @Override
    public double totalExpenses()
    {
        return quantity * pricePerItem;
    }
}


public class Main 
{
    
    public static void main(String[] args) 
    {
        HourlyEmployee karl = new HourlyEmployee("Karl", "Smith", 197404169435L, 30, 100);
        System.out.println(karl.toString());
        SalariedEmployee allie = new SalariedEmployee("Allie", "Persson", 199209146809L, 5000);
        System.out.println(allie.toString());
        
        Invoice bill1 = new Invoice("123456789", 2, 1000);
        Invoice bill2 = new Invoice("987654321", 4, 2000);
        
        IPayable[] salaryExpenses = {karl, allie, bill1, bill2};
        
        System.out.println("Monthly expenses:\n");
        
        for (IPayable salaryExpense : salaryExpenses)
        {
            System.out.println(salaryExpense.getPaymentAmount());
            System.out.println("");
        }
    }

}

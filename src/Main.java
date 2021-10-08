
public class Main 
{
    
    public static void main(String[] args) 
    {
        double total = 0;
        HourlyEmployee karl = new HourlyEmployee("Karl", "Smith", 197404169435L, 30, 100);
        SalariedEmployee allie = new SalariedEmployee("Allie", "Persson", 199209146809L, 5000);
        Invoice bill1 = new Invoice("123456789", 2, 1000);
        Invoice bill2 = new Invoice("987654321", 4, 2000);
        
        IPayable[] salaryExpenses = {karl, allie, bill1, bill2};
        
        System.out.println(karl.toString());
        System.out.println(allie.toString());
        System.out.println("Monthly expenses:");
        
        for (IPayable salaryExpense : salaryExpenses)
        {
            System.out.println(salaryExpense.getPaymentAmount());
            total += salaryExpense.totalExpenses();
        }
        System.out.println("\nTotal Expenses:" + total);
    }

}

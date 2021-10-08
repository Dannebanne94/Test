
public class HourlyEmployee extends Employee
{
    private final double hoursWorkedPerWeek;
    private final double paymentPerHour;
    
    HourlyEmployee(String firstName, String lastName, long ssn, 
            double hoursWorkedPerWeek, double paymentPerHour)
    {
        super(firstName, lastName, ssn);
        this.hoursWorkedPerWeek = hoursWorkedPerWeek;
        this.paymentPerHour = paymentPerHour;
    }
    
    @Override
    public double totalExpenses()
    {
        return earning() * 4;
    }
    
    @Override
    public double getPaymentAmount()
    {
        System.out.print("Salary " + super.getFirstName() +":");
        return earning() * 4;
    }
    
    @Override
    double earning()
    {
        return hoursWorkedPerWeek * paymentPerHour;
    }
    
    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName()
                + "\nSocial security number:" + super.getSsn()
                + "\nWeekly salary:" + earning() + "\n";
    }
}

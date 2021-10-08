
public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, long ssn, double weeklySalary)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
    }

    @Override
    public double getPaymentAmount()
    {
        System.out.print("Salary " + super.getFirstName() + ":");
        return earning() * 4;
    }
    
    @Override
    public double totalExpenses()
    {
        return earning() * 4;
    }
    
    @Override
    double earning()
    {
        return weeklySalary;
    }

    @Override
    public String toString()
    {
        return super.getFirstName() + " " + super.getLastName()
                + "\nSocial security number:" + super.getSsn()
                + "\nWeekly salary:" + earning() + "\n";
    }
}

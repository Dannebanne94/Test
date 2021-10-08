
public class SalariedEmployee extends Employee
{
    private double weeklySalary;

    SalariedEmployee(String firstName, String lastName, long ssn, double weeklySalary)
    {
        super(firstName, lastName, ssn);
        this.weeklySalary = weeklySalary;
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

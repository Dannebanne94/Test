
public abstract class Employee implements IPayable
{
    private final String firstName;
    private final String lastName;
    private final long ssn;
    
    Employee(String firstName, String lastName, long ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
    @Override
    public abstract double getPaymentAmount();
    
    @Override
    public String toString()
    {
        return firstName + " " + lastName + ". Social security number:" + ssn; 
    }
    
    abstract double earning();
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
    }
    
    public long getSsn()
    {
        return ssn;
    }
}

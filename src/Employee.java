
public abstract class Employee 
{
    private String firstName;
    private String lastName;
    private long ssn;
    
    Employee(String firstName, String lastName, long ssn)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }
    
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

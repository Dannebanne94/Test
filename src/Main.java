
public class Main 
{
    
    public static void main(String[] args) 
    {
        HourlyEmployee jason = new HourlyEmployee("Karl", "Smith", 197404169435L, 30, 147);
        System.out.println(jason.toString());
        SalariedEmployee allie = new SalariedEmployee("Allie", "Persson", 199907287342L, 7654);
        System.out.println(allie.toString());
        HourlyEmployee torkild = new HourlyEmployee("Torkild", "Krubster", 199209146809L, 47.5, 153.7);
        System.out.println(torkild.toString());
    }

}

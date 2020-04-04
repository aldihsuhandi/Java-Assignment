public class Fulltime extends Employee
{
    private String baseSalary;

    public Fulltime(String name, int age, String role, String type)
    {
        super(name, age, role, type);
    }

    public void setBaseSalary(String baseSalary)
    {
        this.baseSalary = baseSalary;
    }

    public String getBaseSalary()
    {
        return baseSalary;
    }
}

public class Employee
{
    protected String name;
    protected int age;
    protected String role;
    protected String type;
    protected String status;

    public Employee(String name, int age, String role, String type)
    {
        this.name = name;
        this.age = age;
        this.role = role;
        this.type = type;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public String getRole()
    {
        return role;
    }

    public String getType()
    {
        return type;
    }

    public String getStatus()
    {
        return status;
    }
}

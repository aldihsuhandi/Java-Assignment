public class Parttime extends Employee
{
    private int hourPerWeek;
    private String payPerHour;

    public Parttime(String name, int age, String role, String type)
    {
        super(name, age, role, type);
    }

    public void setHourPerWeek(int hourPerWeek)
    {
        this.hourPerWeek = hourPerWeek;
    }

    public void setPayPerHour(String payPerHour)
    {
        this.payPerHour = payPerHour;
    }

    public int getHourPerWeek()
    {
        return hourPerWeek;
    }

    public String getPayPerHour()
    {
        return payPerHour;
    }
}

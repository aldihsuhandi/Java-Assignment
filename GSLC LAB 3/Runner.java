abstract class Runner
{
    protected String name, type;
    protected int speed, distances = 0;

    public Runner(String name, String type, int speed)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    public abstract void addDistance();
}

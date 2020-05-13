public abstract class Runner implements Comparable< Runner >
{
    protected String name, type;
    protected int speed, distance;

    public Runner(String name, String type, int speed)
    {
        this.name = name;
        this.type = type;
        this.speed = speed;
    }

    public abstract void addDistance();

    public String getName()
    {
        return name;
    }

    public String getType()
    {
        return type;
    }

    public int getSpeed()
    {
        return speed;
    }

    public int getDistance()
    {
        return distance;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public void setSpeed(int speed)
    {
        this.speed = speed;
    }

    public void setDistance(int distance)
    {
        this.distance = distance;
    }

    @Override
    public int compareTo(Runner temp)
    {
        int compareDist = ((Runner)temp).getDistance();
        return this.distance - compareDist;
    }
}

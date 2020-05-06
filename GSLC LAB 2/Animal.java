class Animal
{
    protected String name, gender, genus;
    protected int speed;
    
    public Animal(String name, String gender, String genus, int speed)
    {
        this.name = name;
        this.gender = gender;
        this.genus = genus;
        this.speed = speed;
    }

    public String getName()
    {
        return name;
    }

    public String getGender()
    {
        return gender;
    }

    public String getGenus()
    {
        return genus;
    }

    public int getSpeed()
    {
        return speed;
    }
}

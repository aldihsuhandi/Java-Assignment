class Canine extends Animal
{
    public Canine(String name, String gender, String genus, int speed)
    {
        super(name, gender, genus, speed);
    }

    public String getMood(int total, int max)
    {
        if(total == 1 || total < max)
            return "happy";
        else
            return "unhappy";
    }
}

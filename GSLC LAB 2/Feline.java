class Feline extends Animal
{
    public Feline(String name, String gender, String genus, int speed)
    {
        super(name, gender, genus, speed);
    }

    public String getMood(int total, int max)
    {
        if(total == 1 || total < max)
            return "unhappy";
        else
            return "happy";
    }
}

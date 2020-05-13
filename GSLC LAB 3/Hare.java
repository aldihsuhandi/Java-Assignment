class Hare extends Runner
{
    public Hare(String name, String type, int speed)
    {
        super(name, type, speed);
        addDistance();
    }

    @Override
    public void addDistance()
    {
        Function fun = new Function();
        int moves = fun.getRandNum(speed);
        this.distance += moves;
    }
}

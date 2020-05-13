class Turtle extends Runner
{
    public Turtle(String name, String type, int speed)
    {
        super(name, type, speed);
        addDistance();
    }

    @Override
    public void addDistance()
    {
        Function fun = new Function();
        int moves = fun.getRandNum(speed) + fun.getRandNum(10);
        int special = fun.getRandNum(10);
        if(special == 7)
            special = 15;
        else
            special = 0;

        this.distance += moves + special;
    }
}

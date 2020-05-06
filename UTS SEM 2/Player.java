public class Player implements Comparable< Player >
{
    private int step;
    private char name;

    public Player(char name, int step)
    {
        this.name = name;
        this.step = step;
    }

    public int getStep()
    {
        return step;
    }

    public char getName()
    {
        return name;
    }

    public void setStep(int step)
    {
        this.step = step;
    }

    @Override
    public int compareTo(Player temp)
    {
        int compareStep = ((Player)temp).getStep();
        return this.step - compareStep;
    }
}

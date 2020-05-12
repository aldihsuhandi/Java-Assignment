public abstract class Weapon implements ISkill
{
    // kalo kodingan di lab pake private / protected aja
    protected String name;
    protected int atk, atkSpeed;

    public Weapon(String name, int atk, int atkSpeed)
    {
        this.name = name;
        this.atk = atk;
        this.atkSpeed = atkSpeed;
    }

    public abstract void attack(String opponentName);

    public String getName()
    {
        return name;
    }

    public int getAtk()
    {
        return atk;
    }

    public int getAtkSpeed()
    {
        return atkSpeed;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setAtk(int atk)
    {
        this.atk = atk;
    }

    public void setatkSpeed(int atkSpeed)
    {
        this.atkSpeed = atkSpeed;
    }
}

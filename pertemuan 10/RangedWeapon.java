public class RangedWeapon extends Weapon
{
    private int range;
    public RangedWeapon(String name, int atk, int atkSpeed, int range)
    {
        super(name, atk, atkSpeed);
        this.range = range;
    }

    @Override
    public void attack(String opponentName)
    {
        System.out.println("You shot " + opponentName);
    }

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }
    
    @Override
    public void useSkill(String target)
    {
        System.out.println("You shocked" + target);
    }
}

public class MeleeWeapon extends Weapon
{
    private int weight;
    public MeleeWeapon(String name, int baseAtk, int baseAtkSpeed, int weight)
    {
        super(name, baseAtk, baseAtkSpeed);
        this.atk += (int)(Math.random() * 100 + 1) + 100;
        this.atkSpeed += (int)(Math.random() * 26);
        this.weight = weight;
    }

    @Override
    public void attack(String opponentName)
    {
        System.out.println("You slashed " + opponentName);
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public void useSkill(String target)
    {
        System.out.println("You burn " + target);
    }
}

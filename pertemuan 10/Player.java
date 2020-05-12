public class Player implements ISkill
{
    public String name;
    public Player(String name)
    {
        this.name = name;
    }

    @Override
    public void useSkill(String target)
    {
        System.out.println("You use your skill to " + target);
    }
}

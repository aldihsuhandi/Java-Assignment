import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    ArrayList<Weapon> weapons = new ArrayList<>();
    Player player = new Player("ABC");
    Scanner in = new Scanner(System.in);

    public void useSkillToOpponent(ISkill obj)
    {
        String target = "DEF";
        obj.useSkill(target);
    }

    public void addWeapon()
    {
        System.out.println("Input weapon name: ");
        String name = in.nextLine();

        System.out.println("Input weapon type [Melee | Ranged]: ");
        String type = in.nextLine();

        System.out.println("Input weapon attack: ");
        int atk = in.nextInt();
        in.nextLine();

        System.out.println("Input weapon attack Speed: ");
        int atkSpeed = in.nextInt();
        in.nextLine();

        if(type.equals("Melee"))
        {
            System.out.println("Input weapon weight: ");
            int weight = in.nextInt();
            in.nextLine();

            MeleeWeapon weapon = new MeleeWeapon(name, atk, atkSpeed, weight);
            weapons.add(weapon);
        }
        else
        {
            System.out.println("Input weapon range: ");
            int range = in.nextInt();
            in.nextLine();

            RangedWeapon weapon = new RangedWeapon(name, atk, atkSpeed, range);
            weapons.add(weapon);
        }
    }

    public void viewWeapon()
    {
        if(weapons.isEmpty())
        {
            System.out.println("You don't have any weapon!");
            return;
        }

        int i = 1;
        for(Weapon weapon : weapons){
            System.out.println("Weapon #" + i);
            System.out.println("Atk: " + weapon.getAtk());
            System.out.println("Atk Speed: " + weapon.getAtkSpeed());
            System.out.println("Name: " + weapon.getName());

            if(weapon instanceof MeleeWeapon)
                System.out.println("Weight: " + ((MeleeWeapon)weapon).getWeight());
            else
                System.out.println("Range: " + ((RangedWeapon)weapon).getRange());

            ++i;
        }
    }

    public void useAllSkills()
    {
        useSkillToOpponent(player);
        for(Weapon weapon: weapons)
            useSkillToOpponent(weapon);
    }

    public void printMenu()
    {
        String[] menu = {"Add weapon", "View Inventory", "Use All Skill", "Exit"};
        for(int i = 0;i < 4;++i)
            System.out.printf("%d. %s\n", i + 1, menu[i]);
        System.out.print(">> ");
    }

    public Main()
    {
       // new MeleeWeapon("asdf", 50, 30).attack("aplsdkklasdf");
       // new Weapon("asdf", 50, 30){
       //     @Override
       //     public void attack(String opponentName){
       //         System.out.println("alkdjlsakadjf\n" + opponentName);
       //     }
       // }.attack("asd");;
        
       // new MeleeWeapon("asdf", 50, 5, 25).attack("alkjflkjasddjf");
       // new RangedWeapon("asdf", 50, 50, 25).attack("lkjasjdkfl");


        int choice = -1;
        do{
            printMenu();
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1)
                addWeapon();
            else if(choice == 2)
                viewWeapon();
            else if(choice == 3)
                useAllSkills();
        } while(choice != 4);
    }

    public static void main(String[] args)
    {
        new Main();
    }   
}

import java.util.Random;
import java.util.Vector;

class Function
{
    public void clear_terminal()
    {
        for(int i = 0;i < 42;++i)
            System.out.println();
    }

    public void printMenu()
    {
        String[] menu = {"Add Zoo Animal", "View Zoo Animal", "Take For A Walk", "Release Zoo Animal", "Close Program"};

        System.out.println("+=======================+");
        System.out.println("+ Menu List             +");
        System.out.println("+=======================");
        for(int i = 0;i < 5;++i)
            System.out.printf("+ %d. %-19s+\n", i + 1, menu[i]);
        System.out.println("+=======================+");
        System.out.print("Choice >> ");
    }

    public int randNum(int num)
    {
        Random rand = new Random();
        int ret = rand.nextInt(num + 1);
        return ret;
    }

    public int max(int a, int b)
    {
        if(a > b)
            return a;
        return b;
    }

    public void printHeaders()
    {
        System.out.println("+========================================================+");
        System.out.println("+ No. | Name            | Genus    | Mood       | Gender +");
        System.out.println("+========================================================+");
    }

    public void printAnimal(int idx, String name, String genus, String mood, String gender)
    {
        System.out.printf("+ %-3d | %-14s | %-8s | %-11s | %-6s +\n", idx, name, genus, mood, gender);
    }

    public void printList(Vector<Animal> zoo, int totCanine, int maxCanine, int totFeline, int maxFeline)
    {
        printHeaders();
        if(zoo.isEmpty())
            System.out.println("+ No Zoo Animal Spotted                                  +");
        else
        {
            for(int i = 0;i < zoo.size();++i){
                Animal animal = zoo.get(i);
                String name = animal.getName();
                String genus = animal.getGenus();
                String gender = animal.getGender();
                String mood = "";

                if(genus.equals("canine"))
                {
                    Canine temp = (Canine) animal;
                    mood = temp.getMood(totCanine, maxCanine);
                }
                else
                {
                    Feline temp = (Feline) animal;
                    mood = temp.getMood(totFeline, maxFeline);
                }

                printAnimal(i + 1, name, genus, mood, gender);
            }
        }
    }
}

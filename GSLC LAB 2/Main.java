import java.util.Scanner;
import java.util.Vector;

class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Function fun = new Function();
        Vector<Animal> zoo = new Vector<>();
        int totCanine = 0, totFeline = 0;
        int maxCanine = 0, maxFeline = 0;

        int choice = 0;
        while(choice != 5){
            fun.clear_terminal();
            fun.printMenu();
            choice = in.nextInt();
            in.nextLine();

            if(choice == 1)
            {
                String name = "", genus = "", gender = "";
                int speed = 0;

                do{
                    System.out.print("What's the name [5 - 15 characters]? ");
                    name = in.nextLine();
                } while(!(name.length() >= 5 && name.length() <= 15));

                do{
                    System.out.print("What's its gender [male | female]? ");
                    gender = in.nextLine();
                } while(!(gender.equals("male") || gender.equals("female")));

                do{
                    System.out.print("What's its genus [canine | feline]? ");
                    genus = in.nextLine();
                } while(!(genus.equals("canine") || genus.equals("feline")));

                if(genus.equals("canine"))
                {
                    do{
                        System.out.print("What's its speed [1 - 80]? ");
                        speed = in.nextInt();
                    } while(!(speed >= 0 && speed <= 80));
                    ++totCanine;
                    maxCanine = fun.max(totCanine, maxCanine);

                    zoo.add(new Canine(name, gender, genus, speed));
                }
                else
                {
                    speed = fun.randNum(80);
                    ++totFeline;
                    maxFeline = fun.max(totFeline, maxFeline);

                    zoo.add(new Feline(name, gender, genus, speed));
                }

                System.out.println("Another animal has joined the zoo!!");
            }
            else if(choice == 2)
            {
                fun.printList(zoo, totCanine, maxCanine, totFeline, maxFeline);
                System.out.println("+========================================================+");
                System.out.print("Press enter to continue...");
                in.nextLine();
            }
            else if(choice == 3)
            {
                int sz = zoo.size();
                int idx, durr;

                if(sz == 0)
                {
                    fun.printList(zoo, totCanine, maxCanine, totFeline, maxFeline);
                    System.out.println("+========================================================+");
                    System.out.print("Press enter to continue...");
                    in.nextLine();
                    continue;
                }

                do{
                    fun.printList(zoo, totCanine, maxCanine, totFeline, maxFeline);
                    System.out.println("+========================================================+");

                    System.out.printf("Choose animal to take for a stroll [1 - %d]: ", sz);
                    idx = in.nextInt();
                } while(!(idx >= 1 && idx <= sz));

                do{
                    System.out.printf("Roaming time [0 - 50]: ");
                    durr = in.nextInt();
                } while(!(durr >= 0 && durr <= 50));
                in.nextLine();

                if(durr == 0)
                    durr = 60;

                Animal animal = zoo.get(idx - 1);
                if(animal.getGenus().equals("feline"))
                {
                    int flag = fun.randNum(1);
                    if(flag == 0)
                        System.out.println("Felines doesn't feel like roaming at all today");
                    else
                    {
                        durr = fun.randNum(durr);
                        if(durr == 0)
                            durr = 30;
                        System.out.printf("roaming for total range of %d in %d minutes\n", durr * animal.getSpeed(), durr);
                    }
                }
                else 
                {
                    durr = fun.randNum(durr);
                    if(durr == 0)
                        durr = 60;
                    System.out.printf("roaming for total range of %d in %d minutes\n", durr * animal.getSpeed(), durr);
                }


                System.out.print("Press enter to continue...");
                in.nextLine();
            }
            else if(choice == 4)
            {
                int sz = zoo.size(), idx;

                if(sz == 0)
                {
                    fun.printList(zoo, totCanine, maxCanine, totFeline, maxFeline);
                    System.out.println("+========================================================+");
                    System.out.print("Press enter to continue...");
                    in.nextLine();
                    continue;
                }

                do{
                    fun.printList(zoo, totCanine, maxCanine, totFeline, maxFeline);
                    System.out.println("+========================================================+");

                    System.out.printf("Choose animal that wants to be released [1 - %d]: ", sz);
                    idx = in.nextInt();
                } while(!(idx >= 1 && idx <= sz));
                in.nextLine();
                --idx;

                int tempIdx = 0;
                do{
                    tempIdx = fun.randNum(sz - 1);
                } while(tempIdx == idx && sz != 1);

                Animal animal1 = zoo.get(idx), animal2 = zoo.get(tempIdx);
                String genus1 = animal1.getGenus(), gender1 = animal1.getGender();
                String genus2 = animal2.getGenus(), gender2 = animal2.getGender();

                if(genus1.equals(genus2) && !gender1.equals(gender2))
                {
                    if(genus1.equals("canine"))
                    {
                        totCanine -= 2;
                        System.out.println("ruff ruff <3");
                    }
                    else
                    {
                        totFeline -= 2;
                        System.out.println("meow meow <3");
                    }

                    zoo.remove(animal1);
                    zoo.remove(animal2);
                }
                else
                {
                    if(genus1.equals("canine"))
                    {
                        --totCanine;
                        System.out.println("awooo!!");
                    }
                    else
                    {
                        --totFeline;
                        System.out.println("hiss!!");
                    }

                    zoo.remove(animal1);
                }

                System.out.print("Press enter to continue...");
                in.nextLine();
            }
        }
    }
}

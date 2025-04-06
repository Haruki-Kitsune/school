package Zoomania;

import java.util.ArrayList;
import java.util.Scanner;

public class Zoo_main
{
    public static void main(String[] args)
    {
        ArrayList<Zoo> zoos = new ArrayList<>();
        boolean active = true;
        Scanner scan = new Scanner(System.in);
        Scanner scanInt = new Scanner(System.in);

        //fills zoo with dummy data
        Fill fill = new Fill();
        fill.fill(zoos);


        do
        {
            //choice to enter one of three zoos or to show all animals.
            System.out.println("\n");
            System.out.println("Welcome to Zoomania. Pick your option.");
            System.out.println("Tip: everything that is in between <> is a option.");
            System.out.println("<Enter>\n<Show>\n<Stop>");
            String option = scan.nextLine().toLowerCase();
            switch (option)
            {
                case "enter":
                System.out.println("<Kami>, <Tenshi> or <Blank>");
                String zooName = scan.nextLine();

                int number = nameToInt(zoos, zooName);
                try
                {
                    System.out.println(zoos.get(number));
                    //if the zoo does not have animals it will say so.
                    //else it will show the list of animals.
                    if (zoos.get(number).getAnimal().size() == 0) System.out.println("This zoo does not have any animals.");
                    else System.out.println(zoos.get(number).showAnimals());
                    zoos.get(number).setEnter(true);

                    do
                    {
                        //asks what you want to do.
                        System.out.println("What do you want to do?");
                        System.out.println("<move> an animal.");
                        System.out.println("<put> an animal in the zoo.");
                        System.out.println("<create> a terrarium.");
                        System.out.println("<search> an animal species.");
                        System.out.println("<view>.");
                        System.out.println("check <terratium>.");
                        System.out.println("<kill> an animal.");
                        System.out.println("<check> an animal.");
                        System.out.println("<leave> the zoo.");
                        option = scan.nextLine().toLowerCase();

                        switch (option)
                        {
                            case "move":
                            //menu for move
                            int moveAnimal;
                            System.out.println("What do you want to do?");
                            System.out.println("Move to another <zoo> or move to <terrarium>");
                            option = scan.nextLine().toLowerCase();

                            switch (option)
                            {
                                case "zoo":
                                //moves an animal for one zoo to another
                                System.out.println("\n");
                                System.out.println(zoos.get(number).showAnimalName());
                                System.out.println("What is the name of the animal that you want to to move?");
                                moveAnimal = zoos.get(number).animalToInt(scan.nextLine().toLowerCase());
                                
                                System.out.println("\n");
                                for (int i = 0 ; i < zoos.size() ; i++)
                                    System.out.println("<" + zoos.get(i).getName() + ">");

                                System.out.println("To what zoo?");
                                int moveToZoo = nameToInt(zoos, scan.nextLine().toLowerCase());;
                                try
                                {
                                    zoos.get(number).getAnimal().get(moveAnimal).setLiveIn("none");
                                    zoos.get(moveToZoo).putAnimalInZoo(zoos.get(number).getAnimal().get(moveAnimal));
                                    System.out.println(zoos.get(number).getAnimal().get(moveAnimal).getName() + " moved to " + zoos.get(moveToZoo).getName() + "\n");
                                    zoos.get(number).getAnimal().remove(moveAnimal);
                                }
                                catch (Exception e)
                                {
                                    System.out.println("The animal or zoo you tried to pick does not exist. Please try another one.");
                                }
                                break;

                                case "terrarium":
                                //moves an animal to a terrarium in the zoo
                                System.out.println("\n");
                                System.out.println(zoos.get(number).showAnimalName());
                                System.out.println("Which animal do you want to move?");
                                moveAnimal = zoos.get(number).animalToInt(scan.nextLine().toLowerCase());
                                System.out.println(zoos.get(number).showTerrariumName());
                                String terrarium = scan.nextLine().toLowerCase();

                                if (zoos.get(number).terrariumExists(terrarium))
                                {
                                    zoos.get(number).getAnimal().get(moveAnimal).setLiveIn(terrarium);
                                    System.out.println(zoos.get(number).getAnimal().get(moveAnimal).getName() + " moved to " + zoos.get(number).getTerrarium().get(zoos.get(number).terrariumToInt(terrarium)).getName() + "\n");
                                }
                                break;

                                default:
                                System.out.println("Sorry that is not an option.\n");
                            }
                            break;

                            case "put":
                            //puts a new animal into the zoo
                            System.out.println("What spicies does the animal belong to?");
                            String newSpicies = scan.nextLine();
                            System.out.println("What is the name of the animal?");
                            String newName = scan.nextLine();
                            System.out.println("What is the gender of the animal?");
                            String newGender = scan.nextLine();
                            if (maleOrFemale(newGender))
                            {
                                System.out.println("What is the age of the animal?");
                                try
                                {
                                    int newAge = scanInt.nextInt();
                                    System.out.println("Is it a <animal>, <bird> or a <fish>?");
                                    option = scan.nextLine().toLowerCase();
                                    switch (option)
                                    {
                                        case "animal":
                                        zoos.get(number).putAnimalInZoo(new Animal(newSpicies, newName, newGender, newAge));
                                        System.out.println("\n");
                                        break;

                                        case "bird":
                                        zoos.get(number).putAnimalInZoo(new Bird(newSpicies, newName, newGender, newAge));
                                        System.out.println("\n");
                                        break;

                                        case "fish":
                                        zoos.get(number).putAnimalInZoo(new Fish(newSpicies, newName, newGender, newAge));
                                        System.out.println("\n");
                                        break;

                                        default:
                                        System.out.println("That is not a type.\n");
                                        break;
                                    }
                                    zoos.get(number).putAnimalInZoo(new Animal(newSpicies, newName, newGender, newAge));
                                    System.out.println("\n");
                                }
                                catch (Exception e)
                                {
                                    String dump = scan.nextLine();
                                    System.out.println(dump + " is not an age.\n");
                                }
                            }
                            else
                                System.out.println(newGender + " is not a gender.\n");
                            break;

                            case "create":
                            //creates a new terrarium
                            System.out.println("What will be the name of the terrarium.");
                            String newNameTerrarium = scan.nextLine();
                            System.out.println("What is the terrain");
                            String newTerrain = scan.nextLine();
                            zoos.get(number).createTerrarium(new Terrarium(newNameTerrarium, newTerrain));
                            System.out.println("\n");
                            break;

                            case "search":
                            //search an animal species
                            System.out.println("What spicies does it belong to?");
                            String search = scan.nextLine().toLowerCase();
                            System.out.println("\n");
                            System.out.println(zoos.get(number).searchAnimal(search));
                            break;

                            case "view":
                            //menu for view
                            System.out.println("What do you want to view?");
                            System.out.println("<animal> or <terrarium>");
                            option = scan.nextLine().toLowerCase();

                            switch (option)
                            {
                                case "animal":
                                //views all animals in the zoo
                                System.out.println(zoos.get(number).showAnimals());
                                break;

                                case "terrarium":
                                //views all terrariums in the zoo
                                System.out.println(zoos.get(number).showTerrariums());
                                break;

                                default:
                                System.out.println("That is not something you can view.\n");
                                break;
                            }
                            break;

                            case "terrarium":
                            if (zoos.get(number).getTerrarium().size() != 0)
                            {
                                //menu for terrarium
                                System.out.println("\n");
                                System.out.println(zoos.get(number).showTerrariumName());
                                System.out.println("Which terrarium do you want to check?");
                                option = scan.nextLine().toLowerCase();
                                if (zoos.get(number).terrariumExists(option))
                                {
                                    boolean inTer = true;
                                    int terrarium = zoos.get(number).terrariumToInt(option);

                                    do
                                    {
                                        System.out.println(zoos.get(number).getTerrarium().get(terrarium));
                                        System.out.println("What do you want to do?");
                                        System.out.println("<clean> the terrarium.");
                                        System.out.println("<feed> the animal in the terrarium.");
                                        System.out.println("<show> the animals in the terrarium.");
                                        System.out.println("<leave> the terrarium.");
                                        option = scan.nextLine().toLowerCase();

                                        switch (option)
                                        {
                                            case "clean":
                                            //cleans the terrarium
                                            System.out.println(zoos.get(number).getTerrarium().get(terrarium).clean() + "\n");
                                            break;

                                            case "feed":
                                            //feeds all the animals in the terrarium
                                            zoos.get(number).getTerrarium().get(terrarium).feedAnimals(zoos.get(number).getAnimal());
                                            System.out.println("Animal have beed fed.\n");
                                            break;

                                            case "show":
                                            //shows all the animals in the terrarium
                                            System.out.println(zoos.get(number).getTerrarium().get(terrarium).showAnimals(zoos.get(number).getAnimal()) + "\n");
                                            break;

                                            case "leave":
                                            //leaves that specific terrarium
                                            inTer = false;
                                            System.out.println("\n");
                                            break;

                                            default:
                                            System.out.println("That is not an option.\n");
                                        }
                                    }
                                    while (inTer);
                                }
                            }
                            else
                                System.out.println("This zoo does not have any terrariums");
                            break;

                            case "kill":
                            //kills an animal
                            System.out.println(zoos.get(number).showAnimalName());
                            System.out.println("Which animal do you want to kill?");
                            int kill = zoos.get(number).animalToInt(scan.nextLine().toLowerCase());

                            zoos.get(number).kill(kill);
                            System.out.println(zoos.get(number).getAnimal().get(kill).getName() + " has been killed.");
                            break;

                            case "check":
                            //checks if an animal has specific data and shows it
                            System.out.println(zoos.get(number).showAnimalName());
                            System.out.println("Which animal do you want to check?");
                            int animal = zoos.get(number).animalToInt(scan.nextLine().toLowerCase());
                            System.out.println(zoos.get(number).getAnimal().get(animal).checkAnimal() + "\n");
                            break;

                            case "leave":
                            //leaves the zoo
                            System.out.println("Thank you for visiting " + zoos.get(number).getName() + "\n\n");
                            zoos.get(number).setEnter(false);
                            break;

                            default:
                            System.out.println("Sorry that is not an option.");
                            break;
                        }
                    }
                    while (zoos.get(number).getEnter());
                }
                catch (Exception e)
                {
                    System.out.println("That zoo doesn't exist.");
                }
                break;

                case "show":
                //shows all the animals from all the zoos
                for (int i = 0 ; i < zoos.size() ; i++)
                {
                    System.out.println(zoos.get(i));
                    System.out.println(zoos.get(i).showAnimals());
                }
                break;

                case "stop":
                // stops the program
                active = false;
                break;

                default:
                System.out.println("That is not an option.");
                break;
            }
        }
        while (active);
    }

    //changes the zoo name into the int of the place it stands on in the list.
    private static int nameToInt(ArrayList<Zoo> zoos, String zooName)
    {
        int i;
        for (i = 0 ; i < zoos.size() ; i++)
            if (zoos.get(i).getName().toLowerCase().equals(zooName)) return i;
        return i;
    }

    //checks if data given is male or female
    private static boolean maleOrFemale(String gender)
    {
        boolean mof = false;
        if (gender.equals("male") || gender.equals("female"))
            return true;
        return mof;
    }
}
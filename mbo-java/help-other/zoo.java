package test;

import java.util.Scanner;
public class zoo 
{
    public static void main(String[] args) {
        int infinite = 0;
        zoo_object ouwehands = new zoo_object("ouwehands", 25);
        zoo_object burgers = new zoo_object("burgers", 15);
        ouwehands.animallist.add(new Animal("Olifant","Dumbo","male"));
        ouwehands.animallist.add(new Animal("beer","snor","male"));
        burgers.animallist.add(new Animal("beer","motjel","female"));
          while (infinite != 1)
        {
            System.out.println(burgers.getDieren());
            System.out.println("Welkom welke dierentuin wilt u aanpassen?");
            System.out.println("1. burgers");
            System.out.println("2. ouwehands");
            Scanner scan = new Scanner(System.in);
            int answer = scan.nextInt();
             if (answer == 1 )
             {
                 System.out.println("Wat wilt u aanpassen?");
                 System.out.println("1. een dier toevoegen");
                 System.out.println("2. een verzorger toevoegen");
                 System.out.println("3. een dier aan een verzorger geven");
                 System.out.println("4. alle dier bekijken");
                 System.out.println("5. alle verzorgers bekijken");
                 int answer2 = scan.nextInt();
                 if (answer2 == 1 )
                 {
                     String niks = scan.nextLine();
                     System.out.println("wat is de soort?");
                     String species = scan.nextLine();
                     System.out.println("wat is de naam?");
                     String name = scan.nextLine();
                     System.out.println("wat is het geslacht?");
                     String gender = scan.nextLine();
                     burgers.addAnimal(new Animal(species, name, gender));
                 }
                 else if (answer2 == 2 )
                 {
                     
                 }
                 else if (answer2 == 3 )
                 {
                     
                 }
                 else if (answer2 == 4 )
                 {
                  System.out.print(ouwehands.getDieren());
                 }
                 else if (answer2 == 5 ) 
                 {
                     System.out.println(burgers.getVerzorger());
                 }
             }
             else if (answer == 2 )
             {
                 System.out.println("Wat wilt u aanpassen?");
                 System.out.println("1. een dier toevoegen");
                 System.out.println("2. een verzorger toevoegen");
                 System.out.println("3. een dier aan een verzorger geven");
                 System.out.println("4. alle dier bekijken");
                 System.out.println("5. alle verzorgers bekijken");
                 int answer2 = scan.nextInt();
                 if (answer2 == 1 )
                 {
                     System.out.println("wat is de soort?");
                     String species = scan.nextLine();
                     System.out.println("wat is de naam?");
                     String name = scan.nextLine();
                     System.out.println("wat is het geslacht?");
                     String gender = scan.nextLine();
                     ouwehands.addAnimal(new Animal(species, name, gender));
                 }
                 else if (answer2 == 2 )
                 {
                     
                 }
                 else if (answer2 == 3 )
                 {
                     
                 }
                 else if (answer2 == 4 )
                 {
                     
                 }
                 else if (answer2 == 5 ) 
                 {
                     
                 }
             }
             else 
             {
                 System.out.println("Dat is helaas geen optie.");
             }
        }
    }
}
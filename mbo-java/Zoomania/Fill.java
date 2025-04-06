package Zoomania;

import java.util.ArrayList;

public class Fill 
{
    //fills the zoo array with dummy data
    public ArrayList<Zoo> fill(ArrayList<Zoo> zoos)
    {
        zoos.add(new Zoo("Kami", 19.99));
        zoos.add(new Zoo("Tenshi", 9.99));
        zoos.add(new Zoo("Blank", 0.99));

        zoos.get(0).putAnimalInZoo(new Bird("Phoenix", "Ravel", "Female", 4, "Heavens Peak"));
        zoos.get(0).putAnimalInZoo(new Bird("Seagul", "Higurashi", "male", 6, "Big ocean"));
        zoos.get(0).putAnimalInZoo(new Bird("Parrot", "Speak", "Female", 13, "Salam"));

        zoos.get(0).putAnimalInZoo(new Fish("Sea Serpent", "Leviathan", "Female", 2, "Big ocean"));
        zoos.get(0).putAnimalInZoo(new Fish("Karper", "Fishstick", "male", 14, "Big ocean"));
        zoos.get(0).putAnimalInZoo(new Fish("Catfish", "cat", "male", 6, "Big ocean"));

        zoos.get(0).putAnimalInZoo(new Animal("Nekomata", "Koneko", "Female", 6, "Heavens Peak"));
        zoos.get(0).putAnimalInZoo(new Animal("Nekomata", "Mavis", "Female", 1, "Heavens Peak"));
        zoos.get(0).putAnimalInZoo(new Animal("Fox", "Haruki", "Male", 8, "Salam"));

        zoos.get(0).createTerrarium(new Terrarium("Heavens Peak", "Mountain"));
        zoos.get(0).createTerrarium(new Terrarium("Salam", "Jungle"));
        zoos.get(0).createTerrarium(new Terrarium("Big ocean", "Lake"));



        zoos.get(1).putAnimalInZoo(new Bird("Phoenix", "Reazer", "male", 20, "Heavens Peak"));
        zoos.get(1).putAnimalInZoo(new Bird("Seagul", "Chicken", "male", 8, "Big ocean"));
        zoos.get(1).putAnimalInZoo(new Bird("Parrot", "Talk", "Female", 3, "Salam"));

        zoos.get(1).putAnimalInZoo(new Fish("Sea Serpent", "Levi", "Female", 9, "Big ocean"));
        zoos.get(1).putAnimalInZoo(new Fish("Karper", "Flake", "female", 14, "Big ocean"));
        zoos.get(1).putAnimalInZoo(new Fish("Catfish", "Trap", "male", 6, "Big ocean"));

        zoos.get(1).putAnimalInZoo(new Animal("Snale", "Bob", "male", 6, "Salam"));
        zoos.get(1).putAnimalInZoo(new Animal("Fox", "Kitsune", "Female", 1, "Salam"));
        zoos.get(1).putAnimalInZoo(new Animal("Fox", "Luna", "female", 8, "Salam"));

        zoos.get(1).createTerrarium(new Terrarium("Heavens Peak", "Mountain"));
        zoos.get(1).createTerrarium(new Terrarium("Salam", "Jungle"));
        zoos.get(1).createTerrarium(new Terrarium("Big ocean", "Lake"));

        return zoos;
    }
}
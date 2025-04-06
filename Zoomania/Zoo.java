package Zoomania;

import java.util.ArrayList;
import java.util.Collections;

public class Zoo 
{
    private String name;
    private double entree;
    private boolean enter;
    private ArrayList<Animal> animals = new ArrayList<>();
    private ArrayList<Terrarium> terrariums = new ArrayList<>();

    public Zoo(String name, double entree)
    {
        this.name = name;
        this.entree = entree; 
        enter = false;
    }
    

    
    
    //changes the animals name into the int of the place it stands on in the list.
    public int animalToInt(String animal)
    {
        int num = 0;
        for (int i = 0; i < animals.size() ; i++)
            if (animals.get(i).getName().toLowerCase().equals(animal)) return(num = i);

        return num;
    }

    //changes the terrarium name into the int of the place it stands on in the list.
    public int terrariumToInt(String terrarium)
    {
        int num = 0;
        for (int i = 0 ; i < terrariums.size() ; i++)
            if (terrariums.get(i).getName().toLowerCase().equals(terrarium)) return(num = i);

        return num;
    }

    //shows the zoo name and entree price.
    public String toString()
    {
        return("Zoo name: " + name + "\nPrice: " + entree + "\n");
    }

    //shows all te animals and orders them by age.
    public String showAnimals()
    {
        String show = "";
        String death = "";
        for (int i = 0 ; i < animals.size() ; i++)
            if (animals.get(i).getHunger() == 0)
            {
                death += animals.get(i).getName() + " died of starvation.\n";
                animals.remove(i);
            }
        for (int i = 0 ; i < animals.size() ; i++)
            show += animals.get(i) + "\n";
        if (show.isEmpty())
            show += "This zoo does not have any animals.\n";
        Collections.sort(animals, (animal1, animal2) -> animal1.getAge() - animal2.getAge());
        return show + "\n" + death + "\n";
    }

    //shows the names of all the animals
    public String showAnimalName()
    {
        String show = "";
        for (int i = 0 ; i < animals.size() ; i++)
            show += "<" + animals.get(i).getName() + ">\n";
        if (show.isEmpty())
            show += "This zoo does not have any animals.\n";
        return show;
    }

    //shows all the terrariums
    public String showTerrariums()
    {
        String show = "";
        for (int i = 0 ; i < terrariums.size() ; i++)
            show += terrariums.get(i) + "\n\n";
    
        if (show.isEmpty())
            show += "This zoo does not have any terrariums.\n";
        return show;
    }

    //shows the names of all terrariums
    public String showTerrariumName()
    {
        String show = "";
        for (int i = 0 ; i < terrariums.size() ; i++)
            show += "<" + terrariums.get(i).getName() + ">\n";
        if (show.isEmpty())
            show += "This zoo does not have any terrariums.\n";
        return show;
    }

    //searches the arraylist for the spicies that is given by the user.
    public String searchAnimal(String spicies)
    {
        String data = "";
        for (int i = 0 ; i < animals.size() ; i++)
            if (animals.get(i).getSpecies().toLowerCase().equals(spicies)) data += animals.get(i);
        if (data.isEmpty()) 
            data += "The zoo does not have that spicies.";
        return data;
    }

    //checks if the data given is an existing terrarium
    public boolean terrariumExists(String terrarium)
    {
        boolean exits = false;
        for (int i = 0 ; i < terrariums.size() ; i++)
            if (terrariums.get(i).getName().toLowerCase().equals(terrarium))
                exits = true;
        return exits;
    }

    //kills an animal
    public void kill(int animal)
    {
        animals.get(animal).setHunger(0);
    }

    //adds to the arrayLists
    public void putAnimalInZoo(Animal animal) { animals.add(animal); }   
    public void createTerrarium(Terrarium terrarium) { terrariums.add(terrarium); }


    //cluster of getters and setters
    public ArrayList<Animal> getAnimal() { return animals; }
    public ArrayList<Terrarium> getTerrarium() { return terrariums; }
    public String getName() { return name; }
    public double getEntree() { return entree; }
    public boolean getEnter() { return enter; }
    public void setEnter(boolean enter) { this.enter = enter; }
}
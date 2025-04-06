package Zoo_GUI;

import java.util.ArrayList;
import java.util.Collections;

public class Zoo 
{
    private String name;
    private double entree;
    private boolean enter;
    ArrayList<Animal> Animals = new ArrayList<>();

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
        String animalTLC = animal.toLowerCase();
        for (int i = 0; i < Animals.size() ; i++)
        {
            if (Animals.get(i).getName().toLowerCase().contains(animalTLC)) return(num = i);
        }
        return num;
    }

    //shows the zoo name and entree price.
    public String toString()
    {
        return("Zoo name: " + name + "\nPrice: " + entree + "\n");
    }

    public String searchAnimal(String spicies)
    {
        String data = "";
        for (int i = 0 ; i < Animals.size() ; i++)
        {
            if (Animals.get(i).getSpecies().toLowerCase().equals(spicies)) data += Animals.get(i);
        }
        if (data.isEmpty())
        {
            data += "The zoo does not have that spicies.";
        }
        return data;
    }

    //shows all te and orders them by age.
    public String showAnimals()
    {
        String show = "";
        for (int i = 0 ; i < Animals.size() ; i++)
        {
            show += Animals.get(i);
        }
        Collections.sort(Animals, (animal1, animal2) -> animal1.getAge() - animal2.getAge());
        return show;
    }

    //puts a new animal in the zoo
    public void putAnimalInZoo(Animal animal)
    {
        Animals.add(animal);
    }   



    public String getName()
    {
        return name;
    }

    public double getEntree()
    {
        return entree;
    }

    public boolean getEnter()
    {
        return enter;
    }

    public void setEnter(boolean enter)
    {
        this.enter = enter;
    }
}
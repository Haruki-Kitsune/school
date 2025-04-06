package Zoomania;

import java.util.ArrayList;
import java.util.Random;

public class Terrarium
{
    private String name;
    private String terrain;
    private String isClean;

    public Terrarium(String name, String terrain)
    {
        this.name = name;
        this.terrain = terrain;
        isClean = "Clean";
    }

    public String toString()
    {
        return(
            "Terrarium name: " + getName() + 
            "\nThe terrain: " + getTerrain() + 
            "\nThe terrarium:  " + waste() +
            "\n");
    }

    //makes the terrarium dirty
    public String waste()
    {
        if (isClean.equals("Clean"))
        {
            Random rand = new Random();
            int randomNumIndex = rand.nextInt(100);
            if (randomNumIndex < 60)
            {
                isClean = "Dirty";
            }
            else
            {
                isClean = "Clean";
            }
        }
        return isClean;
    }

    //cleans the terrarium
    public String clean()
    {
        String clean = "";
        if (isClean.equals("Dirty"))
        {
            isClean = "Clean";
            clean = "The terrarium has been cleaned";
        }
        else
            clean = "The terrarium is already clean";

        return clean;
    }

    //feeds all the animals in the terrarium
    public void feedAnimals(ArrayList<Animal> animals)
    {
        for (int i = 0 ; i < animals.size() ; i++)
        {
            if (animals.get(i).liveIn.equals(name))
            {
                animals.get(i).setHunger(100);
            }
        }
    }

    //shows all animals in the terrarium
    public String showAnimals(ArrayList<Animal> animals)
    {
        String data = "Living in this terratium is:\n";
        String death = "";
        for (int i = 0 ; i < animals.size() ; i++)
            if (animals.get(i).liveIn.equals(name))
            {
                if (animals.get(i).getHunger() == 0)
                {
                    death = animals.get(i).getName() + " died of starvation\n";
                    animals.remove(i);
                }
                else
                {
                    data = "Living in this terratium is: ";
                    animals.get(i).setHunger(animals.get(i).getHunger() - 1);
                    data += animals.get(i) + "\n";
                }
            }
        return data + death;
    }


    //cluster of getters and stetters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTerrain() { return terrain; }
    public void setTerrain(String terrain) { this.terrain = terrain; }
    public String getIsClean() { return isClean; }
    public void setIsclean(String isClean) { this.isClean = isClean; }
}
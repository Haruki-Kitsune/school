package Zoomania;

import java.util.Random;

public class Animal 
{
    protected String species;
    protected String name;
    protected String gender;
    protected int age;
    protected int hunger;
    protected String liveIn;



    public Animal(String species, String name, String gender, int age, String liveIn)
    {
        this.species = species;
        this.name = name;
        this.gender = gender;
        this.age = age;
        hunger = 100;
        this.liveIn = liveIn;
    }

    public Animal(String species, String name, String gender, int age)
    {
        this.species = species;
        this.name = name;
        this.gender = gender;
        this.age = age;
        hunger = 100;
        liveIn = "none";
    }

    public Animal(String species, String gender, int age)
    {
        this.species = species;
        name = "Unknown";
        this.gender = gender;
        this.age = age;
        hunger = 100;
        liveIn = "none";
    }

    

    public String toString()
    {
        return(
            "Species: " + getSpecies() + 
            "\nName: " + getName() + 
            "\nGender: " + getGender() + 
            "\nAge: " + getAge() + 
            "\nHunger: " + getHunger() + 
            "\nLives in: " + getLiveIn() +
            "\n");
    }

    public String checkAnimal()
    {
        return "no specific data present";
    }


    //clusster of getters and setters
    public String getSpecies() { return species; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getGender() { return gender; }
    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    public int getHunger() { return hunger; }
    public void setHunger(int hunger) { this.hunger = hunger; }
    public String getLiveIn() { return liveIn; }
    public void setLiveIn(String liveIn) { this.liveIn = liveIn; }
}



class Fish extends Animal
{
    private int surficed;

    public Fish(String species, String name, String gender, int age, String liveIn)
    {
        super(species, name, gender, age, liveIn);
        hunger = 100;
        surficed = 0;
    }

    public Fish(String species, String name, String gender, int age)
    {
        super(species, name, gender, age);
        hunger = 100;
        liveIn = "none";
        surficed = 0;
    }

    public Fish(String species, String gender, int age)
    {
        super(species, gender, age);
        name = "Unknown";
        hunger = 100;
        liveIn = "none";
        surficed = 0;
    }

    //checks if the fish has surficed
    public String checkAnimal()
    {
        String data = "";
        Random rand = new Random();
        int randomNumIndex = rand.nextInt(100);
        if (randomNumIndex > 60) 
        { 
            surficed++;
            data += "total amount surficed: " + surficed; 
        }
        else { data += "total amount surficed: " + surficed; }
        return data;
    }
}



class Bird extends Animal
{
    private int wingPollish;

    public Bird(String species, String name, String gender, int age, String liveIn)
    {
        super(species, name, gender, age, liveIn);
        hunger = 100;
        wingPollish = 0;
    }

    public Bird(String species, String name, String gender, int age)
    {
        super(species, name, gender, age);
        hunger = 100;
        liveIn = "none";
        wingPollish = 0;
    }

    public Bird(String species, String gender, int age)
    {
        super(species, gender, age);
        name = "Unknown";
        hunger = 100;
        liveIn = "none";
        wingPollish = 0;
    }

    //checks if the bird pollishes his wings
    public String checkAnimal()
    {
        String data = "";
        Random rand = new Random();
        int randomNumIndex = rand.nextInt(100);
        if (randomNumIndex > 60) 
        {
            wingPollish++;
            data += "total amount wings pollished: " + wingPollish;
        }
        else { data += "total amount wings pollished: " + wingPollish; }
        return data;
    }
}
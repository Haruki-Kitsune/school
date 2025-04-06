package Zoo_GUI;

public class Animal 
{
    private String species;
    private String name;
    private String Gender;
    private int age;

    public Animal(String species, String name, String gender, int age)
    {
        this.species = species;
        this.name = name;
        this.Gender = gender;
        this.age = age;
    }

    public Animal(String species, String gender, int age)
    {
        this.species = species;
        name = "Unknown";
        this.Gender = gender;
        this.age = age;
    }



    public String toString()
    {
        return("Species: " + getSpecies() + "\nName: " + getName() + "\nGender: " + getGender() + "\nAge: " + getAge() + "\n\n");
    }



    public String getSpecies()
    {
        return species;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getGender()
    {
        return Gender;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }
}
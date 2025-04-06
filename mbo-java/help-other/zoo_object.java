package test;

import java.util.ArrayList;
public class zoo_object {
    private String name;
    private int prijs;
    
    ArrayList<Animal> animallist= new ArrayList<>();
    ArrayList<Verzorger> verzorgerlist = new ArrayList<>();
    
    public zoo_object(String name, int prijs){
        this.name = name;
        this.prijs = prijs;
}

public String getDieren()
{
    String D = "";
 for (int i=0; i<animallist.size(); i++)
 {   
     D += (" - "+animallist.get(i) + "\n");
 }
 return D;
}
public String getVerzorger()
{
    String D = "";
 for (int i=0; i<verzorgerlist.size(); i++)
 {   
     D += (" - "+verzorgerlist.get(i)+"\n");
 }
 return D;
}

public String showZooInfo() {
    return name+" "+prijs;
}
public void addAnimal(Animal animal)
{
    animallist.add(animal);
}
}
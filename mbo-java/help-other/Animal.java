package test;

public class Animal {
        private String species;
        private String gender;
        private String name;
        
    
    public Animal (String sp, String gende, String nam)
    {
        species = sp;
        gender = gende;
        name = nam;
    }
    public Animal (String sp, String gende)
    {
        species = sp;
        gender = gende;
    }
    public String toString()
    {
      return("diersoort : "+species+" gender : "+name+" name : "+gender);
    }
}
package test;

public class Verzorger {
    String naam;
    String geslacht;
    int leeftijd;
    
    public Verzorger(String nam,String geslach,int leef)
    {
        nam = naam;
        geslach = geslacht;
        leef = leeftijd;
    }
    public String toString()
    {
     return("naam : "+naam+" geslacht : "+geslacht+" leeftijd : "+leeftijd);
    }
}
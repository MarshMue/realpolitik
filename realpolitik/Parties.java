package realpolitik;
import java.util.ArrayList;

public class Parties
{    
    public static ArrayList<Party> PARTIES;
    
    public static Party GREEN_PARTY;
    public static Party SOCIALIST_PARTY;
    public static Party REPUBLICAN_PARTY;
    public static Party DEMOCRATIC_PARTY;
    public static Party LIBERTARIAN_PARTY;
    public static Party CONSTIUTIONALIST_PARTY;
    public static Party INDEPENDENT_PARTY;
    
    public static void init()
    {
        PARTIES = new ArrayList<Party>();
        
        //instantiate parties
        GREEN_PARTY = new Party("Green Party", "4 Pillars: ecology, social justice, grassroots democracy and non-violence");
        SOCIALIST_PARTY = new Party("Socialist Party", "By the people, of the people and for the people");
        REPUBLICAN_PARTY = new Party("Republican Party", "Preservation of tradition, culture and defending them at ALL costs");
        DEMOCRATIC_PARTY = new Party("Democratic Party", "Social programs, and drone programs");
        LIBERTARIAN_PARTY = new Party("Libertarian Party", "FREEDOM, LIBERTY, AND AYN RAND");
        CONSTITUTIONALIST_PARTY = new Party("Constitutionalist Party", "We have a nice piece of paper that has nice words on it");
        INDEPENDENT_PARTY = new Party("Independent Party", "The 'yeah, I don't want to pick a side' party");
    }
}

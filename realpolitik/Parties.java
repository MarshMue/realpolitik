package realpolitik;
import java.util.ArrayList;

public class Parties
{    
    public static ArrayList<Party> PARTIES;
    
    public static Party HATE_GUNS_PARTY;
    
    public static void init()
    {
        PARTIES = new ArrayList<Party>();
        HATE_GUNS_PARTY = new Party("Hate Guns Party", "We hate guns");
        
        HATE_GUNS_PARTY.setIssue(Issues.GUN_CONTROL, 100., 100.);
    }
}

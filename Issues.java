import java.util.ArrayList;

public class Issues
{
    public static double MAX_VALUE = 100.;
    
    public static ArrayList<Issue> ISSUES;
    
    public static Issue GUN_CONTROL;
    public static Issue PROLIFE;
    public static Issue PROCHOICE;
    
    public static void init()
    {
        ISSUES = new ArrayList<Issue>();
        GUN_CONTROL      = new Issue("Gun Control", "");
        PROLIFE          = new Issue("Pro-Life", "");
        PROCHOICE        = new Issue("Pro-Choice", "");
        
        PROLIFE.linkIssue(PROCHOICE, -1);
        PROCHOICE.linkIssue(PROLIFE, -1);
    }
}

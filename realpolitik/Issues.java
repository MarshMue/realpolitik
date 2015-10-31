package realpolitik;
import java.util.ArrayList;

public class Issues
{
    public static double MAX_VALUE = 100.;
    
    public static ArrayList<Issue> ISSUES;
    
    public static Issue GUN_CONTROL;
    public static Issue PROLIFE;
    public static Issue PROCHOICE;
    public static Issue CLIMATE_CHANGE;
    public static Issue KURDISTAN;
    public static Issue ISIS;
    public static Issue ENERGY;
    public static Issue OIL;
    public static Issue FRACKING;
    public static Issue MARIJUANA;
    public static Issue DRUG_WAR;
    public static Issue IMMIGRATION;
    public static Issue HEALTHCARE;
    public static Issue EDUCATION;
    public static Issue ECONOMY;
    public static Issue BANKS;
    public static Issue WALL_STREET;
    public static Issue CFR;
    public static Issue DRONES;
    public static Issue PUBLIC_SURVEILLANCE;
    public static Issue RUSSIA;
    public static Issue CHINA;
    public static Issue MINIMUM_WAGE;
    public static Issue TERRORISM;
    public static Issue DEBT;
    public static Issue SPACE;

    public static void init()
    {
        ISSUES = new ArrayList<Issue>();
        GUN_CONTROL         = new Issue("Gun Control", "");
        PROLIFE             = new Issue("Pro-Life", "");
        PROCHOICE           = new Issue("Pro-Choice", "");
        CLIMATE_CHANGE      = new Issue("Climate Change", "Are humans negatively affecting the planet's climate");
        KURDISTAN           = new Issue("Kurdistan", "Should a free and independent Kurdistan be supported");
        ISIS                = new Issue("ISIS", "Giant Islamic terror group in the Middle East");
        ENERGY              = new Issue("Energy", "How should America's energy be handled");
        OIL                 = new Issue("Oil", "How should it be used and regulated");
        FRACKING            = new Issue("Fracking", "Good or bad for the environment/economy");
        MARIJUANA           = new Issue("Marijuana", "Should it be legalized");
        DRUG_WAR            = new Issue("The War on Drugs", "Should drugs be sought to be eliminated or regulated");
        IMMIGRATION         = new Issue("Immigration", "To wall or not to wall, that is the question");
        HEALTHCARE          = new Issue("Healthcare", "How should healthcare be handled");
        EDUCATION           = new Issue("Education", "How should education be handled");
        ECONOMY             = new Issue("Economy", "How should the economy be deal with");
        BANKS               = new Issue("Banks", "What should be done about banks");
        WALL_STREET         = new Issue("Wall Street", "What should be done about Wall Street");
        CFR                 = new Issue("Campaign Finance Reform", "How should campaign financing be dealt with");
        DRONES              = new Issue("Drones", "What should be done about drone use");
        PUBLIC_SURVEILLANCE = new Issue("Public Surveillance", "What should be done about the NSA and similar programs");
        RUSSIA              = new Issue("Russia", "How should foreign relations be handled with Russia");
        CHINA               = new Issue("China", "How should foreign relations be handled with China");
        MINIMUM_WAGE        = new Issue("Minimum wage", "Should there be a minimum wage and/or what should it be");
        TERRORISM           = new Issue("Terrorism", "How should the US approach terrorism");
        DEBT                = new Issue("Debt", "What should be done about the debt");
        SPACE               = new Issue("Space, the final frontier", "How should space exploration be handled");
        
        PROLIFE.linkIssue(PROCHOICE, -1);
        PROCHOICE.linkIssue(PROLIFE, -1);
    }
}

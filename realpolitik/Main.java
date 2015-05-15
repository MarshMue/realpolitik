package realpolitik;
public class Main
{
    public static void main(String[] args)
    {
        Issues.init();
        Parties.init();
        
        IssueList list = new WeightedIssueList();
        System.out.println(list);
        list.add(Issues.PROLIFE, 24.);
        System.out.println(list);
    }
    
    public static void main()
    {
    	main(new String[0]);
    }
}

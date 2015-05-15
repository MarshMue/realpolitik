public class Main
{
    public static void main()
    {
        Issues.init();
        
        IssueList list = new IssueList();
        System.out.println(list);
        list.add(Issues.PROLIFE, 24.);
        System.out.println(list);
    }
}

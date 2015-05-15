package realpolitik;
import java.util.HashMap;

public class Issue
{
    private String name;
    private String desc;
    private HashMap<Issue, Double> linkedIssues;
    
    public Issue(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
        this.linkedIssues = new HashMap<Issue, Double>();
        Issues.ISSUES.add(this);
    }

    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public void linkIssue(Issue issue, double value)
    {
        linkedIssues.put(issue, value);
    }
    
    public HashMap<Issue, Double> getLinkedIssues()
    {
        return linkedIssues;
    }
}

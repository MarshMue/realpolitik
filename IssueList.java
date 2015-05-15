import java.util.HashMap;
import java.util.ArrayList;

public class IssueList
{
    private HashMap<Issue, Double> issues;
    
    public IssueList()
    {
        this.issues = new HashMap<Issue, Double>();
        
        for (Issue issue : Issues.ISSUES)
        {
            set(issue, 0.);
        }
    }
    
    public void add(Issue issue, double value)
    {
        HashMap<Issue, Double> linkedIssues = issue.getLinkedIssues();
        for (Issue linkedIssue : linkedIssues.keySet())
        {
            addRaw(linkedIssue, value * linkedIssues.get(linkedIssue));
        }
        addRaw(issue, value);
    }
    
    public void addRaw(Issue issue, double value)
    {
        double current = issues.get(issue);
        current += value;
        current = Math.min(current, Issues.MAX_VALUE);
        current = Math.max(current, -Issues.MAX_VALUE);
        issues.put(issue, current);
    }
    
    public void set(Issue issue, double value)
    {
        issues.put(issue, value);
    }
    
    public double get(Issue issue)
    {
        return issues.get(issue);
    }
    
    public String toString()
    {
        String output = "";
        for (Issue issue : issues.keySet())
        {
            output += issue.getName() + " \t" + issues.get(issue) + "\n";
        }
        return output;
    }
}

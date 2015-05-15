package realpolitik;
import java.util.HashMap;

public class WeightedIssueList extends IssueList
{
    private HashMap<Issue, Double> weightedIssues;
    
    public WeightedIssueList()
    {
        this.weightedIssues = new HashMap<Issue, Double>();
        
        for (Issue issue : Issues.ISSUES)
        {
            setWeight(issue, 0.);
        }
    }
    
    public void addWeight(Issue issue, double value)
    {
        HashMap<Issue, Double> linkedIssues = issue.getLinkedIssues();
        for (Issue linkedIssue : linkedIssues.keySet())
        {
            addWeightRaw(linkedIssue, value * linkedIssues.get(linkedIssue));
        }
        addWeightRaw(issue, value);
    }
    
    public void addWeightRaw(Issue issue, double value)
    {
        double current = weightedIssues.get(issue);
        current += value;
        current = Math.min(current, Issues.MAX_VALUE);
        current = Math.max(current, -Issues.MAX_VALUE);
        weightedIssues.put(issue, current);
    }
    
    public void setWeight(Issue issue, double value)
    {
        weightedIssues.put(issue, value);
    }
    
    public double getWeight(Issue issue)
    {
        return weightedIssues.get(issue);
    }
    
    public String toString()
    {
        String output = "";
        for (Issue issue : issues.keySet())
        {
            output += issue.getName() + "\t" + get(issue) + "\t" + getWeight(issue) + "\n";
        }
        return output;
    }
}

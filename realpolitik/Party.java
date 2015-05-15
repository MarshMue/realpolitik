package realpolitik;
import java.util.HashMap;

public class Party
{
    private String name;
    private String desc;
    private WeightedIssueList list;
    
    public Party(String name, String desc)
    {
        this.name = name;
        this.desc = desc;
        this.list = new WeightedIssueList();
        Parties.PARTIES.add(this);
    }

    public String getName()
    {
        return name;
    }
    
    public String getDesc()
    {
        return desc;
    }
    
    public double get(Issue issue)
    {
    	return list.get(issue);
    }
    
    public void setIssue(Issue issue, double opinion, double weight)
    {
    	list.set(issue, opinion);
    	list.setWeight(issue, weight);
    }
}

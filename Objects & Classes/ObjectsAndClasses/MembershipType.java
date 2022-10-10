package ObjectsAndClasses;

public class MembershipType {

    protected long max_points = 0;
    protected long min_points = 0;
    protected long numTradesPerDay = 0;

    MembershipType(long min,long max)
    {
        this.max_points = max;
        this.min_points = min;
    }
}

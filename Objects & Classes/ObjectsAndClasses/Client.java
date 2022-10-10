package ObjectsAndClasses;
import java.time.LocalDate;
import java.time.LocalTime;

public class Client {

    private String firstName;
    private String lastName;
    private MembershipType mtype;
    private long points = 0;
    private long tradesToday = 0;
    private LocalDate date;

    Client(String fname,String lname,MembershipType mtype)
    {
        this.firstName = fname;
        this.lastName = lname;
        this.mtype = mtype;
    }

    Client(String fname,String lname)
    {
        this(fname,lname,null);
    }

    public void addTrade(Trade trade)
    {
         
    }

    public boolean canTrade(Trade trade)
    {
        if(mtype == null)
            return false;

        if(trade.date.getDayOfYear() == LocalDate.now().getDayOfYear())
        {

            LocalTime t = LocalTime.now();
            boolean r1 = mtype instanceof Bronze && !(t.getHour() < 10);
            boolean r2 = points <= mtype.max_points && tradesToday < mtype.numTradesPerDay;

            if(r1 && r2)
                return true;
        }
        return false;
    }
}

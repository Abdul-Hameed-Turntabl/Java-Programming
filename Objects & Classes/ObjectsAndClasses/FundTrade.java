package ObjectsAndClasses;
public class FundTrade extends Trade {

    private double dividend = 0;
    private double percentage = 0;

    public FundTrade(String id,String symbol,long quantity,double percentage)
    {
        super(id,symbol,quantity,0);
        this.percentage = percentage%101;
    }

    public void calcDividend()
    {
        this.dividend = (this.percentage/100) * this.getPrice();
    }
}

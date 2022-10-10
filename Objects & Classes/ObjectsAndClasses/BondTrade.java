package ObjectsAndClasses;

public class BondTrade extends Trade {

    private double dividend = 0;

    public BondTrade(String id,String symbol,long quantity,double price,double dividend)
    {
        super(id,symbol,quantity,price);
    }

    public void calcDividend()
    {
        this.dividend = dividend;
    }
}

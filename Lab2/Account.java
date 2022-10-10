package Lab2;
import Lab2.Trade;

public class Account extends Trade {

    protected double totalTradeValue;
    Trade[] trades;
    Account()
    {
        super("","",0,0);
        this.totalTradeValue = 0;
    }

    void setTotalTradeValue(double value)
    {
        totalTradeValue = value;
    }



    double getTotalTradeValue()
    {
        return totalTradeValue;
    }
}

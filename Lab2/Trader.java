package Lab2;
import Lab2.Account;

public class Trader {
    
    private String name;
    Account account;

    Trader(String name)
    { 
        this.name = name;
    }

    void addTrade()
    {
        double newTradeValue = account.getTotalTradeValue() + (account.getPrice()*account.quantity);
        account.setTotalTradeValue(newTradeValue);
    }
}

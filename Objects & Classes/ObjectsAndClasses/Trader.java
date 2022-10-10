package ObjectsAndClasses;

public class Trader {
    private String name;
    public Account account = new Account();

    public Trader(String name)
    {
        this.name = name;
    }

    public void addTrade(Trade trade)
    {
        var currTrade = account.getTotalTradeValue();
        currTrade += trade.getPrice() * trade.quantity;
        account.setTotalTradeValue(currTrade);

        account.addTrade(trade);
    }
}

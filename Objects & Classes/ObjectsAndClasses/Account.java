package ObjectsAndClasses;

import java.util.ArrayList;

public class Account {

  private double totalTradeValue = 0;
  public ArrayList<Trade> trades = new ArrayList<>();

  Account(){}

  public void setTotalTradeValue(double tValue)
  {
    this.totalTradeValue = tValue;
  }

  public double getTotalTradeValue()
  {
    return totalTradeValue;
  }

  public void addTrade(Trade trade)
  {
    trades.add(trade);
  }

}

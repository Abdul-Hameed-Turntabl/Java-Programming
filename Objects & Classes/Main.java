import ObjectsAndClasses.*;

public class Main {
    public static void main(String[] args) {

        FundTrade ftrade = new FundTrade("xvfge","symko",100,10);
        ftrade.setPrice(100.343);

        Trader trader = new Trader("Abdul Hameed");
        trader.addTrade(ftrade);

        for(var t: trader.account.trades)
            System.out.println(t);
    }
}

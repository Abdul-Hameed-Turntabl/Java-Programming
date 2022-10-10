package Lab2;
import Lab2.Trade;

public class Bond extends Trade {
    private double dividend = 0;

    Bond(double dividend)
    {
        super("", "", 0,0);
        this.dividend = dividend;
    }

    public void calcDividend()
    {
        dividend += dividend;
    }
}

package ObjectsAndClasses;
import java.time.LocalDate;

public abstract class Trade 
{
    protected String id;
    protected String symbol;
    protected long quantity;
    protected LocalDate date;
    private double price;

    public Trade(String id,String symbol,long quantity,double price)
    {
        this.id = id;
        this.symbol = symbol;
        this.quantity = quantity;
        this.price = price;
        this.date = LocalDate.now();
    }

    public Trade(String id,String symbol,long quantity)
    {
        this(id,symbol,quantity,0.0);
    }

    @Override
    public String toString()
    {
        var builder = new StringBuilder();
        builder.append("Trade {\n\t");
        builder.append("id: " + id);
        builder.append("\n\tsymbol: " + symbol);
        builder.append("\n\tquantity: " + quantity);
        builder.append("\n\tprice: " + price);
        builder.append("\n}");
        return builder.toString();
    }

    public void setPrice(double price)
    {
        if(price < 0)
        {
            System.out.println("Price can only be positive");
            return;
        }
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public abstract void calcDividend();
}
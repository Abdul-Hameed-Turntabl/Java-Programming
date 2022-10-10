package Lab2;

public abstract class Trade {

    protected String Id;
    protected String sym;
    protected long quantity;
    private double price;

    Trade(String id,String Sym,long quantity,double price)
    {
        this.Id = id;
        this.sym = Sym;
        this.quantity = quantity;
        this.price = price;
    }

    Trade(String id,String Sym,long quantity)
    {
        this(id, Sym, quantity, 0);
        this.price = 0;
    }

    void setPrice(double price)
    {
        if(price < 0)
            return;
        this.price = price;
    }

    double getPrice()
    {
        return price;
    }

    @Override
    public String toString()
    {
        return "Trade { \n\tID : " + Id + "\n\tSymbol: " + sym + "\n\tQuantity: " + quantity + "\n\tprice: " + price + "\n}\n";
    }

    abstract void calcDividend();
}

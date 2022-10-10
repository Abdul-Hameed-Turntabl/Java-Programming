package Lab2;
import Lab2.Trade;

public class Fund extends Trade {

        private double percentage;
        private double dividend = 0;

        Fund(double percentage)
        {
            super("","",0,0);
            this.percentage = percentage;
        }

        public void calcDividend()
        {
            this.dividend += percentage * price; 
        }
}

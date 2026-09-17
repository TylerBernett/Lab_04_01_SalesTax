 class SalesTax
    {
        void main() // public static main (String[] args)
        {
            double purchasePrice = 23.50;
            double total = 0;
            double salesTax = 0;
            final double RATE = .05;

            salesTax = RATE * purchasePrice;
            total = salesTax + purchasePrice;

            IO.println("The total is " + total + " and the tax is " + salesTax);
        }
    }

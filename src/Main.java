//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));

    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}
class Main
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
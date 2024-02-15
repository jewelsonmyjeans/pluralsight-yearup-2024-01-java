//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] prices = { 5, 3, 18, 4 };



        prices[2] = 1;



        for(int index = 0; index < prices.length; index++) {

            int price = prices[index]

            System.out.print(price + " ");

        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args)

    {
        double itemPrice = 0.0;
        double shippingCost = 0.0;
        double SHIPPING_RATE = 0.02;
        double totalPrice = 0.0;
        int FREE_SHIPPING = 100;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter item price: ");
        itemPrice = in.nextDouble();

        if (itemPrice > FREE_SHIPPING) {

            System.out.println("Your shipping cost is free!");
            System.out.println("Your total price is " + itemPrice);

        } else {

            shippingCost = itemPrice * SHIPPING_RATE;
            totalPrice = itemPrice + shippingCost;
            System.out.println("Your shipping price is " + shippingCost);
            System.out.println("Your total price is " + totalPrice);

        }
    }
}
import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {

        double gas;
        double fuelEff;
        double pricePerGallon;
        double costPerHundred;
        double howFar;
        String trash;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of gallons of gas in the tank");
        if(in.hasNextDouble()) {
            gas = in.nextDouble();
            in.nextLine();

            System.out.println("Enter the fuel efficiency in miles");

            if(in.hasNextDouble()) {
                fuelEff = in.nextDouble();
                in.nextLine();

                System.out.println("Enter the price of gas per gallon");
                if (in.hasNextDouble()) {
                    pricePerGallon = in.nextDouble();
                    in.nextLine();

                    costPerHundred = (100 / fuelEff * pricePerGallon);
                    howFar = (gas * fuelEff);

                    System.out.println("Your cost per 100 miles is $" + costPerHundred);
                    System.out.println("You can travel " + howFar + " miles.");

                } else {
                    trash = in.nextLine();
                    System.out.println("You entered an invalid value " + trash);





                }
            }else {
                trash = in.nextLine();
                System.out.println("You entered an invalid value" + trash);
            }
        }else{
                trash = in.nextLine();
                System.out.println("You entered an invalid value" + trash);
            }
    }
}

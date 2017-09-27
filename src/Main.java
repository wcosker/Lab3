import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your car's MPG rating (miles per gallon) as a positive integer: ");
        int mpg = scanner.nextInt();
        if (mpg <= 0){
            System.out.print("ERROR: ONLY POSITIVE INTEGERS ARE ACCEPTED FOR MPG!!!");
            return;
        }
        System.out.print("Enter your car's tank capacity (gallons) as a positive decicmal number: ");
        double cap = scanner.nextDouble();
        if (cap<=0.0){
            System.out.print("ERROR: ONLY POSITIVE DECIMAL NUMBERS ARE ACCEPTED FOR TANK CAPACITY!!!");
            return;
        }
        System.out.print("Enter the percentage of the gas tank that is currently filled (from 0-100%): ");
        double gas = scanner.nextDouble();
        if(gas>100||gas<0){
            System.out.print("ERROR: PERCENTAGE MUST BE A DECIMAL NUMBER IN THE RANGE OF 0-100(INCLUSIVE)!!!");
            return;
        }
        int rawRange = (int) (mpg*cap*(gas*0.01));
        if(rawRange<25)System.out.print("Attention! Your current estimated range is running low: " + rawRange + " miles left!!!");
        else System.out.print("Keep driving! Your current estimated range is: "+rawRange+" miles!");
    }
}
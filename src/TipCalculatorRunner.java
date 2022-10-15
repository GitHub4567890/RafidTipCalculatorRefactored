import java.util.Scanner;

public class TipCalculatorRunner {
    public static void main(String[] args) {
        // Placeholder.
        // Object creation.
        Scanner scan = new Scanner(System.in);
        // Collecting info from user.
        System.out.println("Welcome to the tip calculator!");
        System.out.print("Enter the tip percentage: ");
        int tipPercent = scan.nextInt();
        System.out.print("Enter the number of people in the party: ");
        int people = scan.nextInt();
        // Object creation.
        TipCalculator calc = new TipCalculator(people, tipPercent);
        // Continue collection of info.
        String userInput = "a";
        while (!(userInput.equals("no"))) {
            userInput = scan.nextLine();
            userInput = calc.keywordsChecker("yes, no", userInput);
            calc.addMealAction(userInput);
            if (!(userInput.equals("no"))) {
                System.out.println("Would you like to add a/another meal price? Enter yes or no:");
            }
        }
            System.out.println("---------------------------------------------------------");
            System.out.println("Calculating...");
            // Output to user.
            System.out.println("---------------------------------------------------------");
            System.out.println("The tip percentage is: " + calc.getTipPercentage() + "%.");
            System.out.println("The tip is: $" + calc.tipAmount());
            System.out.println("The total bill without tip is: " + calc.getTotalBillBeforeTip());
            System.out.println("The total bill with tip is: $" + calc.totalBill());
            System.out.println("The per person cost before tip would be: " + calc.perPersonCostBeforeTip());
            System.out.println("The tip per person would be: $" + calc.perPersonTipAmount());
            System.out.println("The total per person with tip would be: $" + calc.perPersonTotalCost());
        }
    }

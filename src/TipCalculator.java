import java.util.Scanner;
public class TipCalculator {
    int numPeople;
    double tipPercentage;
    double totalBillBeforeTip;
    Scanner scan = new Scanner(System.in);

    public TipCalculator(int people, double percent) {
        numPeople = people;
        tipPercentage = percent;
        totalBillBeforeTip = 0.0;
    }

    public double getTotalBillBeforeTip() {
        return totalBillBeforeTip;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void addMeal(double cost) {
        totalBillBeforeTip += cost;
    }

    public double tipAmount() {
        return (totalBillBeforeTip * ((double) tipPercentage / 100));
    }

    public double totalBill() {
        return totalBillBeforeTip + tipAmount();
    }

    public double perPersonCostBeforeTip() {
        return (totalBillBeforeTip / numPeople);
    }

    public double perPersonTipAmount() {
        return (tipAmount() / numPeople);
    }

    public double perPersonTotalCost() {
        return (totalBill() / numPeople);
    }

    // Taken and modified from the web.
    static String keywordsChecker(String searchFor, String input) {
        String usedWord = "none";
        int count = 0;
        String[] word = input.split(",");
        for (int i = 0; i < word.length; i++) {
            if (searchFor.contains(word[i])) {
                usedWord = word[i];
            }
        }
        return usedWord;
    }

    public String addMealAction(String userInput) {
        String a = "completed run";
        if (userInput.equals("yes")) {
            System.out.println("---------------------------------------------------------");
            System.out.println("Add the price of the meal in 0.00 format (do not include a dollar sign).");
            double newMealCost = scan.nextDouble();
            addMeal(newMealCost);
            System.out.println("Your new total bill before tip is: " + getTotalBillBeforeTip());
            System.out.println("---------------------------------------------------------");
            return a;
        } else if (userInput.equals("a")) {
            return a;
        } else if (userInput.equals("none")) {
            System.out.println("Please enter yes or no.");
            return a;
        }
        return a;
    }
}

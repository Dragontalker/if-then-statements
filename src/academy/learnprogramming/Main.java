package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = true;
        if (isAlien) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 90;
        if (topScore > 80) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore >= 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? false : true;
        System.out.println("wasCar = " + wasCar);

        // Challenge
        double firstValue = 20.00d;
        double secondValue = 80.00d;
        double totalValue = firstValue + secondValue * 100.00d;
        System.out.println("totalValue = " + totalValue);
        double remainderValue = (int) totalValue % 40.00d;
        System.out.println("remainderValue = " + remainderValue);
        boolean checkZero = (remainderValue == 0) ? true : false;
        if (!checkZero) {
            System.out.println("Got some remainder");
        }
    }
}

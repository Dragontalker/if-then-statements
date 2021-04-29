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
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}

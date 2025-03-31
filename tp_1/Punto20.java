package tp_1;

import java.util.Random;

class NumberGuessingGame {
    public static int generateRandomNumber() {
        Random random = new Random();
        return random.nextInt(1000) + 1;
    }

    public static String checkGuess(int guess, int target) {
        if (guess > target) {
            return "Demasiado alto";
        } else if (guess < target) {
            return "Demasiado bajo";
        } else {
            return "correcto";
        }
    }
}

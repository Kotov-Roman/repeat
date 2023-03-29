package leetcode.algorithms.binarySearch;

//https://leetcode.com/problems/guess-number-higher-or-lower/
//-1: Your guess is higher than the number I picked (i.e. num > pick).
// 1: Your guess is lower than the number I picked (i.e. num < pick).
// 0: your guess is equal to the number I picked (i.e. num == pick).
public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int lowerBoundary = 0;
        int upperBoundary = n;
        int area = 0;
        while (true) {
            int guess = guess(n);
            switch (guess) {
                case -1: {
                    // Your guess is higher than the number I picked
                    upperBoundary = n;
                    area = upperBoundary - lowerBoundary;
                    n = area / 2 + area % 2;
                    break;
                }
                case 0: {
                    //guess is equal
                    return n;
                }
                case 1: {
                    // Your guess is lower than the number I picked
                    lowerBoundary = n;
                    area = upperBoundary - lowerBoundary;
                    n = n + area / 2 + area % 2;
                    break;
                }
            }
        }
    }

    private int guess(int num) {
        return 0;
    }
}

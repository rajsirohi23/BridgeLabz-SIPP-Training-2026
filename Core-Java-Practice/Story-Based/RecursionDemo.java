public class RecursionDemo {

    static int moveCount = 0;

    // Tower of Hanoi
    static void towerOfHanoi(int n, char source, char helper, char destination) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + source + " to " + destination);
            moveCount++;
            return;
        }

        towerOfHanoi(n - 1, source, destination, helper);

        System.out.println("Move disk " + n + " from " + source + " to " + destination);
        moveCount++;

        towerOfHanoi(n - 1, helper, source, destination);
    }

    // Recursive Binary Search
    static int binarySearch(int[] arr, int low, int high, int target) {
        if (low > high)
            return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target)
            return mid;

        if (target < arr[mid])
            return binarySearch(arr, low, mid - 1, target);

        return binarySearch(arr, mid + 1, high, target);
    }

    // Sum of Digits
    static int sumDigits(int n) {
        if (n == 0)
            return 0;

        return n % 10 + sumDigits(n / 10);
    }

    // Reverse String
    static String reverse(String str) {
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);
    }

    // Balanced Parentheses without Stack
    static boolean balanced(String str, int count, int index) {

        if (count < 0)
            return false;

        if (index == str.length())
            return count == 0;

        char ch = str.charAt(index);

        if (ch == '(')
            return balanced(str, count + 1, index + 1);

        if (ch == ')')
            return balanced(str, count - 1, index + 1);

        return balanced(str, count, index + 1);
    }

    public static void main(String[] args) {

        // Tower of Hanoi
        int n = 3;
        towerOfHanoi(n, 'A', 'B', 'C');
        System.out.println("Total Moves = " + moveCount);

        // Binary Search
        int[] prices = {100, 200, 300, 400, 500};
        int target = 400;

        int index = binarySearch(prices, 0, prices.length - 1, target);
        System.out.println("Price found at index: " + index);

        // Sum of Digits
        System.out.println("Sum of digits = " + sumDigits(12345));

        // Reverse String
        System.out.println("Reverse = " + reverse("Hospital"));

        // Balanced Parentheses
        String exp = "((()))";
        System.out.println("Balanced? " + balanced(exp, 0, 0));
    }
}
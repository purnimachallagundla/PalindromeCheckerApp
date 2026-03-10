import java.util.*;

class TwoPointerPalindromeUC13 {

    public boolean check(String input) {

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

class StackPalindromeUC13 {

    public boolean check(String input) {

        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : input.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}

class ReverseStringPalindromeUC13 {

    public boolean check(String input) {

        String reversed = new StringBuilder(input).reverse().toString();
        return input.equals(reversed);
    }
}

class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC13: Performance Comparison of Palindrome Algorithms ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        TwoPointerPalindromeUC13 algo1 = new TwoPointerPalindromeUC13();
        StackPalindromeUC13 algo2 = new StackPalindromeUC13();
        ReverseStringPalindromeUC13 algo3 = new ReverseStringPalindromeUC13();

        long start1 = System.nanoTime();
        boolean result1 = algo1.check(input);
        long end1 = System.nanoTime();
        long time1 = end1 - start1;

        long start2 = System.nanoTime();
        boolean result2 = algo2.check(input);
        long end2 = System.nanoTime();
        long time2 = end2 - start2;

        long start3 = System.nanoTime();
        boolean result3 = algo3.check(input);
        long end3 = System.nanoTime();
        long time3 = end3 - start3;

        System.out.println("\n--- Results ---");
        System.out.println("Two Pointer Result: " + result1 + " | Time: " + time1 + " ns");
        System.out.println("Stack Result: " + result2 + " | Time: " + time2 + " ns");
        System.out.println("Reverse Result: " + result3 + " | Time: " + time3 + " ns");

        sc.close();
    }
}
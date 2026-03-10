import java.util.Scanner;

class PalindromeChecker {

    public boolean checkPalindrome(String input) {

        char[] arr = input.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== UC11: Object-Oriented Palindrome Service ===");
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        sc.close();
    }
}
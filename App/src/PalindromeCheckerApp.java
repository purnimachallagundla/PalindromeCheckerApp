import java.util.Scanner;

class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        input = input.toLowerCase();

        input = input.replaceAll("\\s+", "");

        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println("Result: It is a palindrome (ignoring spaces and case).");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }

        sc.close();
    }
}
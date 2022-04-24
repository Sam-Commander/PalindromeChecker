import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {

        System.out.println("Choose your f̶i̶g̶h̶t̶e̶r̶ palindrome checker (1 or 2)");
        Scanner sc = new Scanner(System.in);
        String picker = sc.nextLine();

        while(true) {

            System.out.println("Please type a single word to see if its a palindrome, or type q to quit");

            String input = sc.nextLine();

            PalindromeChecker pc = new PalindromeChecker();

            if (input.equals("q")){
                break;
            }

            switch(picker){
                case "1":
                    if (pc.isPalindrome1(input)) {
                        pc.yesPalindrome(input);
                    } else {
                        pc.noPalindrome(input);
                    }
                    break;
                case "2":
                    if (pc.isPalindrome2(input)) {
                        pc.yesPalindrome(input);
                    } else {
                        pc.noPalindrome(input);
                    }
                    break;
            }
        }
    }

    public void yesPalindrome(String word){
        System.out.println(word + " is indeed a palindrome");
    }

    public void noPalindrome(String word){
        System.out.println(word + " is not a palindrome");
    }

    public boolean isPalindrome1(String word) {
        int count = 0;
        for(int i = 0; i < word.length() / 2; i++) {
            char L = word.charAt(i);
            char R = word.charAt(word.length() - 1 - count);
            if(L == R){
                count++;
            } else {
                return false;
            }
        } return true;
    }

    public boolean isPalindrome2(String word){
        int start = 0;
        int end = word.length() - 1;
        for(int i = word.length() - 1; i >= 0; i--){
            if (word.toCharArray()[start] != word.toCharArray()[end]) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }
}
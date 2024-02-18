package weeklyquiz04;

import java.util.Scanner;
import java.util.Stack;
public class parenthesisPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("괄호를 입력해주세요");
        String parenthesis = sc.nextLine();

        boolean answer = answer(parenthesis);
        System.out.println(answer);
    }

    static boolean answer(String parenthesis) {

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(i) == '(') {
                stack.push("(");
            } else if (parenthesis.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                } else stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return false;
        } else return true;

    }
}

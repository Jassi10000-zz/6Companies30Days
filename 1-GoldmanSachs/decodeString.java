import java.util.*;
import java.util.Scanner;

class decodeString {
    static String decodedString(String s) {
        Stack<String> prefixes = new Stack<>();
        Stack<Integer> numbers = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int number = 0;
                while (Character.isDigit(s.charAt(i))) {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                numbers.push(number);
                prefixes.push(sb.toString());
                sb.setLength(0);
            } else if (c == ']') {
                String inner = sb.toString();
                sb.setLength(0);
                sb.append(prefixes.pop());
                int number = numbers.pop();
                for (int j = 0; j < number; j++) {
                    sb.append(inner);
                }
            } else {// a regular character
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
import java.util.*;
import java.util.Scanner;

class runlengthEncoding {
    String encode(String str) {
        String des = "";
        for (int i = 0; i < str.length(); i++) {

            des += str.charAt(i);
            int c = 1;

            while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                c++;
                i++;
            }
            des += c + "";
        }
        return des;
    }
}

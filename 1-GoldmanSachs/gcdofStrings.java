import java.util.*;
import java.util.Scanner;

class gcdOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        if (str2.length() == 0)
            return str1;

        return gcdOfStrings(str2, str1.substring(0, str1.length() % str2.length()));
    }
}
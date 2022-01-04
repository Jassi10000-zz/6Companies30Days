import java.util.*;
import java.util.Scanner;

class numberFollApattern {
    static String printMinNumberForPattern(String s) {
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int num = 1;
        st.push(num);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'D') {
                st.push(++num);
            } else {
                while (st.size() > 0) {
                    ans += st.pop();
                }
                st.push(++num);
            }
        }
        while (st.size() > 0) {
            ans += st.pop();
        }
        return ans;
    }
}
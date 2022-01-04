import java.util.*;
import java.util.Scanner;

public class printAnagramsTogether {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.nextLine();
        }
        List<List<String>> ans = new ArrayList<>();
        anagrams(str, ans);
    }

    public static List<List<String>> anagrams(String[] str, List<List<String>> ans) {
        int n = str.length;
        HashMap<String, Integer> map = new HashMap<>();
        int index=0;
        for (int i = 0; i < n; i++) {
            char arr[] = new char[str[i].length()];
            arr = str[i].toCharArray();

            Arrays.sort(arr);

            String word = new String(arr);
            List<String> list = new ArrayList<>();
            if(map.containsKey(word)) {
                int value = map.get(word);
                list = ans.get(value);
                list.add(str[i]);
                ans.set(value, list);
            }
            else {
                list.add(str[i]);
                map.put(word,index);
                ans.add(list);
                index++;
            }
        }
        return ans;
    }
}

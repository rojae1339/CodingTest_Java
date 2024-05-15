import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        for (int i = 0; i < strings.length; i++) {

            String s = strings[i];
            String sub = s.substring(n, n + 1);
            strings[i] = sub + s;
        }

        Arrays.sort(strings);

        for (int i = 0; i < strings.length; i++) {
            
            strings[i] = strings[i].substring(1);
        }

        return strings;
    }
}
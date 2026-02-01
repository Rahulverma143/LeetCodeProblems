import java.util.*;

class Solution {
    public String reorganizeString(String s) {

        int n = s.length();
        PriorityQueue<int[]> pq =
                new PriorityQueue<>((a, b) -> b[0] - a[0]);

        Map<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
   
        for (Map.Entry<Character, Integer> e : mp.entrySet()) {
            char k = e.getKey();
            int f = e.getValue();
            pq.add(new int[]{f, k});
        }

        StringBuilder res = new StringBuilder();

        while (pq.size() > 1) {
            int[] first = pq.poll();
            int[] second = pq.poll();

            res.append((char) first[1]);
            res.append((char) second[1]);

            if (--first[0] > 0) pq.add(first);
            if (--second[0] > 0) pq.add(second);
        }

       
        if (pq.size() == 1) {
            int[] rem = pq.poll();
            if (rem[0] > 1) return "";
            res.append((char) rem[1]);
        }

        return res.toString();
    }
}

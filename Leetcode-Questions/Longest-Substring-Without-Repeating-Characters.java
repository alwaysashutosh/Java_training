1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        int start = 0, end = 0;
5        int max = 0;
6        HashSet<Character> set = new HashSet<>();
7
8        while (end < s.length()) {
9
10            if (!set.contains(s.charAt(end))) {
11                set.add(s.charAt(end));
12                end++;
13                max = Math.max(max, set.size());
14            }
15            else {
16                set.remove(s.charAt(start));
17                start++;
18            } 
19        }
20        return max;     
21    }
22}
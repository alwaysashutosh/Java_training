1class Solution {
2    public List<String> letterCombinations(String digits) {
3        String[][] numbers ={{"a","b","c"},
4                            {"d","e","f"},
5                            {"g","h","i"},
6                            {"j","k","l"},
7                            {"m","n","o"},
8                            {"p","q","r","s"},
9                            {"t","u","v"},
10                            {"w","x","y","z"}};
11
12        List<String> c= new ArrayList<>();
13
14        if(digits.length()==1){
15            int v= digits.charAt(0)-'0';
16            for(String n: numbers[v-2]){
17            c.add(n);
18           }
19            return c;
20        }
21
22        int first = digits.charAt(0) - '0';
23        for (String s : numbers[first - 2]) {
24            c.add(s);
25        }
26
27        for (int i = 1; i < digits.length(); i++) {
28            int digit = digits.charAt(i) - '0';
29            List<String> temp = new ArrayList<>();
30
31            for (String prev : c) {
32                for (String letter : numbers[digit - 2]) {
33                    temp.add(prev + letter);
34                }
35            }
36
37            c = temp;
38        }
39
40        return c;
41        }
42}
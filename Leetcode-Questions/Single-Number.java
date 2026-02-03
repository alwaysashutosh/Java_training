1class Solution {
2    public int singleNumber(int[] nums) {
3        Map<Integer,Integer>map=new HashMap<>();
4
5        for (int num:nums){
6            if(map.containsKey(num)){
7                map.put(num,map.get(num)+1);
8
9            }
10            else{
11                map.put(num,1);
12            }
13
14
15        }
16            
17            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
18               if (entry.getValue() == 1) {
19                  return entry.getKey();
20            }
21        }
22
23        return -1;
24
25    }
26}
27
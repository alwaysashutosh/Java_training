1class Solution {
2    public int majorityElement(int[] nums) {
3
4        HashMap<Integer,Integer> map = new HashMap<>();
5
6        for(int i = 0 ; i < nums.length ; i++){
7            if(map.containsKey(nums[i])){
8                map.put(nums[i],map.get(nums[i]) + 1);
9            }
10            else{
11                map.put(nums[i],1);
12            }
13        }
14
15        for (Map.Entry<Integer, Integer> temp : map.entrySet()) {
16            if (temp.getValue() > nums.length/2) {
17                return temp.getKey();
18            }
19        }
20
21        return 0;
22    }
23}
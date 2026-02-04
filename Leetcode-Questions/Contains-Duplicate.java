1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        Set<Integer>set =new HashSet<>();
4        for (int num : nums){
5            if(!set.add(num)){
6
7                return true;
8            }
9        }
10
11        return false;
12
13        
14    }
15}
1class Solution {
2    public boolean isGood(int[] nums) {
3        //my approach with
4        int max = Integer.MIN_VALUE;//min value integer c;ass
5        for(int i = 0; i < nums.length; i++) {
6            max = Math.max(nums[i], max);
7        }
8
9        if(nums.length != max + 1) return false;
10
11        HashSet<Integer> set = new HashSet<>();
12        int count = 0;
13        for(int i = 0; i < nums.length; i++) {
14            set.add(nums[i]);
15            if(nums[i] == max) count++;
16        }
17
18        if(count != 2) return false;
19        return set.size() == max;
20    }
21}
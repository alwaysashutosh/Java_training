1class Solution {
2    public int findLucky(int[] arr) {
3        int max = -1;
4        HashMap<Integer, Integer> map = new HashMap<>();
5        for(int i : arr){
6            map.put(i , map.getOrDefault(i,0) + 1);
7        }
8        for(int i = 0; i< arr.length; i++){
9            if(map.get(arr[i]) == arr[i]){
10                max = Math.max(max, arr[i]);
11            }
12        }
13        return max;
14    }
15}
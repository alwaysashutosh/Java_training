1class Solution { 
2    // my approach
3    public boolean isTrionic(int[] arr) {
4      int p = -1;
5      int q = -1;
6      int r = -1;
7      boolean c = true;
8       boolean c1 = true;
9      boolean c2 = true;
10      for(int i = 1 ; i<arr.length ; i++){
11        if(arr[i] > arr[i-1] && c == true){
12            p = i-1;
13            continue;
14        }
15
16        c = false;
17
18        if(arr[i] < arr[i-1] && c1 == true){
19            q = i-1;
20            continue;
21        }
22        c1 = false;
23
24         if(arr[i] > arr[i-1] && c2 == true){
25        r = i;
26        continue;}
27        c2 = false;
28
29      }
30    
31  //  System.out.println(r);
32
33
34     if(p == -1 || p >= arr.length || q >= arr.length || q == -1 || r == -1 || p > q || q > r ||r < arr.length-1 )
35      return false;
36
37      
38
39      return true;
40        
41    }
42}
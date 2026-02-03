1import java.util.*;
2
3class Solution {
4    public int[] dailyTemperatures(int[] temp) {
5//         boolean check = false;
6//         for(int i=0;i<temp.length;i++){
7//             check = false;
8//             for(int j=i+1;j<temp.length;j++){
9//                 if(temp[j]>temp[i]){
10//                     temp[i] = j-i;
11//                     check = true;
12//                     break;
13//                 }
14//             }
15//             if(check == false){
16//                 temp[i]=0;
17//             }
18//         }
19//         return temp;
20//     }
21// }
22
23
24    int n=temp.length;
25    //int answer;
26    int [] answer=new int[n];
27    Stack<Integer> stackk = new Stack<Integer>();
28    for (int i=0;i<n;i++){
29        while (!stackk.isEmpty() && temp[i] > temp[stackk.peek()]){
30            int prev=stackk.pop();
31            answer[prev]=i-prev;
32
33        }
34        stackk.push(i);
35
36    }
37    return answer;
38    }
39}
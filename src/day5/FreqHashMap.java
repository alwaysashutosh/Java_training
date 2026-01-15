package day5;

import java.util.HashMap;

public class FreqHashMap {
    public static void main(String[] args) {
        int [] arr={5,4,5,4,5,9};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        System.out.println(hm);
    }
}

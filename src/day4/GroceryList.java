package day4;

import java.util.ArrayList;

public class GroceryList {
    public static void printGroceryItem(ArrayList<String> arr,int idx) {
        System.out.println("Item at " + "position " + (idx+1) + " is " + arr.get(idx));
    }
    public static void printGroceryList(ArrayList<String> arr) {
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();

        //Task 1 - Input grocery into List
        groceryList.add("Milk");
        groceryList.add("Bread");
        groceryList.add("Cheese");
        groceryList.add("Cake");
        groceryList.add("Fish");

        //Task 2 - Print 1st and 3rd items
        printGroceryItem(groceryList,0);
        printGroceryItem(groceryList,2);

        //Replace the 2nd item with a new one
        System.out.println("Changing the 2nd Item from the List");
        groceryList.set(1,"Egg");
        printGroceryItem(groceryList,1);

        //Add a new item at the end
        System.out.println("Adding new Item to List");
        groceryList.add("Peanuts");
        printGroceryItem(groceryList,groceryList.size()-1);

        //Print the final List
        System.out.println("Grocery List:");
        printGroceryList(groceryList);
    }
}

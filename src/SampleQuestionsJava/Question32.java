package SampleQuestionsJava;

import java.util.*;

public class Question32 {
    static class Product {
        String productID;
        int totalSalesAmount;
        
        public Product(String id, int amount) {
            this.productID = id;
            this.totalSalesAmount = amount;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> productMap = new HashMap<>();
        
        System.out.println("Enter product records (product_ID-total_sales_amount), one per line.");
        System.out.println("Press Ctrl+C to end input.");
        
        while (scanner.hasNextLine()) {
            try {
                String line = scanner.nextLine().trim();
                if (line.isEmpty()) break;
                
                String[] parts = line.split("-");
                if (parts.length == 2) {
                    String id = parts[0].trim();
                    int amount = Integer.parseInt(parts[1].trim());
                    
                    // Keep only the highest sales amount for each product
                    productMap.put(id, Math.max(productMap.getOrDefault(id, 0), amount));
                }
            } catch (Exception e) {
                break;
            }
        }
        
        // Convert to list and sort by sales amount (descending)
        List<Product> products = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : productMap.entrySet()) {
            products.add(new Product(entry.getKey(), entry.getValue()));
        }
        
        products.sort((p1, p2) -> Integer.compare(p2.totalSalesAmount, p1.totalSalesAmount));
        
        // Print results
        for (Product product : products) {
            System.out.println(product.productID + "-" + product.totalSalesAmount);
        }
        
        scanner.close();
    }
}
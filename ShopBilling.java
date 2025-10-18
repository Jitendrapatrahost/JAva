import java.util.Scanner;

class Product {
   
    int pid;
    String pname;
    String category;
    float price;
    float quantity;
    float totalCost;
    float discount;

    
    public Product() {
        pid = 0;
        pname = "Unknown";
        category = "None";
        price = 0.0f;
        quantity = 0.0f;
        totalCost = 0.0f;
        discount = 0.0f;
    }

    public Product(int pid, String pname, float price) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.category = "None";
        this.quantity = 0.0f;
        this.totalCost = 0.0f;
        this.discount = 0.0f;
    }

    public void compute() {
        totalCost = price * quantity;
    }

    public void computeDiscount() {
        if (totalCost < 1000) {
            discount = totalCost * 0.05f;  // 5%
        } else if (totalCost >= 1000 && totalCost < 5000) {
            discount = totalCost * 0.10f;  // 10%
        } else if (totalCost >= 5000) {
            discount = totalCost * 0.15f;  // 15%
        }
    }

    public void display() {
        System.out.println("Product ID: " + pid);
        System.out.println("Name: " + pname);
        System.out.println("Category: " + category);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost);
        System.out.println("Discount: " + discount);
        System.out.println("Final Amount: " + (totalCost - discount));
        System.out.println("---------------------------");
    }
}

public class ShopBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        Product[] products = new Product[n];

        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");

            System.out.print("Product ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Product Name: ");
            String name = sc.nextLine();

            System.out.print("Category: ");
            String category = sc.nextLine();

            System.out.print("Price: ");
            float price = sc.nextFloat();

            System.out.print("Quantity: ");
            float quantity = sc.nextFloat();
            sc.nextLine(); // consume newline

            // Create product object
            Product p = new Product(id, name, price);
            p.category = category;
            p.quantity = quantity;

            // Compute total and discount
            p.compute();
            p.computeDiscount();

            // Store in array
            products[i] = p;
        }

        // Display all products and bills
        System.out.println("\n------- BILL DETAILS -------");
        for (int i = 0; i < n; i++) {
            products[i].display();
        }

        sc.close();
    }
}

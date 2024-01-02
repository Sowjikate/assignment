
import java.util.Scanner;

public class InventoryManagementSystem {
    static String[] productNames = {"Mobile", "Laptop", "Tablet", "Portable HDD", "Bluetooth Headphone", "Smart-watch", "Digital Camera", "Portable Power bank", "Printer", "Wireless Router"};
    static String[] specifications = {"4G, 128GB", "8GB RAM, 1TB HDD", "10-inch display, 64GB", "1TB capacity", "Noise-canceling, wireless", "iOS and Android compatibility", "20MP, Full HD recording", "10000mAh", "Color printer", "Dual-band, 4G connectivity"};
    static double[] costs = {800.0, 1200.0, 500.0, 100.0, 100.0, 200.0, 300.0, 50.0, 150.0, 80.0};
    static int[] quantities = {10, 5, 15, 20, 30, 25, 8, 12, 7, 10};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("\nWelcome to the SmartPoint Electronics Store\n");
            System.out.println("1. View the complete list of our products");
            System.out.println("2. Check the available count for a specific product");
            System.out.println("3. View the specifications and details of a specific product");
            System.out.println("4. Modify the details of a specific product");
            System.out.println("5. Update the inventory for a specific product");
            System.out.println("6. Exit");
            System.out.print("\nPlease choose an option from the above menu: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayProductList();
                    break;
                case 2:
                    checkProductCount(scanner);
                    break;
                case 3:
                    viewProductDetails(scanner);
                    break;
                case 4:
                    editProduct(scanner);
                    break;
                case 5:
                    updateInventory(scanner);
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        System.out.println("\nThank you for visiting SmartPoint!");
        scanner.close();
    }

    public static void displayProductList() {
        System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
        System.out.println("List of all Products\n");
        System.out.println("Product ID   Product Name\n");

        for (int i = 0; i < productNames.length; i++) {
            System.out.printf("%9d%18s\n", (i + 101), productNames[i]);
        }

        System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("\nThank you for visiting SmartPoint!");
            System.exit(0);
        }
    }

    public static void checkProductCount(Scanner scanner) {
        System.out.print("\nEnter the Product ID: ");
        int productId = scanner.nextInt();

        if (productId >= 101 && productId <= 110) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
            System.out.println(productId + productNames[productId - 101]);
            System.out.println("Total available count: " + quantities[productId - 101]);
        } else {
            System.out.println("\nInvalid Product ID.");
        }

        System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("\nThank you for visiting SmartPoint!");
            System.exit(0);
        }
    }

    public static void viewProductDetails(Scanner scanner) {
        System.out.print("\nEnter the Product ID: ");
        int productId = scanner.nextInt();

        if (productId >= 101 && productId <= 110) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
            System.out.println(productId + productNames[productId - 101]);
            System.out.println("Total available count: " + quantities[productId - 101]);
            System.out.println("Specifications: " + specifications[productId - 101]);
        } else {
            System.out.println("\nInvalid Product ID.");
        }

        System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("\nThank you for visiting SmartPoint!");
            System.exit(0);
        }
    }

    public static void editProduct(Scanner scanner) {
        System.out.print("\nEnter the Product ID: ");
        int productId = scanner.nextInt();

        if (productId >= 101 && productId <= 110) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
            System.out.println(productId + productNames[productId - 101]);
            System.out.println("Total available count: " + quantities[productId - 101]);
            System.out.println("Specifications: " + specifications[productId - 101]);

            System.out.println("\nSelect the detail to modify:");
            System.out.println("1. Specifications");
            System.out.println("2. Cost");
            System.out.println("3. Available Quantity");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the new specifications: ");
                    scanner.nextLine();
                    String newSpecs = scanner.nextLine();
                    specifications[productId - 101] = newSpecs;
                    System.out.println("\nSpecifications updated successfully!");
                    break;
                case 2:
                    System.out.print("\nEnter the new cost: ");
                    double newCost = scanner.nextDouble();
                    costs[productId - 101] = newCost;
                    System.out.println("\nCost updated successfully!");
                    break;
                case 3:
                    System.out.print("\nEnter the new available quantity: ");
                    int newQuantity = scanner.nextInt();
                    quantities[productId - 101] = newQuantity;
                    System.out.println("\nAvailable quantity updated successfully!");
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } else {
            System.out.println("\nInvalid Product ID.");
        }

        System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("\nThank you for visiting SmartPoint!");
            System.exit(0);
        }
    }

    public static void updateInventory(Scanner scanner) {
        System.out.print("\nEnter the Product ID: ");
        int productId = scanner.nextInt();

        if (productId >= 101 && productId <= 110) {
            System.out.println("\n-----------------------------------------------------------------------------------------------------\n");
            System.out.println(productId + productNames[productId - 101]);
            System.out.println("Total available count: " + quantities[productId - 101]);

            System.out.println("\n1. Add inventory");
            System.out.println("2. Subtract inventory");

            System.out.print("\nEnter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("\nCurrent available inventory for " + productNames[productId - 101] + ": " + quantities[productId - 101]);
                    System.out.print("\nPlease enter the count to be added: ");
                    int addCount = scanner.nextInt();
                    quantities[productId - 101] += addCount;
                    System.out.println("\nInventory updated successfully!");
                    break;
                case 2:
                    System.out.print("\nCurrent available inventory for " + productNames[productId - 101] + ": " + quantities[productId - 101]);
                    System.out.print("\nPlease enter the count to be subtracted: ");
                    int subtractCount = scanner.nextInt();
                    if (subtractCount <= quantities[productId - 101]) {
                        quantities[productId - 101] -= subtractCount;
                        System.out.println("\nInventory updated successfully!");
                    } else {
                        System.out.println("\nInsufficient inventory. Cannot subtract " + subtractCount + " units.");
                    }
                    break;
                default:
                    System.out.println("\nInvalid choice. Please try again.");
            }
        } else {
            System.out.println("\nInvalid Product ID.");
        }

        System.out.print("\nEnter 'Y' to return to the main menu or 'N' to Exit: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            return;
        } else {
            System.out.println("\nThank you for visiting SmartPoint!");
            System.exit(0);
        }
    }
}


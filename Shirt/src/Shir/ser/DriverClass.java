package Shir.ser;

import java.util.*;

import java.util.Scanner;

public class DriverClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShirtService service = new ShirtService();
        
        // Adding shirts to the service
        service.addShirt(new Shirt("arrow", 40, 2300, "blue"));
        service.addShirt(new Shirt("blackberry", 42, 2800, "white"));
        service.addShirt(new Shirt("arrow", 40, 2900, "red"));
        service.addShirt(new Shirt("blackberry", 38, 1800, "white"));
        service.addShirt(new Shirt("levis", 42, 3800, "white"));
        service.addShirt(new Shirt("adidas", 40, 1500, "red"));
        service.addShirt(new Shirt("blackberry", 38, 4800, "white"));

        int choice;
        do {
            System.out.println("====== Shirt Store Menu ======");
            System.out.println("1. Access All Shirts");
            System.out.println("2. Access Shirts by Brand");
            System.out.println("3. Access Shirts by Price and Color");
            System.out.println("4. Sort Shirts from Low to High Price");
            System.out.println("5. Get All Shirt Brands");
            System.out.println("6. Get Count of Each Brand");
            System.out.println("7. Get Count of Shirts by Size");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // Consume newline left by nextInt()

            switch (choice) {
                case 1:
                    System.out.println("====== Access All Shirts ======");
                    service.getAllShirts();
                    break;

                case 2:
                    System.out.println("====== Access Shirts by Brand ======");
                    System.out.print("Enter Brand: ");
                    String brand = sc.nextLine();
                    service.getShirtByBrand(brand);
                    break;

                case 3:
                    System.out.println("====== Access Shirts by Price and Color ======");
                    System.out.print("Enter min price: ");
                    double min = sc.nextDouble();
                    System.out.print("Enter max price: ");
                    double max = sc.nextDouble();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Color: ");
                    String color = sc.nextLine();
                    service.getShirtByPriceAndColor(min, max, color);
                    break;

                case 4:
                    System.out.println("===== Sorted Shirts On Low To High Price =====");
                    service.sortShirtOnLowToHighPrice();
                    break;

                case 5:
                    System.out.println("======= Get All Brands =======");
                    service.getAllBrands();
                    break;

                case 6:
                    System.out.println("======== Get Count of Brands =======");
                    service.getCountOfBrands();
                    break;

                case 7:
                    System.out.println("======== Get Count of Shirts by Size =======");
                    service.getCountBySize();
                    break;

                case 8:
                    System.out.println("=====================the Programme is terminated.=======================================================");
                    break;

                default:
                    System.out.println("Invalid choice, sir please choose the correct number.");
                    break;
            }

        } while (choice != 8); // Loop until the user chooses to exit
    }
}

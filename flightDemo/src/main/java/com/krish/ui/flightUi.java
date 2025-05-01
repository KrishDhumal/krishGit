package com.krish.ui;

import java.util.List;
import java.util.Scanner;

import com.krish.pojo.flightPojo;
import com.krish.service.flightService;
import com.krish.service.flightServiceImpl;

public class flightUi {
    public static void main(String[] args) {
        flightService service = new flightServiceImpl();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add Flight");
            System.out.println("2. List Flights");
            System.out.println("3. Search by Code");
            System.out.println("4. Search by Carrier");
            System.out.println("5. Search by Route");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    System.out.print("Enter Code: ");
                    int code = sc.nextInt(); sc.nextLine();
                    System.out.print("Enter Carrier: ");
                    String carrier = sc.nextLine();
                    System.out.print("Enter Source: ");
                    String source = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dest = sc.nextLine();
                    flightPojo f = new flightPojo(code, carrier, source, dest);
                    boolean saved = service.save(f);
                    System.out.println(saved ? "Flight added." : "Failed to add flight.");
                    break;

                case 2:
                    List<flightPojo> flights = service.list();
                    flights.forEach(System.out::println);
                    break;

                case 3:
                    System.out.print("Enter Flight Code: ");
                    int searchCode = sc.nextInt();
                    flightPojo found = service.findByCode(searchCode);
                    System.out.println(found != null ? found : "Flight not found.");
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter Carrier: ");
                    String searchCarrier = sc.nextLine();
                    List<flightPojo> byCarrier = service.findByCarrier(searchCarrier);
                    byCarrier.forEach(System.out::println);
                    break;

                case 5:
                    sc.nextLine();
                    System.out.print("Enter Source: ");
                    String src = sc.nextLine();
                    System.out.print("Enter Destination: ");
                    String dst = sc.nextLine();
                    List<flightPojo> byRoute = service.findByRoute(src, dst);
                    byRoute.forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Exited");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 0);

        sc.close();
    }

}
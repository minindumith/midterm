/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blood.pressure.monitor;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {

    static int id;
    static String name;
    static String yob;
    static int systolic;
    static int diastolic;
    static ArrayList<BloodPressure> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static BloodPressure bloodPressure;

    public static void main(String args[]) {

        int choice;

        do {
            displayMenu();
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    create();
                    break;
                case 2:
                    index();
                    break;
                case 3:
                    System.out.println("Enter user id: ");
                    int uid = scanner.nextInt();
                    view(uid);
                    break;
                case 4:
                    delete();
                    break;
                case 5:
                    exit();
                    break;
                default:
      
                    ;
            }
        } while (true);

    }

    public static void create() {
        System.out.println("Enter id:");
        id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Enter name:");
        name = scanner.nextLine();
        System.out.println("Enter  year of birth:");
        yob = scanner.nextLine();
        System.out.println("Enter systolic:");
        systolic = scanner.nextInt();
        System.out.println("Enter diastolic:");
        diastolic = scanner.nextInt();
        System.err.println("");
        bloodPressure = new BloodPressure(id, name, yob, systolic, diastolic);
        list.add(bloodPressure);
    }

    public static void index() {
        for (BloodPressure user : list) {
            System.out.println("User id: " + user.getId());
            System.out.println("User name: " + user.getName());
            System.out.println("User year of birth: " + user.getYob());
            System.out.println("User height: " + user.getSystolic());
            System.out.println("User weight: " + user.getDiastolic());
            System.out.println("");
        }

        bloodPressure.display();
    }

    public static void view(int uid) {
        String stringId = String.valueOf(uid);

        for (BloodPressure user : list) {
            if (String.valueOf(user.getId()).equals(stringId)) {
                System.out.println("User name: " + user.getName());
                System.out.println("User year of birth: " + user.getYob());
                System.out.println("User height: " + user.getSystolic());
                System.out.println("User weight: " + user.getDiastolic());

            } else {
                System.out.println("No user for this id");
            }
        }

        bloodPressure.display();
    }

    public static void displayMenu() {
        System.out.println("Blood Pressure Monitor");
        System.out.println("1.Create a record");
        System.out.println("2.Show all records ");
        System.out.println("3.Show one record for given id");
        System.out.println("4.Delete all records ");
        System.out.println("5.Exit to system");
        System.out.println(" Enter Your choice ");
    }

    public static void delete() {
        list.clear();
    }

    public static void exit() {
        System.exit(0);
    }
}

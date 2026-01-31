package Java290126;

import java.util.*;

public class StudentFile {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Student Record Management System ---");
            System.out.println("1. Add Student Record");
            System.out.println("2. Update Student Record");
            System.out.println("3. Delete Student Record");
            System.out.println("4. View All Students");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                choice = sc.nextInt();
                sc.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter Student ID: ");
                        int id = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter Name: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Enter Age: ");
                        int age = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter Course: ");
                        String course = sc.nextLine().trim();
                        manager.addStudent(new Student(id, name, age, course));
                        break;

                    case 2:
                        System.out.print("Enter Student ID to update: ");
                        int updateId = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter New Name: ");
                        String newName = sc.nextLine().trim();
                        System.out.print("Enter New Age: ");
                        int newAge = Integer.parseInt(sc.nextLine().trim());
                        System.out.print("Enter New Course: ");
                        String newCourse = sc.nextLine().trim();
                        manager.updateStudent(updateId, new Student(updateId, newName, newAge, newCourse));
                        break;

                    case 3:
                        System.out.print("Enter Student ID to delete: ");
                        int deleteId = Integer.parseInt(sc.nextLine().trim());
                        manager.deleteStudent(deleteId);
                        break;

                    case 4:
                        manager.viewAllStudents();
                        break;

                    case 5:
                        System.out.println("Exiting system. Goodbye!");
                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Clear invalid input
                choice = 0; // Reset choice to continue loop
            } catch (NumberFormatException e) {
                System.out.println("Invalid input format. Please enter valid numbers for ID and Age.");
                choice = 0;
            }
        } while (choice != 5);





        sc.close();
    }
}

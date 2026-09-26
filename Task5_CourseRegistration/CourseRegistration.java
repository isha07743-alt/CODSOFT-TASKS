import java.util.Scanner;

public class CourseRegistration {

    static String[] courses = {
        "Java Programming",
        "Python Programming",
        "Web Development",
        "Data Science",
        "Database Management"
    };

    static boolean[] registered = new boolean[courses.length];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=================================");
            System.out.println("      COURSE REGISTRATION");
            System.out.println("=================================");
            System.out.println("1. View Available Courses");
            System.out.println("2. Register for a Course");
            System.out.println("3. Drop a Course");
            System.out.println("4. View Registered Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    viewCourses();
                    break;

                case 2:
                    registerCourse(sc);
                    break;

                case 3:
                    dropCourse(sc);
                    break;

                case 4:
                    viewRegisteredCourses();
                    break;

                case 5:
                    System.out.println("Thank you for using Course Registration System!");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }

    static void viewCourses() {

        System.out.println("\nAvailable Courses:");

        for (int i = 0; i < courses.length; i++) {
            System.out.println((i + 1) + ". " + courses[i]);
        }
    }

    static void registerCourse(Scanner sc) {

        viewCourses();

        System.out.print("Enter course number to register: ");
        int courseNumber = sc.nextInt();

        if (courseNumber >= 1 && courseNumber <= courses.length) {

            int index = courseNumber - 1;

            if (!registered[index]) {
                registered[index] = true;
                System.out.println("Successfully registered for: " + courses[index]);
            } else {
                System.out.println("You are already registered for this course.");
            }

        } else {
            System.out.println("Invalid course number!");
        }
    }

    static void dropCourse(Scanner sc) {

        viewRegisteredCourses();

        System.out.print("Enter course number to drop: ");
        int courseNumber = sc.nextInt();

        if (courseNumber >= 1 && courseNumber <= courses.length) {

            int index = courseNumber - 1;

            if (registered[index]) {
                registered[index] = false;
                System.out.println("Successfully dropped: " + courses[index]);
            } else {
                System.out.println("You are not registered for this course.");
            }

        } else {
            System.out.println("Invalid course number!");
        }
    }

    static void viewRegisteredCourses() {

        System.out.println("\nRegistered Courses:");

        boolean found = false;

        for (int i = 0; i < courses.length; i++) {

            if (registered[i]) {
                System.out.println((i + 1) + ". " + courses[i]);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No courses registered yet.");
        }
    }
}
package gleanross;

import java.util.Scanner;

public class gleanross {
    private final String firstName;
    private final String lastName;
    private int age;
    private boolean isMinor;

    public gleanross(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isMinor = age < 18;
    }

    public gleanross() {
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.isMinor = false;
    }

    public String getName() {
        return lastName + ", " + firstName;
    }
    public void increaseAge() {
        age++;
        isMinor = age < 18;
    }
    public String toString() {
        return lastName + ", " + firstName + " - " + age + " - " + (isMinor ? "minor" : "adult");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter test case number:");
        int testCase = scanner.nextInt();

        switch (testCase) {
            case 1 -> {
                gleanross student1 = new gleanross("Jemar Jude", "Maranga", 17);
                System.out.println("Test Case 1: Student under 18");
                System.out.println(student1);
            }
            case 2 -> {
                gleanross student2 = new gleanross("Jemar Jude", "Maranga", 17);
                student2.increaseAge();
                System.out.println("Test Case 2: Increase age of student 1");
                System.out.println(student2);
            }
            case 3 -> {
                gleanross student3 = new gleanross("Jose", "Cruz", 19);
                System.out.println("Test Case 3: Student over 18");
                System.out.println(student3);
            }
            default -> System.out.println("Invalid test case number");
        }
    }
}



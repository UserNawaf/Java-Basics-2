import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


                       // Nawaf Al Jehani
                       // Exercise 2
                       // 25 nov 2026



// Q1 : 1.Write a program that checks the role of the user


        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your role: ");
        String role = sc.nextLine();
        if(role.equals("admin")) {
            System.out.println("welcome admin");

        } else if (role.equals("superuser")) {
            System.out.println("welcome superuser");



        } else if (role.equals("user")) {
            System.out.println("welcome user");
        }
// Q2  2.Take three numbers from the user and print the greatest number.
        System.out.print("Input the 1st number: ");
        int num1 = sc.nextInt();
        System.out.print("Input the 2nd number: ");
        int num2 = sc.nextInt();
        System.out.print("Input the 3rd number: ");
        int num3 = sc.nextInt();



        if (num1 >= num2 && num1 >= num3) {
            System.out.println("The greatest: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("The greatest: " + num2);
        } else {
            System.out.println("The greatest: " + num3);
        }



        // Q3 : Write a Java program that generates an integer between 1 and 7
        //and displays the name of the weekday.

        // Question 3
        System.out.print("number: ");
        int DaysNumbers = sc.nextInt();

        switch (DaysNumbers) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;


            default:
        }




        // Q4 : Write a program that takes a numeric score as input and prints
        //the corresponding letter grade using the following grading scale:


        System.out.print("Enter your numeric score: ");
        int score = sc.nextInt();
        System.out.println("Numeric Score: " + score);

        if (score >= 90 && score <= 100) {
            System.out.println("Letter Grade: A");
        } else if (score >= 80 && score <= 89) {
            System.out.println("Letter Grade: B");
        } else if (score >= 70 && score <= 79) {
            System.out.println("Letter Grade: C");
        } else if (score >= 60 && score <= 69) {
            System.out.println("Letter Grade: D");
        } else if (score >= 0 && score <= 59) {
            System.out.println("Letter Grade: F");
        }

        // Q5 : Write a Java program that takes a person's age as input and
        //categorizes them into one of three age categories: "Child,"
        //"Teenager," or "Adult" using an if statement.

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 13) {
            System.out.println("You are a Child.");
        } else if (age >= 13 && age <= 19) {
            System.out.println("You are a Teenager.");
        } else if (age >= 20) {
            System.out.println("You are an Adult.");
        }





    }
}


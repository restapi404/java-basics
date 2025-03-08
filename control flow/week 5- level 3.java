import java.util.Scanner; //import scanner class

/*1st program- Write a LeapYear program that takes a year as input and outputs the Year is a Leap Year or not a Leap Year.*/

class LeapYear1 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter year: ");  
        int year = input.nextInt(); //read year
		if (year>= 1582){ //check divisibility by 400 to find leap year
			//Approach 1
            System.out.println("\nUsing multiple if-else statements:");
			if (year%4==0){
				if (year%100==0){
					if (year%400==0){
						System.out.println(year+ " is a leap year");
					}
					else System.out.println(year+ " is not a leap year");
				}
				else System.out.println(year+ " is a leap year");
			}
			else{
				System.out.println(year+ " is not a leap year");
			}
			//Approach 2
			System.out.println("\nUsing a single if statement with logical conditions:");
			if (((year%4==0 && year%100==0 && year%400==0) || (year%4==0 && year%100!=0))){
				System.out.println(year+ " is a leap year");
			}
			else{
				System.out.println(year+ " is not a leap year");
			}
		}
		else{
			System.out.println("Year is invalid for Leap Year calculation");
		}
    }
}


/*2nd program- Rewrite program 1 to determine Leap Year with single if condition using logical and && and or || operators*/

class LeapYear2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  
        System.out.print("Enter year: ");  
        int year = input.nextInt(); // Read year
        input.close(); // Close scanner to prevent resource leak

        // Using a single if condition with && and ||
        if (year >= 1582 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        } else {
            System.out.println("Year is invalid for Leap Year calculation");
        }
    }
}


/* 3rd program- Write a program to input marks and 3 subjects physics, chemistry and maths. Compute the percentage and then calculate the grade as per guidelines */

class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object
		String grade, remarks;
		
        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();
        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        //Calculate percentage
        double percentage = (physics + chemistry + maths) / 3.0;

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } else {
            grade = "E";
            remarks = "Level 1, too below agency-normalized standards";
        }

        // Display result
        System.out.printf("Average Marks: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}


/* 4th program- Write a Program to check if the given number is a prime number or not */

class PrimeNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Read user input

        boolean isPrime = true; // Assume the number is prime

        if (num <= 1) {
            isPrime = false; // Numbers <= 1 are not prime
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // Check divisibility
                    isPrime = false;
                    break;
                }
            }
        }

        // Display result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is not a Prime Number.");
        }
    }
}


/* 5th program- Create a program to check if a number is armstrong or not */

class ArmstrongNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  
        System.out.print("Enter a number: ");
        int num = input.nextInt(); // Read user input

        int n = num;
        int sum = 0;

        //Process each digit of the number
        while (n!= 0) {
            int digit = n%10; // Get last digit
            sum += (digit*digit*digit); // Cube digit and add to sum
            n/= 10; // Remove last digit from n
        }

        // Check if sum matches the original number
        if (sum == num) {
            System.out.println(num + " is an Armstrong Number.");
        } else {
            System.out.println(num + " is not an Armstrong Number.");
        }
    }
}


/* 6th program- Create a program to count the number of digits in an integer. */

class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  
        System.out.print("Enter an integer: ");
        int number = input.nextInt(); // Read user input

        int count = 0; // Variable to store digit count
        int num = number; // Store original number for display

        // Handle the case where number is 0 (since loop won't run for 0)
        if (number == 0) {
            count = 1;
        } 
		else {
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increase count
            }
        }

        // Display the result
        System.out.println("The number " + num + " has " + count + " digits.");
    }
}


/* 7th program- Create a program to find the BMI of a person */

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double height = input.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } 
		else if (bmi <= 24.9) {
            status = "Normal";
        }
		else if (bmi <= 39.9) {
            status = "Overweight";
        } 
		else {
            status = "Obese";
        }

        // Display results
        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
    }
}


/* 8th program- Create a program to check if a number taken from the user is a Harshad Number. */

class HarshadNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  

        // Get user input for the number
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = 0;
        int n = num;

        // Loop through each digit of the number
        while (num != 0) {
            sum += num % 10; // Add the last digit to sum
            num /= 10; // Remove the last digit from number
        }

        // Check if the original number is divisible by the sum of its digits
        if (n % sum == 0) {
            System.out.println(n + " is a Harshad Number.");
        } else {
            System.out.println(n + " is not a Harshad Number.");
        }
    }
}


/* 9th program- Create a program to check if a number is an Abundant Number. */

class AbundantNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object  

        // Get user input for the number
        System.out.print("Enter a number: ");
        int n = input.nextInt();

        int sum = 0;

        // Loop to find divisors of the number
        for (int i = 1; i < n; i++) {
            if (n % i == 0) { // Check if i is a divisor of the number
                sum += i; 
            }
        }

        // Check if the sum of divisors is greater than the number itself
        if (sum > n) {
            System.out.println(n + " is an Abundant Number.");
        } else {
            System.out.println(n + " is not an Abundant Number.");
        }
  }
}


/* 10th program- Write a program to create a calculator using switch case. */

class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Create scanner object

        // Get input for the two numbers and operator
        System.out.print("Enter first number: ");
        double first = input.nextDouble();
        System.out.print("Enter second number: ");
        double second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        String op = input.next();

        double result; // Variable to store the result

        // Perform calculation
        switch (op) {
            case "+":
                result = first + second;
                System.out.println("Result: " + result);
                break;

            case "-":
                result = first - second;
                System.out.println("Result: " + result);
                break;

            case "*":
                result = first * second;
                System.out.println("Result: " + result);
                break;

            case "/":
                if (second != 0) {
                    result = first / second;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;

            default:
                System.out.println("Invalid Operator.");
                break;
        }
    }
}


/* 11th program- Write a program DayOfWeek that takes a date as input and prints the day of the week that the date falls on. */

class DayOfWeek {
    public static void main(String[] args) {
        // Get the month, day, and year from the command line arguments
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the month (1-12): ");
        int m = input.nextInt();
        System.out.print("Enter the day: ");
        int d = input.nextInt();
        System.out.print("Enter the year: ");
        int y = input.nextInt();
        
        input.close(); // Close the scanner to prevent resource leak
        
        // Apply the formula
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;
        
        // Output the day of the week
        System.out.println("Day of the week: " + d0);
    }
}
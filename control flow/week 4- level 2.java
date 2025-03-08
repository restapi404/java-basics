//Import Scanner class
import java.util.Scanner; 

// 1st program
class PrintOddEven {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter number: ");  
        int n = input.nextInt();  
        
        if (n>0) {// Check if the number is positive
            for (int i = 1; i <= n; i++) { // Loop from 1 to n
                if (i % 2 == 0) { // Check if the number is even
                    System.out.println("Even: " + i);
                } else { // Otherwise, it's odd
                    System.out.println("Odd: " + i);
                }
            }
        } else {
            System.out.println(n + " is not a natural number");
        }
    }
}

// 2nd program
class FindBonuses {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter year of service: ");  
        int serviceYear = input.nextInt();  
        System.out.println("Enter salary of employee: ");
        double salary = input.nextDouble();
        
        if (serviceYear > 5) { // Eligible for bonus if service > 5 years
            double bonus = 0.05 * salary; // Calculate 5% bonus
            System.out.println("Bonus of employee= " + bonus);
        } else {
            System.out.println("Service year of employee not more than 5 years");
        }
    }
}

// 3rd program
class MultiplicationTable {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter number (6-9): ");  
        int n = input.nextInt();
        if (n>=6 && n<=9){
			for (int i = 1; i <= 10; i++) { // Loop from 1 to 10
                System.out.println(n + "x" + i + " = " + (n * i));
			}
        }
		else System.out.println("Invalid number");
    }
}

// 4th program
class FizzBuzz {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter term: ");  
        int n = input.nextInt();
        
        if (n > 0) { // Only for positive numbers
            for (int i = 1; i <= n; i++) {
                if (i % 3 == 0 && i % 5 == 0) { // Divisible by both 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // Divisible by 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // Divisible by 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); // Print number if no condition met
                }
            }
        } else {
            System.out.println("Number is not positive");
        }
    }
}

// 5th program
class FizzBuzzUsingWhile {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter term: ");  
        int n = input.nextInt();
        int i = 1;
        
        if (n > 0) {
            while (i <= n) { // Loop from 1 to n
                if (i % 3 == 0 && i % 5 == 0) { // Divisible by both 3 and 5
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) { // Divisible by 3
                    System.out.println("Fizz");
                } else if (i % 5 == 0) { // Divisible by 5
                    System.out.println("Buzz");
                } else {
                    System.out.println(i); // Print number if no condition met
                }
                i++;
            }
        } else {
            System.out.println("Number is not positive");
        }
    }
}

// 6th program
class YoungestAndTallest {
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object for input
        System.out.print("Enter age and height of Amar: \n");
        int amarAge = input.nextInt();
        int amarHeight = input.nextInt();

        System.out.print("Enter age and height of Akbar: \n");
        int akbarAge = input.nextInt();
        int akbarHeight = input.nextInt();

        System.out.print("Enter age and height of Anthony: \n");
        int anthonyAge = input.nextInt();
        int anthonyHeight = input.nextInt();
        
        // Finding youngest friend
        String smallest = (amarAge < akbarAge ? (amarAge < anthonyAge ? "Amar" : "Anthony") : (akbarAge < anthonyAge ? "Akbar" : "Anthony"));
        System.out.println("Youngest friend is: " + smallest);
        
        // Finding tallest friend
        String tallest = (amarHeight > akbarHeight ? (amarHeight > anthonyHeight ? "Amar" : "Anthony") : (akbarHeight > anthonyHeight ? "Akbar" : "Anthony"));
        System.out.println("Tallest friend is: " + tallest);
    }
}

//7th program

// Class to find all factors of a number using for loop
class FactorsUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		if (number > 0) {
			// Loop from 1 to number - 1 to find factors
			for (int i = 1; i < number; i++) {
				if (number % i == 0) {
					System.out.println(i); // Print factor
				}
			}
		} else {
			System.out.println(number + " is not positive");
		}
	}
}

// 8th program
class FactorsUsingWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int i = 1;
		if (number > 0) {
			// Loop until i is less than number
			while (i < number) {
				if (number % i == 0) {
					System.out.println(i); // Print factor
				}
				i++;
			}
		} else {
			System.out.println(number + " is not positive");
		}
	}
}

// 9th program
class GreatestFactorUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int greatestFactor = 1;
		// Loop from number-1 to 1 to find the greatest factor
		for (int i = number - 1; i >= 1; i--) {
			if (number % i == 0) {
				greatestFactor = i;
				break; // Exit loop after finding the greatest factor
			}
		}
		System.out.println("Greatest factor of " + number + " is: " + greatestFactor);
	}
}

// 10th program
class GreatestFactorUsingWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int greatestFactor = 1;
		int counter = number - 1;
		// Loop until the greatest factor is found
		while (counter >= 1) {
			if (number % counter == 0) {
				greatestFactor = counter;
				break;
			}
			counter--;
		}
		System.out.println("Greatest factor of " + number + " is: " + greatestFactor);
	}
}

// 11h program
class MultiplesUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		if (number > 0) {
			// Loop from 100 down to 1 to find multiples
			for (int i = 100; i >= 1; i--) {
				if (number % i == 0) {
					System.out.println(i);
					continue;
				}
			}
		}
	}
}

// 12th pogram
class MultiplesUsingWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		int counter = number - 1;
		// Loop until counter reaches 0
		while (counter > 0) {
			if (number % counter == 0) {
				System.out.println(counter);
			}
			counter--;
		}
	}
}

// 13th program
class PowerUsingFor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter power: ");
		int power = input.nextInt();
		int result = 1;
		// Multiply number by itself power times
		for (int i = 1; i <= power; i++) {
			result *= number;
		}
		System.out.println(result);
	}
}

// 14th program
class PowerUsingWhile {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Create Scanner object
		System.out.print("Enter number: ");
		int number = input.nextInt();
		System.out.print("Enter power: ");
		int power = input.nextInt();
		int result = 1, counter = 0;
		// Multiply number by itself power times
		while (counter < power) {
			result *= number;
			counter++;
		}
		System.out.println(result);
	}
}


/*class Fibonacci{
	public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter terms: ");
		int n= input.nextInt();
		int sum=0, a=0;b=1;
		System.out.print(a+" "+b+" ");
		for (int i=0; i<n;i++){
			sum=a+b;
			a=b;
			b=sum;
			System.out.print(sum+" ");
			}
	}
}*/

//1 2 4 7 11 
class NumberPattern{
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter terms: ");
		int n= input.nextInt();
		int sum=1;
		for (int i=1; i<n;i++){
			sum+=i;
			System.out.print(sum+" ");
		}
	}
}	

class Firstpattern{
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter terms: ");
		int n= input.nextInt();
		int sum=1;
		for (int i=1; i<=n;i++){
			if (i%2==0){
				System.out.println("\n");
			}
			else{
				for(int j=1; j<=i;j++){
					System.out.print("* ");
				}
			}
		}
	}
}	

//1st program
//31-01-2024 -> right
//29-02-2025 -> wrong (invalid date)

//1-31 , 2-28, 3-31, 4-30, 5- 31, 6-30, 7-31, 8-31, 9- 30, 10-31, 11-30, 12-31
/*
class date{
	public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter date (DD-MM-YYYY): ");
		String day= input.nextLine();
		String[] s = day.split("-");
		int d = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int year = Integer.parseInt(s[2]);
		
		int n,x1=,x2=0;
		if (year%4!=0) n=28;
		else n=29;
		
		if (month<=7) {
			x1=31; x2=30;
		}
		else if(month>=8 && month<=12) {
			x1=30; x2=31;
		}
		else System.out.println("Invalid date");
		
		for(int i=1;i<=12;i++){
			if (i%2==0 && i==month){
				if (d>=1 && d<=x2){
					System.out.println("Valid date");
				}
				else if (month==2){
				    if (d>=1 && d<=n) System.out.println("Valid date");
					else System.out.println("Invalid date");
				}
				else{
					System.out.println("Invalid date");
				}
			}
			else if (i%2!=0 && i==month){
				if (d>=1 && d<=x1){
					System.out.println("Valid date");
				}
				else{
					System.out.println("Invalid date");
				}
			}
			else continue;
		}
	}
}
*/

class DateValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter date (dd-mm-yyyy): ");
        String date = input.nextLine();

        String[] s = date.split("-");
        
        if (s.length != 3) {
            System.out.println(date + " is in Invalid Format");
            return;
        }

        int day = Integer.parseInt(s[0]);
        int month = Integer.parseInt(s[1]);
        int year = Integer.parseInt(s[2]);

        if (year < 1) {
            System.out.println(date + " -> Wrong (Invalid Year)");
            return;
        }

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        int[] daysInMonth = {0, 31, (isLeap ? 29 : 28), 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month < 1 || month > 12) {
            System.out.println(date + " -> Wrong (Invalid Month)");
        } else if (day < 1 || day > daysInMonth[month]) {
            System.out.println(date + "is an Invalid Date");
        } else {
            System.out.println(date + "is a Valid Date");
        }
    }
}

class SecondPattern {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
		
        int rows =input.nextInt(); ; // Number of rows in the pattern

        // Loop for each row
        for (int i = 1; i <= rows; i++) {
            // Print left triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Print spaces between the triangles
            for (int k = 1; k <= 4 * (rows - i); k++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print right triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println("\n");
        }
    }
}

class Third {
    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
		
        int rows =input.nextInt(); ; // Number of rows in the pattern
		
		
        for (int i = rows; i >=1; i--) {
            // Print left triangle
            for (int j = 2*i - 1; j>=1; j--) {
                System.out.print("* ");
            }

            // Print spaces between the triangles
            for (int k = 4 * (rows - i); k>=1; k--) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print right triangle
            for (int j = 2 * i - 1; j >=1; j--) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println("\n");
        }
        for (int i = 1; i <= rows; i++) {
            // Print left triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Print spaces between the triangles
            for (int k = 1; k <= 4 * (rows - i); k++) {
                System.out.print("  "); // Two spaces for alignment
            }

            // Print right triangle
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }

            // Move to the next line
            System.out.println("\n");
        }
    }
}

		

//2nd program
/*

*                 *

* * *         * * *

* * * * * * * * * *

*/
class four{
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter number: ");
		int n= input.nextInt();
        int t,x,num=n;
		while (n>=10){
			x=0;
			while (n!=0) {
                t = n % 10;     // Get the last digit
                x += (t*t);
                n = n / 10;     // Remove the last digit
            }
		    n=x;
		}
		if (n==1 || n==7){
			System.out.println(num+" is a happy number");
		}
		else{
			System.out.println(num+" is not a happy number");
		}
	}
}
		

class disarium{
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		int t, x=0, n=0, no=num,i=1;
		while (num!=0) {
            t = num % 10;     // Get the last digit
            x=(x*10)+t;
            num = num / 10;     // Remove the last digit
        }
		while (x!=0){
		    t=x%10;
			int t1=t;
			for(int k=1;k<i; k++){
				t*=t1;
			}
			n+=t;
			x=x/10;
			i++;
		}
        
        if (n==no){
			System.out.println(no+" is a disarium number");
		}
		else{
			System.out.println(no+" is not a disarium number");
		}
	}
}
		
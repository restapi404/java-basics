import java.util.Scanner; //import scanner class

class Fibonacci{
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
}

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
		
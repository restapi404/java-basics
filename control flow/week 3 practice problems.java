import java.util.Scanner; //import scanner class


//1st program
class DivisibleByFive {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        int num = input.nextInt(); //read number
        //check divisibility by 5
        System.out.println("Is the number " + num+ " divisible by 5? " + (num % 5==0) );  //Print result
    }
}

//2nd program
class SmallestOfThree {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        int num1 = input.nextInt(); //read first number
        System.out.println("enter second number");  
        int num2 = input.nextInt(); //read second number
        System.out.println("enter third number");  
        int num3 = input.nextInt(); //read third number
        //check if first number is the smallest
        System.out.println("Is the first number the smallest? " + ((num1<num2) && (num1<num3)) );  //Print result
    }
}

//3rd program
class LargestOfThree {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        int num1 = input.nextInt(); //read first number
        System.out.println("enter second number");  
        int num2 = input.nextInt(); //read second number
        System.out.println("enter third number");  
        int num3 = input.nextInt(); //read third number
        //check which number is the largest
        System.out.println("Is the first number the largest? " + ((num1>num2) && (num1>num3)) );  //Print result1
        System.out.println("Is the second number the largest? " + ((num2>num3) && (num2>num1)) );  //Print result2
        System.out.println("Is the third number the largest? " + ((num3>num1) && (num3>num2)) );  //Print result3
    }
}

//4th program
class SumOfN {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int n = input.nextInt(); //read number
		//check if number is positive
		if (n>0){
			//calculate sum of first n natural numbers
			int sum= n*(n+1)/2;
			System.out.println("The sum of " + n + " natural numbers is " +sum);  //Print result
		}
		else{
			System.out.println("The number " + n + " is not a natural number");  //Print result
		}
    }
}

//5th program
class CheckToVote {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter age");  
        int age = input.nextInt(); //read number
		//check if person is eligible to vote
		if (age>=18){
			System.out.println("The person's age is " +age +" and can vote.");  //Print result
		}
		else{
			System.out.println("The person's age is " +age +" and cannot vote.");  //Print result
		}
    }
}

//6th program
class CheckNumber {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int n = input.nextInt(); //read number
		//check if number is positive, negative or zero
		if (n>0){
			System.out.println("Positive");  //Print result
		}
		else if (n<0){
			System.out.println("Negative");  //Print result
		}
		else {
			System.out.println("Zero"); //Print result
		}
    }
}

//7th program
class SpringSeason {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter month");  
        int month = input.nextInt(); //read month
		System.out.println("enter day");  
        int day = input.nextInt(); //read day
		//check if the given date falls in spring season
		if (month==4||month==5){
			System.out.println("Its a Spring Season");  //Print result
		}
		else if (month==3){
			if(day>=20){
				System.out.println("Its a Spring Season");  //Print result
			}
			else{
				System.out.println("Not a Spring Season");  //Print result	
			}
		}
		else if (month==6){
			if (day<=20){
				System.out.println("Its a Spring Season");  //Print result
			}
			else{
				System.out.println("Not a Spring Season");  //Print result
			}
		}
		else{
			System.out.println("Not a Spring Season");  //Print result
		}
    }
}

//8th program
class CountdownUsingWhile {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int counter = input.nextInt(); //read number
		//loop until counter reaches 1
		while (counter>=1){
			System.out.println(counter); //print result
			counter-=1; //decrement counter
		}
    }
}

//9th program
class CountdownUsingFor {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int counter = input.nextInt(); //read number
		//use for loop to print countdown
		for (int i=counter; i>=1;i-- ){
			System.out.println(i); //Print result
		}
    }
}

//10th program
class SumUntilZero {
    public static void main(String[] args) {
		double n=0.0;
		Scanner input = new Scanner(System.in); //create scanner object  
		System.out.println("enter number");  
        double num = input.nextDouble(); //read number
		//loop until user enters zero
		while (num!=0){
			n+=num;
			System.out.println("enter number");  
            num = input.nextDouble(); //read number
		}
	    System.out.println(n);
    }
}

//11th program
class SumUntilZeroUsingBreak {
    public static void main(String[] args) {
		double n=0.0;
		Scanner input = new Scanner(System.in); //create scanner object  
		System.out.println("enter number");  
        double num = input.nextDouble(); //read number
		//loop until user enters zero or a negative number
		while (true){
			n+=num;
			if (num==0 || num<0){ //check condition to break loop
				break;
			}
			else{
				System.out.println("enter number");  
			    num = input.nextDouble(); //read number
			}
		}
	    System.out.println(n); //print result
    }
}

//12th program
class CompareUsingWhile {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int n = input.nextInt(); //read number
		int sum1=0, sum2=0;
		//check if number is positive
		if (n>0){
			int t=n;
			sum1=n*(n+1)/2; //calculate sum using formula
			while (t>0){ //calculate sum using while loop
				sum2+=t;
				t-=1;
			}
		//compare sums
		if (sum1==sum2){
			System.out.println("The sum of "+ n + " natural numbers using both the formula and while loop both " + sum1 );
		}
		else{
			System.out.println("The sum of "+ n + " natural numbers using the formula is " + sum2 + " and while loop is "+sum1);
		}	
		}
    }
}

//13th program
class CompareUsingFor {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int n = input.nextInt(); //read number
		int sum1=0, sum2=0;
		//check if number is positive
		if (n>0){
			sum1=n*(n+1)/2; //calculate sum using formula
			for(int i=n; i>=1; i-- ){ //calculate sum using for loop
				sum2+=i;
			}
		//compare sums
		if (sum1==sum2){
			System.out.println("The sum of "+ n + " natural numbers using both the formula and for loop both " + sum1 );
		}
		else{
			System.out.println("The sum of "+ n + " natural numbers using the formula is " + sum2 + " and while loop is "+sum1);
		}	
		}
    }
}

//14th program
class FactorialUsingWhile {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int num = input.nextInt(); //read number
		int fact=1,t=num;
		//calculate factorial using while loop
		while(t>0){
			fact*=t;
			t-=1;
		}
		System.out.println("The factorial of "+ num + " is "+fact);
    }
}

//15th program
class FactorialUsingFor {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number");  
        int num = input.nextInt(); //read number
		int fact=1;
		//calculate factorial using for loop
		for(int i=num;i>=1;i-- ){
			fact*=i;
		}
		System.out.println("The factorial of "+ num + " is "+fact);
    }
}

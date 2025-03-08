import java.util.Scanner; //import scanner class

class PoundsToKilograms {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter weight in pounds: ");  
        double weightPounds = input.nextDouble(); //read weight in pounds  

        //convert pounds to kilograms  
        double weightKg = weightPounds / 2.2;  

        //display results  
        System.out.println("The weight of the person in pounds is " + weightPounds + " and in kg is " + weightKg);  
        input.close();  
    }  
}

class CelsiusToFahrenheit {  
    public static void main(String[] args) {  
        double celsius; //declare variable for temp in celsius
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter temperature in celsius");  
        celsius = input.nextDouble(); //read temp in celsius  
		
        //convert celsius to fahrenheit  
        double fahrenheitResult = (celsius * 9 / 5) + 32;  
		
        //display result  
        System.out.println("The " + celsius + " celsius is " + fahrenheitResult + " fahrenheit");  
        input.close();  
    }  
}

class Rounds {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first side of triangular park: ");  
        int side1 = input.nextInt(); //read first side  
        System.out.println("enter second side of triangular park: ");  
        int side2 = input.nextInt(); //read second side  
        System.out.println("enter third side of triangular park: ");  
        int side3 = input.nextInt(); //read third side  
		
        int peri = side1 + side2 + side3; //calculate perimeter  
        int rounds = (5 * 1000) / peri; //find number of rounds
		
        //display results  
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");  
        input.close();  
    }  
}


class SimpleInterest {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter principle: ");  
        int principal = input.nextInt(); //read principle  
        System.out.println("enter rate: ");  
        int rate = input.nextInt(); //read rate  
        System.out.println("enter time: ");  
        int time = input.nextInt(); //rate time  
        int si = principal * rate * time / 100;  

        //display results  
        System.out.println("The Simple Interest is " + si + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time);  
        input.close();  
    }  
}

class TotalIncome {  
    public static void main(String[] args) {  
        int salary, bonus;  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter salary");  
        salary = input.nextInt(); //read salary  
        System.out.println("enter bonus");  
        bonus = input.nextInt(); //read bonus  
		
        //add salary and bonus to find total income  
        int totalIncome = salary + bonus;  
		
        //display results  
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);  
        input.close();  
    }  
}

class FindHcf {  
    public static void main(String[] args) {  
        int num1, num2, arr1[], arr2[], hcf=1;  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number 1");  
        num1 = input.nextInt(); //read salary  
        System.out.println("enter number 2");  
        num2 = input.nextInt(); //read bonus  
		
		for(int i=1; i<num1;i++){
			if (num1%i==0){
				arr1[i-1]=i;
			}
		}
		for(int i=1; i<num2;i++){
			if (num2%i==0){
				arr2[i-1]=i;
			}
		}
		
		for(int i=1; i<num1.length;i++){
			for(int j=1; j<num2.length; j++){
				System.out.println(arr[i],arr[j]);
				if (arr[i]==arr[j]){
					hcf=hcf*arr[i];
				}
			}
		}
        input.close();  
    }  
}
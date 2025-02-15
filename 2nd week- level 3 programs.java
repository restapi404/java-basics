import java.util.Scanner; //import scanner class

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

class FahrenheitToCelsius {  
    public static void main(String[] args) {  
        double fahrenheit; //declare variable for temp in fahrenheit  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter temperature in fahrenheit");  
        fahrenheit = input.nextDouble(); //read temp in fahrenheit  
		
        //convert fahrenheit to celsius  
        double celsiusResult = (fahrenheit - 32) * 5 / 9;  
		
        //display result  
        System.out.println("The " + fahrenheit + " fahrenheit is " + celsiusResult + " celsius");  
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

class Swap {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        int num1 = input.nextInt(); //read first number  
        System.out.println("enter second number");  
        int num2 = input.nextInt(); //read second number  
		
        int swap = num2; //assign num2 value to new variable  
        num2 = num1; //assign num1 value to num2  
        num1 = swap; //assign num2 (swap) value to num1  
		
        //display results  
        System.out.println("The swapped numbers are " + num1 + " and " + num2);  
        input.close();  
    }  
}

class TravelComputation {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter name: ");  
        String name = input.next(); //read name  
        System.out.println("enter from City: ");  
        String fromCity = input.next(); //read from city  
        System.out.println("enter via City: ");  
        String viaCity = input.next(); //read via City  
        System.out.println("enter to City: ");  
        String toCity = input.next(); //read to City  

        System.out.println("enter from To Via in miles: ");  
        double fromToVia = input.nextDouble(); //read distance between the fromCity to viaCity  
        System.out.println("enter via To Final City in miles: ");  
        double viaToFinalCity = input.nextDouble(); //read distance between the viaCity to toCity  
        System.out.println("enter time taken From City to Via City");  
        int timeFromToVia = input.nextInt(); //read travel from fromCity to viaCity in minutes  
        System.out.println("enter time taken From Via City to Final Destination");  
        int timeViaToFinalCity = input.nextInt(); //read travel from viaCity to toCity in minutes  

        //total time taken to travel from fromCity to toCity in minutes  
        int totalTime = timeFromToVia + timeViaToFinalCity;  
        //read total distance between the fromCity to toCity  
        double totalDistance = fromToVia + viaToFinalCity;  

        //print the travel details  
        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the Total Time taken is " + totalTime + " minutes");  
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

class DivideChoc {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter number of chocolates: ");  
        int numberOfChocolates = input.nextInt(); //read no. of chocolates  
        System.out.println("enter number of children: ");  
        int numberOfChildren = input.nextInt(); //read no. of children  

        int chocPerChild = numberOfChocolates / numberOfChildren; //chocolates per child  
        int remainingChoc = numberOfChocolates % numberOfChildren;  

        //display results  
        System.out.println("The number of chocolates each child gets is " + chocPerChild + " and the number of remaining chocolates are " + remainingChoc);  
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

class Handshakes {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter the number of students: ");  
        int numberOfStudents = input.nextInt(); //read number of students  

        // Calculate maximum number of handshakes using given formula  
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;  

        //display results  
        System.out.println("The maximum number of handshakes among " + numberOfStudents + " students is " + maxHandshakes);  
        input.close();  
    }  
}

class PoundsToKilograms {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in);  // Create Scanner object  
        System.out.print("Enter weight in pounds: ");  
        double weightPounds = input.nextDouble(); //read weight in pounds  

        //convert pounds to kilograms  
        double weightKg = weightPounds / 2.2;  

        //display results  
        System.out.println("The weight of the person in pound is " + weightPounds + " and in kg is " + weightKg);  
        input.close();  
    }  
}

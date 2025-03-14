import java.util.Scanner; //import scanner class

class Calculator {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        double num1 = input.nextDouble(); //read first number  
        System.out.println("enter second number");  
        double num2 = input.nextDouble(); //read second number  
		
        //perform addition, subtraction, multiplication and division  
        double sum = num1 + num2;  
        double diff = num1 - num2;  
        double prod = num1 * num2;  
        double qot = num1 / num2;  
		
        //display results  
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + num1 + " and " + num2 + " is " + sum + ", " + diff + ", " + prod + " and " + qot);  
        input.close();  
    }  
}

class AreaTriangle {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter base in cm");  
        double base = input.nextDouble(); //read base  
        System.out.println("enter height in cm");  
        double height = input.nextDouble(); //read height 
		
        //Calculate area in cm^2 and convert to inches^2  
        double areaCm = (base * height) / 2;  
        double areaIn = areaCm / 2.54;  
		
        //display results  
        System.out.println("The Area of the triangle in sq inches is " + areaIn + " and sq centimeters is " + areaCm);  
        input.close();  
    }  
}

class SideFromPerimeter {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter perimeter of square");  
        double peri = input.nextDouble(); //read perimeter  
		
        double side = peri / 4; //calculate side  
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri); //print result  
        input.close();  
    }  
}

class YardsMilesFromFeet {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter distance in feet");  
        double feet = input.nextDouble(); //read distance in feet  
		
        double yards = feet / 3; //convert feet to yards  
        double miles = yards / 1760; //convert yards to miles  
		
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles); //print result  
        input.close();  
    }  
}

class TotalPrice {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("unit price of item");  
        int uPrice = input.nextInt(); //read unit price of item  
        System.out.println("unit quantity of item");  
        int quantity = input.nextInt(); //read quantity of item  
		
        int totalPrice = uPrice * quantity; //calculate total price 
		
        //display results  
        System.out.println("The total purchase price is INR " + totalPrice + " if the quantity is " + quantity + " and unit price is INR " + uPrice);  
        input.close();  
    }  
}

class QuotientReminder {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter first number");  
        double num1 = input.nextDouble(); //read first number  
        System.out.println("enter second number");  
        double num2 = input.nextDouble(); //read second number  
		
        double qot = num1 / num2; //calculate quotient  
        double rem = num1 % num2; //calculate remainder  
		
        System.out.println("The Quotient is " + qot + " and Reminder is " + rem + " of two numbers " + num1 + " and " + num2); //print results  
        input.close();  
    }  
}

class IntegerOperations {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter 3 numbers a, b and c");  
        int a = input.nextInt(); //read 1st number  
        int b = input.nextInt(); //read 2nd number  
        int c = input.nextInt(); //read 3rd number  
		
        int op1 = a + b * c; //perform first operation  
        int op2 = a * b + c; //perform second operation  
        int op3 = c + a / b; //perform third operation  
        int op4 = a % b + c; //perform fourth operation  
		
        //display results  
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4);  
        input.close();  
    }  
}

class DoubleOperations {  
    public static void main(String[] args) {  
        Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter 3 numbers a, b and c in float");  
        double a = input.nextDouble(); //read 1st number in float  
        double b = input.nextDouble(); //read 2nd number in float  
        double c = input.nextDouble(); //read 3rd number in float  
		
        //perform 4 operations  
        double op1 = a + b * c;  
        double op2 = a * b + c;  
        double op3 = c + a / b;  
        double op4 = a % b + c;  
		
        System.out.println("The results of Double Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4); //display results  
        input.close();  
    }  
}

// Extras
class AdditionWithoutSymbol {  
    public static void main(String[] args) {  
        int num1 = -3, num2 = -4;  
        int sum = (num1 - (-num2));  
        System.out.println(sum);  
    }  
}

class SubtractWithoutSymbol {  
    public static void main(String[] args) {  
        int num1 = 4, num2 = 2;  
        int diff = (~(~num1 + num2));  
        System.out.println(diff);  
    }  
}

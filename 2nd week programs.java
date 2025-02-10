import java.util.Scanner;
class calc {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter first number");
		double num1= input.nextDouble();
		System.out.println("enter second number");
		double num2 = input.nextDouble();
		double sum = num1 + num2;
		double diff = num1 - num2;
		double prod = num1 * num2;
		double qot = num1 / num2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " +num1+ " and " + num2 + " is "+ sum + ", " + diff + ", " +prod +" and " +qot);
		input.close();
	}
}


class area_triangle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter base in cm");
		double base= input.nextDouble();
		System.out.println("enter height in cm");
		double height = input.nextDouble();
		double area_cm= (base * height) /2 ;
		double area_in= area_cm/2.54;
        System.out.println("The Area of the triangle in sq inches is " + area_in + " and sq centimeters is " + area_cm);
		input.close();
	}
}


class side_from_perimeter {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter perimeter of square");
		double peri= input.nextDouble();
		double side= peri/4;
        System.out.println("The length of the side is " + side + " whose perimeter is " + peri);
		input.close();
	}
}

class yards_miles_fromft {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter distance in feet");
		double feet= input.nextDouble();
		double yards = feet/3;
		double miles = yards/1760;
        System.out.println("The distance in yards is " + yards + " while the distance in miles is " + miles);
		input.close();
	}
}

class totalprice {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("unit price of item");
		int uprice= input.nextInt();
		System.out.println("unit quantity of item");
		int quantity= input.nextInt();
		int totalprice= uprice * quantity ;
        System.out.println("The total purchase price is INR " + totalprice + " if the quantity is " + quantity + " and unit price is INR "+ uprice);
		input.close();
	}
}

class quotient_reminder {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter first number");
		double num1= input.nextDouble();
		System.out.println("enter second number");
		double num2 = input.nextDouble();
		double qot = num1 / num2;
		double rem = num1%num2;
        System.out.println("The Quotient is " + qot + " and Reminder is " + rem + " of two numbers "+ num1 + " and " +num2);
		input.close();
	}
}

class intoperation {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter 3 numbers a, b and c");
		int a= input.nextInt();
		int b= input.nextInt();
		int c= input.nextInt();
		int op1= a + b *c;
		int op2= a * b + c;
		int op3= c + a / b;
		int op4= a % b + c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4);
		input.close();
	}
}

class DoubleOpt {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
		System.out.println("enter 3 numbers a, b and c in float");
		double a= input.nextDouble();
		double b= input.nextDouble();
		double c= input.nextDouble();
		double op1= a + b *c;
		double op2= a * b + c;
		double op3= c + a / b;
		double op4= a % b + c;
        System.out.println("The results of Int Operations are " + op1 + ", " + op2 + ", " + op3 + " and " + op4);
		input.close();
	}
}
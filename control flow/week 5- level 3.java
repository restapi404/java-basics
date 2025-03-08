import java.util.Scanner; //import scanner class

//1st program
class LeapYear {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //create scanner object  
        System.out.println("enter year: ");  
        int year = input.nextInt(); //read year
		if (year>= 1582){
			//check divisibility by 400 to find leap year
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



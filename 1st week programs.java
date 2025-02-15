import java.util.Scanner; 

class HarryAge {
    public static void main(String[] args) {
        int birthYear = 2000;  //Harry's birth year
        int currentYear = 2024;  //Current year
		
        int age = currentYear - birthYear;  //Calculate age
        System.out.println("Harry's age in 2024 is " + age);  //Print age
    }
}

class AverageMarks {
    public static void main(String[] args) {
        int maths = 94, physics = 95, chemistry = 96;  //Subjects' Marks
        int totalSubjects = 3;  // Number of subjects
		
        double average = (maths + physics + chemistry) / totalSubjects;  //Calculate average
        System.out.println("Sam's average mark in PCM is " + average);  //Print result
    }
}

class ConvertKmsToMiles {
    public static void main(String[] args) {
        double kilometers = 10.8;  //Distance in km
        double conversionFactor = 1.6; 
		
        double miles = kilometers * conversionFactor;  //Convert to miles
        System.out.println("The distance " + kilometers + " km in miles is " + miles); //Print result
    }
}

class ProfitLossCalc {
    public static void main(String[] args) {
        int costPrice = 129, sellingPrice = 191; 
		
        int profit = sellingPrice - costPrice;  //Calculate profit
        double profitPercent = ((double) profit / costPrice) * 100;  //Calculate profit percentage
		
		//Display results
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profitPercent + "%");
    }
}

class PenDistribution {
    public static void main(String[] args) {
        int totalPens = 14, totalStudents = 3;
		
        int pensPerStudent = totalPens / totalStudents;  //Pens for each student
        int remainingPens = totalPens % totalStudents;  //Remaining pens
        System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens); //Print result
    }
}

class Discount {
    public static void main(String[] args) {
        int fee = 125000, discountPercent = 10;  //Fee and discount percentage
		
        double discount = (fee * discountPercent) / 100.0;  //Calculate discount amount
        double discountedFee = fee - discount;  //Final fee after discount
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); //Print result
    }
}

class EarthVolume {
    public static void main(String[] args) {
        int radius = 6378;  //Earth's radius in km
        double pi = 3.14159;  //Approximate value of π
		
        double volumeKm3 = (4.0 / 3.0) * pi * r * r * r;  //Volume formula
        double volumeMiles3 = volumeKm3 * 0.239913;  //Convert km^3 to miles^3
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3); //Print result
    }
}

class KmToMilesUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Scanner object for input
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();  //read user input for distance
		
        double miles = km / 1.6;  //Convert km to miles
        System.out.println("The total miles is " + miles + " mile for the given " + km + " km"); //Print result
		
        input.close();
    }
}

class DiscountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  //Scanner object for input

        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();  //Read fee from user

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();  //Read discount percentage
        
        double discount = (fee * discountPercent) / 100;  //Calculate discount
        double discountedFee = fee - discount;  //Final amount after discount

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee); //Print result
        input.close(); 
    }
}

class HeightConverter {
    public static void main(String[] args) {
        double heightCm = 170.0; 
		
        double heightInches = heightCm / 2.54;  //Convert cm to inches
		
        int feet = (int) (heightInches / 12);  //Convert inches to feet
        int inches = (int) (heightInches % 12);  //Remaining inches
        System.out.println("Your height in cm is " + heightCm + " while in feet is " + feet + " and inches is " + inches); //Print result
    }
}

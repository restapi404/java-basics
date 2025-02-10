import java.util.Scanner;

class HarryAge {
    public static void main(String[] args) {
        int birth_yr = 2000;
        int current_yr = 2024;
        int age = current_yr - birth_yr;
        System.out.println("Harry's age in 2024 is " + age);
    }
}

class AverageMarks {
    public static void main(String[] args) {
        int maths = 94;
        int physics = 95;
        int chemistry = 96;
        int total_subjects = 3;
        double average = (maths + physics + chemistry) / total_subjects;
        System.out.println("Sam's average mark in PCM is " + average);
    }
}

class Convert_kms_to_miles {
    public static void main(String[] args) {
        double kilometers = 10.8;
        double convert = 1.6;
        double miles = kilometers * convert;
        System.out.println("The distance " + kilometers + " km in miles is " + miles);
    }
}

class profitloss_calc {
	public static void main(String[] args) {
		int cost_price = 129;
		int selling_price = 191;
		int profit = selling_price - cost_price;
		double profit_perc = (profit / cost_price) * 100;
		System.out.println("The Cost Price is INR " + cost_price + " and Selling Price is INR " + selling_price);
        System.out.println("The Profit is INR " + profit + " and the Profit Percentage is " + profit_perc + "%");
	}
}

class pen_distribution {
	public static void main(String[] args) {
		int total_pens = 14;
		int total_stds = 3;
		int pens_per_std = total_pens / total_stds;
		int remaining = total_pens % total_stds;
		System.out.println("The Pen Per Student is " + pens_per_std + " and the remaining pen not distributed is " + remaining);
    }
}

class discount {
	public static void main(String[] args) {
		int fee = 125000; 
        int discount_perc = 10;         
        double discount = (fee * discount_perc) / 100;
        double discounted_fee = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discounted_fee);
    }
}

class earth_vol{
    public static void main(String[] args) {
        int r = 6378;  
        double pi = 3.14159;     
        double volume_km3 = (4/3)*pi*r*r*r;
        double volume_miles3 = volume_km3 * 0.239913;
        System.out.println("The volume of Earth in cubic kilometers is " + volume_km3 + " and cubic miles is " + volume_miles3);
    }
}

class km_to_miles_userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble(); 
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}

class discount_userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the student fee (INR): ");
        double fee = input.nextDouble();  

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();  
        
        double discount = (fee * discountPercent) / 100;
        
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedFee);
        input.close();
    }
}

class height_converter {
    public static void main(String[] args) {
        double height_cm = 170.0;

        double height_inches = height_cm / 2.54;

        double feet = (int) (height_inches / 12);  
        double inches = (int) (height_inches % 12); 

        System.out.println("Your height in cm is " + height_cm + " while in feet is " + feet + " and inches is " + inches);
    }
}

	
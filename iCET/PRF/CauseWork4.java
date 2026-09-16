import java.util.*;
class CauseWork4{
	public static void main(String args []){
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("|                     SALARY INFORMATION SYATEM                          |");
		System.out.println("--------------------------------------------------------------------------");
		
		Scanner input = new Scanner(System.in);
		
		System.out.println('\n');
		System.out.println("\t[1] Calculate Income Tax ");
		System.out.println("\t[2] Calculate Annual Bonus ");
		System.out.println("\t[3] Calculate Loan Amount ");
		
		
		System.out.print("\n Enter an option to continue > ");
		int x =input.nextInt();
		
		switch (x){
			case 1: 
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("|                  Calculate Income Tax                                   |");
					System.out.println("--------------------------------------------------------------------------");
					
					System.out.print("Input Employee Name : ");
					String ename = input.nextLine();
					input.nextLine();
					
					System.out.print("Input Employee Salary : ");
					double esalary = input.nextDouble();
					
					if (esalary <= 100000 ){
						System.out.println("You Don't have to pay any income tax");
					}
					
					else if (esalary<=141667){
						System.out.println("You Have To Pay Income Tax Per Month : " +(esalary - 100000)*0.06);
					}
					else if (esalary<=183333){
						System.out.println("You Have To Pay Income Tax Per Month : " + 2500 +(esalary - 141667)*0.12);
					}
					else if (esalary<=225000){
						System.out.println("You Have To Pay Income Tax Per Month : " +( 7500 +(esalary - 183333)*0.18));
					}
					else if (esalary<=266667){
						System.out.println("You Have To Pay Income Tax Per Month : " +( 15000 +(esalary - 225000)*0.24));
					}
					else if (esalary<=308333){
						System.out.println("You Have To Pay Income Tax Per Month : " + (25000 +(esalary - 266667)*0.3));
					}
					else 
						System.out.println("You Have To Pay Income Tax Per Month : " +(37500 + (esalary - 308333)*0.36));
					
				break;
				
			case 2:
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("|                  Calculate Annual Bonus                                |");
					System.out.println("--------------------------------------------------------------------------");

					System.out.print("Input Your Name : ");
					String name = input.nextLine();
					input.nextLine();

					System.out.print("Input Your Salary : ");
					double salary = input.nextDouble();
					
					if (salary<100000){
						System.out.println("Anual Bonus  : "+(salary+5000));
					}
						
					else if (salary<200000){
							System.out.println("Anual Bonus : "+(salary *0.1));
					}
					else if (salary<300000){
							System.out.println("Anual Bonus  : "+(salary *0.15));
					}
					else if (salary<40000){
							System.out.println("Anual Bonus : "+(salary *0.2));
					}
					else if (salary>400000){
							System.out.println("Anual Bonus : "+(salary *0.35));
					}
						
					break;
				
			case 3:
					System.out.println("--------------------------------------------------------------------------");
					System.out.println("|                  Calculate Loan Amount                                  |");
					System.out.println("--------------------------------------------------------------------------");
					
					System.out.print("Input Employee Name : ");
					String empName = input.nextLine();
					input.nextLine();

					System.out.print("Input Employee Salary : ");
					double empSalary = input.nextDouble();

					System.out.print("Enter number of years : ");
					int Y = input.nextInt();
					int n = Y * 12; // months
					double mr = 0.15 / 12;// monthly rate
					double pow = 1 / Math.pow(1 + mr, n);//caculation
					double monthPay = empSalary * 0.60; // 60% 

					if (empSalary < 50000) {
						System.out.println("You can't apply for loan because your salary is less than Rs.50000!");
						}
					else {
						
						double loan= monthPay*(1-pow)/mr;
						System.out.println("You can get loan Amount : Rs." + loan);
						}
					
					break;
			}
	}
}

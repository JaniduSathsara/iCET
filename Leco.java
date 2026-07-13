import java.util.*;
class Leco{
	public static void main (String args[]){
	Scanner input=new Scanner(System.in);
	System.out.println(" ========================================");
	System.out.println("| \t LECO APP - MAIN MENU            |");
	System.out.println(" ======================================== \n");
	
	
	System.out.println("\t [1] Add LECO Account");
	System.out.println("\t [2] Bill Calculation \n");
	
	
	System.out.print("Enter an option to continue >");
	int selection1 = input.nextInt();
	
	switch (selection1){
			case 1:
			
				System.out.println("\n\t [1] Domestic - No Solar(Normal Meter)");
				System.out.println("\t [2] Domestic - With Solar (Net Meetering / Net Plus)\n");
	
	
				System.out.print("Select Account Type >");
				int selection2 = input.nextInt();
			
				System.out.println(" ========================================");
				System.out.println("| \t ADD LECO ACCOUNT               |");
				System.out.println(" ======================================== \n");
	
				System.out.print("Input Account Number - ");
				String acc = input.nextLine();
				input.nextLine();
	
				System.out.print("Input Customer Name - ");
				String name = input.nextLine();
	
				System.out.print("Input NIC Number - ");
				String nic = input.nextLine();
	
				System.out.print("Input Meter Number - ");
				String mnum = input.nextLine();
	
				System.out.print("Select Account Type - ");
				int x = input.nextInt();
				System.out.println("\n");
	
				System.out.println("----------------Account Created-------------------\n");
				System.out.println("Account Number  :" +acc);
				System.out.println("Customer Name   :" +name);
				System.out.println("NIC Number      :" +nic);
				System.out.println("Meter Number    :" +mnum);
				
				switch (selection2){
					case 1:
						if (x == 1) {
							System.out.println("Account Type    : Domestic - No Solar");
						}else
							System.out.println("Account Type    : Domestic - With Solar");
						}
						System.out.println("\n");
				System.out.println("_______________________________________________");		
				System.out.println("Your LECO account has been created successfully.");
				System.out.println("_______________________________________________");
	break;
	
		case 2 :
				System.out.println(" ========================================");
				System.out.println("|   LECO BILL CALCULATION - ONLY METER   |");
				System.out.println(" ======================================== \n");
				
				System.out.print("Input Customer name - ");
				String cname = input.nextLine();
				input.nextLine();
				
				System.out.print("Input Total Units   - ");
				int unit  = input.nextInt();
				System.out.println("\n");
				if (unit<=30){
			    double totalunit = (unit*4);
			    double fcharge = 75;
					System.out.println("Energy Charge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge));
				}
				else if (unit<=60){
					double totalunit =((unit*6)-60);
					double fcharge = 200;
					System.out.println("Energy Charge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge)); 
				}
				else if (unit<=90){
					double totalunit = (60*11)+(30*14);
					double fcharge = 400;
					System.out.println("Energy Charge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge));
				}
				else if (unit<=120){
					double totalunit =(60*11)+(30*14)+(30*20);
					double fcharge = 1000;
					System.out.println("Energy Cahrge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge));
				}
				else if (unit<=180){
					double totalunit = (60*11)+(30*14)+(30*20)+(30*33);
					double fcharge = 1500;
					System.out.println("Energy Charge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge));
				}
				/*else{
					double totalunit = (60*11)+(30*52)-180;
					double fcharge = 2000;
					System.out.println("Energy Charge    - Rs."+totalunit);
					System.out.println("Fixed Charge     - Rs."+fcharge+"\n");
					System.out.println("You have to pay  - Rs."+(totalunit+fcharge));
				}*/
				
	break;
			}
	}
}
		

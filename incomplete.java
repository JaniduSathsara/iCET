import java.util.*;
class Example{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("+-------------------------------------------------------------+");
		System.out.println("|           Boiled Chicken Packet Factory System              |");
		System.out.println("+-------------------------------------------------------------+");
		System.out.print("\n");
		
		System.out.print("Enter today's Mnufacturing Price (Rs.per kg) :");
		double mfPrice = input.nextDouble();
		
		System.out.print("Enter today's Selling Price (Rs.per kg) :");
		double sellPrice = input.nextDouble();
		System.out.print("\n");
		
				int count = 0;
				double tot = 0;
				double max = 0;
				double min = 0;
				double avg = 0;
				int bcount = 0;
				int totbox = 0;
				int totpack = 0;
				double totweight = 0;
				double totmax = 0;
				double totmin=0;
				double totavg = 0;
				double mfcost = 0;
				double totincome = 0;
				double profit=0;
		while (true){
			if (mfPrice>0 || sellPrice>0){			
				bcount++;
				System.out.println("Starting Box "+bcount+ "...");
				}
				
					System.out.println("+-------------------------------------------------------------+");
					System.out.println("|  \t \t \t  Box #" +bcount+"\t\t\t      |");                           
					System.out.println("+-------------------------------------------------------------+");
					System.out.print("\n");
			
			while(true){
				
				System.out.print("Enter packet weight (KG) [0 = box full, -1 = end day] :");
				double weight = input.nextDouble();
				System.out.print("\n");
									
					
					if (count > 0) {
						count++;
						tot += weight;

						if (max > weight)
						   weight = max;

							if (min < weight)
							min = weight;
						}
				
					if(weight==0){
						
						System.out.println("Entering Box Report............");
						
						System.out.println("+-------------------------------------------------------------+");
						System.out.println("|                         Box Report                          |");
						System.out.println("+-------------------------------------------------------------+");
						System.out.print("\n");
						
						while(weight!=0 && weight!=-1){
	
							if(weight<0 && weight!=-1){
								System.out.println("\tInvalid input...");
								System.out.print("Enter packet weight (kg) [0 = box full, -1 = end day]: ");
								weight = input.nextDouble();
							continue;
							}

							count++;
							totweight=totweight+weight;
			
							if(max<weight){
								max=weight;
							}
	
								if(count == 1){
									min = weight;
								}else if(min > weight){
										min = weight;
								}
			
						}

						System.out.println("---------------------------------");
						System.out.println("Total Packets   :"+count);
						System.out.println("Total Weight    :"+tot+"KG");
						System.out.println("Max Weight      :"+max+"KG");
						System.out.println("Min Weight      :"+min+"KG");
						System.out.println("Average weight  :"+avg+"KG");
						System.out.print("---------------------------------");
						
						
						
					break;
						
						
					}else if (weight <= (-0) && weight !=(-1) ){
						System.out.println("Invalid Input.....");
					}
					
					else if(weight ==(-1)){
						System.out.println("End of the day..........");
						
						System.out.println("========================DAY-END SUMMARY==================");
						System.out.print("\n");
							
						System.out.println("Total Boxes Packed     :"+totbox);
						System.out.println("Total Packet Packed    :"+totpack+"KG");
						System.out.println("Total Weight (Day)     :"+totweight+"KG");
						System.out.println("Max Weight (Day)       :"+totmax+"KG");
						System.out.println("Min Weight (Day)       : "+totmin+"KG");
						System.out.println("Average weight (Day)   :"+totavg+"KG");
						System.out.println("Manufacturing Cost     : Rs."+mfcost);
						System.out.println("Total Income (Sales)   : Rs."+totincome);
						System.out.println("Net Profit             : Rs."+profit);
						
						System.out.println("=====================================================================");
						System.out.print("\n");
						System.out.println("Thank You.Program ended.");
						
						break;
						}
					
				}
			}	
			
	
	}
}
		

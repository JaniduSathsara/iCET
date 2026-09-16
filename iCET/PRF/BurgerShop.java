import java.util.*;
class BurgerShop{
	
	public static void CustomerBill(){
		Scanner input = new Scanner (System.in);
		
		double [] BillValue =  new double [0];
		String [] CustomerID = new String [0];
		
		double [] tempBill = new double [BillValue.length+1];
		for (int i = 0; i < BillValue.length; i++){
			tempBill[i]=BillValue[i];
		}
		
		String [] tempID = new String [CustomerID.length+1];
		for (int i = 0; i < CustomerID.length; i++){
			tempID[i]=CustomerID[i];
		}
	
		
		int customerCount = 0;
		while(true){
			System.out.print("\nEnter Customer ID (Enter -1 to stop) : ");
			String cusID = input.next();
			
			if(cusID .equals ("-1")){
				break;
			}
			System.out.println();
			System.out.print("\nEnter Bill Value : ");
			double bill = input.nextDouble();
			
			BillValue[customerCount] = bill;
			CustomerID[customerCount] = cusID;
			customerCount++;
		}		
		CustomerReport(BillValue,CustomerID,customerCount);
	}
	
	public static void CustomerReport(double [] BillValue,String [] CustomerID,int customerCount){
		for (int i = 0; i < customerCount-1; i++){
			for (int j = i+1; j <customerCount; j++){
				if(BillValue[i]==BillValue[i]){
					double tempBill = BillValue[i];
					BillValue[i]=BillValue[j];
					BillValue[j]=tempBill;
					
					String tempID = CustomerID[i];
					CustomerID[i]=CustomerID[j];
					CustomerID[j]=tempID;
				}	
			}	
		}
		System.out.println();
		System.out.println("Customer ID  |  Total Bill  ");
		System.out.println("--------------------------------");
		
		for (int k = 0; k < customerCount; k++){
			System.out.println("  "+CustomerID[k]+ "\t\t"+BillValue[k]);
		}	
	}
	
	public static void main(String args []){
		CustomerBill();
	}
}

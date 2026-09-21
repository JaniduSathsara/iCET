import java.util.*;
class Customers{
    String customerID;
    String customerName;
    String customerPhoneNum;

    public Customers(String customerID, String customerName, String customerPhoneNum){
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerPhoneNum = customerPhoneNum;
    }
}

class Orders{

    String orderID;
    String customerID;
    double billValue;

    public Orders(String orderID, String customerID, double billValue){
        this.orderID = orderID;
        this.customerID = customerID;
        this.billValue = billValue;
    }
}

class BurgerShop {
    public static Customers[] customerArray = new Customers[0];
    public static Orders[] orderArray = new Orders[0];
    public static String[] givenCustomerIDs = {"C001", "C002","C005"};
    
    public static String checkCustomerID(String customerID){
        for (int i = 0; i < givenCustomerIDs.length; i++){
            if (givenCustomerIDs[i].equals(customerID)){
                return "Already Added..";
            }
        }
        return "New Customer Detected..";
    }

    public static void addCustomer(String id, String name, String phone) {
        Customers customer = new Customers(id, name, phone);
        customerArray = Arrays.copyOf(customerArray,customerArray.length + 1);
        customerArray[customerArray.length - 1] = customer;
    }
    public static void addOrder(String orderID, String customerID, double bill){
        Orders order = new Orders(orderID, customerID, bill);
        orderArray = Arrays.copyOf(orderArray,orderArray.length + 1);
        orderArray[orderArray.length - 1] = order;
    }

    public static void sortCustomers() {
        Arrays.sort(customerArray, new Comparator<Customers>(){
            public int compare(Customers c1, Customers c2) {
				return c1.customerID.compareTo(c2.customerID);
            }
        });
    }

    public static void customerReport() {
        sortCustomers();
        System.out.println();
        System.out.println("========================================================");
        System.out.println("|                  CUSTOMER REPORT                     |");
        System.out.println("========================================================");

        for (int i = 0; i < customerArray.length; i++) {
            double totalBill = 0;
            for (int j = 0; j < orderArray.length; j++){
                if (customerArray[i].customerID.equals(orderArray[j].customerID)){
                    totalBill += orderArray[j].billValue;
                }
            }
            System.out.println("Customer ID   : "+ customerArray[i].customerID);
            System.out.println("Customer Name : "+ customerArray[i].customerName);
            System.out.println("Phone Number  : "+ customerArray[i].customerPhoneNum);
            System.out.println("Total Bill    : "+ totalBill);
            System.out.println("--------------------------------------------------------");
        }
    }

    public static void customerDetails(){
        Scanner input = new Scanner(System.in);
        while (true){
            System.out.print("Enter Customer ID [Enter -1 to Stop] : ");
            String customerID = input.next();

            if (customerID.equals("-1")){
                break;
            }

            String result = checkCustomerID(customerID);
            System.out.println(result);

            System.out.print("Enter Customer Name : ");
            String customerName = input.next();

            System.out.print("Enter Customer Phone No : ");
            String customerPhoneNum = input.next();


            System.out.print("Enter Bill Value : ");
            double billValue = input.nextDouble();

            addCustomer(customerID,customerName,customerPhoneNum);
            String orderID ="O" + String.format("%03d", orderArray.length + 1);

            addOrder(orderID,customerID,billValue);
            System.out.println();
        }
        customerReport();
    }

    public static void main(String args[]){

        System.out.println("==================================================================");
        System.out.println("|       BURGER SHOP BILLING SYSTEM - DAILY TRANSACTION ENTRY     |");
        System.out.println("==================================================================");
        System.out.println();

        customerDetails();
    }
}

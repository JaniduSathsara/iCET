import java.util.*;

class StudentManagementSystem {
    // Batch status
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;
     public static final int StudentCount = 25;
   

    // Batch data
    public static int[] batchNameArray = { 105, 106, 107, 108, 109, 110 };
    public static int[] batchStatusArray = { 0, 0, 0, 0, 1, 1 };
    public static int[] studentCountArray = new int[100];
   

    // Student data
    public static String[] regNoArray = {
            "PR24105001", "PR24105002", "PR24105003", "PR24105004", "PR24105005",
            "PR24105006", "PR24105007", "PR24105008", "PR24105009", "PR24105010",
            "OR24105011", "OR24105012", "OR24105013", "OR24105014", "OR24105015",
            "PR24105016", "PR24105017", "PR24105018", "OR24105019", "OR24105020",
            "PR24105021", "PR24105022", "OR24105023", "OR24105024", "PR24105025",
            "PR24106001", "PR24106002", "PR24106003", "PR24106004", "PR24106005",
            "PR24106006", "PR24106007", "PR24106008", "PR24106009", "PR24106010",
            "OR24106011", "OR24106012", "OR24106013", "OR24106014", "OR24106015",
            "PR24106016", "PR24106017", "PR24106018", "OR24106019", "OR24106020",
            "PR24106021", "PR24106022", "OR24106023", "OR24106024", "PR24106025",
            "PR24107001", "PR24107002", "PR24107003", "PR24107004", "PR24107005",
            "PR24107006", "PR24107007", "PR24107008", "PR24107009", "PR24107010",
            "OR24107011", "OR24107012", "OR24107013", "OR24107014", "OR24107015",
            "PR24107016", "PR24107017", "PR24107018", "OR24107019", "OR24107020",
            "PR24107021", "PR24107022", "OR24107023", "OR24107024", "PR24107025",
            "PR24108001", "PR24108002", "PR24108003", "PR24108004", "PR24108005",
            "PR24108006", "PR24108007", "PR24108008", "PR24108009", "PR24108010",
            "OR24108011", "OR24108012", "OR24108013", "OR24108014", "OR24108015",
            "PR24108016", "PR24108017", "PR24108018", "OR24108019", "OR24108020",
            "PR24108021", "PR24108022", "OR24108023", "OR24108024", "PR24108025",
            "PR24109001", "PR24109002", "PR24109003", "PR24109004", "PR24109005",
            "PR24109006", "PR24109007", "PR24109008", "PR24109009", "PR24109010",
            "OR24109011", "OR24109012", "OR24109013", "OR24109014", "OR24109015",
            "PR24109016", "PR24109017", "PR24109018", "OR24109019", "OR24109020",
            "PR24109021", "PR24109022", "OR24109023", "OR24109024", "PR24109025",
            "PR24110001", "PR24110002", "PR24110003", "PR24110004", "PR24110005",
            "PR24110006", "PR24110007", "PR24110008", "PR24110009", "PR24110010",
            "OR24110011", "OR24110012", "OR24110013", "OR24110014", "OR24110015",
            "PR24110016", "PR24110017", "PR24110018", "OR24110019", "OR24110020",
            "PR24110021", "PR24110022", "OR24110023", "OR24110024", "PR24110025"

    };

    public static String[] nicArray = {
            "199501012345", "199503153872", "199506202198", "199509102983", "199511258739",
            "199512303498", "199502183764", "199504223198", "199508153210", "199510293417",
            "199601102375", "199604182938", "199606243879", "199608142178", "199610312475",
            "199611173452", "199603293481", "199605083217", "199607232198", "199609192375",
            "199701212483", "199703132487", "199706253478", "199708083298", "199710243651",
            "199712152983", "199702182734", "199704293187", "199705142375", "199709083751",
            "199801032874", "199803232871", "199806193428", "199808013764", "199810242374",
            "199812302984", "199802152348", "199805213471", "199807172398", "199811283472",
            "199901122471", "199903052984", "199906213874", "199908093412", "199910273894",
            "199912153482", "199902202394", "199904163874", "199907293481", "199911083479",
            "200001112374", "200003143478", "200006293874", "200008103471", "200010252984",
            "200012043894", "200002193874", "200004212374", "200005183492", "200007153871",
            "200101232984", "200103083471", "200106273894", "200108123984", "200110043728",
            "200112213874", "200102253471", "200104103874", "200105293784", "200107202983",
            "200201013874", "200203253471", "200206143874", "200208083471", "200210293874",
            "200212183471", "200202103874", "200204123894", "200205283471", "200207153874",
            "200301093874", "200303283471", "200306153874", "200308123471", "200310083874",
            "200312243471", "200302273874", "200304203471", "200305123874", "200307213471",
            "200401153874", "200403123471", "200406293874", "200408083471", "200410213874",
            "200412153471", "200402203874", "200404273471", "200405143874", "200407183471",
            "200501023874", "200503193471", "200506153874", "200508213471", "200510083874",
            "200512293471", "200502123874", "200504153471", "200505283874", "200507173471"
            ,"200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200512345678", "199909876543", "199812346789", "200010203040", "200608789012",
            "200012345678", "199812345679", "199902345678", "199712345670", "200102345671",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678",
            "200203456782", "200305678901", "199601234567", "199511223344", "200412345678"
        };

    public static String[] nameArray = {
            "Gunawardena Weerasinghe", "Senanayake Silva", "Silva Kumara", "Kumara Herath", "Rathnayake Herath",
            "Wijesinghe Bandara", "Rajapaksha Herath", "Senanayake Karunaratne", "Karunaratne Jayasinghe",
            "Gunawardena Silva",
            "Weerasinghe Rajapaksha", "Silva Rathnayake", "Fernando Perera", "Kumara Abeysekera",
            "Ekanayake Rathnayake",
            "Herath Gunawardena", "Abeysekera Silva", "Weerasinghe Silva", "Jayasinghe Dias", "Bandara Rathnayake",
            "Silva Perera", "De Silva Dias", "Abeysekera Jayasinghe", "Rajapaksha Senanayake", "Kumara Karunaratne",
            "Silva Abeysekera", "Jayasinghe Bandara", "Rathnayake Kumara", "Weerasinghe Rajapaksha",
            "Senanayake Herath",
            "Perera Ekanayake", "Herath Jayasinghe", "Kumara Gunawardena", "Abeysekera Silva", "Dias Fernando",
            "Karunaratne Weerasinghe", "Ekanayake Bandara", "Rajapaksha Kumara", "Silva De Silva",
            "Gunawardena Rathnayake",
            "Bandara Karunaratne", "Fernando Perera", "De Silva Silva", "Rajapaksha Gunawardena", "Herath Weerasinghe",
            "Karunaratne Dias", "Jayasinghe Silva", "Senanayake Abeysekera", "Silva Jayasinghe", "Rathnayake Kumara",
            "Gunawardena Kumara", "Rajapaksha Silva", "Perera Jayasinghe", "Silva Ekanayake", "Dias Senanayake",
            "Herath Abeysekera", "Rathnayake Fernando", "Kumara Herath", "Weerasinghe Silva", "Senanayake Karunaratne",
            "Abeysekera Silva", "Bandara Gunawardena", "Karunaratne Weerasinghe", "Perera Herath", "Fernando Dias",
            "Weerasinghe Gunawardena", "Rathnayake Kumara", "Senanayake Fernando", "Silva Bandara", "Herath Rajapaksha",
            "Kumara Jayasinghe", "Abeysekera Perera", "Rathnayake Jayasinghe", "Kumara Weerasinghe",
            "Rajapaksha Ekanayake",
            "Fernando Rajapaksha", "Silva Gunawardena", "Perera Wijesinghe", "Herath Abeysekera",
            "Rajapaksha Ekanayake",
            "Karunaratne Silva", "Weerasinghe Fernando", "Silva Bandara", "Abeysekera Weerasinghe",
            "Kumara Karunaratne",
            "Dias Rajapaksha", "Herath Perera", "Rathnayake Gunawardena", "Ekanayake Jayasinghe", "Gunawardena Silva",
            "Rajapaksha Perera", "Karunaratne Jayasinghe", "Weerasinghe Abeysekera", "Rathnayake Fernando",
            "Kumara Herath",
            "Silva Weerasinghe", "Herath Karunaratne", "Abeysekera Silva", "Gunawardena Ekanayake",
            "Weerasinghe Kumara",
            "Weerasinghe Kumara", "Rajapaksha Abeysekera", "Gunawardena Perera", "Karunaratne Silva",
            "Herath Wijesinghe",
            "Rathnayake Ekanayake", "Silva Fernando", "Abeysekera Rajapaksha", "Fernando Bandara", "Perera Herath",
            "Weerasinghe Jayasinghe", "Silva Karunaratne", "Rathnayake Gunawardena", "Herath Kumara",
            "Abeysekera Silva",
            "Ekanayake Bandara", "Rajapaksha Fernando", "Gunawardena Weerasinghe", "Kumara Karunaratne", "Silva Dias",
            "Perera Weerasinghe", "Karunaratne Rajapaksha", "Jayasinghe Silva", "Rathnayake Perera", "Silva Ekanayake",
            "Silva Karunaratne", "Herath Fernando", "Kumara Jayasinghe", "Weerasinghe Perera", "Abeysekera Rajapaksha",
            "Rathnayake Karunaratne", "Ekanayake Bandara", "Gunawardena Perera", "Silva Wijesinghe",
            "Rajapaksha Jayasinghe",
            "Rathnayake Fernando", "Karunaratne Kumara", "Perera Silva", "Gunawardena Ekanayake", "Bandara Rajapaksha",
            "Silva Herath", "Rathnayake Weerasinghe", "Perera Gunawardena", "Herath Karunaratne", "Silva Rajapaksha",
            "Ekanayake Kumara", "Bandara Herath", "Weerasinghe Rajapaksha", "Karunaratne Abeysekera", "Perera Dias",

    };

    public static int[] prfArray = {
            85, 39, -1, 72, 44,
            91, 60, 38, 95, 49,
            -1, 67, 23, 58, 88,
            81, 73, 29, 62, -1,
            79, 53, 94, 47, 35,
            93, 15, -1, 82, 45,
            88, 23, 79, 37, -1,
            68, 100, 59, 29, 92,
            12, 77, 38, 66, 9,
            84, 51, 32, -1, 97,
            95, -1, 63, 88, 32,
            76, 97, 54, -1, 23,
            90, 35, 81, 61, 44,
            67, 100, 17, 85, 29,
            70, 42, -1, 60, 86,
            86, 57, 91, 35, -1,
            76, 48, 94, 23, 69,
            -1, 80, 55, 88, 32,
            100, 67, 43, -1, 90,
            60, 77, 25, 71, 84,
            92, 68, 59, 85, 63,
            76, 91, 70, 84, 63,
            72, 89, 45, 81, 77,
            68, 63, 88, 75, 90,
            57, 79, 92, 62, 100,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2

    };

    public static int[] dbmsArray = {
            66, 45, 93, 58, -1,
            37, 88, 21, 79, 40,
            76, 54, -1, 69, 92,
            25, 84, 33, 60, 71,
            59, -1, 98, 27, 48,
            35, 91, 60, -1, 72,
            49, 26, 80, 14, 89,
            67, -1, 31, 94, 53,
            78, 5, 90, 24, 86,
            39, -1, 61, 73, 100,
            38, 91, -1, 74, 55,
            82, 66, 49, 99, 13,
            80, 70, 93, 36, 59,
            85, 47, 90, -1, 22,
            77, 34, 63, 100, 29,
            79, 62, 87, -1, 54,
            46, 99, 39, 70, -1,
            75, 83, 58, 92, 30,
            91, 40, 63, 95, 68,
            -1, 66, 21, 88, 37,
            67, 91, 85, 73, 70,
            63, 76, 88, 55, 64,
            79, 80, 59, 92, 68,
            100, 77, 83, 45, 62,
            66, 59, 78, 85, 56,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2,
            -2, -2, -2, -2, -2
    };

    public static void extendArrays(String nicNum, String stuName, String studentId){
		String[] tempNic = new String[nicArray.length+1];
		String[] tempName = new String[nameArray.length+1];
		String[] tempId = new String[regNoArray.length+1];
		int[] tempPrf = new int[prfArray.length+1];
		int[] tempDbms = new int[dbmsArray.length+1];
		
		for (int i = 0; i < regNoArray.length; i++){
			tempNic[i] = nicArray[i];
			tempName[i] = nameArray[i];
			tempId[i] = regNoArray[i];
			tempPrf[i] = prfArray[i];
			tempDbms[i] = dbmsArray[i];
		}
		tempNic[tempNic.length-1] = nicNum;
		tempName[tempName.length-1] = stuName;
		tempId[tempId.length-1] = studentId;
		tempPrf[tempPrf.length-1] = -2;
		tempDbms[tempDbms.length-1] = -2;
		
		nicArray = tempNic;
		nameArray = tempName;
		regNoArray = tempId;
		prfArray = tempPrf;
		dbmsArray = tempDbms;
	}
	

    // console clear
    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
            // Handle any exceptions.
        }
    }

     // Exit
    public static void exit() {
        clearConsole();
        System.out.println("\n\t\tYou left the program...\n");
        System.exit(0);
    }
    
   
    // home page
    public static void homePage() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tiCET Student Management System\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Student Management");
        System.out.println("\n[2] Batch Management ");
        System.out.println("\n[3] Grade Management");
        System.out.println("\n[4] Report Generator");
        System.out.println("\n[5] Exit");

        Scanner input = new Scanner(System.in);
        do {

            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    studentManagement();
                    break;
                case 2:
                    clearConsole();
                    batchManagement();
                    break;
                case 3:
                    clearConsole();
                    gradeManagement();
                    break;
                case 4:
                    clearConsole();
                    reportGenerator();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);
    }

    // Student Management
    public static void studentManagement() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t\tStudent Management\t\t\t|");
        System.out.println("-----------------------------------------------------------------\n");
        System.out.println("[1] Add Student");
        System.out.println("\n[2] Update Student ");
        System.out.println("\n[3] View Student Profile");
        System.out.println("\n[4] Delete Student Profile");
        System.out.println("\n[5] Exit");
        
        Scanner input = new Scanner(System.in);
        do {

            System.out.print("\n\nEnter an option to continue > ");
            int option = input.nextInt();

            switch (option) {
                case 1:
                    clearConsole();
                    addStudent();
                    break;
                case 2:
                    clearConsole();
                    updateStudent();
                    break;
                case 3:
                    clearConsole();
                    viewStudent();
                    break;
                case 4:
                    clearConsole();
                    deleteStudent();
                    break;
                case 5:
                    exit();
                    break;
            }
        } while (true);

    }
    
    public static void addStudent(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t Add Student \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
        
        System.out.print("Enter Batch Number (Student Should be added) :");
        int batchNum = input.nextInt();
        System.out.println();
        
		if(checkBatchNum(batchNum)){
			System.out.print("Enter Student NIC : ");
			String stuNIC = input.next();
			System.out.println();

		if(checkNIC(stuNIC)){
			System.out.print("Enter Student Name : ");
			String stuName = input.next();
			System.out.println();

			System.out.print("Enter lecture mode ( 1- Physical  0- Online) : ");
			int lecMode = input.nextInt();

			System.out.println();
			String studentId = newSturegisterID(batchNum, lecMode, StudentCount);
			extendArrays(stuNIC, stuName, studentId);

		}else{
			System.out.println("This student already added to the system...");
		}
		}else{
			System.out.println("Students can't be added to this batch because enrollment is closed...");
		}
	}

	public static boolean checkBatchNum(int batchNum){
		for (int i = 0; i < batchNameArray.length; i++){
			if(batchNameArray[i] == batchNum){
				if(batchStatusArray[i] == 1){
					return true;
				}else{
					return false;
				}
			}
		}
		return false;
	}

	public static boolean checkNIC(String stuNIC){
		for (int i = 0; i < nicArray.length; i++){
			if(nicArray[i].equals(stuNIC)){
				return false;
			}
		}
		return true;
	}

	public static String newSturegisterID(int batchNum, int lecMode, int StudentCount){
		String studentId = "";
		int year = 24;
		StudentCount++;

		if (lecMode == 1){
			studentId = String.format("Student Registration No - PR%03d"+year+batchNum+StudentCount);
		}else if (lecMode == 0){
			studentId = String.format("Student Registration No - OR%%03d"+year+batchNum+StudentCount);
		}
		return studentId;
	}
	
	
	public static void updateStudent(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t Update Student \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No: ");
		String registerdID = input.next();
		System.out.println();
	
		
		if (checkRegisterID(nicArray, nameArray, registerdID)) {
			System.out.println();
		}else{
			System.out.println("Register ID not found..");
		}
		
		System.out.println("What do you want to update ?");
		System.out.println();
		System.out.println("\t [1] Student's Name");
		System.out.println();
		System.out.println("\t [2] Student's NIC");
		
		System.out.print("\n\nEnter your option > ");
		int option = input.nextInt();
		
        while (true) {   
            switch (option) {
                case 1:
                    clearConsole();
                    nameUpdate(nicArray, nameArray);
                    break;
                case 2:
                    clearConsole();
                    nicUpdate(nicArray,nameArray);
                    break;
                default:
					System.out.println("Invalid option!");
            }
        }
	}
	
	public static boolean checkRegisterID(String[] nicArray, String[] nameArray, String registerdID) {
		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i].equals(registerdID)){
				System.out.println("Student Name : " + nameArray[i]);
				System.out.println();
				System.out.println("Student NIC  : " + nicArray[i]);
				return true;
			}
		}
		return false;
	}
	
	public static void nameUpdate(String[] nicArray, String[] nameArray) {
		Scanner input = new Scanner(System.in);

		System.out.println("Student Name Update");
		System.out.println("====================\n");

		System.out.print("\nEnter Student Registration No : ");
		String registeredID = input.nextLine();

		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i].equals(registeredID)){
				System.out.println("\nRegistration No     :"+regNoArray[i]);
				System.out.println("Student NIC           :"+nicArray[i]);
				System.out.println("Student Current Name  :"+nameArray[i]);
				System.out.println();
				System.out.print("\nEnter student name to update - ");
				String newName = input.nextLine();

				nameArray[i] = newName;
				System.out.println("\nStudent name updated successfully...");
				return;
			}
		}
	}
	
	public static void nicUpdate(String[] nicArray, String[] nameArray){
		Scanner input = new Scanner(System.in);

		System.out.println("Student NIC Update");
		System.out.println("====================\n");

		System.out.print("\nEnter Student Registration No : ");
		String registeredID = input.nextLine();

		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i].equals(registeredID)){

				System.out.println("\nRegistration No      :"+regNoArray[i]);
				System.out.println("Student name           :"+nameArray[i]);
				System.out.println("Student Current NIC    :"+nicArray[i]);
				System.out.println();
				System.out.print("\nEnter student NIC to update - ");
				String newNIC = input.nextLine();

				nicArray[i] = newNIC;
				System.out.println("\nStudent NIC updated successfully...");
				return;
			}
		}
	}

	// me method eka (view & delete) walata
	public static boolean checksRegisterID(String[] nicArray,String[] nameArray,String registeredID){
		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i] != null && regNoArray[i].equals(registeredID)){
				System.out.println("\tRegistration No\t\t: " + regNoArray[i]);
				System.out.println("\tStudent Name\t\t: " + nameArray[i]);
				System.out.println("\tStudent NIC\t\t: " + nicArray[i]);
				
				if(prfArray[i] == -1){
					System.out.println("\tStudent PRF Marks\t: Absent");
				}else if(prfArray[i] == -2){
					System.out.println("\tStudent PRF Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent PRF Marks\t: " + prfArray[i]);
				}

				if(dbmsArray[i] == -1){
					System.out.println("\tStudent DBMS Marks\t: Absent");
				}else if(dbmsArray[i] == -2){
					System.out.println("\tStudent DBMS Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent DBMS Marks\t: " + dbmsArray[i]);
				}

				double gpaValue = makeGpaValue(i);
				System.out.println("\tStudent GPA\t\t: " + gpaValue);
				return true;
			}
		}
		return false;
	}
	
	public static void viewStudent(){
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t     View Student's Profile     \t\t|");
		System.out.println("-----------------------------------------------------------------\n");

		System.out.print("Enter Student Registration No: ");
		String registeredID = input.next();
		System.out.println();

		if (checksRegisterID(nicArray, nameArray, registeredID)){
			System.out.print("\nDo you want to search another student details (Y/N): ");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y'){
				viewStudent();
			}else if(option == 'N' || option == 'n'){
				clearConsole();
			}else{
			}
		}else{
			System.out.println("\nStudent Registration not found!");
			
			System.out.print("\nDo you want to search another student details (Y/N): ");
			char option = input.next().charAt(0);

			if(option == 'Y' || option == 'y'){
				viewStudent();
			}else if (option == 'N' || option == 'n'){
				homePage();
			}else{
				System.out.println("\nInvalid option!");
			}
		}
	}

	public static double makeGpaValue(int i){
    double PRFGpaValue = 0; 
    double DBMSgpaValue = 0;

		if(prfArray[i] == -1){
			PRFGpaValue = 0;
		}else if (prfArray[i] == -2){
			PRFGpaValue = 0;
		}else if(prfArray[i] >= 90 && prfArray[i] <= 100){
			PRFGpaValue = 4.25;
		}else if (prfArray[i] >= 80 && prfArray[i] <= 89){
			PRFGpaValue = 4.00;
		}else if (prfArray[i] >= 75 && prfArray[i] <= 79){
			PRFGpaValue = 3.70;
		}else if (prfArray[i] >= 70 && prfArray[i] <= 74){
			PRFGpaValue = 3.30;
		}else if (prfArray[i] >= 65 && prfArray[i] <= 69){
			PRFGpaValue = 3.00;
		}else if (prfArray[i] >= 60 && prfArray[i] <= 64){
			PRFGpaValue = 2.70;
		}else if (prfArray[i] >= 55 && prfArray[i] <= 59){
			PRFGpaValue = 2.30;
		}else if (prfArray[i] >= 50 && prfArray[i] <= 54){
			PRFGpaValue = 2.00;
		}else if (prfArray[i] >= 45 && prfArray[i] <= 49){
			PRFGpaValue = 1.70;
		}else if (prfArray[i] >= 40 && prfArray[i] <= 44){
			PRFGpaValue = 1.30;
		}else if (prfArray[i] >= 30 && prfArray[i] <= 39){
			PRFGpaValue = 1.00;
		}else if (prfArray[i] >= 20 && prfArray[i] <= 29){
			PRFGpaValue = 0.70;
		}
		if(dbmsArray[i] == -1){
			DBMSgpaValue = 0;
		}else if (dbmsArray[i] == -2) {
			DBMSgpaValue = 0;
		}else if (dbmsArray[i] >= 90 && dbmsArray[i] <= 100){
			DBMSgpaValue = 4.25;
		}else if (dbmsArray[i] >= 80 && dbmsArray[i] <= 89){
			DBMSgpaValue = 4.00;
		}else if (dbmsArray[i] >= 75 && dbmsArray[i] <= 79){
			DBMSgpaValue = 3.70;
		}else if (dbmsArray[i] >= 70 && dbmsArray[i] <= 74){
			DBMSgpaValue = 3.30;
		}else if (dbmsArray[i] >= 65 && dbmsArray[i] <= 69){
			DBMSgpaValue = 3.00;
		}else if (dbmsArray[i] >= 60 && dbmsArray[i] <= 64){
			DBMSgpaValue = 2.70;
		}else if (dbmsArray[i] >= 55 && dbmsArray[i] <= 59){
			DBMSgpaValue = 2.30;
		}else if (dbmsArray[i] >= 50 && dbmsArray[i] <= 54){
			DBMSgpaValue = 2.00;
		}else if (dbmsArray[i] >= 45 && dbmsArray[i] <= 49){
			DBMSgpaValue = 1.70;
		}else if (dbmsArray[i] >= 40 && dbmsArray[i] <= 44){
			DBMSgpaValue = 1.30;
		}else if (dbmsArray[i] >= 30 && dbmsArray[i] <= 39){
			DBMSgpaValue = 1.00;
		}else if (dbmsArray[i] >= 20 && dbmsArray[i] <= 29){
			DBMSgpaValue = 0.70;
		}
		double totGpaValue = (PRFGpaValue + DBMSgpaValue)/2;
		return totGpaValue;
	}
	
	public static void deleteStudent(){
    Scanner input = new Scanner(System.in);

    System.out.println("-----------------------------------------------------------------");
    System.out.println("|\t\t      Delete Student Profile\t\t\t|");
    System.out.println("-----------------------------------------------------------------\n");

    System.out.print("Enter Student Registration No: ");
    String registeredID = input.next();

    if(checksRegisterID(nicArray, nameArray, registeredID)){
		System.out.println();
        System.out.print("\nDo you want to delete this student profile (Y/N): ");
        char option = input.next().charAt(0);

        if(option == 'Y' || option == 'y'){
            System.out.println("Student was successfully deleted from the system..");
            deleteStudent();
        }else if (option == 'N' || option == 'n'){
            homePage();
        }

    }else{
        System.out.println("\n\tStudent Registration No not found.");
        System.out.println();
        System.out.print("\nDo you want to try again (Y/N): ");
        char option = input.next().charAt(0);

        if(option == 'Y' || option == 'y'){
            deleteStudent();
        }else if (option == 'N'|| option == 'n'){
            homePage();
        }
    }
}

    // Batch Management
	public static void batchManagement(){
	Scanner input = new Scanner(System.in);
    
        while (true){
            clearConsole();

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("|\t\t\t\tBatch Management\t\t\t|");
            System.out.println("-------------------------------------------------------------------------\n");

            System.out.println("[1] Add Batch\n");
            System.out.println("[2] Update Batch\n");
            System.out.println("[3] View Batch\n");
            System.out.println("[4] Back to Home Page\n");
            System.out.print("Enter an option to continue > ");
            int option = input.nextInt();
            
            switch (option) {
                case 1:
                    clearConsole();
                    addBatch();
                    break;
                case 2:
                    clearConsole();
                    updateBatch();  
                    break;
                case 3:
                    clearConsole();
                    viewBatch();
                    break;
                case 4:
                    return;
            }

        }
    }

    public static void addBatch(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t          Add Batch        \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("\nEnter Batch Number : ");
		int batchNum = input.nextInt();
		
		if(batchNum < 100){
			System.out.print("\nDo you want to try again (Y/N): ");
			char option = input.next().charAt(0);
			
			if(option == 'Y' || option == 'y'){
				clearConsole();
				addBatch();
			}else if(option == 'N' || option == 'n'){
				clearConsole();
				homePage();
			}
		}else{
			if(checkBatchNum(batchNum)){
				System.out.println("\nBatch is already added to the system.");
				
				System.out.print("\nDo you want to add another batch to the system (Y/N): ");
				char option = input.next().charAt(0);
				if(option == 'Y' || option == 'y'){
					clearConsole();
					addBatch();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}
			}else{
				System.out.println("\nBatch is successfully added to the system.");
				
				extendBatchArrays(batchNum);
				
				System.out.print("\nDo you want to add another batch to the system (Y/N): ");
				char option = input.next().charAt(0);
				if(option == 'Y' || option == 'y'){
					clearConsole();
					addBatch();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}
			}
		}
	}
	
	public static void extendBatchArrays(int batchNum){
		int[] tempBatchName = new int[batchNameArray.length+1];
		int[] tempBatchStatus = new int[batchStatusArray.length+1];
		for(int i = 0; i < batchNameArray.length; i++){
			tempBatchName[i] = batchNameArray[i];
			tempBatchStatus[i] = batchStatusArray[i];
		}
		tempBatchName[tempBatchName.length-1] = batchNum;
		tempBatchStatus[tempBatchStatus.length-1] = 1;
		
		batchNameArray = tempBatchName;
		batchStatusArray =tempBatchStatus;	
	}
	
	public static int BatchNum(int batchNum){
        int index = -1;
        for (int i = 0; i < batchNameArray.length; i++){
            if (batchNameArray[i] == batchNum) {
                index = i;
                break;
            }
        }
        return index;
    }

    public static void updateBatch(){
        Scanner input = new Scanner(System.in);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("|\t\t          Update Batch          \t\t|");
        System.out.println("-----------------------------------------------------------------\n");

        System.out.print("Enter Batch Number : ");
        int batchNum = input.nextInt();

        int index = BatchNum(batchNum);

		if (index == -1) {
			System.out.println("\n\tThis batch does not exist in the system.");
			System.out.println();
			System.out.print("\nDo you want to update another batch details (Y/N): ");
			char option = input.next().charAt(0);
			if (option == 'Y' || option == 'y') {
				clearConsole();
				updateBatch();
			} else if (option == 'N' || option == 'n') {
				clearConsole();
				homePage();
			}
		}else {
			if (batchStatusArray[index] == ENROLLMENTOPEN){
				System.out.println( "\nCurrent Status : ENROLLMENT OPEN");
				System.out.println();
				
				System.out.print("\n\nDo you want to change the batch status "+"to ENROLLMENT CLOSED (Y/N) ? ");
				char answer = input.next().charAt(0);
				if (answer == 'Y' || answer == 'y') {
				batchStatusArray[index] = ENROLLMENTCLOSED;
				System.out.println("\n\tBatch Status updated successfully...");
				System.out.println();
				System.out.print("\nDo you want to update another batch details (Y/N): ");
				char option = input.next().charAt(0);
				if (option == 'Y' || option == 'y') {
					clearConsole();
					updateBatch();
				} else if (option == 'N' || option == 'n') {
					clearConsole();
					homePage();
				}
			}
		}else if (batchStatusArray[index] == ENROLLMENTCLOSED) {
			System.out.println("\nCurrent Status : ENROLLMENT CLOSED");
			System.out.println();
			System.out.print( "\n\nDo you want to change the batch status " +"to ENROLLMENT OPEN (Y/N) ? ");

			char answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y')               
				batchStatusArray[index] = ENROLLMENTOPEN;
				System.out.println("\n\tBatch Status updated successfully...");
				System.out.print("\nDo you want to update another batch details (Y/N): ");
				char option = input.next().charAt(0);
				if (option == 'Y' || option == 'y') {
					clearConsole();
					updateBatch();
				}else if(option == 'N' || option == 'n') {
					clearConsole();
					homePage();
				}
			}
		}
	}

    public static void viewBatch(){
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t           View Batch          \t\t|");
		System.out.println("-----------------------------------------------------------------\n");

		System.out.printf("%-5s %-10s %-20s %-25s\n","No","Batch No","Student Count","Status");
		for (int i = 0; i < batchNameArray.length; i++){
			String status;
			if (batchStatusArray[i] == ENROLLMENTOPEN){
				status = "ENROLLMENT OPEN";
			} else {
				status = "ENROLLMENT CLOSED";
			}
			System.out.printf("%-5d %-10d %-20d %-25s\n",(i + 1),batchNameArray[i],25,status);
		}

		System.out.print("\nDo you want to go to the home page (Y/N): ");
		char option = input.next().charAt(0);
		if (option == 'Y' || option == 'y') {
			clearConsole();
			homePage();
		} else if (option == 'N' || option == 'n'){
			clearConsole();
			exit();
		}
	}

    // Grade Management
	public static void gradeManagement() {
		Scanner input = new Scanner(System.in);
		
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tGrade Management\t\t\t|");
        System.out.println("-------------------------------------------------------------------------\n");
        System.out.println("[1] PRF Marks Update");
        System.out.println("\n[2] DBMS Marks Update ");
        System.out.println("\n[3] Exit");
        System.out.println();
        System.out.print("Enter an option >");
        int option = input.nextInt();
        
        switch(option){
			case 1:
				prfMarksUpdate();
				clearConsole();
			break;
			case 2:
				dbmsMarksUpdate();
				clearConsole();
			break;
			case 3:
				exit();
				clearConsole();
			break;
		}
    }
    
    public static void prfMarksUpdate(){
		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\t PRF Marks Update \t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n");

		System.out.print("Enter Student Registration No: ");
		String registeredID = input.next();

		if(prfmarkswithRegisterID(nicArray, nameArray, registeredID)){

			int index = -1;
			for(int i = 0; i < regNoArray.length; i++){
				if(regNoArray[i].equals(registeredID)){
					index = i;
					break;
				}
			}
			System.out.print("\nDo you want to update this student's PRF marks ? ");
			char answer = input.next().charAt(0);

			if(answer == 'Y' || answer == 'y'){
				System.out.print("\n\tEnter PRF Marks : ");
				int prfMark = input.nextInt();

				prfArray[index] = prfMark;

				System.out.println("\n\tThis student PRF Marks updated successfully...");
				
				System.out.print("\nDo you want to update another student PRF marks (Y/N): ");
				char option = input.next().charAt(0);

				if(option == 'Y' || option == 'y'){
					clearConsole();
					prfMarksUpdate();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}else{
					System.out.println("\nInvalid option!");
				}
			}else{
				System.out.print("\nDo you want to search another student details (Y/N): ");
				char option = input.next().charAt(0);

				if(option == 'Y' || option == 'y'){
					clearConsole();
					prfMarksUpdate();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}else{
					System.out.println("\nInvalid option!");
				}
			}
		}else{
			System.out.println("\nStudent Registration No not found!");

			System.out.print("\nDo you want to search another student details (Y/N): ");
			char option = input.next().charAt(0);
			if(option == 'Y' || option == 'y'){
				clearConsole();
				prfMarksUpdate();
			}else if(option == 'N' || option == 'n'){
				clearConsole();
				homePage();
			}else{
				System.out.println("\nInvalid option!");
			}
		}
	}
    
    public static boolean prfmarkswithRegisterID(String[] nicArray,String[] nameArray,String registeredID){
		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i] != null && regNoArray[i].equals(registeredID)){
				System.out.println("\tRegistration No\t\t: " + regNoArray[i]);
				System.out.println("\tStudent Name\t\t: " + nameArray[i]);
				System.out.println("\tStudent NIC\t\t: " + nicArray[i]);
				
				if(prfArray[i] == -1){
					System.out.println("\tStudent PRF Marks\t: Absent");
				}else if(prfArray[i] == -2){
					System.out.println("\tStudent PRF Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent PRF Marks\t: " + prfArray[i]);
				}
				return true;
			}
		}
		return false;
	}
	    
	
	public static void dbmsMarksUpdate(){
		Scanner input = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("|\t\t\t DBMS Marks Update \t\t\t|");
		System.out.println("-------------------------------------------------------------------------\n");

		System.out.print("Enter Student Registration No: ");
		String registeredID = input.next();

		if(dbmsMarksWithRegisterID(nicArray, nameArray, registeredID)){
			int index = -1;
			for(int i = 0; i < regNoArray.length; i++){
				if(regNoArray[i].equals(registeredID)){
					index = i;
					break;
				}
			}
			System.out.print("\nDo you want to update this student's DBMS marks ? ");
			char answer = input.next().charAt(0);

			if(answer == 'Y' || answer == 'y'){
				System.out.print("\n\tEnter DBMS Marks : ");
				int dbmsMark = input.nextInt();
				dbmsArray[index] = dbmsMark;

				System.out.println("\n\tThis student DBMS Marks updated successfully...");

				System.out.print("\nDo you want to update another student DBMS marks (Y/N): ");
				char option = input.next().charAt(0);

				if(option == 'Y' || option == 'y'){
					clearConsole();
					dbmsMarksUpdate();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}else{
					System.out.println("\nInvalid option!");
				}
			}else{
				System.out.print("\nDo you want to search another student details (Y/N): ");
				char option = input.next().charAt(0);
				if(option == 'Y' || option == 'y'){
					clearConsole();
					dbmsMarksUpdate();
				}else if(option == 'N' || option == 'n'){
					clearConsole();
					homePage();
				}else{
					System.out.println("\nInvalid option!");
				}
			}
		}else{
			System.out.println("\nStudent Registration No not found!");
			
			System.out.print("\nDo you want to search another student details (Y/N): ");
			char option = input.next().charAt(0);

			if(option == 'Y' || option == 'y'){
				clearConsole();
				dbmsMarksUpdate();
			}else if(option == 'N' || option == 'n'){
				clearConsole();
				homePage();
			}else{
				System.out.println("\nInvalid option!");
			}
		}
	}
		
		
	public static boolean dbmsMarksWithRegisterID(String[] nicArray,String[] nameArray,String registeredID){
		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i] != null && regNoArray[i].equals(registeredID)){
				System.out.println("\tRegistration No\t\t: " + regNoArray[i]);
				System.out.println("\tStudent Name\t\t: " + nameArray[i]);
				System.out.println("\tStudent NIC\t\t: " + nicArray[i]);
				
				if(dbmsArray[i] == -1){
					System.out.println("\tStudent DBMS Marks\t: Absent");
				}else if(dbmsArray[i] == -2){
					System.out.println("\tStudent DBMS Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent DBMS Marks\t: " + dbmsArray[i]);
				}
				return true;
			}
		}
		return false;
	}

    // Report Generator
    public static void reportGenerator(){
		Scanner input = new Scanner(System.in);
		
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("|\t\t\t\tReport Generator\t\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------\n");
        System.out.println();
        System.out.println("[1] Student Registration Report\n ");
        System.out.println("[2] Batch - wise Student Report \n");
        System.out.println("[3] Industry Training Eligibility Report \n");
        System.out.println("[4] Exit\n"); 
        System.out.println();
        
        System.out.print("Enter an option >");
        int option = input.nextInt();
        
        switch(option){
			case 1:
				studentRegistrationReport();
				clearConsole();
			break;
			case 2:
				batchwiseStudentReport();
				clearConsole();
			break;
			case 3:
				industryTrainingEligibilityReport();
				clearConsole();
			break;
			case 4:
				exit();
				clearConsole();
			break;
			
		}
    }
		
    public static void studentRegistrationReport(){
		Scanner input = new Scanner (System.in);
		
		while (true){
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("| \t\t\t\t\t\t Student Registration Report \t\t\t\t\t\t|");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println();
			
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.printf("| %-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC","PRF Marks", "DBMS Marks", "GPA |");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			
			System.out.println();
			//sort
			for (int i = 0; i < nameArray.length - 1; i++){
				for (int j = i + 1; j < nameArray.length; j++){
					if (nameArray[i].compareTo(nameArray[j]) > 0){
						String temp = nameArray[i];
						nameArray[i] = nameArray[j];
						nameArray[j] = temp;

						String tempReg = regNoArray[i];
						regNoArray[i] = regNoArray[j];
						regNoArray[j] = tempReg;

						String tempNic = nicArray[i];
						nicArray[i] = nicArray[j];
						nicArray[j] = tempNic;

						int tempPrf = prfArray[i];
						prfArray[i] = prfArray[j];
						prfArray[j] = tempPrf;

						int tempDbms = dbmsArray[i];
						dbmsArray[i] = dbmsArray[j];
						dbmsArray[j] = tempDbms;
					}
				}
			}
			for (int i = 0; i < nameArray.length; i++){
				System.out.printf("%-6d %-20s %-30s %-20s %-15d %-15d %-8.2f\n",i + 1,regNoArray[i],nameArray[i],nicArray[i],prfArray[i],dbmsArray[i],makeGpaValue(i));
			}
			System.out.print("\nDo you want to go HomePage (Y/N):");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y'){
				clearConsole();
				homePage();
			} else if (option == 'N' || option == 'n'){
				clearConsole();
				exit();
			}
		}
	}
	
	
	public static void batchwiseStudentReport(){
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t      Batch-wise Student Report      \t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		System.out.println();
		
		System.out.println("[1] 105 Batch\n");
		System.out.println("[2] 106 Batch\n");
		System.out.println("[3] 107 Batch\n");
		System.out.println("[4] 108 Batch\n");
		System.out.println("[5] 109 Batch\n");
		System.out.println("[6] 110 Batch\n");
		System.out.println("[7] Exit\n");
		

		System.out.print("\nEnter an option to continue > ");
		int option = input.nextInt();

		switch (option) {
			case 1:
				batchReport(105);
			break;
			case 2:
				batchReport(106);
			break;
			case 3:
				batchReport(107);
			break;
			case 4:
				batchReport(108);
			break;

			case 5:
				batchReport(109);
			break;
			case 6:
				batchReport(110);
			break;
			case 7:
				exit();
			break;
		}
	}

	public static void batchReport(int batchNumber){
		Scanner input = new Scanner(System.in);

		System.out.println("------------------------------------------------------------------------");
		System.out.println("|\t\t\t "+batchNumber+" Batch Student Report\t\t\t|");
		System.out.println("------------------------------------------------------------------------\n");

		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No","Registration No","Student Name","NIC","PRF Marks","DBMS Marks","GPA");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		int count = 1;
		String batch = String.valueOf(batchNumber);
		for (int i = 0; i < regNoArray.length; i++){
			if (regNoArray[i].length() >= 7){
				String studentBatch = regNoArray[i].substring(4, 7);
				if (studentBatch.equals(batch)) {
					System.out.printf("%-6d %-20s %-30s %-20s %-15d %-15d %-8.2f\n",count,regNoArray[i],nameArray[i],nicArray[i],prfArray[i],dbmsArray[i],makeGpaValue(i));
					count++;
				}
			}
		}
		System.out.print("\nDo you want to another batch report (Y/N): ");
		char option = input.next().charAt(0);

		if(option == 'Y' || option == 'y'){
			clearConsole();
			batchwiseStudentReport();
		}else if(option == 'N' || option == 'n'){
			clearConsole();
			homePage();
		}
	}
		
	
	public static void industryTrainingEligibilityReport(){
		Scanner input = new Scanner(System.in);

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|\t\t      Industry Training Eligiblity Student Report      \t\t|");
		System.out.println("---------------------------------------------------------------------------------\n");
		System.out.println();
		
		
		System.out.println("\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-6s %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC","PRF Marks", "DBMS Marks", "GPA");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		int count = 1;
		for (int i = 0; i < regNoArray.length; i++){
			if (makeGpaValue(i) > 3.25){
				if (prfArray[i] > 50 && dbmsArray[i] > 50){
					System.out.printf("%-6d %-20s %-30s %-20s %-15d %-15d %-8.2f\n",count,regNoArray[i],nameArray[i],nicArray[i],prfArray[i],dbmsArray[i],makeGpaValue(i));
					count++;
				}
			}
		}
		System.out.print("\nDo you want to go HomePage (Y/N): ");
		char option = input.next().charAt(0);

		if (option == 'Y' || option == 'y'){
			clearConsole();
			homePage();
		} else if (option == 'N' || option == 'n'){
			clearConsole();
			exit();
		}
	}
	
    // main method
    public static void main(String args[]) {
        homePage();
    }

}


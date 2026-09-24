import java.util.*;
class Students {
    private String registrationNumber;
    private String nicNumber;
    private String name;
    private int prfMarks;
    private int dbmsMarks;
    
    public Students(String registrationNumber,String nicNumber,String name,int prfMarks,int dbmsMarks){
        this.registrationNumber = registrationNumber;
        this.nicNumber = nicNumber;
        this.name = name;
        this.prfMarks = prfMarks;
        this.dbmsMarks = dbmsMarks;
    }

    public void setRegistrationNumber(String registrationNumber){
        this.registrationNumber = registrationNumber;
    }
    public void setNicNumber(String nicNumber){
        this.nicNumber = nicNumber;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrfMarks(int prfMarks){
        this.prfMarks = prfMarks;
    }
    public void setDbmsMarks(int dbmsMarks){
        this.dbmsMarks = dbmsMarks;
    }
    public String getRegistrationNumber(){
        return registrationNumber;
    }
    public String getNicNumber(){
        return nicNumber;
    }
    public String getName(){
        return name;
    }
    public int getPrfMarks(){
        return prfMarks;
    }
    public int getDbmsMarks(){
        return dbmsMarks;
    }
}


class Batch{
    private int batchName;
    private int batchStatus;

    public Batch(int batchName, int batchStatus){
        this.batchName = batchName;
        this.batchStatus = batchStatus;
    }
    public int getBatchName(){
        return batchName;
    }
    public int getBatchStatus(){
        return batchStatus;
    }
    public void setBatchName(int batchName){
        this.batchName = batchName;
    }
    public void setBatchStatus(int batchStatus){
        this.batchStatus = batchStatus;
    }
}


class StudentManagementSystem {
    public static final int ENROLLMENTOPEN = 1;
    public static final int ENROLLMENTCLOSED = 0;
    public static final int STUDENTCOUNT = 25;

    public static Batch[] batchArray={
        new Batch(105, 0),
        new Batch(106, 0),
        new Batch(107, 0),
        new Batch(108, 0),
        new Batch(109, 1),
        new Batch(110, 1)

    };


    // Student data
    public static Students[] studentsArray = {
		new Students("PR24105001","199501012345","Gunawardena Weerasinghe",85,66),
		new Students("PR24105002","199503153872","Senanayake Silva",39,45),
		new Students("PR24105003","199506202198","Silva Kumara",-1,93),
		new Students("PR24105004","199509102983","Kumara Herath",72,58),
		new Students("PR24105005","199511258739","Rathnayake Herath",44,-1),
		new Students("PR24105006","199512303498","Wijesinghe Bandara",91,37),
		new Students("PR24105007","199502183764","Rajapaksha Herath",60,88),
		new Students("PR24105008","199504223198","Senanayake Karunaratne",38,21),
		new Students("PR24105009","199508153210","Karunaratne Jayasinghe",95,79),
		new Students("PR24105010","199510293417","Gunawardena Silva",49,40),

		new Students("OR24105011","199601102375","Weerasinghe Rajapaksha",-1,76),
		new Students("OR24105012","199604182938","Silva Rathnayake",67,54),
		new Students("OR24105013","199606243879","Fernando Perera",23,-1),
		new Students("OR24105014","199608142178","Kumara Abeysekera",58,69),
		new Students("OR24105015","199610312475","Ekanayake Rathnayake",88,92),
		new Students("PR24105016","199611173452","Herath Gunawardena",81,25),
		new Students("PR24105017","199603293481","Abeysekera Silva",73,84),
		new Students("PR24105018","199605083217","Weerasinghe Silva",29,33),
		new Students("OR24105019","199607232198","Jayasinghe Dias",62,60),
		new Students("OR24105020","199609192375","Bandara Rathnayake",-1,71),
		new Students("PR24105021","199701212483","Silva Perera",79,59),
		new Students("PR24105022","199703132487","De Silva Dias",53,-1),
		new Students("OR24105023","199706253478","Abeysekera Jayasinghe",94,98),
		new Students("OR24105024","199708083298","Rajapaksha Senanayake",47,27),
		new Students("PR24105025","199710243651","Kumara Karunaratne",35,48),

		new Students("PR24106001","199712152983","Silva Abeysekera",93,35),
		new Students("PR24106002","199702182734","Jayasinghe Bandara",15,91),
		new Students("PR24106003","199704293187","Rathnayake Kumara",-1,60),
		new Students("PR24106004","199705142375","Weerasinghe Rajapaksha",82,-1),
		new Students("PR24106005","199709083751","Senanayake Herath",45,72),
		new Students("PR24106006","199801032874","Perera Ekanayake",88,49),
		new Students("PR24106007","199803232871","Herath Jayasinghe",23,26),
		new Students("PR24106008","199806193428","Kumara Gunawardena",79,80),
		new Students("PR24106009","199808013764","Abeysekera Silva",37,14),
		new Students("PR24106010","199810242374","Dias Fernando",-1,89),
		new Students("OR24106011","199812302984","Karunaratne Weerasinghe",68,67),
		new Students("OR24106012","199802152348","Ekanayake Bandara",100,-1),
		new Students("OR24106013","199805213471","Rajapaksha Kumara",59,31),
		new Students("OR24106014","199807172398","Silva De Silva",29,94),
		new Students("OR24106015","199811283472","Gunawardena Rathnayake",92,53),
		new Students("PR24106016","199901122471","Bandara Karunaratne",12,78),
		new Students("PR24106017","199903052984","Fernando Perera",77,5),
		new Students("PR24106018","199906213874","De Silva Silva",38,90),
		new Students("OR24106019","199908093412","Rajapaksha Gunawardena",66,24),
		new Students("OR24106020","199910273894","Herath Weerasinghe",9,86),
		new Students("PR24106021","199912153482","Karunaratne Dias",84,39),
		new Students("PR24106022","199902202394","Jayasinghe Silva",51,-1),
		new Students("OR24106023","199904163874","Senanayake Abeysekera",32,61),
		new Students("OR24106024","199907293481","Silva Jayasinghe",-1,73),
		new Students("PR24106025","199911083479","Rathnayake Kumara",97,100),

		new Students("PR24107001","200001112374","Gunawardena Kumara",95,38),
		new Students("PR24107002","200003143478","Rajapaksha Silva",-1,91),
		new Students("PR24107003","200006293874","Perera Jayasinghe",63,-1),
		new Students("PR24107004","200008103471","Silva Ekanayake",88,74),
		new Students("PR24107005","200010252984","Dias Senanayake",32,55),
		new Students("PR24107006","200012043894","Herath Abeysekera",76,82),
		new Students("PR24107007","200002193874","Rathnayake Fernando",97,66),
		new Students("PR24107008","200004212374","Kumara Herath",54,49),
		new Students("PR24107009","200005183492","Weerasinghe Silva",-1,99),
		new Students("PR24107010","200007153871","Senanayake Karunaratne",23,13),
		new Students("OR24107011","200101232984","Abeysekera Silva",90,80),
		new Students("OR24107012","200103083471","Bandara Gunawardena",35,70),
		new Students("OR24107013","200106273894","Karunaratne Weerasinghe",81,93),
		new Students("OR24107014","200108123984","Perera Herath",61,36),
		new Students("OR24107015","200110043728","Fernando Dias",44,59),
		new Students("PR24107016","200112213874","Weerasinghe Gunawardena",67,85),
		new Students("PR24107017","200102253471","Rathnayake Kumara",100,47),
		new Students("PR24107018","200104103874","Senanayake Fernando",17,90),
		new Students("OR24107019","200105293784","Silva Bandara",85,-1),
		new Students("OR24107020","200107202983","Herath Rajapaksha",29,22),
		new Students("PR24107021","200201013874","Kumara Jayasinghe",70,77),
		new Students("PR24107022","200203253471","Abeysekera Perera",42,34),
		new Students("OR24107023","200206143874","Rathnayake Jayasinghe",-1,63),
		new Students("OR24107024","200208083471","Kumara Weerasinghe",60,100),
		new Students("PR24107025","200210293874","Rajapaksha Ekanayake",86,29),

		new Students("PR24108001","200212183471","Fernando Rajapaksha",86,79),
		new Students("PR24108002","200202103874","Silva Gunawardena",57,62),
		new Students("PR24108003","200204123894","Perera Wijesinghe",91,87),
		new Students("PR24108004","200205283471","Herath Abeysekera",35,-1),
		new Students("PR24108005","200207153874","Rajapaksha Ekanayake",-1,54),
		new Students("PR24108006","200301093874","Karunaratne Silva",76,46),
		new Students("PR24108007","200303283471","Weerasinghe Fernando",48,99),
		new Students("PR24108008","200306153874","Silva Bandara",94,39),
		new Students("PR24108009","200308123471","Abeysekera Weerasinghe",23,70),
		new Students("PR24108010","200310083874","Kumara Karunaratne",69,-1),
		new Students("OR24108011","200312243471","Dias Rajapaksha",-1,75),
		new Students("OR24108012","200302273874","Herath Perera",80,83),
		new Students("OR24108013","200304203471","Rathnayake Gunawardena",55,58),
		new Students("OR24108014","200305123874","Ekanayake Jayasinghe",88,92),
		new Students("OR24108015","200307213471","Gunawardena Silva",32,30),
		new Students("PR24108016","200401153874","Rajapaksha Perera",100,91),
		new Students("PR24108017","200403123471","Karunaratne Jayasinghe",67,40),
		new Students("PR24108018","200406293874","Weerasinghe Abeysekera",43,63),
		new Students("OR24108019","200408083471","Rathnayake Fernando",-1,95),
		new Students("OR24108020","200410213874","Kumara Herath",90,68),
		new Students("PR24108021","200412153471","Silva Weerasinghe",60,-1),
		new Students("PR24108022","200402203874","Herath Karunaratne",77,66),
		new Students("OR24108023","200404273471","Abeysekera Silva",25,21),
		new Students("OR24108024","200405143874","Gunawardena Ekanayake",71,88),
		new Students("PR24108025","200407183471","Weerasinghe Kumara",84,37),

		new Students("PR24109001","200501023874","Weerasinghe Kumara",92,67),
		new Students("PR24109002","200503193471","Rajapaksha Abeysekera",68,91),
		new Students("PR24109003","200506153874","Gunawardena Perera",59,85),
		new Students("PR24109004","200508213471","Karunaratne Silva",85,73),
		new Students("PR24109005","200510083874","Herath Wijesinghe",63,70),
		new Students("PR24109006","200512293471","Rathnayake Ekanayake",76,63),
		new Students("PR24109007","200502123874","Silva Fernando",91,76),
		new Students("PR24109008","200504153471","Abeysekera Rajapaksha",70,88),
		new Students("PR24109009","200505283874","Fernando Bandara",84,55),
		new Students("PR24109010","200507173471","Perera Herath",63,64),
		new Students("OR24109011","200203456782","Weerasinghe Jayasinghe",72,79),
		new Students("OR24109012","200305678901","Silva Karunaratne",89,80),
		new Students("OR24109013","199601234567","Rathnayake Gunawardena",45,59),
		new Students("OR24109014","199511223344","Herath Kumara",81,92),
		new Students("OR24109015","200412345678","Abeysekera Silva",77,68),
		new Students("PR24109016","200512345678","Ekanayake Bandara",68,100),
		new Students("PR24109017","199909876543","Rajapaksha Fernando",63,77),
		new Students("PR24109018","199812346789","Gunawardena Weerasinghe",88,83),
		new Students("OR24109019","200010203040","Kumara Karunaratne",75,45),
		new Students("OR24109020","200608789012","Silva Dias",90,62),
		new Students("PR24109021","200012345678","Perera Weerasinghe",57,66),
		new Students("PR24109022","199812345679","Karunaratne Rajapaksha",79,59),
		new Students("OR24109023","199902345678","Jayasinghe Silva",92,78),
		new Students("OR24109024","199712345670","Rathnayake Perera",62,85),
		new Students("PR24109025","200102345671","Silva Ekanayake",100,56),

		new Students("PR24110001","200203456782","Silva Karunaratne",-2,-2),
		new Students("PR24110002","200305678901","Herath Fernando",-2,-2),
		new Students("PR24110003","199601234567","Kumara Jayasinghe",-2,-2),
		new Students("PR24110004","199511223344","Weerasinghe Perera",-2,-2),
		new Students("PR24110005","200412345678","Abeysekera Rajapaksha",-2,-2),
		new Students("PR24110006","200512345678","Rathnayake Karunaratne",-2,-2),
		new Students("PR24110007","199909876543","Ekanayake Bandara",-2,-2),
		new Students("PR24110008","199812346789","Gunawardena Perera",-2,-2),
		new Students("PR24110009","200010203040","Silva Wijesinghe",-2,-2),
		new Students("PR24110010","200608789012","Rajapaksha Jayasinghe",-2,-2),
		new Students("OR24110011","200012345678","Rathnayake Fernando",-2,-2),
		new Students("OR24110012","199812345679","Karunaratne Kumara",-2,-2),
		new Students("OR24110013","199902345678","Perera Silva",-2,-2),
		new Students("OR24110014","199712345670","Gunawardena Ekanayake",-2,-2),
		new Students("OR24110015","200102345671","Bandara Rajapaksha",-2,-2),
		new Students("PR24110016","200203456782","Silva Herath",-2,-2),
		new Students("PR24110017","200305678901","Rathnayake Weerasinghe",-2,-2),
		new Students("PR24110018","199601234567","Perera Gunawardena",-2,-2),
		new Students("OR24110019","199511223344","Herath Karunaratne",-2,-2),
		new Students("OR24110020","200412345678","Silva Rajapaksha",-2,-2),
		new Students("PR24110021","200203456782","Ekanayake Kumara",-2,-2),
		new Students("PR24110022","200305678901","Bandara Herath",-2,-2),
		new Students("OR24110023","199601234567","Weerasinghe Rajapaksha",-2,-2),
		new Students("OR24110024","199511223344","Karunaratne Abeysekera",-2,-2),
		new Students("PR24110025","200412345678","Perera Dias",-2,-2)
	};

    public Students[] extendStudentsArray(Students[] studentsArray){
        Students[] tempStudentsArray = new Students[studentsArray.length + 1];
        for (int i = 0; i < studentsArray.length; i++) {
            tempStudentsArray[i] = studentsArray[i];
        }
        return tempStudentsArray;
    }

    public static Batch[] extendBatchArray(Batch[] batchArray){
        Batch[] tempBatchArray = new Batch[batchArray.length + 1];
        for (int i = 0; i < batchArray.length; i++) {
            tempBatchArray[i] = batchArray[i];
        }
        return tempBatchArray;
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

		}else{
			System.out.println("This student already added to the system...");
		}
		}else{
			System.out.println("Students can't be added to this batch because enrollment is closed...");
		}
	}

	public static boolean checkBatchNum(int batchNum){
		for (int i = 0; i < batchArray.length; i++){
			if (batchArray[i].getBatchName() == batchNum){
				if (batchArray[i].getBatchStatus() == ENROLLMENTOPEN) {
					return true;
				} else {
					return false;
				}
			}
		}
		return false;
	}

	public static boolean checkNIC(String stuNIC){
		for (int i = 0; i < studentsArray.length; i++){
			if(studentsArray[i].getNicNumber() == (stuNIC)){
				return false;
			}
		}
		return true;
	}

	public static String newSturegisterID(int batchNum,int lecMode,int StudentCount) {
		int year = 24;
		StudentCount++;
		String studentId = "";

		if (lecMode == 1){
			studentId = String.format("Student Registration No - PR%d%d%03d",year,batchNum,StudentCount);
		} else if (lecMode == 0){
			studentId = String.format("Student Registration No - OR%d%d%03d",year,batchNum,StudentCount);
		}
		return studentId;
	}
	
	public static void updateStudent(){
		Scanner input = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t\t Update Student \t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");
		
		System.out.print("Enter Student Registration No: ");
		String registeredID = input.next();

		if (checkRegisterID(studentsArray, registeredID)) {
			System.out.println();
		} else {
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
                    nameUpdate(studentsArray);
                    break;
                case 2:
                    clearConsole();
                    nicUpdate(studentsArray);
                    break;
                default:
					System.out.println("Invalid option!");
            }
        }
	}
	public static boolean checkRegisterID(Students[] studentsArray, String registeredID){
		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)){
				System.out.println("Student Name : " +studentsArray[i].getName());
				System.out.println();
				System.out.println("Student NIC  : " + studentsArray[i].getNicNumber());
				return true;
			}
		}
		return false;
	}
	
	// Update Student Name
	public static void nameUpdate(Students[] studentsArray){
		Scanner input = new Scanner(System.in);

		System.out.println("Student Name Update");
		System.out.println("====================\n");

		System.out.print("Enter Student Registration No : ");
		String registeredID = input.next();

		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)) {
				System.out.println("\nRegistration No     : "+ studentsArray[i].getRegistrationNumber());
				System.out.println("Student NIC         : "+ studentsArray[i].getNicNumber());
				System.out.println("Student Current Name: "+ studentsArray[i].getName());
				System.out.println();
				System.out.print("Enter student name to update - ");
				String newName = input.next();
				studentsArray[i].setName(newName);
				System.out.println("\nStudent name updated successfully...");
				return;
			}
		}

		System.out.println("\nStudent Registration No not found...");
	}


	// Update Student NIC
	public static void nicUpdate(Students[] studentsArray){
		Scanner input = new Scanner(System.in);
		System.out.println("Student NIC Update");
		System.out.println("====================\n");

		System.out.print("Enter Student Registration No : ");
		String registeredID = input.next();
		
		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)){
				System.out.println("\nRegistration No     : "+ studentsArray[i].getRegistrationNumber());
				System.out.println("Student Name        : "+ studentsArray[i].getName());
				System.out.println("Student Current NIC : "+ studentsArray[i].getNicNumber());
				System.out.println();
				System.out.print("Enter student NIC to update - ");
				String newNIC = input.next();

				studentsArray[i].setNicNumber(newNIC);

				System.out.println("\nStudent NIC updated successfully...");
				return;
			}
		}
		System.out.println("\nStudent Registration No not found...");
	}


	// View Student Details
	public static boolean checksRegisterID(Students[] studentsArray){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student Registration No : ");
		String registeredID = input.next();
		for (int i = 0; i < studentsArray.length; i++) {
			if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)) {
				System.out.println("\tRegistration No\t\t: "+ studentsArray[i].getRegistrationNumber());
				System.out.println("\tStudent Name\t\t: "+ studentsArray[i].getName());
				System.out.println("\tStudent NIC\t\t: "+ studentsArray[i].getNicNumber());
				return true;
			}
		}
		return false;
	}
	
	public static boolean checksRegisterID(Students[] studentsArray, String registeredID){
		for (int i = 0; i < studentsArray.length; i++){
			if(studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)) {
				System.out.println("\tRegistration No\t\t: "+ studentsArray[i].getRegistrationNumber());
				System.out.println("\tStudent Name\t\t: "+ studentsArray[i].getName());
				System.out.println("\tStudent NIC\t\t: "+ studentsArray[i].getNicNumber());
				if (studentsArray[i].getPrfMarks() == -1){
					System.out.println("\tStudent PRF Marks\t: Absent");
				}else if (studentsArray[i].getPrfMarks() == -2) {
					System.out.println("\tStudent PRF Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent PRF Marks\t: "+ studentsArray[i].getPrfMarks());
				}
				if (studentsArray[i].getDbmsMarks() == -1){
					System.out.println("\tStudent DBMS Marks\t: Absent");
				}else if (studentsArray[i].getDbmsMarks() == -2) {
					System.out.println("\tStudent DBMS Marks\t: Not conducted");
				}else {
					System.out.println("\tStudent DBMS Marks\t: "+ studentsArray[i].getDbmsMarks());
				}
				double gpaValue = makeGpaValue(studentsArray[i]);
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

		if (checksRegisterID(studentsArray, registeredID)){
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

	public static double makeGpaValue(Students student){
		double PRFGpaValue = 0;
		double DBMSgpaValue = 0;

		int prfMarks = student.getPrfMarks();
		int dbmsMarks = student.getDbmsMarks();

		// PRF GPA
		if (prfMarks == -1 || prfMarks == -2){
			PRFGpaValue = 0;
		}else if (prfMarks >= 90 && prfMarks <= 100){
			PRFGpaValue = 4.25;
		}else if (prfMarks >= 80){
			PRFGpaValue = 4.00;
		}else if (prfMarks >= 75){
			PRFGpaValue = 3.70;
		}else if (prfMarks >= 70){
			PRFGpaValue = 3.30;
		}else if (prfMarks >= 65){
			PRFGpaValue = 3.00;
		}else if (prfMarks >= 60){
			PRFGpaValue = 2.70;
		}else if (prfMarks >= 55){
			PRFGpaValue = 2.30;
		}else if (prfMarks >= 50){
			PRFGpaValue = 2.00;
		}else if (prfMarks >= 45){
			PRFGpaValue = 1.70;
		}else if (prfMarks >= 40){
			PRFGpaValue = 1.30;
		}else if (prfMarks >= 30){
			PRFGpaValue = 1.00;
		}else if (prfMarks >= 20){
			PRFGpaValue = 0.70;
		}
		// DBMS GPA
		if(dbmsMarks == -1 || dbmsMarks == -2){
			DBMSgpaValue = 0;
		}else if (dbmsMarks >= 90 && dbmsMarks <= 100){
			DBMSgpaValue = 4.25;
		}else if (dbmsMarks >= 80){
			DBMSgpaValue = 4.00;
		}else if (dbmsMarks >= 75){
			DBMSgpaValue = 3.70;
		}else if (dbmsMarks >= 70){
			DBMSgpaValue = 3.30;
		}else if (dbmsMarks >= 65){
			DBMSgpaValue = 3.00;
		}else if (dbmsMarks >= 60){
			DBMSgpaValue = 2.70;
		}else if (dbmsMarks >= 55){
			DBMSgpaValue = 2.30;
		}else if (dbmsMarks >= 50){
			DBMSgpaValue = 2.00;
		}else if (dbmsMarks >= 45){
			DBMSgpaValue = 1.70;
		}else if (dbmsMarks >= 40){
			DBMSgpaValue = 1.30;
		}else if (dbmsMarks >= 30){
			DBMSgpaValue = 1.00;
		}else if (dbmsMarks >= 20){
			DBMSgpaValue = 0.70;
		}
		return (PRFGpaValue + DBMSgpaValue) / 2;
	}
	
	public static void deleteStudent(){
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t      Delete Student Profile\t\t\t|");
		System.out.println("-----------------------------------------------------------------\n");

		System.out.print("Enter Student Registration No: ");
		String registeredID = input.next();

		if(checksRegisterID(studentsArray, registeredID)){
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
                    //updateBatch();  
                    break;
                case 3:
                    clearConsole();
                    //viewBatch();
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
				}else{
					System.out.println("\nBatch is successfully added to the system.");

					batchArray = extendBatchArray(batchArray);

					batchArray[batchArray.length - 1] = new Batch(batchNum, 1);
				}
			}
		}
	}
		
	public static int BatchNum(int batchNum){
		int index = -1;
		for (int i = 0; i < batchArray.length; i++){
			if (batchArray[i] != null &&batchArray[i].getBatchName() == batchNum){
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

			if (option == 'Y' || option == 'y'){
				clearConsole();
				updateBatch();

			}else if (option == 'N' || option == 'n'){
				homePage();
			}

		}else{
			if (batchArray[index].getBatchStatus() == ENROLLMENTOPEN){
				System.out.println("\nCurrent Status : ENROLLMENT OPEN");
				System.out.println();
				System.out.print("\n\nDo you want to change the batch status " +"to ENROLLMENT CLOSED (Y/N) ? ");
				char answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y'){
					batchArray[index].setBatchStatus(ENROLLMENTCLOSED);

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
			} else if (batchArray[index].getBatchStatus() == ENROLLMENTCLOSED) {
				System.out.println("\nCurrent Status : ENROLLMENT CLOSED");
				System.out.println();
				System.out.print("\n\nDo you want to change the batch status " +"to ENROLLMENT OPEN (Y/N) ? ");
				char answer = input.next().charAt(0);

				if (answer == 'Y' || answer == 'y') {

					batchArray[index].setBatchStatus(ENROLLMENTOPEN);

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
			}
		}
	}


	public static void viewBatch() {
		Scanner input = new Scanner(System.in);

		System.out.println("-----------------------------------------------------------------");
		System.out.println("|\t\t           View Batch          \t\t|");
		System.out.println("-----------------------------------------------------------------\n");

		System.out.printf("%-5s %-10s %-20s %-25s\n","No", "Batch No", "Student Count", "Status");
		for (int i = 0; i < batchArray.length; i++){
			if (batchArray[i] == null){
				continue;
			}
			String status;
			if(batchArray[i].getBatchStatus() == ENROLLMENTOPEN){
				status = "ENROLLMENT OPEN";
			}else{
				status = "ENROLLMENT CLOSED";
			}
			System.out.printf("%-5d %-10d %-20d %-25s\n",(i + 1),batchArray[i].getBatchName(),25,status);
		}
		System.out.print("\nDo you want to go to the home page (Y/N): ");
		char option = input.next().charAt(0);

		if(option == 'Y' || option == 'y'){
			clearConsole();
			homePage();

		}else if (option == 'N' || option == 'n'){
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

		if (prfmarkswithRegisterID(studentsArray, registeredID)){
			int index = -1;
			for (int i = 0; i < studentsArray.length; i++){
				if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)){
					index = i;
					break;
				}
			}

			System.out.print("\nDo you want to update this student's PRF marks ? ");
			char answer = input.next().charAt(0);

			if (answer == 'Y' || answer == 'y'){

				System.out.print("\n\tEnter PRF Marks : ");
				int prfMark = input.nextInt();
				
				studentsArray[index].setPrfMarks(prfMark);
				System.out.println("\n\tThis student PRF Marks updated successfully...");
				System.out.print("\nDo you want to update another student PRF marks (Y/N): ");

				char option = input.next().charAt(0);

				if (option == 'Y' || option == 'y') {
					clearConsole();
					prfMarksUpdate();

				} else if (option == 'N' || option == 'n') {
					clearConsole();
					homePage();

				} else {
					System.out.println("\nInvalid option!");
				}

			}else{
				System.out.print("\nDo you want to search another student details (Y/N): ");

				char option = input.next().charAt(0);
				if (option == 'Y' || option == 'y') {
					clearConsole();
					prfMarksUpdate();

				} else if (option == 'N' || option == 'n') {
					clearConsole();
					homePage();

				} else {
					System.out.println("\nInvalid option!");
				}
			}

		}else{
			System.out.println("\nStudent Registration No not found!");

			System.out.print("\nDo you want to search another student details (Y/N): ");

			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y'){
				clearConsole();
				prfMarksUpdate();

			}else if (option == 'N' || option == 'n'){
				clearConsole();
				homePage();

			}else{
				System.out.println("\nInvalid option!");
			}
		}
	}
    
	public static boolean prfmarkswithRegisterID(Students[] studentsArray, String registeredID){
		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null &&
				studentsArray[i].getRegistrationNumber().equals(registeredID)){
				System.out.println("\tRegistration No\t\t: " +studentsArray[i].getRegistrationNumber());

				System.out.println("\tStudent Name\t\t: " +studentsArray[i].getName());
				System.out.println("\tStudent NIC\t\t: " +studentsArray[i].getNicNumber());

				if (studentsArray[i].getPrfMarks() == -1){
					System.out.println("\tStudent PRF Marks\t: Absent");

				}else if(studentsArray[i].getPrfMarks() == -2){
					System.out.println("\tStudent PRF Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent PRF Marks\t: " +studentsArray[i].getPrfMarks());
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

		if (dbmsMarksWithRegisterID(studentsArray, registeredID)){
			int index = -1;
			for (int i = 0; i < studentsArray.length; i++){
				if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)){
					index = i;
					break;
				}
			}
		
			System.out.print("\nDo you want to update this student's DBMS marks ? ");
			char answer = input.next().charAt(0);
			if(answer == 'Y' || answer == 'y'){

            System.out.print("\n\tEnter DBMS Marks : ");
            int dbmsMark = input.nextInt();

            studentsArray[index].setDbmsMarks(dbmsMark);

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
			
	public static boolean dbmsMarksWithRegisterID(Students[] studentsArray, String registeredID){
		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null &&studentsArray[i].getRegistrationNumber().equals(registeredID)){
				System.out.println("\tRegistration No\t\t: " +studentsArray[i].getRegistrationNumber());

				System.out.println("\tStudent Name\t\t: " +studentsArray[i].getName());
				System.out.println("\tStudent NIC\t\t: " +studentsArray[i].getNicNumber());
				
				if (studentsArray[i].getDbmsMarks() == -1){
					System.out.println("\tStudent DBMS Marks\t: Absent");
				}else if(studentsArray[i].getDbmsMarks() == -2) {
					System.out.println("\tStudent DBMS Marks\t: Not conducted");
				}else{
					System.out.println("\tStudent DBMS Marks\t: " +studentsArray[i].getDbmsMarks());
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
				clearConsole();
				studentRegistrationReport();
			break;
			case 2:
				clearConsole();
				batchwiseStudentReport();
			break;
			case 3:
				clearConsole();
				industryTrainingEligibilityReport();
			break;
			case 4:
				clearConsole();
				exit();
			break;
			
		}
    }
		
    public static void studentRegistrationReport(){
    Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println("|\t\t\t\t\t\t Student Registration Report \t\t\t\t\t\t|");
			System.out.println("------------------------------------------------------------------------------------------------------------------------");
			System.out.println();

			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.printf("| %-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC","PRF Marks", "DBMS Marks", "GPA |");
			System.out.println("-----------------------------------------------------------------------------------------------------------------------");
			System.out.println();

			for (int i = 0; i < studentsArray.length - 1; i++){
				for (int j = i + 1; j < studentsArray.length; j++){
					if (studentsArray[i] != null && studentsArray[j] != null){
						char first = studentsArray[i].getName().charAt(0);
						char second = studentsArray[j].getName().charAt(0);
						if (first > second){
							Students temp = studentsArray[i];
							studentsArray[i] = studentsArray[j];
							studentsArray[j] = temp;
						}
					}
				}
			}

			for (int i = 0; i < studentsArray.length; i++){
				if (studentsArray[i] != null) {
					System.out.printf("%-20s %-30s %-20s %-15d %-15d %-8.2f\n",studentsArray[i].getRegistrationNumber(),studentsArray[i].getName(),studentsArray[i].getNicNumber(),studentsArray[i].getPrfMarks(),studentsArray[i].getDbmsMarks(),makeGpaValue(studentsArray[i]));
				}
			}

			System.out.print("\nDo you want to go HomePage (Y/N): ");
			char option = input.next().charAt(0);

			if (option == 'Y' || option == 'y') {
				clearConsole();
				homePage();
			} else if (option == 'N' || option == 'n') {
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
				clearConsole();
				batchReport(105);
			break;
			case 2:
				clearConsole();
				batchReport(106);
			break;
			case 3:
				clearConsole();
				batchReport(107);
			break;
			case 4:
				clearConsole();
				batchReport(108);
			break;

			case 5:
				clearConsole();
				batchReport(109);
			break;
			case 6:
				clearConsole();
				batchReport(110);
			break;
			case 7:
				clearConsole();
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
		System.out.printf("%-20s %-30s %-20s %-15s %-15s %-8s\n","Registration No","Student Name","NIC","PRF Marks","DBMS Marks","GPA");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null){
				String registrationNumber = studentsArray[i].getRegistrationNumber();
				if (registrationNumber.length() >= 7){
					String studentBatch =registrationNumber.substring(4, 7);
					int id = Integer.parseInt(studentBatch);
					if (id == batchNumber){
						System.out.printf("%-20s %-30s %-20s %-15d %-15d %-8.2f\n",studentsArray[i].getRegistrationNumber(),studentsArray[i].getName(),studentsArray[i].getNicNumber(),studentsArray[i].getPrfMarks(),studentsArray[i].getDbmsMarks(),makeGpaValue(studentsArray[i]));
					}
				}
			}
		}
	}
	
	// PR25122167
		
	public static void industryTrainingEligibilityReport(){
		Scanner input = new Scanner(System.in);

		System.out.println("---------------------------------------------------------------------------------");
		System.out.println("|\t\t      Industry Training Eligiblity Student Report      \t\t|");
		System.out.println("---------------------------------------------------------------------------------\n");
		System.out.println();
		
		
		System.out.println("\n");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");
		System.out.printf("%-20s %-30s %-20s %-15s %-15s %-8s\n","No", "Registration No", "Student Name", "NIC","PRF Marks", "DBMS Marks", "GPA");
		System.out.println("----------------------------------------------------------------------------------------------------------------------");

		System.out.println();
		
		for (int i = 0; i < studentsArray.length; i++){
			if (studentsArray[i] != null) {
				if (makeGpaValue(studentsArray[i]) > 3.25){
					if (studentsArray[i].getPrfMarks() > 50 &&studentsArray[i].getDbmsMarks() > 50) {
						System.out.printf("%-20s %-30s %-20s %-15d %-15d %-8.2f\n",studentsArray[i].getRegistrationNumber(),studentsArray[i].getName(),studentsArray[i].getNicNumber(),studentsArray[i].getPrfMarks(),studentsArray[i].getDbmsMarks(),makeGpaValue(studentsArray[i]));
					}
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


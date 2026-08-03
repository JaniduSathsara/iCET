import java.util.*;
class NumberConverter{

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
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        L1:do{
            System.out.println("\n\n\n\t\t\t\t\t __   ______             __");                
            System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\");                
            System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______");      
            System.out.println("\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");      
            System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");      
            System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$");            
            System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____");       
            System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");      
            System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$");      
                                                        
            
            System.out.println("\n   _   _                       _                        _____                                         _");                 
            System.out.println("  | \\ | |                     | |                      / ____|                                       | |");                
            System.out.println("  |  \\| |  _   _   _ __ ___   | |__     ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_    ___   _ __"); 
            System.out.println("  | . ` | | | | | | '_ ` _ \\  | '_ \\   / _ \\ | '__|   | |       / _ \\  | '_ \\  \\ \\ / /  / _ \\ | '__| | __|  / _ \\ | '__|");
            System.out.println("  | |\\  | | |_| | | | | | | | | |_) | |  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_  |  __/ | |");   
            System.out.println("  |_| \\_|  \\__,_| |_| |_| |_| |_.__/   \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__|  \\___| |_|");   
            System.out.println("\n===========================================================================================================================");                                                                                                                            
            
            System.out.println("\n\n\n\t[01] Decimal Converter");
            System.out.println("\n\t[02] Binary Converter");
            System.out.println("\n\t[03] Octal Converter");
            System.out.println("\n\t[04] Hexadecimal Converter");
            System.out.println("\n\t[05] Roman Number Converter");

            System.out.print("\n\nEnter Option -> ");
            int option=input.nextInt();

            switch(option){
                case 1: //Decimal Converter
                        L2:do{
                            clearConsole();
                            System.out.println("+-------------------------------------------+");
                            System.out.println("|            Decimal Converter              |");
                            System.out.println("+-------------------------------------------+");
                            System.out.print("\n\nEnter an Decimal number: ");
                            int decimal = input.nextInt();
                            int temp=decimal;
                            if(decimal>=0){
                                do{
                                    int num=temp%10;
                                    temp/=10;
                                    if(num>9){
                                        System.out.println("\tInvalid input...");
                                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                                        char c = input.next().charAt(0);

                                        if (c == 'Y' || c == 'y') {
                                            clearConsole();
                                            continue L2;
                                        }else if (c == 'N' || c == 'n'){
                                            clearConsole();
                                            continue L1;
                                        }
                                    }
                                }while(temp>0);
                            }else{
                                System.out.println("\tInvalid input...");
                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char c = input.next().charAt(0);

                                if (c == 'Y' || c == 'y') {
                                    clearConsole();
                                    continue L2;
                                }else if (c == 'N' || c == 'n'){
                                    clearConsole();
                                    continue L1;
                                }
                            }

                            //-----------Decimal to Binary----------
                            int binary = 0;
                            int base = 1;
                            int temp2=decimal;
                            while(temp2 > 0){
                                binary = binary + (temp2%2)*base;
                                temp2 = temp2/2;
                                base = base*10;
                            }
                            System.out.println("\n\tBinary number: "+binary);
                            //-----------Decimal to Octal----------
                            int octal = 0;
                            int base1 = 1;
                            int temp3=decimal;
                            while(temp3 > 0){
                                octal = octal + (temp3%8)*base1;
                                temp3 = temp3/8;
                                base1 = base1*10;
                            }
                            System.out.println("\tOctal number: "+octal);
                            //-----------Decimal to Hexa Decimal----------
                            int temp4=decimal;
                            String hex = "";
                            while(temp4 > 0){
                                int rem = temp4%16;
                                if(rem<10){
                                    hex = rem + hex;
                                }
                                else{
                                    hex = (char)(rem+55) + hex;
                                }
                                temp4 = temp4/16;
                            }
                            System.out.println("\tHexadecimal number: "+hex);
                            //----back to homepage-----
                            System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                            char c = input.next().charAt(0);

                            if (c == 'Y' || c == 'y') {
                                clearConsole();
                                continue L1;
                            }else {
                                break L1;
                            }  
                            
                        }while(true);

                        
                case 2: //Binary Converter
                        L3:do{
                            clearConsole();
                            System.out.println("+-------------------------------------------+");
                            System.out.println("|            Binary Converter               |");
                            System.out.println("+-------------------------------------------+");
                            System.out.print("\n\nEnter an Binary number: ");
                            int binaryNumber = input.nextInt();
                            int temp=binaryNumber;
                            if(binaryNumber>=0){
                                do{
                                    int num=temp%10;
                                    temp/=10;
                                    if(num>1){
                                        System.out.println("\tInvalid input...");
                                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                                        char c = input.next().charAt(0);

                                        if (c == 'Y' || c == 'y') {
                                            clearConsole();
                                            continue L3;
                                        }else if (c == 'N' || c == 'n'){
                                            clearConsole();
                                            continue L1;
                                        }
                                    }
                                }while(temp>0);
                            }else{
                                System.out.println("\tInvalid input...");
                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char c = input.next().charAt(0);

                                if (c == 'Y' || c == 'y') {
                                    clearConsole();
                                    continue L3;
                                }else if (c == 'N' || c == 'n'){
                                    clearConsole();
                                    continue L1;
                                }
                            }
                        //-----------Binary to Decimal----------
                            int decimal = 0;
                            int base1 = 1;
                            while(binaryNumber > 0){
                                int rem = binaryNumber%10;
                                decimal = decimal + rem*base1;
                                base1 = base1*2;
                                binaryNumber = binaryNumber/10;
                            }
                            System.out.println("\n\tDecimal Number: "+decimal);
                            //-----------Binary to Octal----------
                            int octal = 0;
                            int base2 = 1;
                            int temp3=decimal;
                            while(temp3 > 0){
                                octal = octal + (temp3%8)*base2;
                                temp3 = temp3/8;
                                base2 = base2*10;
                            }
                            System.out.println("\tOctal number: "+octal);
                            //-----------Binary to Hexa Decimal----------
                            int temp4=decimal;
                            String hex = "";
                            while(temp4 > 0){
                                int rem = temp4%16;
                                if(rem<10){
                                    hex = rem + hex;
                                }
                                else{
                                    hex = (char)(rem+55) + hex;
                                }
                                temp4 = temp4/16;
                            }
                            System.out.println("\tHexadecimal number: "+hex);
                            //----back to homepage-----
                            System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                            char c = input.next().charAt(0);

                            if (c == 'Y' || c == 'y') {
                                clearConsole();
                                continue L1;
                            }else {
                                break L1;
                            }
                        }while(true);
                case 3: //Octal Converter
                        L4:do{
                            clearConsole();
                            System.out.println("+-------------------------------------------+");
                            System.out.println("|              Octal Converter              |");
                            System.out.println("+-------------------------------------------+");
                            System.out.print("\n\nEnter an Octal number: ");
                            int octal = input.nextInt();
                            int temp=octal;
                            if(octal>=0){
                                do{
                                    int num=temp%10;
                                    temp/=10;
                                    if(num>7){
                                        System.out.println("\tInvalid input...");
                                        System.out.print("\nDo you want to input number again (Y/N) -> ");
                                        char c = input.next().charAt(0);

                                        if (c == 'Y' || c == 'y') {
                                            clearConsole();
                                            continue L4;
                                        }else if (c == 'N' || c == 'n'){
                                            clearConsole();
                                            continue L1;
                                        }
                                    }
                                }while(temp>0);
                            }else{
                                System.out.println("\tInvalid input...");
                                System.out.print("\nDo you want to input number again (Y/N) -> ");
                                char c = input.next().charAt(0);

                                if (c == 'Y' || c == 'y') {
                                    clearConsole();
                                    continue L4;
                                }else if (c == 'N' || c == 'n'){
                                    clearConsole();
                                    continue L1;
                                }
                            }
                        //-----------Octal to Decimal----------
                            int decimal = 0;
                            int base = 1;
                            while(octal > 0){
                                int rem = octal%10;
                                decimal = decimal + rem*base;
                                base = base*8;
                                octal = octal/10;
                            }
                            System.out.println("\n\tDecimal Number: "+decimal);
                        //-----------Octal to Binary----------
                            
                            int temp2 = decimal;
                            String binary = "";
                            while (temp2 > 0) {
                                int remainder = temp2 % 2;
                                binary = remainder + binary;
                                temp2 /= 2;
                            }
                            System.out.println("\tBinary Number: " + binary);
                        //-----------Octal to Hexa Decimal----------
                            String hex = "";
                            while(decimal > 0){
                                int rem = decimal%16;
                                if(rem<10){
                                    hex = rem + hex;
                                }
                                else{
                                    hex = (char)(rem+55) + hex;
                                }
                                decimal = decimal/16;
                            }
                            System.out.println("\tHexadecimal Number: "+hex);

                            //----back to homepage-----
                            System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                            char c = input.next().charAt(0);

                            if (c == 'Y' || c == 'y') {
                                clearConsole();
                                continue L1;
                            }else {
                                break L1;
                            }
                        }while(true);
                case 4: //HexaDecimal Converter
                        
                            clearConsole();
                            System.out.println("+-------------------------------------------+");
                            System.out.println("|            HexaDecimal Converter          |");
                            System.out.println("+-------------------------------------------+");
                            System.out.print("\n\nEnter an HexaDecimal number : ");
                            String hex = System.console().readLine();
                            
                            
                        L5:do{
                            //-----------HexaDecimal to Decimal----------
                            int decimal = 0;
                            for (int i = hex.length()-1, j = 0; i >= 0; i--, j++) {
                                char c = hex.charAt(i);
                                int digit = 0;
                                if (c >= '0' && c <= '9') {
                                    digit = c - '0';
                                } else if (c >= 'A' && c <= 'F') {
                                    digit = c - 'A' + 10;
                                } else if (c >= 'a' && c <= 'f') {
                                    digit = c - 'a' + 10;
                                }
                                decimal += digit * Math.pow(16, j);
                            }
                            System.out.println("\n\tDecimal Number: " + decimal);  
                            //-----------HexaDecimal to Binary----------
                                int temp2 = decimal;
                                String binary = "";
                                while (temp2 > 0) {
                                    int remainder = temp2 % 2;
                                    binary = remainder + binary;
                                    temp2 /= 2;
                                }
                                System.out.println("\tBinary Number: " + binary);
                            //-----------HexaDecimal to Octal----------
                                int temp3 = decimal;
                                String octal = "";
                                while (temp3 > 0) {
                                    int remainder = temp3 % 8;
                                    octal = remainder + octal;
                                    temp3 /= 8;
                                }
                                System.out.println("\tOctal Number: " + octal);

                                //----back to homepage-----
                                System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                                char c = input.next().charAt(0);

                                if (c == 'Y' || c == 'y') {
                                    clearConsole();
                                    continue L1;
                                }else {
                                    break L1;
                                }

                        }while (true); 
                            
                        
                    
                case 5: //Roman Converter
                        clearConsole();
                        System.out.println("+--------------------------------------------------------------+");
                        System.out.println("|                     Roman Number Converter                   |");
                        System.out.println("+--------------------------------------------------------------+");
                        System.out.println("\n\n\t[01] Decimal Number to Roman Number Converter");
                        System.out.println("\n\t[02] Roman Number to Decimal Number Converter");
                        System.out.print("\n\nEnter an option -> ");
                        int option2=input.nextInt();
                        switch(option2){
                            case 1: //decimal to roman
                                    L6:do{
                                        clearConsole();
                                        System.out.println("+------------------------------------------------------------------+");
                                        System.out.println("|            Decimal Number to Roman Number Converter              |");
                                        System.out.println("+------------------------------------------------------------------+");
                                        System.out.print("\n\nEnter an Decimal number: ");
                                        int num = input.nextInt();
                                        if(num>=0){
                                            String roman = "";

                                            while (num >= 1000) {
                                                roman += "M";
                                                num -= 1000;
                                            }
                                            while (num >= 900) {
                                                roman += "CM";
                                                num -= 900;
                                            }
                                            while (num >= 500) {
                                                roman += "D";
                                                num -= 500;
                                            }
                                            while (num >= 400) {
                                                roman += "CD";
                                                num -= 400;
                                            }
                                            while (num >= 100) {
                                                roman += "C";
                                                num -= 100;
                                            }
                                            while (num >= 90) {
                                                roman += "XC";
                                                num -= 90;
                                            }
                                            while (num >= 50) {
                                                roman += "L";
                                                num -= 50;
                                            }
                                            while (num >= 40) {
                                                roman += "XL";
                                                num -= 40;
                                            }
                                            while (num >= 10) {
                                                roman += "X";
                                                num -= 10;
                                            }
                                            while (num >= 9) {
                                                roman += "IX";
                                                num -= 9;
                                            }
                                            while (num >= 5) {
                                                roman += "V";
                                                num -= 5;
                                            }
                                            while (num >= 4) {
                                                roman += "IV";
                                                num -= 4;
                                            }
                                            while (num >= 1) {
                                                roman += "I";
                                                num -= 1;
                                            }

                                            System.out.println("\n\tRoman numeral: " + roman);
                                            //----back to homepage-----
                                            System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                                            char c = input.next().charAt(0);

                                            if (c == 'Y' || c == 'y') {
                                                clearConsole();
                                                continue L1;
                                            }else {
                                                break L1;
                                            }
                                        }else{
                                            System.out.println("\tInvalid input...");
                                            System.out.println("\nDo you want to input number again (Y/N) -> ");
                                            String i=input.nextLine();
                                            if(i.equalsIgnoreCase("Y")){
                                                clearConsole();
                                                continue L6;
                                            }else if(i.equalsIgnoreCase("N")){
                                                clearConsole();
                                                continue L1;
                                            }
                                        }
                                    }while(true);
                            case 2: //roman to decimal
                                    clearConsole();
                                    System.out.println("+------------------------------------------------------------------+");
                                    System.out.println("|            Roman Number to Decimal Number Converter              |");
                                    System.out.println("+------------------------------------------------------------------+");
                                    System.out.print("\n\nEnter an Roman number: ");
                                    String roman = System.console().readLine();
                                    int decimal = 0; 
                                    for (int i = 0; i < roman.length(); i++) {
                                        char ch = roman.charAt(i);
                                        switch (ch) {
                                            case 'M':
                                                decimal += 1000;
                                                break;
                                            case 'D':
                                                decimal += 500;
                                                break;
                                            case 'C':
                                                if (i < roman.length() - 1 && (roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M')) {
                                                    decimal -= 100;
                                                } else {
                                                    decimal += 100;
                                                }
                                                break;
                                            case 'L':
                                                decimal += 50;
                                                break;
                                            case 'X':
                                                if (i < roman.length() - 1 && (roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C' || roman.charAt(i+1) == 'M')) {
                                                    decimal -= 10;
                                                } else {
                                                    decimal += 10;
                                                }
                                                break;
                                            case 'V':
                                                decimal += 5;
                                                break;
                                            case 'I':
                                                if (i < roman.length() - 1 && (roman.charAt(i+1) == 'V' || roman.charAt(i+1) == 'X' || roman.charAt(i+1) == 'L' || roman.charAt(i+1) == 'C' || roman.charAt(i+1) == 'D' || roman.charAt(i+1) == 'M')) {
                                                    decimal -= 1;
                                                } else {
                                                    decimal += 1;
                                                }
                                                break;
                                            default:
                                                System.out.println("Invalid Roman numeral!");
                                                return;
                                        }
                                    }

                                    System.out.println("\n\tDecimal number: " + decimal);

                                    //----back to homepage-----
                                    System.out.print("\n\nDo you want to go to homepage (Y/N)-> ");
                                    char c = input.next().charAt(0);

                                    if (c == 'Y' || c == 'y') {
                                        clearConsole();
                                        continue L1;
                                    }else {
                                        break L1;
                                    }
                                        }
                default: continue L1; 
            }

        }while(true);
    }
}
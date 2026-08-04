import java.util.*;
class NumberConverter{
    public static String decimalToBinary(int dec){
        if (dec==0) return "0";
        String bin="";
        while (dec>0) {
            bin=(dec%2)+bin;
            dec/=2;
        }
        return bin;
    }

    public static String decimalToOctal(int dec){
        if (dec==0) return "0";
        String octal ="";
        while (dec>0){
            octal=(dec%8)+octal;
            dec/=8;
        }
        return octal;
    }

    public static String decimalToHex(int dec){
        if (dec==0) return "0";
        char[] hexaChar={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexa="";
        while (dec>0){
            hexa=hexaChar[dec%16]+hexa;
            dec/=16;
        }
        return hexa;
    }

    public static int binaryToDecimal(String binary){
        int dec=0;
        for (int i=0;i<binary.length();i++){
            dec=dec*2+(binary.charAt(i)-'0');
        }
        return dec;
    }

    public static int octalToDecimal(String octal){
        int dec=0;
        for (int i = 0;i<octal.length();i++){
            dec=dec*8+(octal.charAt(i)-'0');
        }
        return dec;
    }

    public static int hexToDecimal(String hex){
        hex=hex.toUpperCase();
        int dec=0;
        for (int i=0;i<hex.length();i++){
            char ch = hex.charAt(i);
            int digitValue=(ch>='0'&& ch<='9')?(ch-'0'):(ch-'A'+10);
            dec=dec*16+digitValue;
        }
        return dec;
    }

    public static String decimalToRoman(int num){
        String roman="";
        while (num>=1000) { roman += "M";  num -= 1000; }
        while (num>=900)  { roman += "CM"; num -= 900;  }
        while (num>=500)  { roman += "D";  num -= 500;  }
        while (num>=400)  { roman += "CD"; num -= 400;  }
        while (num>=100)  { roman += "C";  num -= 100;  }
        while (num>=90)   { roman += "XC"; num -= 90;   }
        while (num>=50)   { roman += "L";  num -= 50;   }
        while (num>=40)   { roman += "XL"; num -= 40;   }
        while (num>=10)   { roman += "X";  num -= 10;   }
        while (num>=9)    { roman += "IX"; num -= 9;    }
        while (num>=5)    { roman += "V";  num -= 5;    }
        while (num>=4)    { roman += "IV"; num -= 4;    }
        while (num>=1)    { roman += "I";  num -= 1;    }
        return roman;
    }

    public static int romanToDecimal(String romanNum) {
        int decimal=0;
        for (int i=0;i<romanNum.length();i++) {
            int currentValue = getRomanValue(romanNum.charAt(i));
            int nextValue = 0;
            if (i + 1<romanNum.length()){
                nextValue = getRomanValue(romanNum.charAt(i + 1));
            }
            if (currentValue<nextValue){
                decimal -=currentValue;
            } else {
                decimal +=currentValue;
            }
        }
        return decimal;
    }
    public static int getRomanValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default:  return 0;
        }
	}

    public static boolean isValidDecimal(String s){
        if (s == null || s.isEmpty()) return false;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c<'0'||c>'9') return false;
        }
        return true;
    }

    public static boolean isValidBinary(String s){
        if (s == null||s.isEmpty()) return false;
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (c != '0' && c != '1') return false;
        }
        return true;
    }

    public static boolean isValidOctal(String s){
        if (s == null || s.isEmpty()) return false;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c < '0' || c > '7') return false;
        }
        return true;
    }

    public static boolean isValidHex(String s){
        if (s == null || s.isEmpty()) return false;
        for (int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValidRoman(String s){
        if (s == null || s.isEmpty()) return false;
        for (int i=0;i<s.length();i++) {
            char c= s.charAt(i);
            if (c != 'I' && c != 'V' && c != 'X' && c != 'L'
                    && c != 'C' && c != 'D' && c != 'M') {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean running = true;

        System.out.println("\t\t\t\t\t __    _____             __");
		System.out.println("\t\t\t\t\t|  \\ /      \\           |  \\");
		System.out.println("\t\t\t\t\t \\$$|  $$$$$$\\  ______  | $$  _______");
		System.out.println("\t\t\t\t\t|  \\| $$   \\$$ |      \\ | $$ /       \\");
		System.out.println("\t\t\t\t\t| $$| $$        \\$$$$$$\\| $$|  $$$$$$$");
		System.out.println("\t\t\t\t\t| $$| $$   __  /      $$| $$| $$");
		System.out.println("\t\t\t\t\t| $$| $$__/  \\|  $$$$$$$| $$| $$_____");
		System.out.println("\t\t\t\t\t| $$ \\$$    $$ \\$$    $$| $$ \\$$     \\");
		System.out.println("\t\t\t\t\t \\$$  \\$$$$$$   \\$$$$$$$ \\$$  \\$$$$$$$\n");
		
		System.out.println("  _   _                       _                       _____                                         _");
		System.out.println(" | \\ | |                     | |                     / ____|                                       | |");
		System.out.println(" |  \\| |  _   _   _ __ ___   | |__    ___   _ __    | |        ___    _ __   __   __   ___   _ __  | |_   ___   _ __");
		System.out.println(" | . ` | | | | | | '_ ` _ \\  | '_ \\  / _ \\ | '__|   | |       / _ \\  | '  \\  \\ \\ / /  / _ \\ | '__| | __| / _ \\ | '__|");
		System.out.println(" | |\\  | | |_| | | | | | | | | |_) ||  __/ | |      | |____  | (_) | | | | |  \\ V /  |  __/ | |    | |_ |  __/ | |");
		System.out.println(" |_| \\_|  \\__,_| |_| |_| |_| |_.__/  \\___| |_|       \\_____|  \\___/  |_| |_|   \\_/    \\___| |_|     \\__| \\___| |_|");
		System.out.println("\n======================================================================================================================");
		System.out.println("\n");
		
		System.out.println("\t[01] Decimal Converter \n");
		System.out.println("\t[02] Binary Converter \n");
		System.out.println("\t[03] Octal Converter \n");
		System.out.println("\t[04] Hexadecimal Converter \n");
		System.out.println("\t[05] Roman Number Converter \n");
		
		System.out.print("Enter Option >");
		int selec = input.nextInt();

             switch (selec){
                case 1:{
                    boolean validInput = false;
                    while (!validInput){
                        System.out.println();
                        System.out.println("+-----------------------------------------+");
                        System.out.println("|            Decimal Converter            |");
                        System.out.println("+-----------------------------------------+");
                        System.out.println();
                        System.out.print("Enter an Decimal number: ");
                        String decStr = input.next();

                        if (!isValidDecimal(decStr)){
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') continue;
                            else break;
                        }

                        validInput = true;
                        int dec = Integer.parseInt(decStr);

                        System.out.println();
                        System.out.println("\t\tBinary number: " + decimalToBinary(dec));
                        System.out.println("\t\tOctal number: " + decimalToOctal(dec));
                        System.out.println("\t\tHexadecimal number: " + decimalToHex(dec));
                        System.out.println();
                    }
                    break;
                }

                case 2: {
                    boolean validInput = false;
                    while (!validInput){
                        System.out.println();
                        System.out.println("+-----------------------------------------+");
                        System.out.println("|             Binary Converter            |");
                        System.out.println("+-----------------------------------------+");
                        System.out.println();
                        System.out.print("Enter an Binary number: ");
                        String binary = input.next();

                        if (!isValidBinary(binary)){
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') continue;
                            else break;
                        }

                        validInput = true;
                        int dec = binaryToDecimal(binary);

                        System.out.println();
                        System.out.println("\t\tDecimal Number: "+dec);
                        System.out.println("\t\tOctal number: "+decimalToOctal(dec));
                        System.out.println("\t\tHexadecimal number: "+decimalToHex(dec));
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    boolean validInput = false;
                    while (!validInput){
                        System.out.println();
                        System.out.println("+-----------------------------------------+");
                        System.out.println("|              Octal Converter            |");
                        System.out.println("+-----------------------------------------+");
                        System.out.println();
                        System.out.print("Enter an Octal number: ");
                        String octalc = input.next();

                        if (!isValidOctal(octalc)){
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') continue;
                            else break;
                        }

                        validInput = true;
                        int dec = octalToDecimal(octalc);

                        System.out.println();
                        System.out.println("\t\tDecimal Number: " + dec);
                        System.out.println("\t\tBinary Number: " + decimalToBinary(dec));
                        System.out.println("\t\tHexadecimal Number: " + decimalToHex(dec));
                        System.out.println();
                    }
                    break;
                }

                case 4: {
                    boolean validInput = false;
                    while (!validInput){
                        System.out.println();
                        System.out.println("+-----------------------------------------+");
                        System.out.println("|        HexaDecimal Converter            |");
                        System.out.println("+-----------------------------------------+");
                        System.out.println();
                        System.out.print("Enter an HexaDecimal number: ");
                        String hex = input.next();

                        if (!isValidHex(hex)) {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') continue;
                            else break;
                        }

                        validInput = true;
                        int dec = hexToDecimal(hex);

                        System.out.println();
                        System.out.println("\t\tDecimal Number: " + dec);
                        System.out.println("\t\tBinary Number: " + decimalToBinary(dec));
                        System.out.println("\t\tOctal Number: " + decimalToOctal(dec));
                        System.out.println();
                    }
                    break;
                }

                case 5: {
                    System.out.println("+------------------------------------------------------------------------------+");
                    System.out.println("|                       Roman Number Converter                                 |");
                    System.out.println("+------------------------------------------------------------------------------+");
                    System.out.println();
                    System.out.println("       [01] Decimal Number to Roman Number Converter");
                    System.out.println();
                    System.out.println("       [02] Roman Number to Decimal Number Converter");
                    System.out.println();
                    System.out.print("Enter an option: ");
                    int romanOption = input.nextInt();

                    switch (romanOption){
                        case 1:{
                            boolean validInput = false;
                            while (!validInput) {
                                System.out.println();
                                System.out.println("+------------------------------------------------------------------------------+");
                                System.out.println("|               Decimal Number to Roman Number Converter                       |");
                                System.out.println("+------------------------------------------------------------------------------+");
                                System.out.println();
                                System.out.print("Enter an Decimal number: ");
                                String decStr = input.next();

                                int decimal = 0;
                                boolean isValid = isValidDecimal(decStr);
                                if (isValid) decimal = Integer.parseInt(decStr);

                                if (!isValid || decimal <= 0 || decimal > 3999){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char retry = input.next().charAt(0);
                                    if (retry == 'Y' || retry == 'y') continue;
                                    else break;
                                }

                                validInput = true;
                                System.out.println();
                                System.out.println("\t\tRoman numeral: " + decimalToRoman(decimal));
                                System.out.println();
                            }
                            break;
                        }

                        case 2: {
                            boolean validInput = false;
                            while (!validInput) {
                                System.out.println();
                                System.out.println("+------------------------------------------------------------------------------+");
                                System.out.println("|               Roman Number to Decimal Number Converter                       |");
                                System.out.println("+------------------------------------------------------------------------------+");
                                System.out.println();
                                System.out.print("Enter an Roman number: ");
                                String romanNum = input.next().toUpperCase();

                                if (!isValidRoman(romanNum)){
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char retry = input.next().charAt(0);
                                    if (retry == 'Y' || retry == 'y') continue;
                                    else break;
                                }

                                validInput = true;
                                System.out.println();
                                System.out.println("\t\tDecimal number: " + romanToDecimal(romanNum));
                                System.out.println();
                            }
                            break;
                        }

                        default:
                            System.out.println("\nInvalid option...");
                    }
                    break;
                }

                default:
                    System.out.println("\nInvalid Option...");
            }

            System.out.println();
            System.out.print("Do you want to go to homepage (Y/N)-> ");
            char homePage = input.next().charAt(0);
            if (homePage == 'Y' || homePage =='y'){
                for (int i=0;i<50; i++){
                    System.out.println();
                }
            } else{
                running = false;
                System.out.println("\nProgramme is close__");
            }
        }
    }

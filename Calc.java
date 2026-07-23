import java.util.*;
class Calc{
	public static void main(String args[]){
		Scanner input = new Scanner (System.in);
		     boolean running = true;
		while (running) {
			
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
			 case 1: {
					
                    boolean validInput = false;
                    while (!validInput) {
						System.out.println();
						System.out.println("+-----------------------------------------+");
						System.out.println("|            Decimal Converter            |");
						System.out.println("+-----------------------------------------+");
						System.out.println();
                        System.out.print("Enter an Decimal number: ");
                        String decStr = input.next();

                        boolean isValid = true;
                        for (int i = 0; i < decStr.length(); i++) {
                            char c = decStr.charAt(i);
                            if (c < '0' || c > '9') {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid || decStr.isEmpty()) {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') {
                                continue;
                            } else {
                                break;
                            }
                        }

                        validInput = true;
                        int dec = Integer.parseInt(decStr);
                        int tem = dec;
                        int tem2 = dec;

                        // Decimal to Binary
                        String bin = "";
                        if (dec == 0) {
                            bin = "0";
                        } else {
                            int d = dec;
                            while (d > 0) {
                                bin = (d % 2) + bin;
                                d = d / 2;
                            }
                        }

                        // Decimal to Octal
                        String octal = "";
                        if (tem == 0) {
                            octal = "0";
                        } else {
                            while (tem > 0) {
                                octal = (tem % 8) + octal;
                                tem = tem / 8;
                            }
                        }

                        // Decimal to Hexadecimal
                        String hexa = "";
                        char[] hexaChar = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        if (tem2 == 0) {
                            hexa = "0";
                        } else {
                            while (tem2 > 0) {
                                hexa = hexaChar[tem2 % 16] + hexa;
                                tem2 = tem2 / 16;
                            }
                        }

                        System.out.println();
                        System.out.println("\t\tBinary number: " + bin);
                        System.out.println("\t\tOctal number: " + octal);
                        System.out.println("\t\tHexadecimal number: " + hexa);
                        System.out.println();
                    }
                    break;
                }

                case 2: {
                    
                    boolean validInput = false;
                    while (!validInput) {
						System.out.println();
						System.out.println("+-----------------------------------------+");
						System.out.println("|             Binary Converter            |");
						System.out.println("+-----------------------------------------+");
						System.out.println();

                        System.out.print("Enter an Binary number: ");
                        String binary = input.next();

                        boolean isValid = true;
                        for (int i = 0; i < binary.length(); i++) {
                            char c = binary.charAt(i);
                            if (c != '0' && c != '1') {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid || binary.isEmpty()) {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') {
                                continue;
                            } else {
                                break;
                            }
                        }

                        validInput = true;

                        // Binary to Decimal
                        int decBin = 0;
                        for (int i = 0; i < binary.length(); i++) {
                            decBin = decBin * 2 + (binary.charAt(i) - '0');
                        }
                        int dec2 = decBin;
                        int dec3 = decBin;

                        // Binary to Octal 
                        String octal2 = "";
                        if (dec2 == 0) {
                            octal2 = "0";
                        } else {
                            while (dec2 > 0) {
                                octal2 = (dec2 % 8) + octal2;
                                dec2 = dec2 / 8;
                            }
                        }

                        // Binary to Hexadecimal
                        String hexa2 = "";
                        char[] hexaChar2 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        if (dec3 == 0) {
                            hexa2 = "0";
                        } else {
                            while (dec3 > 0) {
                                hexa2 = hexaChar2[dec3 % 16] + hexa2;
                                dec3 = dec3 / 16;
                            }
                        }

                        System.out.println();
                        System.out.println("\t\tDecimal Number: " + decBin);
                        System.out.println("\t\tOctal number: " + octal2);
                        System.out.println("\t\tHexadecimal number: " + hexa2);
                        System.out.println();
                    }
                    break;
                }

                case 3: {
                    
                    boolean validInput = false;
                    while (!validInput) {
						System.out.println();
						System.out.println("+-----------------------------------------+");
						System.out.println("|              Octal Converter            |");
						System.out.println("+-----------------------------------------+");
						System.out.println();

                        System.out.print("Enter an Octal number: ");
                        String octalc = input.next();

                        boolean isValid = true;
                        for (int i = 0; i < octalc.length(); i++) {
                            char c = octalc.charAt(i);
                            if (c < '0' || c > '7') {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid || octalc.isEmpty()) {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') {
                                continue;
                            } else {
                                break;
                            }
                        }

                        validInput = true;

                        // Octal to Decimal
                        int decOctal = 0;
                        for (int i = 0; i < octalc.length(); i++) {
                            decOctal = decOctal * 8 + (octalc.charAt(i) - '0');
                        }
                        int dec4 = decOctal;
                        int dec5 = decOctal;

                        // Octal to Binary 
                        String bin3 = "";
                        if (dec4 == 0) {
                            bin3 = "0";
                        } else {
                            while (dec4 > 0) {
                                bin3 = (dec4 % 2) + bin3;
                                dec4 = dec4 / 2;
                            }
                        }

                        // Octal to Hexadecimal
                        String hexa3 = "";
                        char[] hexaChar3 = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                        if (dec5 == 0) {
                            hexa3 = "0";
                        } else {
                            while (dec5 > 0) {
                                hexa3 = hexaChar3[dec5 % 16] + hexa3;
                                dec5 = dec5 / 16;
                            }
                        }

                        System.out.println();
                        System.out.println("\t\tDecimal Number: " + decOctal);
                        System.out.println("\t\tBinary Number: " + bin3);
                        System.out.println("\t\tHexadecimal Number: " + hexa3);
                        System.out.println();
                    }
                    break;
                }

                case 4: {
                    

                    boolean validInput = false;
                    while (!validInput) {
						System.out.println();
						System.out.println("+-----------------------------------------+");
						System.out.println("|        HexaDecimal Converter            |");
						System.out.println("+-----------------------------------------+");
						System.out.println();
                        System.out.print("Enter an HexaDecimal number: ");
                        String hex = input.next();

                        boolean isValid = true;
                        for (int i = 0; i < hex.length(); i++) {
                            char c = hex.charAt(i);
                            if (!((c >= '0' && c <= '9') || (c >= 'A' && c <= 'F') || (c >= 'a' && c <= 'f'))) {
                                isValid = false;
                                break;
                            }
                        }

                        if (!isValid || hex.isEmpty()) {
                            System.out.println("\tInvalid input...");
                            System.out.print("\nDo you want to input number again (Y/N) -> ");
                            char retry = input.next().charAt(0);
                            if (retry == 'Y' || retry == 'y') {
                                continue;
                            } else {
                                break;
                            }
                        }

                        validInput = true;
                        String hexUpper = hex.toUpperCase();

                        // Hexadecimal to Decimal
                        int decHex = 0;
                        for (int i = 0; i < hexUpper.length(); i++) {
                            char ch = hexUpper.charAt(i);
                            int digitValue;
                            if (ch >= '0' && ch <= '9') {
                                digitValue = ch - '0';
                            } else {
                                digitValue = ch - 'A' + 10;
                            }
                            decHex = decHex * 16 + digitValue;
                        }
                        int dec6 = decHex;
                        int dec7 = decHex;

                        // Hexadecimal to Binary 
                        String bin4 = "";
                        if (dec6 == 0) {
                            bin4 = "0";
                        } else {
                            while (dec6 > 0) {
                                bin4 = (dec6 % 2) + bin4;
                                dec6 = dec6 / 2;
                            }
                        }

                        // Hexadecimal to Octal 
                        String octal4 = "";
                        if (dec7 == 0) {
                            octal4 = "0";
                        } else {
                            while (dec7 > 0) {
                                octal4 = (dec7 % 8) + octal4;
                                dec7 = dec7 / 8;
                            }
                        }

                        System.out.println();
                        System.out.println("\t\tDecimal Number: " + decHex);
                        System.out.println("\t\tBinary Number: " + bin4);
                        System.out.println("\t\tOctal Number: " + octal4);
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

                    switch (romanOption) {

                        //Decimal to Roman
                        case 1: {
                            

                            boolean validInput = false;
                            while (!validInput) {
								System.out.println();
								System.out.println("+------------------------------------------------------------------------------+");
								System.out.println("|               Decimal Number to Roman Number Converter                       |");
								System.out.println("+------------------------------------------------------------------------------+");
								System.out.println();
                                System.out.print("Enter an Decimal number: ");
                                String decStr = input.next();

                                boolean isValid = true;
                                for (int i = 0; i < decStr.length(); i++) {
                                    char c = decStr.charAt(i);
                                    if (c < '0' || c > '9') {
                                        isValid = false;
                                        break;
                                    }
                                }

                                int decimal = 0;
                                if (isValid && !decStr.isEmpty()) {
                                    decimal = Integer.parseInt(decStr);
                                }

                                if (!isValid || decStr.isEmpty() || decimal <= 0 || decimal > 3999) {
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char retry = input.next().charAt(0);
                                    if (retry == 'Y' || retry == 'y') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                }

                                validInput = true;
                                int num = decimal;
                                String roman = "";

                                while (num >= 1000) { roman += "M";  num -= 1000; }
                                while (num >= 900)  { roman += "CM"; num -= 900;  }
                                while (num >= 500)  { roman += "D";  num -= 500;  }
                                while (num >= 400)  { roman += "CD"; num -= 400;  }
                                while (num >= 100)  { roman += "C";  num -= 100;  }
                                while (num >= 90)   { roman += "XC"; num -= 90;   }
                                while (num >= 50)   { roman += "L";  num -= 50;   }
                                while (num >= 40)   { roman += "XL"; num -= 40;   }
                                while (num >= 10)   { roman += "X";  num -= 10;   }
                                while (num >= 9)    { roman += "IX"; num -= 9;    }
                                while (num >= 5)    { roman += "V";  num -= 5;    }
                                while (num >= 4)    { roman += "IV"; num -= 4;    }
                                while (num >= 1)    { roman += "I";  num -= 1;    }

                                System.out.println();
                                System.out.println("\t\tRoman numeral: " + roman);
                                System.out.println();
                            }
                            break;
                        }

                        // Roman to Decimal
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

                                boolean isValid = true;
                                for (int i = 0; i < romanNum.length(); i++){
                                    char c = romanNum.charAt(i);
                                    if (c != 'I' && c != 'V' && c != 'X' && c != 'L'
                                            && c != 'C' && c != 'D' && c != 'M') {
                                        isValid = false;
                                        break;
                                    }
                                }

                                if (!isValid || romanNum.isEmpty()) {
                                    System.out.println("\tInvalid input...");
                                    System.out.print("\nDo you want to input number again (Y/N) -> ");
                                    char retry = input.next().charAt(0);
                                    if (retry == 'Y' || retry == 'y') {
                                        continue;
                                    } else {
                                        break;
                                    }
                                }

                                validInput = true;
                                int decimalRom = 0;

                                for (int i = 0; i < romanNum.length(); i++) {

                                    char current = romanNum.charAt(i);
                                    int currentValue = 0;
                                    if      (current == 'I')
										currentValue = 1;
                                    else if (current == 'V') 
										currentValue = 5;
                                    else if (current == 'X') 
										currentValue = 10;
                                    else if (current == 'L') 
										currentValue = 50;
                                    else if (current == 'C') 
										currentValue = 100;
                                    else if (current == 'D') 
										currentValue = 500;
                                    else if (current == 'M') 
										currentValue = 1000;

                                    int nextValue = 0;
                                    if (i + 1 < romanNum.length()) {
                                        char next = romanNum.charAt(i + 1);
                                        if      (next == 'I') 
											nextValue = 1;
                                        else if (next == 'V') 
											nextValue = 5;
                                        else if (next == 'X') 
											nextValue = 10;
                                        else if (next == 'L') 
											nextValue = 50;
                                        else if (next == 'C') 
											nextValue = 100;
                                        else if (next == 'D') 
											nextValue = 500;
                                        else if (next == 'M') 
											nextValue = 1000;
                                    }

                                    if (currentValue < nextValue) {
                                        decimalRom -= currentValue;
                                    } else {
                                        decimalRom += currentValue;
                                    }
                                }

                                System.out.println();
                                System.out.println("\t\tDecimal number: " + decimalRom);
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

            if (homePage == 'Y' || homePage == 'y') {
                for (int i = 0; i < 50; i++) {
                    System.out.println();
                }
            } else {
                running = false;
                System.out.println("\nProgramme is close__");
            }

        } 
    }
 }


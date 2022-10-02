
import java.io.File;
import java.io.PrintWriter;
import java.util.*;
/**
╔═══╗     ╔╗               ╔═══╗              ╔╗                 ╔═══╗         ╔╗    
║╔═╗║    ╔╝╚╗              ╚╗╔╗║             ╔╝╚╗                ║╔═╗║         ║║    
║║ ║║╔══╗╚╗╔╝╔╗╔╗╔╗╔══╗     ║║║║╔╗╔═╗╔══╗╔══╗╚╗╔╝╔══╗╔═╗╔╗ ╔╗    ║║ ╚╝╔═╗╔══╗╔═╝║╔══╗
║╚═╝║║╔═╝ ║║ ╠╣║╚╝║║╔╗║     ║║║║╠╣║╔╝║╔╗║║╔═╝ ║║ ║╔╗║║╔╝║║ ║║    ║║ ╔╗║╔╝║╔╗║║╔╗║║══╣
║╔═╗║║╚═╗ ║╚╗║║╚╗╔╝║║═╣    ╔╝╚╝║║║║║ ║║═╣║╚═╗ ║╚╗║╚╝║║║ ║╚═╝║    ║╚═╝║║║ ║║═╣║╚╝║╠══║
╚╝ ╚╝╚══╝ ╚═╝╚╝ ╚╝ ╚══╝    ╚═══╝╚╝╚╝ ╚══╝╚══╝ ╚═╝╚══╝╚╝ ╚═╗╔╝    ╚═══╝╚╝ ╚══╝╚══╝╚══╝
                                                        ╔═╝║                         
                                                        ╚══╝                         

 */
public class Generator {
    
    public static void main(String[] args) throws Exception {
        Scanner SuperCoolQuote = new Scanner(new File("Supercool.txt"));
        PrintWriter write = new PrintWriter("Passcode.txt");
        String RED = "\u001B[31m";
  

        String BLUE = "\u001B[34m";


        String CYAN = "\u001B[36m";

        String HIDE = "\u001B[30m";

        String OK = "\u001B[32m";
        
        String finalReturnedPasscode = "";

        System.out.println("╔═══╗     ╔╗               ╔═══╗              ╔╗                 ╔═══╗         ╔╗    ");
        System.out.println("║╔═╗║    ╔╝╚╗              ╚╗╔╗║             ╔╝╚╗                ║╔═╗║         ║║    ");
        System.out.println("║║ ║║╔══╗╚╗╔╝╔╗╔╗╔╗╔══╗     ║║║║╔╗╔═╗╔══╗╔══╗╚╗╔╝╔══╗╔═╗╔╗ ╔╗    ║║ ╚╝╔═╗╔══╗╔═╝║╔══╗");
        System.out.println("║╚═╝║║╔═╝ ║║ ╠╣║╚╝║║╔╗║     ║║║║╠╣║╔╝║╔╗║║╔═╝ ║║ ║╔╗║║╔╝║║ ║║    ║║ ╔╗║╔╝║╔╗║║╔╗║║══╣");
        System.out.println("║╔═╗║║╚═╗ ║╚╗║║╚╗╔╝║║═╣    ╔╝╚╝║║║║║ ║║═╣║╚═╗ ║╚╗║╚╝║║║ ║╚═╝║    ║╚═╝║║║ ║║═╣║╚╝║╠══║");
        System.out.println("╚╝ ╚╝╚══╝ ╚═╝╚╝ ╚╝ ╚══╝    ╚═══╝╚╝╚╝ ╚══╝╚══╝ ╚═╝╚══╝╚╝ ╚═╗╔╝    ╚═══╝╚╝ ╚══╝╚══╝╚══╝");
        System.out.println("                                                        ╚══╝                         \n");


        System.out.println(RED + "CredentialCompartmentalizing " + BLUE + "By Mac Lawson (https://github.com/mac-lawson)\n");

        System.out.println(CYAN + SuperCoolQuote.nextLine() + BLUE +"\n\n\n");
        if(true) {
            errorCodes(0);
        }
        if(args[0].contains("-l")) {
            for(int i = 0; i < 1; i++) {
                System.out.println(BLUE + "PASSWORD CREATED FOR ACCOUNT TIER: \n");
                if(args[1].contains("Domain Admin")) {finalReturnedPasscode = genCode(250);  System.out.println(OK + finalReturnedPasscode + "\n");}
                else if(args[1].contains("Object")) {finalReturnedPasscode = genCode(200);  System.out.println(OK + finalReturnedPasscode+ "\n");}
                else if(args[1].contains("Server")) {finalReturnedPasscode = genCode(150);  System.out.println(OK + finalReturnedPasscode+ "\n");}
                else if(args[1].contains("Workstation")) {finalReturnedPasscode = genCode(75);  System.out.println(OK + finalReturnedPasscode+ "\n");}
                else if(args[1].contains("Normal")) {finalReturnedPasscode = genCode(35);  System.out.println(OK + finalReturnedPasscode+ "\n");}
                else {}

            }
        } else if(args[0].contains("-h")) {
            System.out.println(RED);
            errorCodes(0);
            System.out.println(BLUE);

        } 
        System.out.println(HIDE);

        if(args[2].contains("-o")) {
            write.println(finalReturnedPasscode);
            write.close();
        }

    
        
    }

    public static void errorCodes(Integer type) {
        String RED = "\u001B[31m";
  

        String BLUE = "\u001B[34m";


        if(type == 0) {System.out.println(RED + "USAGE: java Generator.java -l (Active Directory Priv Level; i.e. -l 'Domain Admin'; CASE SENSITIVE) \n{Domain Admin, Domain Object Admin, Server Admin, Workstation Admin, Normal User} \n OPTIONS: \n -o: Output to Passcode.txt \n Help: mlawson07@tutanota.com\n" + BLUE);}
        else if(type == 1) {System.out.println(RED + "ERROR: No args provided. Use java Generator.java -h for help \n" + BLUE);}
        else {}

    }

    public static char ranLetter() {
        Random r = new Random();
        Integer sel = (int)(Math.random() * 10);
        char retValue = 'a';

        if( sel <= 5) {
         retValue =  (char)(r.nextInt(26) + 'a');
        }
        else {
          retValue = (char)(r.nextInt(26) + 'A'); 
        }

        return retValue;
    }

    public static String ranInt() {
        Integer retValue = (int)(Math.random() * 10);
        return Integer.toString(retValue);
    }


    public static String genCode(Integer length) {
        String finalPassword = "";
        for(int i = 0; i < length; i++) {
            Integer ranSel = (int)(Math.random() * 10);
            if(ranSel <= 5) {finalPassword += ranInt();}
            else{finalPassword += ranLetter();}

        }
        return finalPassword;
    }




}

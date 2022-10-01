
import java.io.File;
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

        String RED = "\u001B[31m";
  

        String BLUE = "\u001B[34m";


        String CYAN = "\u001B[36m";


        System.out.println(CYAN + SuperCoolQuote.nextLine() + BLUE);
        if(true) {
            errorCodes(0);
        }
        if(args[0].contains("-l")) {
            for(int i = 0; i < 1; i++) {
                System.out.println(BLUE + "PASSWORD CREATED FOR ACCOUNT TIER: ");
                if(args[1].contains("Domain Admin")) {System.out.println(BLUE + genCode(250));}
                else if(args[1].contains("Object")) {System.out.println(BLUE + genCode(100));}
                else if(args[1].contains("Server")) {System.out.println(BLUE + genCode(50));}
                else if(args[1].contains("Workstation")) {System.out.println(BLUE + genCode(25));}
                else if(args[1].contains("Normal")) {System.out.println(BLUE + genCode(10));}
                else {}

            }
        } else if(args[0].contains("-h")) {
            System.out.println(RED);
            errorCodes(0);
            System.out.println(BLUE);

        }

    
        
    }

    public static void errorCodes(Integer type) {
        String RED = "\u001B[31m";
  

        String BLUE = "\u001B[34m";


        if(type == 0) {System.out.println(RED + "USAGE: java Generator.java -l (Active Directory Priv Level) \n{Domain Admin, Domain Object Admin, Server Admin, Workstation Admin, Normal User} " + BLUE);}
        else if(type == 1) {System.out.println(RED + "ERROR: No args provided. Use java Generator.java -h for help " + BLUE);}
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

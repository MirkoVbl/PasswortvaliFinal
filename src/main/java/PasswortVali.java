import java.util.Scanner;

public class PasswortVali {

    public static void main(String[] args) {
        System.out.println("Wähle ein Passwort");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(abNachOben(input));


    }

    public static boolean passwortLaenge(String password) {
        if (password.length() <=8) {
            return false;
        }
        return true;
    }

    public static boolean checkForNumber(String password) {
        char[] arr = password.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isDigit(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForUpperCase(String password) {
        char[] arr = password.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isUpperCase(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkForLowerCase(String password) {
        char[] arr = password.toCharArray();

        for (int i = 0; i < arr.length; i++) {

            if (Character.isLowerCase(arr[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean badPassword (String password){
        String[] badPW =new String[5];
        badPW[0] = "Passwort1";
        badPW[1] = "12345678";
        badPW[2] = "987654321";
        badPW[3] = "ABC123ABC";

        if (password != badPW[0] && password != badPW[1] && password != badPW[2] && password != badPW[3] && password != badPW[4]){
            return false;
        }
        return true;
    }

    public static String abNachOben (String input){

        if (passwortLaenge(input) == false){
            return "Dein Passwort ist nicht lang genug";
        }else if (checkForNumber(input) == false){
            return "Dein Passwort enthält keine Zahl";
        }else if (checkForUpperCase(input) == false){
            return "dein Passwort enthält keinen Großbuchstaben";
        }else if (badPassword(input) == false){
            return "Dein Passwort ist nicht sicher";
        }
        return "Passwort erfolgreich erstellt!";
    }


}

import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    public ArrayList<Integer> getTenRolls() {
        Random randMachine = new Random();
        ArrayList<Integer> tenRollArray = new ArrayList<Integer>();
        for (int i = 0; i<10; i++) {
            int randomTenNum = randMachine.nextInt(10);
            tenRollArray.add(randomTenNum);
        }
        return tenRollArray;
    }
    public char getRandomLetter() {
        Random randMachine = new Random();
        char[] alphabetArray = new char[26];
        for(int i = 0; i<26; i++) {
            alphabetArray[i] = (char) ('A' + i);}
        int randomIndex = randMachine.nextInt(25);
        char returnChar = alphabetArray[randomIndex];
        return returnChar;
    }

    public String generatePassword() {
        char[] password = new char[8];
        for (int i=0; i<=7; i++) {
            password[i] = getRandomLetter();
        }
        String finalPassword =  new String(password);
        return finalPassword;
    }

    public String[] getNewPasswordSet(int length) {
        String[] passwords = new String[length];
        
        for (int i=0; i<=(length-1); i++) {
            char[] password = new char[8];
            for (int e=0; e<=7; e++) {
                password[e] = getRandomLetter();
            }
            String finalPassword =  new String(password);
            
            passwords[i] = finalPassword;
        }
        return passwords;
    }
}


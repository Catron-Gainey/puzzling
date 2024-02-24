import java.util.ArrayList;
import java.util.Random;
public class TestPuzzleJava {
    
	public static void main(String[] args) {
		PuzzleJava generator = new PuzzleJava();
		ArrayList<Integer> randomRolls = generator.getTenRolls();
		System.out.println(randomRolls);

        char randomLetter = generator.getRandomLetter();
        System.out.println(randomLetter);

        String password = generator.generatePassword();
        System.out.println(password);

        String[] passwords = generator.getNewPasswordSet(3);
        for (int i=0; i<passwords.length; i++ ){
            System.out.println(passwords[i]);
        }
	}
}

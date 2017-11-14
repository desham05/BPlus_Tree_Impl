import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int num1;
		int num2 = 20;
		String word1,word2,word3;
		System.out.print("Enter number 1: ");
		num1 = kb.nextInt();
		System.out.print("Enter number word1: ");
		word1 = kb.nextLine();
		System.out.print("Enter number word2: ");
		word2 = kb.nextLine();
		System.out.print("Enter number word3: ");
		word3 = kb.nextLine();
		
		if(word1.length() >= num1 && word1.length() <= num2 && word2.length() >= num1 && word2.length() <= num2 
				&& word3.length() >= num1 && word3.length() <= num2)
		{
				System.out.print("word: "+word1);
		}
		}

}

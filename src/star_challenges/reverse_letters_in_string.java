package star_challenges;

public class reverse_letters_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseLettersInString("happiness");
	}
	
	public static void reverseLettersInString(String word) {
		String newWord = "";
		for (int i = word.length() - 1; i >= 0; i--) {
			newWord = newWord + word.charAt(i);
		}
		System.out.println(newWord);
	}

}

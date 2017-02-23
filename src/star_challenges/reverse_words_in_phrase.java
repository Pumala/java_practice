package star_challenges;

public class reverse_words_in_phrase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverseWordsInPhrase("there is a cat over here");
	}

	public static void reverseWordsInPhrase( String word) {
		String[] arr = word.split(" ");
		String newPhrase = "";
		
		for (int i = arr.length - 1; i >= 0; i--) {
			newPhrase = newPhrase + " " + arr[i];
		}
		System.out.println(newPhrase);
	}
}

public class Palindrome {
		public static boolean check(String word) {
			char [] wordArray = word.toCharArray();
			StringBuilder stringBuilder = new StringBuilder();
			for(int i=wordArray.length-1;i>=0;i--) {
				stringBuilder.append(wordArray[i]);
			}
			String reversedWord=stringBuilder.toString();
			if(word.equals(reversedWord))
				return true;
			return false;
		}
}

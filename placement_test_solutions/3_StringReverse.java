public class StringReverse {
	public static String reverse(String string) {
		char [] stringArray = string.toCharArray();
		StringBuilder stringBuilder = new StringBuilder();
		for(int i=stringArray.length-1;i>=0;i--) {
			stringBuilder.append(stringArray[i]);
		}
		String reversedString=stringBuilder.toString();
		return reversedString;
	}
}

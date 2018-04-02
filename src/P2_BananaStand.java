/*
	ISYS 320
	Name(s):
	Date: 
*/


public class P2_BananaStand {
	public static void main(String[] args) {
		String quote = "There's always money in the banana stand.";
		String banana = quote.substring(28, 35);		
		System.out.println(banana.toUpperCase());
		System.out.println(secondHalf( quote));
	}
	
	public static Object secondHalf(String half) {
		int sentenceLength = half.length() / 2;
		return half.substring(sentenceLength);
	}
}

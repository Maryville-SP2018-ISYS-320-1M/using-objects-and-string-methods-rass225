/*
	ISYS 320
	Name(s):
	Date: 
*/

public class P5_UpperFirst {

	public static void main(String[] args) {
		System.out.println(upperFirst("Rasmus Tauts", " "));
		
	}
	public static Object upperFirst(String string, String delimiter) 
	{
		int i = string.indexOf(delimiter);
		string = string.substring(0,  i).toUpperCase() + string.substring(i).toLowerCase();
		return string;
	}

}

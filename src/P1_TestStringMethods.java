/*
	ISYS 320
	Name(s):
	Date: 
*/

/*
 Your expression predictions:
 
 1. 12
 2. a
 3. G
 4. 2 
 5. GANDALF The GRAY
 6. frodo baggins
 7. o Baggins
 8. dalf the GR 
 9. Goondoolf the GRAY
 10.Gandalf the GRAY
 11. ( is it an error?)
 
  
 */

/*
 Were you correct? Explain if you were not (what did you learn?)
 
 1. Correct
 2. Correct
 3. Correct
 4. Correct 
 5. Correct
 6. Correct
 7. Correct
 8. Correct 
 9. Correct
 10.Correct
 11.the code typed strange1
 
 */
public class P1_TestStringMethods
{
	public static void main(String[] args)
	{
		String str1 = "Frodo Baggins";
		String str2 = "Gandalf the GRAY";
		System.out.println(str1.length());
		System.out.println(str1.charAt(7));
		System.out.println(str2.charAt(0));
		System.out.println(str1.indexOf("o"));
		System.out.println(str2.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.substring(4));
		System.out.println(str2.substring(3, 14));
		System.out.println(str2.replace("a", "oo"));
		System.out.println(str2.replace("gray", "white"));
		System.out.println("str1".replace("r",  "range"));
	}
}

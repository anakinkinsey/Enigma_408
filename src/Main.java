import java.util.Scanner;

public class Main 
{
	public static void main(String[] arg) {
		String str,estr="";
		int x;
		Scanner key = new Scanner(System.in);
		Enigma enigma = new Enigma(key);
		
		str = key.next().toUpperCase();
		for (x=0;x<str.length();x++)
			estr = estr + enigma.Encrypt(str.charAt(x));
		System.out.print(estr);
	}
}

public class Convert {
	public static char[] alpu =("ABCDEFGHIJKLMNOPQRSTUVWXYZ").toCharArray();
	public static int CharInt (char nxt)
	{
		int z;
		for (z=0; z<26; z++ )
		{
			if (nxt == alpu[z])
				return z;				
		}
		return 26;
	}
	public static char IntChar (int x){
		return alpu[x];
	}
	public static char[] ShiftChar(char[] x,int y){
		char z,w;
		int i;
		for (w=0;w<y;w++){
			z=x[0];
			for (i=0;i<25;i++)
				x[i]=x[i+1];
			x[25]=z;
		}
		return x;
	}
}
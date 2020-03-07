package a1z261;
import java.util.*;
public class a1z26
{

	public static void main(String[] args)
	{
		String str;
		char ch;
		int i=0;
		System.out.println("enter the message");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		for(int n=0;n<str.length();n++)
		{
			ch=str.charAt(i);
			int m=(int)ch;
			if(m>=65 && m<=90)
			{
			int g=m%65;
			g+=1;
			System.out.print("0");
			System.out.print(g);
			}
			if(m>=97 && m<=122)
			{
				int g=m%97;
				g+=1;
				System.out.print("0");
				System.out.print(g);
			}
			i++;
		}
	}
}
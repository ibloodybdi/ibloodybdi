/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		double m,n,a,b,d;
		m = 9.9;
		n = 11;
		d = 10;
		a = Math.abs(m-d);
		b = Math.abs(n-d);
		if(a<b) {
			System.out.println(m+" blizje");
		} else if(a>b) {
			System.out.println(n+" blizje");
		} else {
			System.out.println("Rastoyanije ot "+m+" do 10 = rasstoyanijy ot "+n+" do 10");
		}
	}
}
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Random rnd=new Random();
        int a= (int)rnd.nextInt(899)+100;
        int b=a%10;
        int c=(a/10)%10;
        int d=(a/100)%10;
        if(b>=c&b>d||b>c&b>=d){
            System.out.println("В числе "+a+" наибольшая цифра " +b);
        }
        else {
            if (c>b&c>=d) {
                System.out.println("В числе "+a+" наибольшая цифра " +c);
            }
            else {
                System.out.println("В числе "+a+" наибольшая цифра " +d);
            }
        }
	}
}
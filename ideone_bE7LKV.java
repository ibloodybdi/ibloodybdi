/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
int [][] Mas = new int[5][8];
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                Mas[i][h]=(int)((Math.random()*99)-99);
                System.out.print(Mas[i][h]+" ");
            }
        }
        int min=Mas[0][0];
        for(int i =0;i<Mas.length;i++){
            for(int h=0;h<Mas[i].length;h++){
                if(Mas[i][h]>min)min=Mas[i][h];
            }
        }
        System.out.println(" ");
        System.out.println("Значение максимального элемента массива = "+min);
	}
}
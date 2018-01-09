package whatnot;/* Program to split of a 4 digit number */

public class P7
{
public static void main(String args[])
{
int x = 1234, y, z;
	//int x=8970,y,z ;

/*y = x /1000 ;
System.out.println(" The digit in the Thousand's place = "+y);

z = x % 1000;
y = z /100;
System.out.println("\n The digit in the Hundred's place = "+y);

z = z % 100;
y = z / 10;
System.out.println("\n The digit in the Ten's place = "+y);

y = z % 10;
System.out.println("\n The digit in the Unit's place = "+y);
*/
	
	z=x%10;
	System.out.println("\n The digit in the Unit's place = "+z);
}
}
/**
 *   File Name: helloyou.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: May 19, 2016
 *   
 */

package helloyouproject;

/**
 * helloyou //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 * 
 * @author      yerramsetty, Anand
 * @version     1.0.0
 * @since       1.0
 *
 */

import java.util.Scanner;

public class helloyou
{
static Scanner scanner = new Scanner (System.in);
static String[] userVars;
static String[] details;

public static void main(String[] args)
{
String name;
System.out.println("hello well come");
System.out.println("what is your name");
name = scanner.nextLine();
details=requestUserInfo(name,"age","city of residence","favorite color","current mood");
outputUserDetails(name);
exitApplication();
}

public static String[] requestUserInfo(String name, String... details)
{
	int i;
	userVars = new String[details.length];
	System.out.println("tell me more about yourself" +name+ "!");
	for(i=0;i<details.length;i++)
	{
		System.out.println("can i get your" +details[i]+ ",please?");
		userVars[i] = scanner.nextLine();
	}
return details;
}

public static void outputUserDetails(String name)
{
	int i;
System.out.println("\n Well" + name + ", it seems I have learned enough about you");
for (i=userVars.length-1;i>0 ;i-- ) 
	{
	System.out.println("Your" + details[i]+ "is" + userVars[i] + ".");
	}
}

public static void exitApplication()
{
System.out.println("Thank you for using SQA greeting Applicaion");
System.exit(0);
} 

}
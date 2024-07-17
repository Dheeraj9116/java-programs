package interviewpurpose;

public class DStringMethods{

public static void main(String args[])
{

/*// Using string literals
String str1 = "Hello, World! no 1";

// Using the String class constructor
String str2 = new String ("Hello, World! no 2");
System.out.println(str1);
System.out.println(str2);
*/

/*
String var= "Hello! World";
System.out.println("String: " +var);

// get the length of var
int length = var.length();
System.out.println("Length: " + length);   */

/*
//concat method 
String s = "Sachin";
s=s.concat(" Tendulkar");
System.out.println(s);*/

/*
//charat method at index add value
String myStr = "Hello";
char result = myStr.charAt(0);
System.out.println(result);
*/

/*
//replace Method L to p 
String myStr = "Hello";
System.out.println(myStr.replace('l', 'p'));
*/

/*
//getbytes converts a string into an array of bytes.
String myStr = "Hello";
byte[] result = myStr.getBytes();
System.out.println(result[3]);
*/


  /*
//compare two strings
    String first = "java programming";
    String second = "java programming";
    String third = "python programming";

    // compare first and second strings
    boolean result1 = first.equals(second);
    System.out.println("Strings first and second are equal: " + result1);

    // compare first and third strings
    boolean result2 = first.equals(third);
    System.out.println("Strings first and third are equal: " + result2);
  */

/*
//contains() method checks string or not.
  String str1 = "Java String contains()";

    // check if str1 contains "Java"
    boolean result = str1.contains("Java");

    System.out.println(result);
*/

/*
String str1 = "java is fun";
String str1 = "program";

// extract substring from index 0 to 3
System.out.println(str1.substring(0, 4));
    // start index only
    System.out.println(str1.substring(3));  // gram

//start and end index
  System.out.println(str1.substring(0, 5));  // progr
*/

/*
//join strings
String str1 = "java is fun";
String str2 = "program";
// join strings with space between them
    String joinedStr = String.join(" ", str1, str2);

    System.out.println(joinedStr);
*/

/*
String str1 = "Java is fun";
    int result;
// getting index of character 's'
    result = str1.indexOf('s');

    System.out.println(result);
*/

/*
//isemty method
String str1 = "java is fun";
String str2 = "";
 System.out.println(str1.isEmpty()); // false
    System.out.println(str2.isEmpty()); // true
*/

/*
//Startswith method it check given and var
String str1 = "java is fun";
 System.out.println(str1.startsWith("Java")); //false
*/

/*
//endswith
 String str = "Java Programming";

 System.out.println(str.endsWith("mming")); // true
 System.out.println(str.endsWith("Java")); // false
*/  

/*  
//intern method
String str1 = new String("xyz");
    String str2 = new String("xyz");
    System.out.println(str1 == str2); // false

    // using the intern() method
    // now both str1 and str2 share the same memory pool
    str1 = str1.intern();
    str2 = str2.intern();

    System.out.println(str1 == str2); // true
*/

/*
//trim() method 
String s1="  hello string   ";  
System.out.println(s1+"javas");//without trim()  hello string   javas
System.out.println(s1.trim()+"javas");//with trim()  hello stringjavas
*/
}
}
package com.mcnz.examples;

public class CodeSnippets {

	public static void main(String[] args) {

/* ****
1. Declaring variables 
*/

boolean b = true;
byte me = 12;
short temper = 13;
int x = 10;
long john = 100;
char lie = 'C';
float sum = (float)12.45;
double dip = 12.45;

/* ****
2. Casting
*/

me = (byte)x;
sum = (float)dip;
dip = sum;
temper = (short)dip;

/* ****
3. Conversions
*/

String bean = "12345";
int erest = Integer.parseInt(bean);


/* ****
4. Comparing primitives
*/

int eye = 10;
double ears = 20;
short hands = 10;

System.out.println(!(eye==hands));
System.out.println(ears==hands);


/* ****
5. Comparing Strings
*/
String diaz = "Cameron";
String myself = "Cameron";
String trump = "Donald";

System.out.println(myself.equals(diaz));
System.out.println(myself.equals(trump));

	}
}

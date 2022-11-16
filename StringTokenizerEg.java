package String;

import java.util.StringTokenizer;

//Simple way to break a string,pakage:java.otil.StringTokenizer
public class StringTokenizerEg {
public static void show() {//show method
	StringTokenizer sk=new StringTokenizer("Anudip Foundation Skill and Career Development Center");
while(sk.hasMoreTokens()) {//boolean method its check if there is more token available or not
	System.out.print(sk.nextToken(" "));//string method it returns the next token from stringTokenizer method
	StringTokenizer sk1=new StringTokenizer("Hi there, how are you doing");
	while(sk1.hasMoreTokens()) {
		System.out.println();
		System.out.println(sk1.nextToken(","));
		
	}
}
}
public static void main(String args[]) {
	show();

}
}

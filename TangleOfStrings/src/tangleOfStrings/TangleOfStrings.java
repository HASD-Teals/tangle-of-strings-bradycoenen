import java.util.Scanner;

public class TangleOfStrings {
	public static Scanner input = new Scanner(System.in);


	public static void main(String[] args) {
		input.useDelimiter(System.lineSeparator());
		mypassword();

	}
	public static void mypassword() {
		String password="";
		System.out.print("What's the secert code man: ");
		password=input.next();
		if(password.equals("me")) {
			menu();
		}
		else {
			System.out.println("Incorrect Password");
			mypassword();
		}
	}
	public static void menu() {
		System.out.println("1: Print my string backward");
		System.out.println("2: Make a list of words in my string with a given length");
		System.out.println("3: Print out number of vowels in my string");
		System.out.println("4: Inverse the character case of my string");
		System.out.println("5: Compare to a 2nd string for content equality");
		System.out.println("6: Replace a word in your string with a new word");
		System.out.println("7: Quit");
		System.out.println("Your Choice: ");
		int truck= input.nextInt();
		String Semi = "";
		switch(truck) {
		case 1:
			System.out.print("Name String here:");
			String js=input.next();
			backwards(js);
			System.out.println(" ");
			menu();
			break;
		case 2:
			System.out.print("Name String here:");
			String js1=input.next();
			list(js1);
			System.out.println(" ");
			menu();
			break;
		case 3:
			System.out.print("Name String here:");
			String js2=input.next();
			voules(js2);
			System.out.println(" ");
			menu();
			break;
		case 4:
			System.out.print("Name String here:");
			String js3=input.next();
			cc(js3);
			System.out.println(" ");
			menu();
			break;
		case 5:
			System.out.print("Name String here:");
			String js4=input.next();
			similar(js4);
			System.out.println(" ");
			menu();
			break;
		case 6:
			System.out.print("Name String here:");
			String js5=input.next();
			replace(js5);
			System.out.println(" ");
			menu();
			break;
		case 7:
			quit();
			break;




		}			
	}
	public static void backwards(String js) {
		for (int i=js.length()-1;i>=0;i--) {
			System.out.print(js.charAt(i));

		}
	}
	public static void cc(String js3) {

		System.out.println(" ");
		for (int i=0;i<js3.length();i++) {
			String ju= js3.toUpperCase();
			String jl= js3.toLowerCase();
			if (js3.charAt(i)==jl.charAt(i)) {
				System.out.print(ju.charAt(i));
			}
			else {
				System.out.print(jl.charAt(i));
			}
		}
	}
	public static void similar(String js4) {;
	System.out.println(" ");
	System.out.println("String to be compared to:");
	String rando= input.next() ;
	if (js4.equals(rando)) {
		System.out.println("The Strings are similar");
	}
	else {
		System.out.println("The Strings are not similar");
	}
	}
	public static void voules(String js2) {
		System.out.println(" ");
		int v=0;
		for (int i=0;i<=js2.length();i++) {
			if(js2.charAt(i)=='a'||js2.charAt(i)=='e'||js2.charAt(i)=='i'||js2.charAt(i)=='o'||js2.charAt(i)=='u'||js2.charAt(i)=='A'||js2.charAt(i)=='E'||js2.charAt(i)=='I'||js2.charAt(i)=='O'||js2.charAt(i)=='U')  {
				v++;
			}
		}
		System.out.print(v);	
	}
	public static void list(String js1) {
		System.out.println(" ");
		String temp = "";
		for (int i=0;i<js1.length();i++) {
			if (!Character.toString(js1.charAt(i)).equals(" ")) {
				temp += js1.charAt(i);
			}
			else {
				System.out.println(temp);
				temp="";
			}

		}
		System.out.println(temp);
	}
	public static void replace(String js5) {
		System.out.println("Word you want to replace:");
		String target=input.next();
		System.out.println("Word that it should be replaced with:");
		String replace=input.next();
		target =target.toLowerCase();
		String newphrase = js5.toLowerCase().replace(target, replace);
		System.out.println(newphrase);

	}
	public static void quit() {
		System.out.println("Thanks for utilizing, come again!");
	}
	public static void option() {
		
	}
}

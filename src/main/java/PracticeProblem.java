import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
q3();
	}

	public static void q1() {
    Scanner input = new Scanner(System.in);
    int num;
    do {
        System.out.print("Input a positive integer: ");
        num = input.nextInt();
    } 
	while (num < 0);
    	System.out.println(num * 2);
	input.close();
	}


	public static void q2() {
    Scanner input = new Scanner(System.in);
    String pass;
    String passConfirm;

    do {
        System.out.print("Input a password: ");
        pass = input.nextLine();
        System.out.print("Confirm the password: ");
        passConfirm = input.nextLine();
    } 
	while (!pass.equals(passConfirm));
		System.out.println("success.");
	}

	public static void q3() {
		Scanner input = new Scanner(System.in);
    	int num;
		int multiple;
		do {
		System.out.print("Input an integer: ");
		num = input.nextInt();
		System.out.print("Input an integer that is a multiple of the first integer: ");
		multiple = input.nextInt();
		}
		while (multiple % num != 0);
			System.out.println("success.");
	}	
}


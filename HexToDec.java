import java.util.Scanner;
public class HexToDec{
	public static void main(String[]args){
		System.out.println("Enter the Hex digit: ");
		Scanner input=new Scanner(System.in);
		String hexString = input.nextLine();

		if(hexString.length()!=1){
			System.out.println("Wrong length");
			System.exit(1);
		}
		char ch=hexString.charAt(0);
		if(ch<='F'&&ch>='A'){
			int value=ch-'A'+10;
			System.out.println("The decimal value of "+ch+" is "+value);
		}else if(Character.isDigit(ch)){
			System.out.println("The decimal value of "+ch+" is "+ch);
		}else{
			System.out.println("Invalid input");
		}
	}
}
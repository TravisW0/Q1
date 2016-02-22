import java.util.Scanner;

public class QBrating {
	public static void main(String [] args){
		double TD;
		double Att;
		double Intr;
		double Yards;
		double Comp;
		double QBR;
		double a;
		double b;
		double c;
		double d;
		
		Scanner QBinput = new Scanner(System.in);
		System.out.println("Enter quarterback Touchdowns: ");
		TD = QBinput.nextDouble();
		
		System.out.println("Enter quarterback Attempts: ");
		Att = QBinput.nextDouble();
		
		System.out.println("Enter quarterback Interceptions: ");
		Intr = QBinput.nextDouble();
		
		System.out.println("Enter quarterback Yards: ");
		Yards = QBinput.nextDouble();
		
		System.out.println("Enter quarterback Completions: ");
		Comp = QBinput.nextDouble();
		
		a = ((Comp/Att)-.3)*5;
		
		b = ((Yards/Att)-3)*.25;
		
		c = (TD/Att)*20;
		
		d = 2.375 - ((Intr/Att)*25);
				
		
		QBR = ((a + b + c + d)/6) * 100;
		
		System.out.println("The quarterback's rating is : " + QBR);
		
	}
}

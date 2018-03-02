package training;

import java.io.Console;
import java.io.IOException;

public class ConsoleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Console console = System.console();
String user = console.readLine("Enter UserName");
System.out.println(user);
try {
	Runtime.getRuntime().exec("cls");
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

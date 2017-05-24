package chat1;

import java.net.*;
import java.io.*;
 
public class  server
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(2000);
		Socket sk=ss.accept();
		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		//BufferedReader: reads text from a character-input stream
		PrintStream cout=new PrintStream(sk.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (  true )
		{
			s=cin.readLine();
  			if (s.equalsIgnoreCase("END"))
  			{
				cout.println("BYE");
    				break;
  			  }
			System. out.print("From Client : "+s+"\n");
			System.out.print("Server msg: ");
			s=stdin.readLine();
			cout.println(s);
		}
		ss.close();
 		sk.close();
 		cin.close();
		cout.close();
 		stdin.close();
	}
}

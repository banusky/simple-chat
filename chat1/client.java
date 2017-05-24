package chat1;

import java.net.*;
import java.io.*;

public class  client
{
	public static void main(String args[]) throws Exception
	{
		Socket socket=new Socket("192.168.43.213",2000);
		BufferedReader sin=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		PrintStream sout=new PrintStream(socket.getOutputStream());
		BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (  true )
		{
			System.out.print("Client msg : ");
			s=stdin.readLine();
			sout.println(s);
			s=sin.readLine();
			System.out.print("From Server : "+s+"\n");
  			if ( s.equalsIgnoreCase("BYE") )
 			   break;
		}
		socket.close();
		 sin.close();
		 sout.close();
 		stdin.close();
	}
}

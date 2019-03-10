import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.util.Scanner;

public class Client
{
	public static void main(String[] args)
	{
		try
		{
			Socket socket = new Socket("127.0.0.1", 1211);
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter your 10 digit code or password");
			dout.writeUTF(input.nextLine());
			dout.flush();
			
			System.out.println(din.readUTF());
			
			ObjectInputStream objectIn = new ObjectInputStream(socket.getInputStream());
			String[] array = (String[]) objectIn.readObject();
			
			int i = 0;
			for(String choice : array) {
				System.out.println(choice + " - " + i + " - heeey");
				i++;
			}
			
			System.out.println("Enter your name , egn, adress and the number of your choice");
			String response = input.nextLine();
			dout.writeUTF(response);
			dout.flush();
			
			
				
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CitizenThread extends Thread
{
	private Socket socket;
	String[] candidates = {"Pesho Ivanov", "Dimitur Georgiev", "Ivailo Nenchov", "Stanislav Pavlov", "Vladimir Putin"};
	
	public CitizenThread(Socket socket)
	{
		this.socket = socket;
	}
	
	public void run()
	{
		try
		{
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			
			
			ObjectOutputStream objectOut = new ObjectOutputStream(socket.getOutputStream());
			objectOut.writeObject(candidates);
			objectOut.flush();
			
			String anwser[] = din.readUTF().split(" ");
			Citizen citizen = new Citizen(anwser[0], anwser[1], anwser[2]);
			Server.votedCitizensRegister.add(citizen);
			int vote = Integer.parseInt(anwser[3]);
			int votesForP = Server.votesMap.get(vote);
			synchronized(this)
			{
			Server.votesMap.put(vote, votesForP + 1);
			}
			System.out.println("---" + vote + " / " + votesForP);
			
			dout.close();
			din.close();
			objectOut.close();

			return;
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


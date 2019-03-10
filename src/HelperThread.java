import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Map.Entry;

public class HelperThread implements Runnable
{
	private Socket socket;
	
	public HelperThread(Socket socket)
	{
		this.socket = socket;
	}
	
	public void start()
	{
		run();
	}
	
	public void run()
	{
		for(Entry entry : Server.votesMap.entrySet())
		{
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("----------------------");
		
		try
		{
			DataInputStream din = new DataInputStream(socket.getInputStream());
			DataOutputStream dout = new DataOutputStream(socket.getOutputStream());
			boolean shouldNotRefuse = false;
			while (true)
			{
				String EGNorPass = din.readUTF();
				for(String pass : Server.map.keySet())
				{
					if(pass.equals(EGNorPass))
					{
						if(Server.map.get(pass).equals("vote"))
						{
							
							dout.writeUTF("You have been connected");
							dout.flush();
							shouldNotRefuse = true;
							CitizenThread th = new CitizenThread(socket);
							th.run();
						}
						else if(Server.map.get(pass).equals("admin"))
						{
							
						}
					}
				}
				
				if(!shouldNotRefuse)
				{
					dout.writeUTF("REFUSED");
					dout.flush();
					din.close();
					dout.close();
					return;
				}
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}

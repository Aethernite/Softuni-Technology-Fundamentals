import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
public class Server
{
	 static HashMap<String, String> map = new HashMap<String, String>();
	 static HashMap<Integer, Integer> votesMap = new HashMap<Integer, Integer>();
	 static List<Citizen> votedCitizensRegister = new LinkedList<Citizen>();
	
	public static void main(String[] args)
	{
		votesMap.put(0, 0);
		votesMap.put(1, 0);
		votesMap.put(2, 0);
		votesMap.put(3, 0);
		votesMap.put(4, 0);
		
		map.put("9805069047", "vote");
		map.put("admin1", "admin");
		map.put("9804053998", "vote");
		map.put("preslava981", "admin");
		map.put("hellothere", "admin");
		map.put("5012170366", "vote");
		
		try
		{
			
			ServerSocket ss = new ServerSocket(1211);
			while (true)
			{
				Socket socket = ss.accept();
				HelperThread th = new HelperThread(socket);
				th.start();
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	
	}	
}

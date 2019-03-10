import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Serverino{
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(1337);
        //ТУК МОЖЕ ДА СЕ ИНИЦИАЛИЗИРА ДАДЕН КЛАС/ДАДЕНА СТРУКТУРА

        while(true){
            Socket s = ss.accept();
            System.out.println("New client at " + s);
            ClientThread ob = new ClientThread(s);
            Thread th = new Thread(ob);
        }
    }
}

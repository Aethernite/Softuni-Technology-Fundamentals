import java.io.DataInputStream;
        import java.io.DataOutputStream;
        import java.net.Socket;

public class ClientThread implements Runnable {
    private Socket s;
    private DataInputStream dis;
    private DataOutputStream dos;



    public ClientThread(Socket s){
        this.s = s;
    }

    private void openStreams(){
        try{
            dis = new DataInputStream(s.getInputStream());
            dos = new DataOutputStream(s.getOutputStream());
        } catch(Exception e){
            e.getMessage();
        }
    }


    @Override
    public void run(){
        openStreams();
        // LOGIC
        //LOGIC
        // LOGIC
    }
}


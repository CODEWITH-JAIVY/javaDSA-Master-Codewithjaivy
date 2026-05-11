import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(5000) ;
        System.out.println("server created ");
        Socket socket =  serverSocket.accept() ;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter printWriter  = new PrintWriter( socket.getOutputStream()) ;
          String message  = bufferedReader.readLine();
        System.out.println("clint say" + message);
        printWriter.print("Hello message reacved ");
        serverSocket.close();
        socket.close();

    }
}

import java.net.*;
import java.io.*;

public class Server {
    public static void main(String[] args) throws IOException, InterruptedIOException{
        int count = 0;
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("сервер запущен");
while(true) {
            Socket clientSoket = serverSocket.accept();
            System.out.println("клиент подключён: "+(++count));
            OutputStreamWriter writer = new OutputStreamWriter(clientSoket.getOutputStream());
            writer.write("HTTP/1.0 200 OK\n" + "Content-type: text/html\n" + "\n" + "<h1>f<h1/>");
            writer.flush();

            writer.close();
            clientSoket.close();
        }
       // serverSocket.close();
    }
}

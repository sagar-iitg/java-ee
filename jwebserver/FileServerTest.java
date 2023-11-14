import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;
import java.nio.file.Path;
import com.sun.net.httpserver.SimpleFileServer;


//minimum jdk18 required
public class FileServerTest{



    
    public static void main(String[] args)
    {

         Path path=Path.of("D:\\git-personal\\java-ee\\Jwebserver\\test_file");
        HttpServer server=SimpleFileServer.createFileServer(new InetSocketAddress(8000), path, SimpleFileServer.OutputLevel.VERBOSE);

        server.start();

          
    }
   


}
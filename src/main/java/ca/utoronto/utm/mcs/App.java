package ca.utoronto.utm.mcs;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsServer;
import io.github.cdimascio.dotenv.Dotenv;
import java.io.IOException;
import java.net.InetSocketAddress;

public class App
{
    static int port = 8080;

    public static void main(String[] args) throws IOException
    {
        // TODO Create Your Server Context Here, There Should Only Be One Context
        Server server;
        ServerComponent component = DaggerServerComponent.create();
        server = component.buildServer();
        server.run(port);
        System.out.printf("Server started on port %d\n", port);

        // This code is used to get the neo4j address, you must use this so that we can mark :)
        Dotenv dotenv = Dotenv.load();
        String addr = dotenv.get("NEO4J_ADDR");
        System.out.println(addr);


    }
}

package ca.utoronto.utm.mcs;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpsServer;
import dagger.Module;
import dagger.Provides;
import java.io.IOException;
import java.net.InetSocketAddress;

@Module
public class ServerModule {
    // TODO Complete This Module

  /**
   * This method provides(returns) the httpServer object that is to be
   * injected in the server object
   * @return the httpServer object that is to be injected
   */
  @Provides
  HttpServer provideHttpServer() {
    try {
      return HttpServer.create();
    }
    catch (IOException err){
      System.out.println(err);
    }
    return null;
  }
}

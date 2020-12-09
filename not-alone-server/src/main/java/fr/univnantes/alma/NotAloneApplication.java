package fr.univnantes.alma;

import fr.univnantes.alma.handler.GameServiceHandler;
import fr.univnantes.alma.thrift.GameService;
import org.apache.thrift.protocol.TBinaryProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.server.TServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan
public class NotAloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotAloneApplication.class, args);
    }

    @Bean
    public TProtocolFactory tProtocolFactory() {
        return new TBinaryProtocol.Factory();
    }

    @Bean
    public ServletRegistrationBean gameServer(TProtocolFactory protocolFactory, GameServiceHandler handler) {
        TServlet tServlet = new TServlet(new GameService.Processor<GameServiceHandler>(handler), protocolFactory);

        return new ServletRegistrationBean(tServlet, "/api");
    }
}

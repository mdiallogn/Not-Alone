package fr.univnantes.alma;

import fr.univnantes.alma.thrift.GameServerService;
import fr.univnantes.alma.thrift.JoinRequest;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.protocol.TProtocolFactory;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = NotAloneApplication.class)
class NotAloneApplicationTest {
    @Autowired
    protected TProtocolFactory protocolFactory;

    @LocalServerPort
    protected int port;

    protected GameServerService.Iface client;

    @BeforeEach
    public void setUp() throws Exception {
        TTransport transport = new THttpClient("http://localhost:" + port + "/api");

        TProtocol protocol = protocolFactory.getProtocol(transport);

        client = new GameServerService.Client(protocol);
    }

    @Test
    public void testCreateGame() throws TException {
        int id = client.createGame(4);

        assertThat(id).isGreaterThan(0);
    }

    @Test
    public void testJoinGame() throws TException, InterruptedException {
        int id = client.createGame(4);

        client.join(id, new JoinRequest("one"));
        client.join(id, new JoinRequest("two"));
        client.join(id, new JoinRequest("three"));
        client.join(id, new JoinRequest("four"));
        client.start(id);

        Thread.sleep(1000);
    }
}

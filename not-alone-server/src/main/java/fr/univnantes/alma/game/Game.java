package fr.univnantes.alma.game;

import fr.univnantes.alma.common.GameJoinRequest;
import org.atlanmod.commons.log.Log;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class Game {
    /**
     * Stores arriving registrations.
     */
    private final BlockingQueue<GameJoinRequest> requests;

    /**
     * Counter used to increment player identifications.
     */
    private final AtomicInteger idCounter = new AtomicInteger(0);

    private final AtomicInteger expectedPlayers;

    public Game(int expectedPlayers) {
        this.expectedPlayers = new AtomicInteger(expectedPlayers);
        this.requests = new ArrayBlockingQueue<GameJoinRequest>(expectedPlayers);
    }

    public int join(GameJoinRequest request) {
        int id = idCounter.getAndIncrement();
        requests.offer(request);
        return id;
    }

    public void start() {
        Thread t = new Thread(() -> {
            this.waitForPlayers();
            Log.info("We can start !");
        }
        );
        t.start();
    }

    private void waitForPlayers() {
        Log.info("Waiting for request. Expecting {0} players.", expectedPlayers);

        GameJoinRequest request;

        while (requests.size() < expectedPlayers.intValue()) {
            try {
                request = requests.take();
                this.handleRequest(request);
            } catch (InterruptedException e) {
                Log.error(e);
            }
        }
    }

    private void handleRequest(GameJoinRequest request) {
    }
}

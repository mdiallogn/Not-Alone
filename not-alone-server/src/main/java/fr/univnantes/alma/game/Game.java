package fr.univnantes.alma.game;

import fr.univnantes.alma.common.GameJoinRequest;
import fr.univnantes.alma.model.cards.Lieu;
import fr.univnantes.alma.model.cards.Survie;
import fr.univnantes.alma.model.players.Creature;
import fr.univnantes.alma.model.players.Player;
import fr.univnantes.alma.model.players.Tracked;
import fr.univnantes.alma.model.utlis.Phase;
import org.atlanmod.commons.log.Log;

import java.util.List;
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


    private Thread play;
    private Phase phase;

    List<Tracked> trackeds;
    Creature creature;
    List<Lieu> lieuCards;
    List<Survie> survies;



    public Game(int expectedPlayers) {
        this.expectedPlayers = new AtomicInteger(expectedPlayers);
        this.requests = new ArrayBlockingQueue<GameJoinRequest>(expectedPlayers);

        play = new Thread(() -> this.start());
        play.start();

        this.phase = Phase.ONE;
    }

    public  int join(GameJoinRequest request) {
        int id = idCounter.getAndIncrement();
        requests.offer(request);
        return id;
    }

    private void start() {
        this.waitForPlayers();
        Log.info("We can start !");

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

    private void   handleRequest(GameJoinRequest request) {
    }

    public void settingUp(){

    }

    public boolean gameOver(){
        return false;
    }

    public List<Player> getWinner(){
        return null;
    }

    public void init(){
        trackeds = InitData.createTrackedPlayers(6);
        creature = InitData.createCreature();
        lieuCards = InitData.generateLieucards(10);
        survies = InitData.generateSurvieCards(10);


    }
}

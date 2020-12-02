package fr.univnantes.alma.controller;

import fr.univnantes.alma.model.cards.Card;
import fr.univnantes.alma.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;


@RestController @CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class CardController {

    @Autowired
    private CardRepository cardRepository;

    @GetMapping("/cards")
    public List<Card> getAllCards(){
        return cardRepository.findAll();
    }

    @GetMapping("/cards/{id}")
    public ResponseEntity<Card> getCardById(@PathVariable(value = "id" ) UUID cardID) throws Exception{
        Card card = this.cardRepository.findById(cardID).orElseThrow(()-> new Exception("Card not found"));
        return ResponseEntity.ok().body(card);
    }

    @PostMapping("/cards")
    public Card createCard(@RequestBody Card card){
        return cardRepository.save(card);
    }


}

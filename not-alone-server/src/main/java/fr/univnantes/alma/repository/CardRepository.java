package fr.univnantes.alma.repository;

import fr.univnantes.alma.model.cards.Card;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CardRepository extends JpaRepository<Card, UUID> {

}

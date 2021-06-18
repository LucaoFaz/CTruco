package com.bueno.truco.domain.usecases.hand;

import com.bueno.truco.domain.entities.deck.Card;
import com.bueno.truco.domain.entities.player.Player;

import java.util.List;

public class PlayerMock extends Player {

    public PlayerMock(String id, List<Card> cards){
        super("Mock - " + id);
        setCards(cards);
    }

    @Override
    public Card playCard() {
        return cards.remove(0);
    }

    @Override
    public boolean requestTruco() {
        return false;
    }

    @Override
    public int getTrucoResponse(int newHandPoints) {
        return 0;
    }
}

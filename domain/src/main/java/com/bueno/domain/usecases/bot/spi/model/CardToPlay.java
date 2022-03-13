/*
 *  Copyright (C) 2021 Lucas B. R. de Oliveira - IFSP/SCL
 *  Contact: lucas <dot> oliveira <at> ifsp <dot> edu <dot> br
 *
 *  This file is part of CTruco (Truco game for didactic purpose).
 *
 *  CTruco is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  CTruco is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with CTruco.  If not, see <https://www.gnu.org/licenses/>
 */

package com.bueno.domain.usecases.bot.spi.model;


public final class CardToPlay {
    private final TrucoCard content;
    private final boolean discard;

    private CardToPlay(TrucoCard card, boolean discard) {
        this.content = card;
        this.discard = discard;
    }
    public static CardToPlay of(TrucoCard card){
        return new CardToPlay(card, false);
    }

    public static CardToPlay ofDiscard(TrucoCard card){
        return new CardToPlay(card, true);
    }

    public TrucoCard value() {
        return discard ? TrucoCard.closed() : content;
    }

    public TrucoCard content() {
        return content;
    }

    public boolean isDiscard() {
        return discard;
    }
}
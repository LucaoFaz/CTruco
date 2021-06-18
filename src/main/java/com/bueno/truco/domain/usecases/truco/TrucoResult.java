package com.bueno.truco.domain.usecases.truco;

import com.bueno.truco.domain.entities.player.Player;

import java.util.Objects;
import java.util.Optional;

public class TrucoResult {
    private final int points;
    private final Player winner;

    public TrucoResult(int points) {
        this(points, null);
    }

    public TrucoResult(int points, Player winner) {
        this.points = points;
        this.winner = winner;
    }

    public int getPoints() {
        return points;
    }

    public Optional<Player> getWinner() {
        return Optional.ofNullable(winner);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TrucoResult that = (TrucoResult) o;
        return points == that.points && Objects.equals(winner, that.winner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(points, winner);
    }

    @Override
    public String toString() {
        return "Points=" + points + ", winner=" + (winner != null? winner : "No winner");
    }
}

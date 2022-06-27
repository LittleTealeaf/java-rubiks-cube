package simulator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RubiksCube {

    private final Map<Piece, Point> state;

    public RubiksCube() {
        state = new HashMap<>();
        Stream.of(Piece.values()).parallel().forEach(piece -> state.put(piece, piece.point()));
    }
    public void move(Move... moves) {
        Arrays.stream(moves).forEach(move -> {
            state.keySet().parallelStream().forEach(piece -> {
                state.compute(piece, (piece1, point) -> move.apply(point));
            });
        });
    }

    @Override
    public String toString() {
        return state.toString();
    }
}

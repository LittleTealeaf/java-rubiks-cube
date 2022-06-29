package simulator;

import java.util.Set;
import java.util.stream.Collectors;

public class RubiksCube {

    private static final Set<Point> PIECES = Set.of(Point.W, Point.WB, Point.WG, Point.WO, Point.WR, Point.WRB, Point.WRG, Point.WOB, Point.WOG, Point.Y, Point.YB, Point.YG,
                                                    Point.YO, Point.YR, Point.YRB, Point.YRG, Point.YOB, Point.YOG, Point.G, Point.O, Point.R, Point.B, Point.RG, Point.RB,
                                                    Point.OB, Point.OG
                                                   );

    private final Set<Piece> pieces = PIECES.parallelStream().map(Piece::new).collect(Collectors.toSet());


    public RubiksCube() {}

    @Override
    public String toString() {
        return pieces.stream().map(Piece::toString).collect(Collectors.joining(" "));
    }

    public void move(Move... moves) {
        for(Move move : moves) {
            pieces.forEach(move::apply);
        }
    }
}

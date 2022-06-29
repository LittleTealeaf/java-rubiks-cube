package simulator;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Stream;

public enum Move {
    R(new Point[][]{
            {
                    Point.WOB, Point.OYB, Point.YRB, Point.RWB
            }, {
                    Point.WB, Point.OB, Point.YB, Point.RB
            }, {
                    Point.BW, Point.BO, Point.BY, Point.BR
            }, {
                    Point.WRB, Point.OWB, Point.YOB, Point.RYB
            }, {
                    Point.BWR, Point.BWO, Point.BYO, Point.BYR
            }
    }),
    R2(R, Transform.TWO),
    RP(R, Transform.PRIME),
    U(new Point[][]{
            {
                    Point.WG, Point.RG, Point.YG, Point.OG
            }, {
                    Point.GW, Point.GR, Point.GY, Point.GO
            }, {
                    Point.WRG, Point.RYG, Point.YOG, Point.OWG
            }, {
                    Point.OYG, Point.WOG, Point.RWG, Point.YRG
            }, {
                    Point.GYR, Point.GYO, Point.GWO, Point.GWR
            }
    }),
    U2(U, Transform.TWO),
    UP(U, Transform.PRIME),
    L(new Point[][]{
            {
                    Point.WG, Point.RG, Point.YG, Point.OG
            }, {
                    Point.GW, Point.GR, Point.GY, Point.GO
            }, {
                    Point.WOG, Point.RWG, Point.YRG, Point.OYG
            }, {
                    Point.OWG, Point.WRG, Point.RYG, Point.YOG
            }, {
                    Point.GWR, Point.GYR, Point.GYO, Point.GWO
            }
    }),
    L2(L, Transform.TWO),
    LP(L, Transform.PRIME),
    D,
    D2(D, Transform.TWO),
    DP(D, Transform.PRIME),
    B,
    B2(B, Transform.TWO),
    BP(B, Transform.PRIME),
    F,
    F2(F, Transform.TWO),
    FP(F, Transform.PRIME);

    private final Point[][] permutations;

    Move(Move move, Transform transform) {
        this.permutations = switch (transform) {
            case PRIME -> (Arrays.stream(move.permutations)).map((perm) -> {
                Point[] a = new Point[perm.length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = perm[perm.length - 1 - i];
                }
                return a;
            }).toList().toArray(new Point[0][]);
            case TWO -> Arrays.stream(move.permutations).flatMap((perm) -> {
                Point[][] a = new Point[2][perm.length];
                for (int i = 0; i < perm.length; i++) {
                    a[i % 2][i / 2] = perm[i];
                }
                return Stream.of(a[0], a[1]);
            }).toList().toArray(new Point[0][]);
        };
    }

    Move(Point[]... permutations) {
        this.permutations = permutations;
    }

    public void apply(Piece piece) {
        for (Point[] permutation : permutations) {
            for (int i = 0; i < permutation.length; i++) {
                if (permutation[i] == piece.getLocation()) {
                    piece.setLocation(permutation[(i + 1) % permutation.length]);
                    return;
                }
            }
        }
    }

    private enum Transform {
        PRIME,
        TWO;
    }
}

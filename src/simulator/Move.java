package simulator;

import java.util.Arrays;
import java.util.stream.Stream;

public enum Move {
    R(new Point[][]{
            {
                Point.WOB,Point.OYB,Point.YRB,Point.RWB
            }
    }),
    R2(R,Transform.TWO),
    RP(R,Transform.PRIME),
    U,
    U2(U,Transform.TWO),
    UP(U,Transform.PRIME),
    L,
    L2(L,Transform.TWO),
    LP(L,Transform.PRIME),
    D,
    D2(D,Transform.TWO),
    DP(D,Transform.PRIME),
    B,
    B2(B,Transform.TWO),
    BP(B,Transform.PRIME),
    F,
    F2(F,Transform.TWO),
    FP(F,Transform.PRIME);

    private final Point[][] permutations;

    Move(Move move, Transform transform) {
//        this.permutations = switch (transform) {
//            case PRIME -> Arrays.stream(move.permutations).parallel().map(perm -> {
//                Point[] a = new Point[perm.length];
//                for (int i = 0; i < a.length; i++) {
//                    a[i] = perm[perm.length - 1 - i];
//                }
//                return a;
//            }).toList().toArray(new Point[0][]);
//            case TWO -> Arrays.stream(move.permutations).parallel().flatMap(perm -> {
//                Point[][] a = new Point[2][perm.length / 2];
//                for (int i = 0; i < perm.length; i++) {
//                    a[i % 2][i / 2] = perm[i];
//                }
//                return Stream.of(a);
//            }).toList().toArray(new Point[0][]);
//        };
        this.permutations = Arrays.stream(move.permutations).parallel().flatMap(switch(transform) {
            case PRIME -> (perm) -> {
                Point[] a = new Point[perm.length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = perm[perm.length - 1 - i];
                }
                return Stream.of(new Point[][] {a});
            };
            case TWO -> (perm) -> {
                Point[][] a = new Point[2][perm.length];
                for(int i = 0; i < perm.length; i++) {
                    a[i%2][i/2] = perm[i];
                }
                return Stream.of(a);
            };
        }).toList().toArray(new Point[0][]);
    }

    Move(Point[]... permutations) {
        this.permutations = permutations;
    }

    private enum Transform {
        PRIME,
        TWO;
    }
}

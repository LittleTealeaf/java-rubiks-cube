package simulator;

import java.time.Period;
import java.util.stream.Stream;

public enum Move {
    R(MovePermutation.R),
    RP(MovePermutation.R, true),
    U(MovePermutation.U),
    UP(MovePermutation.U, true),
    L(MovePermutation.L),
    LP(MovePermutation.L, true),
    B(MovePermutation.B),
    BP(MovePermutation.B, true),
    D(MovePermutation.D),
    DP(MovePermutation.D, true),
    F(MovePermutation.F),
    FP(MovePermutation.F, true),
    X(MovePermutation.X),
    XP(MovePermutation.X,true),
    Y(MovePermutation.Y),
    YP(MovePermutation.Y,true),
    Z(MovePermutation.Z),
    ZP(MovePermutation.Z,true);

    //    private final MovePermutation permutation;
    private final Point[][] perms;
    private final boolean isReverse;

    Move(MovePermutation permutation) {
        this(permutation, false);
    }

    Move(MovePermutation permutation, boolean isReverse) {
        this.perms = permutation.getPermutations();
        this.isReverse = isReverse;
    }

    public Point apply(Point point) {
        for (Point[] perm : perms) {
            for (int j = 0; j < perm.length; j++) {
                if (perm[j] == point) {
                    if (isReverse) {
                        if (j == 0) {
                            return perm[perm.length - 1];
                        } else {
                            return perm[j - 1];
                        }
                    } else {
                        return perm[(j + 1) % perm.length];
                    }
                }
            }
        }

        return point;
    }
}

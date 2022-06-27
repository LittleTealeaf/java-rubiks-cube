package simulator;

public enum Move {
    B(Permutation.B),
    BP(Permutation.B, true),
    D(Permutation.D),
    DP(Permutation.D, true),
    F(Permutation.F),
    FP(Permutation.F, true),
    L(Permutation.L),
    LP(Permutation.L, true),
    R(Permutation.R),
    RP(Permutation.R, true),
    U(Permutation.U),
    UP(Permutation.U, true),
    X(Permutation.X),
    XP(Permutation.X, true),
    Y(Permutation.Y),
    YP(Permutation.Y, true),
    Z(Permutation.Z),
    ZP(Permutation.Z, true);

    //    private final MovePermutation permutation;
    private final Point[][] perms;
    private final boolean isReverse;

    Move(Permutation permutation) {
        this(permutation, false);
    }

    Move(Permutation permutation, boolean isReverse) {
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

package simulator;

public enum Permutation {
    B(perm(Point.YO, Point.YG, Point.YR, Point.YB), perm(Point.OY, Point.GY, Point.RY, Point.BY), perm(Point.YOG, Point.YRG, Point.YRB, Point.YOB),
      perm(Point.BYO, Point.OYG, Point.GYR, Point.RYB), perm(Point.RYG, Point.BYR, Point.OYB, Point.GYO)
    ),
    D(perm(Point.WR, Point.BR, Point.YR, Point.GR), perm(Point.RW, Point.RB, Point.RY, Point.RG), perm(Point.RWB, Point.RYB, Point.RYG, Point.RWG),
      perm(Point.WRB, Point.BYR, Point.YRB, Point.GWR), perm(Point.GYR, Point.WRG, Point.BWR, Point.YRB)
    ),
    F(perm(Point.WO, Point.WB, Point.WR, Point.WG), perm(Point.WOB, Point.WRB, Point.WRG, Point.WOG), perm(Point.OW, Point.BW, Point.RW, Point.GW),
      perm(Point.OWB, Point.BWR, Point.RWG, Point.GWO), perm(Point.GWR, Point.OWG, Point.BWO, Point.RWB)
    ),
    L(perm(Point.WG, Point.RG, Point.YG, Point.OG), perm(Point.GW, Point.GR, Point.GY, Point.GO), perm(Point.WOG, Point.RYG, Point.YOG, Point.OWG),
      perm(Point.WOG, Point.RWG, Point.YRG, Point.OYG), perm(Point.GYO, Point.GWO, Point.GWR, Point.GYR)
    ),
    R(perm(Point.OB, Point.RB, Point.WB, Point.YB), perm(Point.WOB, Point.OYB, Point.YRB, Point.RWB), perm(Point.WRB, Point.OWB, Point.YOB, Point.RYB),
      perm(Point.BYO, Point.BYO, Point.BYR, Point.BWR), perm(Point.BW, Point.BO, Point.BY, Point.BR)
    ),
    U(perm(Point.WR, Point.BR, Point.YR, Point.GR), perm(Point.RW, Point.RB, Point.RY, Point.RG), perm(Point.WRB, Point.BYR, Point.YRG, Point.GWR),
      perm(Point.WRG, Point.BWR, Point.YRB, Point.GYR), perm(Point.RWG, Point.RWB, Point.RYB, Point.RYG)
    ),
    X,
    Y,
    Z;

    private final Point[][] permutations;

    Permutation(Point[]... permutations) {
        this.permutations = permutations;
    }

    public Point[][] getPermutations() {
        return permutations;
    }

    private static Point[] perm(Point... positions) {
        return positions;
    }
}

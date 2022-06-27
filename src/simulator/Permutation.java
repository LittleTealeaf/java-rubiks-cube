package simulator;

public enum Permutation {
    B(new Point[][]{
            {
                    Point.YO, Point.YG, Point.YR, Point.YB
            }, {
                    Point.OY, Point.GY, Point.RY, Point.BY
            }, {
                    Point.YOG, Point.YRG, Point.YRB, Point.YOB
            }, {
                    Point.BYO, Point.OYG, Point.GYR, Point.RYB
            }, {
                    Point.RYG, Point.BYR, Point.OYB, Point.GYO
            }
    }),
    D(perm(Point.WR, Point.BR, Point.YR, Point.GR), perm(Point.RW, Point.RB, Point.RY, Point.RG), perm(Point.RWB, Point.RYB, Point.RYG, Point.RWG),
      perm(Point.WRB, Point.BYR, Point.YRB, Point.GWR), perm(Point.GYR, Point.WRG, Point.BWR, Point.YRB)
    ),
    F(perm(Point.WO, Point.WB, Point.WR, Point.WG), perm(Point.WOB, Point.WRB, Point.WRG, Point.WOG), perm(Point.OW, Point.BW, Point.RW, Point.GW),
      perm(Point.OWB, Point.BWR, Point.RWG, Point.GWO), perm(Point.GWR, Point.OWG, Point.BWO, Point.RWB)
    ),
    L(perm(Point.WG, Point.RG, Point.YG, Point.OG), perm(Point.GW, Point.GR, Point.GY, Point.GO), perm(Point.WOG, Point.RYG, Point.YOG, Point.OWG),
      perm(Point.WOG, Point.RWG, Point.YRG, Point.OYG), perm(Point.GYO, Point.GWO, Point.GWR, Point.GYR)
    ),
    R(perm(Point.OB, Point.YB, Point.RB, Point.WB), perm(Point.WOB, Point.OYB, Point.YRB, Point.RWB), perm(Point.WRB, Point.OWB, Point.YOB, Point.RYB),
      perm(Point.BYO, Point.BYR, Point.BWR, Point.BWO), perm(Point.BW, Point.BO, Point.BY, Point.BR)
    ),
    U(perm(Point.WO, Point.BO, Point.YO, Point.GO), perm(Point.OW, Point.OB, Point.OY, Point.OG), perm(Point.WOB, Point.BYO, Point.YOG, Point.GWO),
      perm(Point.WOG, Point.BWO, Point.YOB, Point.GYO), perm(Point.OWG, Point.OWB, Point.OYB, Point.OYG)
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

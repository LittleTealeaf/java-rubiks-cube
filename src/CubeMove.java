public enum CubeMove {
    R(new int[] {8,20,53,38}),
    R2,
    RP,
    U,
    U2,
    UP,
    L,
    L2,
    LP,
    B,
    B2,
    BP,
    F,
    F2,
    FP,
    D,
    D2,
    DP,
    X,
    X2,
    XP,
    Y,
    Y2,
    YP,
    Z,
    Z2,
    ZP;


    private final int[][] rotation;

    CubeMove(int[]... rotation) {
        this.rotation = rotation;
    }
}

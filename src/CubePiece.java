public enum CubePiece {
    B(Type.CENTER,28),
    G(Type.CENTER,22),
    O(Type.CENTER,31),
    OB(Type.EDGE,30),
    OG(Type.EDGE,32),
    R(Type.CENTER,25),
    RB(Type.EDGE,26),
    RG(Type.EDGE,24),
    W(Type.CENTER, 4),
    WB(Type.EDGE, 5),
    WG(Type.EDGE, 3),
    WO(Type.EDGE, 1),
    WOB(Type.CORNER, 2),
    WOG(Type.CORNER, 0),
    WR(Type.EDGE,7),
    WRB(Type.CORNER,8),
    WRG(Type.CORNER,6),
    Y(Type.CENTER,49),
    YB(Type.EDGE,50),
    YG(Type.EDGE,48),
    YO(Type.EDGE,52),
    YOB(Type.CORNER,53),
    YOG(Type.CORNER,51),
    YR(Type.EDGE,46),
    YRB(Type.CORNER,47),
    YRG(Type.CORNER,45);

    private Type t;
    private final int p;

    CubePiece(Type t, int pos) {
        this.t = t;
        this.p = pos;
    }

    public Type type() {
        return t;
    }

    public int position() {
        return p;
    }

    public enum Type {
        CENTER,
        EDGE,
        CORNER;
    }
}

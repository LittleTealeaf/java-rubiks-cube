package simulator;

/**
 * List of cube positions, their type, and their location
 */
public enum Point {
    B(PieceType.CENTER),
    BO(PieceType.EDGE),
    BR(PieceType.EDGE),
    BW(PieceType.EDGE),
    BWO(PieceType.CORNER),
    BWR(PieceType.CORNER),
    BY(PieceType.EDGE),
    BYO(PieceType.CORNER),
    BYR(PieceType.CORNER),
    G(PieceType.CENTER),
    GO(PieceType.EDGE),
    GR(PieceType.EDGE),
    GW(PieceType.EDGE),
    GWO(PieceType.CORNER),
    GWR(PieceType.CORNER),
    GY(PieceType.EDGE),
    GYO(PieceType.CORNER),
    GYR(PieceType.CORNER),
    O(PieceType.CENTER),
    OB(PieceType.EDGE),
    OG(PieceType.EDGE),
    OW(PieceType.EDGE),
    OWB(PieceType.CORNER),
    OWG(PieceType.CORNER),
    OY(PieceType.EDGE),
    OYB(PieceType.CORNER),
    OYG(PieceType.CORNER),
    R(PieceType.CENTER),
    RB(PieceType.EDGE),
    RG(PieceType.EDGE),
    RW(PieceType.EDGE),
    RWB(PieceType.CORNER),
    RWG(PieceType.CORNER),
    RY(PieceType.EDGE),
    RYB(PieceType.CORNER),
    RYG(PieceType.CORNER),
    W(PieceType.CENTER),
    WB(PieceType.EDGE),
    WG(PieceType.EDGE),
    WO(PieceType.EDGE),
    WOB(PieceType.CORNER),
    WOG(PieceType.CORNER),
    WR(PieceType.EDGE),
    WRB(PieceType.CORNER),
    WRG(PieceType.CORNER),
    Y(PieceType.CENTER),
    YB(PieceType.EDGE),
    YG(PieceType.EDGE),
    YO(PieceType.EDGE),
    YOB(PieceType.CORNER),
    YOG(PieceType.CORNER),
    YR(PieceType.EDGE),
    YRB(PieceType.CORNER),
    YRG(PieceType.CORNER);

    private final PieceType pieceType;


    Point(PieceType pieceType) {
        this.pieceType = pieceType;
    }



    public PieceType getPieceType() {
        return pieceType;
    }
}

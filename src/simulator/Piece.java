package simulator;

/**
 * Piece Heirarchy:
 *
 * W > Y > R > O > B > G
 *
 * W = 0-8, Y = 9-17, R = 18-26, O = 27-35, B = 36-44, G = 45-53
 *
 * Order goes like this:
 * n = center
 * n+1, n+2, n+3, n+4 = most to least significant edge
 * n+5, n+6, n+7, n+8 = most to least significant corner
 */
public enum Piece {
    B(PieceType.CENTER, 36),
    G(PieceType.CENTER, 45),
    O(PieceType.CENTER, 27),
    OB(PieceType.EDGE, 28),
    OG(PieceType.EDGE, 29),
    R(PieceType.CENTER, 18),
    RB(PieceType.EDGE, 19),
    RG(PieceType.EDGE, 20),
    W(PieceType.CENTER, 0),
    WB(PieceType.EDGE, 3),
    WG(PieceType.EDGE, 4),
    WO(PieceType.EDGE, 2),
    WOB(PieceType.CORNER, 7),
    WOG(PieceType.CORNER, 8),
    WR(PieceType.EDGE, 1),
    WRB(PieceType.CORNER, 5),
    WRG(PieceType.CORNER, 6),
    Y(PieceType.CENTER, 9),
    YB(PieceType.EDGE, 12),
    YG(PieceType.EDGE, 13),
    YO(PieceType.EDGE, 11),
    YOB(PieceType.CORNER, 16),
    YOG(PieceType.CORNER, 17),
    YR(PieceType.EDGE, 10),
    YRB(PieceType.CORNER, 14),
    YRG(PieceType.CORNER, 15),
    ;

    private final PieceType mPieceType;
    private final int mDefaultPosition;

    Piece(PieceType pieceType, int pos) {
        this.mPieceType = pieceType;
        this.mDefaultPosition = pos;
    }

    public PieceType getPieceType() {
        return mPieceType;
    }

    public int getDefaultPosition() {
        return mDefaultPosition;
    }

    public static PieceType getPieceType(Piece piece) {
        return piece.getPieceType();
    }

    public static int getDefaultPosition(Piece piece) {
        return piece.getDefaultPosition();
    }
}

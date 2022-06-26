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
    WRB(Point.WRB),
    WRG(Point.WRG),
    WOB(Point.WOB),
    WOG(Point.WOG),
    WB(Point.WB),
    WO(Point.WO),
    WG(Point.WG),
    WR(Point.WR),
    W(Point.W),
    YRB(Point.YRB),
    YRG(Point.YRG),
    //FINISH
    ;

    private Point point;

    Piece(Point point) {
        this.point = point;
    }


}

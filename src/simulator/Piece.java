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
    YOB(Point.YRB),
    YOG(Point.YOG),
    YB(Point.YB),
    YO(Point.YO),
    YG(Point.YG),
    YR(Point.YR),
    Y(Point.Y),
    O(Point.O),
    OG(Point.OG),
    G(Point.G),
    RG(Point.RG),
    R(Point.R),
    RB(Point.RB),
    B(Point.B),
    OB(Point.OB),
    ;

    private Point point;

    Piece(Point point) {
        this.point = point;
    }


}

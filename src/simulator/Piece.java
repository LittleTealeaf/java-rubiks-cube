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
    B(Point.B),
    G(Point.G),
    O(Point.O),
    OB(Point.OB),
    OG(Point.OG),
    R(Point.R),
    RB(Point.RB),
    RG(Point.RG),
    W(Point.W),
    WB(Point.WB),
    WG(Point.WG),
    WO(Point.WO),
    WOB(Point.WOB),
    WOG(Point.WOG),
    WR(Point.WR),
    WRB(Point.WRB),
    WRG(Point.WRG),
    Y(Point.Y),
    YB(Point.YB),
    YG(Point.YG),
    YO(Point.YO),
    YOB(Point.YOB),
    YOG(Point.YOG),
    YR(Point.YR),
    YRB(Point.YRB),
    YRG(Point.YRG)
    ;

    private Point point;

    Piece(Point point) {
        this.point = point;
    }

    public Point point() {
        return point;
    }
}

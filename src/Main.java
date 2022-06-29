import simulator.Move;
import simulator.RubiksCube;

public class Main {

    public static void main(String[] args) {
        RubiksCube rubiksCube = new RubiksCube();
        rubiksCube.move(Move.R);
        System.out.println(rubiksCube);
        rubiksCube.move(Move.RP);
        System.out.println(rubiksCube);
    }
}
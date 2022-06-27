import simulator.Move;
import simulator.RubiksCube;

public class Main {

    public static void main(String[] args) {
        RubiksCube rubiksCube = new RubiksCube();
        rubiksCube.move(Move.R,Move.U,Move.RP,Move.UP);

        System.out.println(rubiksCube.toString());

    }
}
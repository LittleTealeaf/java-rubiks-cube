import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;



/**
 * Integer locations are as follows:
 * <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/9/9d/Rubik%27s_cube_colors.svg/220px-Rubik%27s_cube_colors.svg.png"/>
 * Starting at 0, going from the top row (left to right) (skipping empty spaces)
 *
 * Color Heirarchy
 * W > Y > R > O > B > G
 */
public class RubikCube {

    public Map<CubePiece,Integer> state;

    public RubikCube() {
        this.state = new HashMap<>();
        Arrays.stream(CubePiece.values()).forEach(i -> state.put(i,i.position()));
//        Default State

    }
}

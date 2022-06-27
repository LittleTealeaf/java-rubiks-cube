package simulator;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum Permutation {
    R(new Point[][]{
            {

            }
    }),
    U,
    L,
    D,
    B,
    F;

    private final Point[][] permutations;

    Permutation(Permutation permutation, Transform transform) {
        this.permutations = switch (transform) {
            case PRIME -> Arrays.stream(permutation.permutations).parallel().map(perm -> {
                Point[] a = new Point[perm.length];
                for (int i = 0; i < a.length; i++) {
                    a[i] = perm[perm.length - 1 - i];
                }
                return a;
            }).toList().toArray(new Point[0][]);
            case TWO -> Arrays.stream(permutation.permutations).parallel().flatMap(perm -> {
                Point[][] a = new Point[2][perm.length / 2];
                for (int i = 0; i < perm.length; i++) {
                    a[i % 2][i / 2] = perm[i];
                }
                return Stream.of(a);
            }).toList().toArray(new Point[0][]);
        };
    }

    Permutation(Point[]... permutations) {
        this.permutations = permutations;
    }

    private enum Transform {
        PRIME,
        TWO;
    }
}

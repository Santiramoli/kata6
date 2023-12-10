package test;

import software.ulpgc.kata6.GameOfLife;

import static org.assertj.core.api.Assertions.assertThat;
import static test.test.Cases.*;


public class test {

    @org.junit.Test
    public void should_return_empty_board_given_3x3_empty_board() {
        assertThat(new GameOfLife(empty3x3).next().toString()).isEqualTo(empty3x3);
    }

    @org.junit.Test
    public void should_return_empty_board_given_3x3_board_with_one_alive_cell() {
        assertThat(new GameOfLife(oneAliveCell3x3).next().toString()).isEqualTo(empty3x3);
    }

    @org.junit.Test
    public void should_return_empty_board_given_4x4_board_with_one_alive_cell() {
        assertThat(new GameOfLife(oneAliveCell4x4).next().toString()).isEqualTo(empty4x4);
    }

    @org.junit.Test
    public void should_return_a_board_with_square_live_cell_3x3_given_square_live_cell_3x3() {
        assertThat(new GameOfLife(squareLiveCell3x3).next().toString()).isEqualTo(squareLiveCell3x3);
    }

    @org.junit.Test
    public void should_return_a_board_with_square_live_cell_3x3_given_triangle_live_cell_3x3() {
        assertThat(new GameOfLife(triangleLiveCell3x3).next().toString()).isEqualTo(squareLiveCell3x3);
    }

    @org.junit.Test
    public void should_return_a_board_with_four_live_cell_4x4_given_triangle_live_cell_4x4(){
        assertThat(new GameOfLife(threeAliveCell4x4).next().toString()).isEqualTo(fourAliveCell4x4);
    }

    public static class Cases {
        static final String empty3x3 = """
                ...
                ...
                ...
                """;
        static final String oneAliveCell3x3 = """
            ...
            ..X
            ...
            """;

        static final String squareLiveCell3x3 = """
            .XX
            .XX
            ...
            """;

        static final String triangleLiveCell3x3 = """
            .X.
            .XX
            ...
            """;

        static final String empty4x4 = """
                ....
                ....
                ....
                ....
                """;

        static final String oneAliveCell4x4 = """
            ....
            ..X.
            ....
            ....
            """;


        static final String threeAliveCell4x4 = """
                ....
                ..XX
                ..X.
                ....
                """;
        static final String fourAliveCell4x4 = """
                ....
                ..XX
                ..XX
                ....
                """;
    }

}


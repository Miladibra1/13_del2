import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class test {
    @Test
    void testBoard() {
        Board board = new Board();
        int res = board.getFelt(2);
        assertTrue(res == 250);

        res = board.getFelt(3);
        assertTrue(res == -100);

        res = board.getFelt(4);
        assertTrue(res == 100);

        res = board.getFelt(5);
        assertTrue(res == -20);

        res = board.getFelt(6);
        assertTrue(res == 180);

        res = board.getFelt(7);
        assertTrue(res == 0 );

        res = board.getFelt(8);
        assertTrue(res == -70);

        res = board.getFelt(9);
        assertTrue(res == 60);

        res = board.getFelt(10);
        assertTrue(res == -80);

        res = board.getFelt(11);
        assertTrue(res == -50);

        res = board.getFelt(12);
        assertTrue(res == 650);
    }
}

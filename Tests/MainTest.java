import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void squareTest() {
        assertEquals(25,Main.Square(5));
    }

    @Test
    void countATest() {
        assertEquals(2, Main.countA("alphabet"));
    }

    @Test
    void petRockTest() {
        assertEquals("Rocky", Main.PetRock(3));
    }
}
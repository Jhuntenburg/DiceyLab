import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    @org.junit.jupiter.api.Test
    void constructorTest() {
        //Given
        Dice player = new Dice(3);
        //When
        int expected = 3;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }
    @org.junit.jupiter.api.Test
    void tossAndSum() {
        //given
        Dice player = new Dice(2);

        //When

        //Then
        assertNotNull(player.tossAndSum());
    }


    @org.junit.jupiter.api.Test
    void getNumOfDiceThrown() {
        //Given
        Dice player = new Dice(42);
        //When
        int expected = 42;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }

    @org.junit.jupiter.api.Test
    void setNumOfDiceThrown() {
        //Given
        Dice player = new Dice(42);
        //When
        int expected = 42;
        int numOfDiceThrown = player.getNumOfDiceThrown();
        //Then
        assertEquals(expected, numOfDiceThrown);
    }
}
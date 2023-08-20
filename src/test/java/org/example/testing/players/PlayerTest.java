package org.example.testing.players;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.*;


@RunWith(MockitoJUnitRunner.class)
public class PlayerTest {

    @Mock
    private Dice dice2;
    @InjectMocks
    Player player2 ;

    @Test
    public void win() {

        Mockito.when(dice2.roll()).thenReturn(4);
        assertEquals(true, player2.play());
    }

    @Test
    public void lose() {

        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(2);
        Player plr = new Player(dice,2);
        assertEquals(false, plr.play());

    }
}
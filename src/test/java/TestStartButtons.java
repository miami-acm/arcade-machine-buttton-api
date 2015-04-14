import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestStartButtons {
	@Test
	public void testS() {
		char key = 's';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isStartButton(key));

		assertFalse(Buttons.isPlayer2Button(key));
		assertFalse(Buttons.isAnyButton(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testJ() {
		char key = 'j';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isStartButton(key));

		assertFalse(Buttons.isPlayer2Button(key));
		assertFalse(Buttons.isAnyButton(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}
}

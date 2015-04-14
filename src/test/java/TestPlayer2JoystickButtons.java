import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestPlayer2JoystickButtons {
	@Test
	public void testY() {
		char key = 'y';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testU() {
		char key = 'u';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testI() {
		char key = 'i';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testK() {
		char key = 'k';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testH() {
		char key = 'h';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testN() {
		char key = 'n';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testM() {
		char key = 'm';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testComma() {
		char key = ',';

		assertTrue(Buttons.isPlayer2Joystick(key));
		assertTrue(Buttons.isPlayer2Key(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestPlayer1JoystickButtons {
	@Test
	public void testQ() {
		char key = 'q';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testW() {
		char key = 'w';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testE() {
		char key = 'e';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testA() {
		char key = 'a';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testD() {
		char key = 'd';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testZ() {
		char key = 'z';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testX() {
		char key = 'x';

		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isAnyButton(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testC() {
		char key = 'c';

		assertTrue(Buttons.isPlayer1Joystick(key));
		assertTrue(Buttons.isPlayer1Key(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isJoystick(key));
		assertTrue(Buttons.isAnyKey(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestPlayer1Buttons {
	@Test
	public void testR() {
		char key = 'r';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testT() {
		char key = 't';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testF() {
		char key = 'f';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testG() {
		char key = 'g';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testV() {
		char key = 'v';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}

	@Test
	public void testB() {
		char key = 'b';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer1Button(key));
		assertTrue(Buttons.isPlayer1Key(key));

		assertFalse(Buttons.isPlayer2Joystick(key));
		assertFalse(Buttons.isPlayer2Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer2Button(key));
	}
}

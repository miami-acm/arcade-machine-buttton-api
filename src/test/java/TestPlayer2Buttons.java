import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestPlayer2Buttons {
	@Test
	public void testO() {
		char key = 'o';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testP() {
		char key = 'p';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testL() {
		char key = 'l';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testSemicolon() {
		char key = ';';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testPeriod() {
		char key = '.';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}

	@Test
	public void testSlash() {
		char key = '/';

		assertTrue(Buttons.isAnyKey(key));
		assertTrue(Buttons.isAnyButton(key));
		assertTrue(Buttons.isPlayer2Button(key));
		assertTrue(Buttons.isPlayer2Key(key));

		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isPlayer1Key(key));
		assertFalse(Buttons.isJoystick(key));
		assertFalse(Buttons.isPlayer1Joystick(key));
		assertFalse(Buttons.isStartButton(key));
		assertFalse(Buttons.isPlayer1Button(key));
	}
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestNotKeys {
	@Test
	public void testNotButtons() {
		char[] keys = {'`', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
			'-', '=', '[', ']', '\\', '\''};

		for (char key : keys) {
			assertFalse(Buttons.isJoystick(key));
			assertFalse(Buttons.isAnyKey(key));
			assertFalse(Buttons.isPlayer1Key(key));
			assertFalse(Buttons.isPlayer1Joystick(key));
			assertFalse(Buttons.isAnyButton(key));
			assertFalse(Buttons.isPlayer2Joystick(key));
			assertFalse(Buttons.isPlayer2Key(key));
			assertFalse(Buttons.isStartButton(key));
			assertFalse(Buttons.isPlayer1Button(key));
			assertFalse(Buttons.isPlayer2Button(key));
		}
	}
}

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestNotKeys {
	@Test
	public void testNotButtons() {
		String keys = "`1234567890-=[]\\'ynizqec,~!@#$%^&*()_+{}|:YNIZQEC<>?\"";
		String error = " should not be a valid key, but it is.";

		for (char key : keys.toCharArray()) {
			assertFalse(key + error, Buttons.isJoystick(key));
			assertFalse(key + error, Buttons.isAnyKey(key));
			assertFalse(key + error, Buttons.isPlayer1Key(key));
			assertFalse(key + error, Buttons.isPlayer1Joystick(key));
			assertFalse(key + error, Buttons.isAnyButton(key));
			assertFalse(key + error, Buttons.isPlayer2Joystick(key));
			assertFalse(key + error, Buttons.isPlayer2Key(key));
			assertFalse(key + error, Buttons.isStartButton(key));
			assertFalse(key + error, Buttons.isPlayer1Button(key));
			assertFalse(key + error, Buttons.isPlayer2Button(key));
		}
	}
}

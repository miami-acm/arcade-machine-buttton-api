import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;

public class TestNotKeys {
	@Test
	public void testNotButtons() {
		String keys = "`1234567890-=[]\\\'";

		for (char key : keys.toCharArray()) {
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

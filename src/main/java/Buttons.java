import java.util.HashSet;

public class Buttons {
	public static final int API_VERSION = 1;

	public static final char PLAYER_1_START = 's';
	public static final char PLAYER_1_JOYSTICK_UP = 'w';
	public static final char PLAYER_1_JOYSTICK_UP_RIGHT = 'e';
	public static final char PLAYER_1_JOYSTICK_RIGHT = 'd';
	public static final char PLAYER_1_JOYSTICK_DOWN_RIGHT = 'c';
	public static final char PLAYER_1_JOYSTICK_DOWN = 'x';
	public static final char PLAYER_1_JOYSTICK_DOWN_LEFT = 'z';
	public static final char PLAYER_1_JOYSTICK_LEFT = 'a';
	public static final char PLAYER_1_JOYSTICK_UP_LEFT = 'q';
	public static final char PLAYER_1_BUTTON_1 = 'r';
	public static final char PLAYER_1_BUTTON_2 = 't';
	public static final char PLAYER_1_BUTTON_3 = 'f';
	public static final char PLAYER_1_BUTTON_4 = 'g';
	public static final char PLAYER_1_BUTTON_5 = 'v';
	public static final char PLAYER_1_BUTTON_6 = 'b';

	public static final char PLAYER_2_START = 'j';
	public static final char PLAYER_2_JOYSTICK_UP = 'u';
	public static final char PLAYER_2_JOYSTICK_UP_RIGHT = 'i';
	public static final char PLAYER_2_JOYSTICK_RIGHT = 'k';
	public static final char PLAYER_2_JOYSTICK_DOWN_RIGHT = ',';
	public static final char PLAYER_2_JOYSTICK_DOWN = 'm';
	public static final char PLAYER_2_JOYSTICK_DOWN_LEFT = 'n';
	public static final char PLAYER_2_JOYSTICK_LEFT = 'h';
	public static final char PLAYER_2_JOYSTICK_UP_LEFT = 'y';
	public static final char PLAYER_2_BUTTON_1 = 'o';
	public static final char PLAYER_2_BUTTON_2 = 'p';
	public static final char PLAYER_2_BUTTON_3 = 'l';
	public static final char PLAYER_2_BUTTON_4 = ';';
	public static final char PLAYER_2_BUTTON_5 = '.';
	public static final char PLAYER_2_BUTTON_6 = '/';

	private HashSet<Character> player1Keys;
	private HashSet<Character> player2Keys;

	private HashSet<Character> player1Joystick;
	private HashSet<Character> player2Joystick;

	private HashSet<Character> player1Buttons;
	private HashSet<Character> player2Buttons;

	private HashSet<Character> allKeys;
	private HashSet<Character> allJoystickKeys;
	private HashSet<Character> allStartButtons;
	private HashSet<Character> allButtons;

	/**
	 * Return true if the given key is any fight pad button. Does not include
	 * start buttons.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isAnyButton(char key) {
		return allButtons.contains(key);
	}

	/**
	 * Return true if the given key is any player's start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isStartButton(char key) {
		return allStartButtons.contains(key);
	}

	/**
	 * Return true if the given key is any direction on any joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isJoystick(char key) {
		return allJoystickKeys.contains(key);
	}

	/**
	 * Return true if the given key is a valid buton on the fight pad for player
	 * 1 to press. This does not include the start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer1Button(char key) {
		return player1Buttons.contains(key);
	}

	/**
	 * Return true if the given key is a valid buton on the fight pad for player
	 * 2 to press. This does not include the start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer2Button(char key) {
		return player2Buttons.contains(key);
	}

	/**
	 * Return true if the given key is a valid Joystick direction on the player
	 * 1 joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer1Joystick(char key) {
		return player1Joystick.contains(key);
	}

	/**
	 * Return true if the given key is a valid Joystick direction on the player
	 * 2 joystick.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer2Joystick(char key) {
		return player2Joystick.contains(key);
	}

	/**
	 * Return true if the given key is any valid key for the arcade machine
	 * controller to press.
	 *
	 * @param key the character keycode to be tested against the anyKey set
	 */
	public boolean isAnyKey(char key) {
		return allKeys.contains(key);
	}

	/**
	 * Return true if the given key is a valid key for Player 1 to press,
	 * including the joystick and start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer1Key(char key) {
		return player1Keys.contains(key);
	}

	/**
	 * Return true if the given key is a valid key for Player 2 to press,
	 * including the joystick and start button.
	 *
	 * @param key the character keycode to be tested against
	 */
	public boolean isPlayer2Key(char key) {
		return player2Keys.contains(key);
	}

	/**
	 * Construct a new ButtonManager
	 */
	public Buttons() {
		setupPlayer1Buttons();
		setupPlayer2Buttons();

		setupPlayer1Joystick();
		setupPlayer2Joystick();

		setupPlayer1Keys();
		setupPlayer2Keys();

		setupAllKeys();
		setupAllButtons();
		setupAllJoystickKeys();
		setupAllStartButtons();
	}

	/**
	 * Instantiate and fill the <code>allKeys</code> HashSet.
	 */
	private void setupAllKeys() {
		allKeys = new HashSet<Character>();

		allKeys.addAll(player1Keys);
		allKeys.addAll(player2Keys);
	}

	/**
	 * Instantiate and fill the HashSet <code>player1Keys</code>.
	 */
	private void setupPlayer1Keys() {
		player1Keys = new HashSet<Character>();

		player1Keys.add(PLAYER_1_START);
		player1Keys.addAll(player1Joystick);
		player1Keys.addAll(player1Buttons);
	}

	/**
	 * Instantiate and fill the HashSet <code>player2Keys</code>.
	 */
	private void setupPlayer2Keys() {
		player2Keys = new HashSet<Character>();

		player2Keys.add(PLAYER_2_START);
		player2Keys.addAll(player2Joystick);
		player2Keys.addAll(player2Buttons);
	}

	/**
	 * Instantiate and fill the HashSet <code>player1Joystick</code>.
	 */
	private void setupPlayer1Joystick() {
		player1Joystick = new HashSet<Character>();

		player1Joystick.add(PLAYER_1_JOYSTICK_UP);
		player1Joystick.add(PLAYER_1_JOYSTICK_UP_RIGHT);
		player1Joystick.add(PLAYER_1_JOYSTICK_RIGHT);
		player1Joystick.add(PLAYER_1_JOYSTICK_DOWN_RIGHT);
		player1Joystick.add(PLAYER_1_JOYSTICK_DOWN);
		player1Joystick.add(PLAYER_1_JOYSTICK_DOWN_LEFT);
		player1Joystick.add(PLAYER_1_JOYSTICK_LEFT);
		player1Joystick.add(PLAYER_1_JOYSTICK_UP_LEFT);
	}

	/**
	 * Instantiate and fill the HashSet <code>player2Joystick</code>.
	 */
	private void setupPlayer2Joystick() {
		player2Joystick = new HashSet<Character>();

		player2Joystick.add(PLAYER_2_JOYSTICK_UP);
		player2Joystick.add(PLAYER_2_JOYSTICK_UP_RIGHT);
		player2Joystick.add(PLAYER_2_JOYSTICK_RIGHT);
		player2Joystick.add(PLAYER_2_JOYSTICK_DOWN_RIGHT);
		player2Joystick.add(PLAYER_2_JOYSTICK_DOWN);
		player2Joystick.add(PLAYER_2_JOYSTICK_DOWN_LEFT);
		player2Joystick.add(PLAYER_2_JOYSTICK_LEFT);
		player2Joystick.add(PLAYER_2_JOYSTICK_UP_LEFT);
	}

	/**
	 * Instantiate and fill the HashSet <code>player1Buttons</code>.
	 */
	private void setupPlayer1Buttons() {
		player1Buttons = new HashSet<Character>();

		player1Buttons.add(PLAYER_1_BUTTON_1);
		player1Buttons.add(PLAYER_1_BUTTON_2);
		player1Buttons.add(PLAYER_1_BUTTON_3);
		player1Buttons.add(PLAYER_1_BUTTON_4);
		player1Buttons.add(PLAYER_1_BUTTON_5);
		player1Buttons.add(PLAYER_1_BUTTON_6);
	}

	/**
	 * Instantiate and fill the HashSet <code>player2Buttons</code>.
	 */
	private void setupPlayer2Buttons() {
		player2Buttons = new HashSet<Character>();

		player2Buttons.add(PLAYER_2_BUTTON_1);
		player2Buttons.add(PLAYER_2_BUTTON_2);
		player2Buttons.add(PLAYER_2_BUTTON_3);
		player2Buttons.add(PLAYER_2_BUTTON_4);
		player2Buttons.add(PLAYER_2_BUTTON_5);
		player2Buttons.add(PLAYER_2_BUTTON_6);
	}

	/**
	 * Instantiate and fill the HashSet <code>allJoystickKeys</code>.
	 */
	private void setupAllJoystickKeys() {
		allJoystickKeys = new HashSet<Character>();

		allJoystickKeys.addAll(player1Joystick);
		allJoystickKeys.addAll(player2Joystick);
	}

	/**
	 * Instantiate and fill the HashSet <code>allButtons</code>.
	 */
	private void setupAllButtons() {
		allButtons = new HashSet<Character>();

		allButtons.addAll(player1Buttons);
		allButtons.addAll(player2Buttons);
	}

	/**
	 * Instantiate and fill the HashSet <code>allButtons</code>.
	 */
	private void setupAllStartButtons() {
		allStartButtons = new HashSet<Character>();

		allStartButtons.add(PLAYER_1_START);
		allStartButtons.add(PLAYER_2_START);
	}
}

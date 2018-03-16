import java.util.Scanner;

public class Game {
	private int playerPositionX;
	private int playerPositionY;
	private int treasurePositionX;
	private int treasurePositionY;
	private int gridSizeX;
	private int gridSizeY;

	public Game(int gridSizeX, int gridSizeY, int playerPositionX, int playerPositionY, int treasurePositionX,
			int treasurePositionY) {

		this.gridSizeX = gridSizeX;
		this.gridSizeY = gridSizeY;
		this.playerPositionX = playerPositionX;
		this.playerPositionY = playerPositionY;
		this.treasurePositionX = treasurePositionX;
		this.treasurePositionY = treasurePositionY;

		String[][] myGridArray = new String[this.gridSizeX][this.gridSizeY];

		Scanner myScanner = new Scanner(System.in);

		myGridArray[playerPositionX][playerPositionY] = "P";
		myGridArray[treasurePositionX][treasurePositionY] = "T";

		for (int i = 0; i < myGridArray.length; i++) {
			for (int j = 0; j < myGridArray.length; j++) {
				myGridArray[i][j] = "_";
				System.out.print("[_" + myGridArray[i][j] + "_]");
			}
			System.out.println("");
		}

		System.out.println(Math.hypot(treasurePositionX - playerPositionX, treasurePositionY - treasurePositionY));

		while (playerPositionX != treasurePositionX || playerPositionY != treasurePositionY) {

			System.out.println("Insert values 1-4 to move the player: 1=north; 2=east; 3=south; 4=west");
			int direction = myScanner.nextInt();

			switch (direction) {

			case 1: // north

				playerPositionX = playerPositionX - 1;
				break;
			case 2: // east
				playerPositionY = playerPositionY + 1;
				break;
			case 3: // south
				playerPositionX = playerPositionX + 1;
				break;
			case 4: // west
				playerPositionY = playerPositionY - 1;
				break;
			}
			myGridArray[playerPositionX][playerPositionY] = "P";

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < 10; j++) {
					System.out.print("[_" + myGridArray[i][j] + "_]");
				}
				System.out.println("");
			}
			System.out.println("Your distance to treasure is: "
					+ Math.hypot((treasurePositionX - playerPositionX), treasurePositionY - treasurePositionY));
		}
		myScanner.close();
		System.out.println("Well done! You found the treasure! :)");
	}

	public int getPlayerPositionX() {
		return playerPositionX;
	}

	public void setPlayerPositionX(int playerPositionX) {
		this.playerPositionX = playerPositionX;
	}

	public int getPlayerPositionY() {
		return playerPositionY;
	}

	public void setPlayerPositionY(int playerPositionY) {
		this.playerPositionY = playerPositionY;
	}

	public int getTreasurePositionX() {
		return treasurePositionX;
	}

	public void setTreasurePositionX(int treasurePositionX) {
		this.treasurePositionX = treasurePositionX;
	}

	public int getTreasurePositionY() {
		return treasurePositionY;
	}

	public void setTreasurePositionY(int treasurePositionY) {
		this.treasurePositionY = treasurePositionY;
	}

	public int getGridSizeX() {
		return gridSizeX;
	}

	public void setGridSizeX(int gridSizeX) {
		this.gridSizeX = gridSizeX;
	}

	public int getGridSizeY() {
		return gridSizeY;
	}

	public void setGridSizeY(int gridSizeY) {
		this.gridSizeY = gridSizeY;
	}

}

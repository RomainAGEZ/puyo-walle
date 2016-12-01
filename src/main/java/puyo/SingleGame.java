package puyo;

public class SingleGame extends Game{
	private String p1Name;
	private Grid gridp1;
	
	public SingleGame(String gameName, String playerName) {
		super(gameName);
		this.p1Name = playerName;
	}
	
	public void setGridp1(Grid gridp1) {
		this.gridp1 = gridp1;
	}
	
	
}

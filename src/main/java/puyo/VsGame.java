package puyo;

public class VsGame extends Game{
	private String p1Name;
	private String p2Name;
	private Grid p1Grid;
	private Grid p2Grid;
	
	public VsGame(String p1Name, String p2Name, String gameName) {
		super(gameName);
		this.p1Name = p1Name;
		this.p2Name = p2Name;
	}
	
	public void setP1Grid(Grid p1Grid) {
		this.p1Grid = p1Grid;
	}
	
	public void setP2Grid(Grid p2Grid) {
		this.p2Grid = p2Grid;
	}
	
	public String getP1Name() {
		return p1Name;
	}
	
	public String getP2Name() {
		return p2Name;
	}
}

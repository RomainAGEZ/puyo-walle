package puyo;

public class GridArray implements Grid{
	Puyo[][] grid = new Puyo[6][12];
	int mainPuyoX;
	int mainPuyoY;
	Puyo mainPuyo;
	Puyo secondPuyo;
	Direction secondPuyoLocation;
	
	public GridArray() {
		this.init();
	}
	
	public void init(){
		for(int i=0;i<grid.length;i++){
			for(int j=0;j<grid[0].length;j++){
				grid[i][j] = Puyo.None;
			}
		}
	}
	
	public Puyo getMainPuyo() {
		return mainPuyo;
	}
	
	public int getMainPuyoX() {
		return mainPuyoX;
	}
	
	public int getMainPuyoY() {
		return mainPuyoY;
	}
	
	public Puyo getSecondPuyo() {
		return secondPuyo;
	}
	
	public void setNewPuyo(int mainPuyoX, int mainPuyoY, Puyo mainPuyo, Puyo secondPuyo, Direction secondPuyoLocation) {
		this.mainPuyo = mainPuyo;
		this.secondPuyo = secondPuyo;
		this.mainPuyoX = mainPuyoX;
		this.mainPuyoY = mainPuyoY;
		this.secondPuyoLocation = secondPuyoLocation;
	}
	
	public Puyo getPuyoAt(int y, int x) {
		return grid[y][x];
	}
	
	public void setPuyoAt(int y, int x, Puyo p) {
		this.grid[y][x] = p;
	}
	
	public Grid copy() {
		Grid g = new GridArray();
		for(int i = 0; i < this.grid.length; i++){
			for(int j = 0; j < this.grid.length; j++){
				g.setPuyoAt(i, j, this.grid[i][j]);
			}
		}
		g.setNewPuyo(this.mainPuyoX, this.mainPuyoY, this.mainPuyo, this.secondPuyo, this.secondPuyoLocation);
		return g;
	}
	
	public int getSecondPuyoX() {
		switch (this.secondPuyoLocation){
		case Down: return this.mainPuyoX;
		case Top: return this.mainPuyoX;
		case Left: return this.mainPuyoX - 1;
		//default : Right
		default : return this.mainPuyoX + 1;
		}
	}
	
	public int getSecondPuyoY() {
		switch (this.secondPuyoLocation){
		case Down: return this.mainPuyoY - 1;
		case Top: return this.mainPuyoY + 1;
		case Left: return this.mainPuyoY;
		//default : Right
		default : return this.mainPuyoY;
		}
	}
	
	public void move(Direction d) throws MoveException{
		switch(d){
		case Top: throw new MoveException("Impossible de se déplacer vers le haut");
		case Down:
			
		}
		
	}
	
	
	@Override
	public String toString() {
		String str = "";
		for(Puyo[] lig:grid){
			str += '|';
			for(Puyo p:lig){
				str += Puyo.toChar(p);
			}
			str += '|';
			str += '\n';
		}
		str += "--------";
		return str;
	}

}

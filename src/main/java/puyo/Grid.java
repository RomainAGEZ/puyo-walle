package puyo;

public interface Grid {
	//Vide la grille
	public void init();
	public void setPuyoAt(int y, int x, Puyo p);
	public Puyo getPuyoAt(int y, int x);
	public Grid copy();
	public void setNewPuyo(int mainPuyoX, int mainPuyoY, Puyo mainPuyo, Puyo secondPuyo, Direction secondPuyoLocation);
	public int getMainPuyoX();
	public int getMainPuyoY();
	public int getSecondPuyoX();
	public int getSecondPuyoY();
	public Puyo getMainPuyo();
	public Puyo getSecondPuyo();
	public void move(Direction d);
	
}

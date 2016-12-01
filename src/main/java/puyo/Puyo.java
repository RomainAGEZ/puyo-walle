package puyo;

public enum Puyo {
	Red, Green, Yellow, Blue, Rock, None;
	
	static public char toChar(Puyo p){
		switch(p){
		case Red: return 'R';
		case Green : return 'G';
		case Yellow : return 'Y';
		case Blue : return 'B';
		case Rock : return 'X';
		// default : None
		default : return ' ';
		}
	}
}



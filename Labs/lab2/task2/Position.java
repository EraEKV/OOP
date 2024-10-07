package task2;

public class Position {
	public final Letters x;
	public final Integer y;
	
	public Position(Letters x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isValid() {
        return y >= 1 && y <= 8;
    }
	
	public String toString() {
		return "Pos=" + this.x + this.y;
	}
}

package game;

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
	
	public Position shift(PositionShift shift) {
        return new Position(Letters.values()[this.x.ordinal() + shift.xShift], this.y + shift.yShift);
    }

    public boolean canShift(PositionShift shift) {
        int f = x.ordinal() + shift.xShift;
        int r = y + shift.yShift;

        if ((f < 0) || (f > 7)) return false;
        if ((r < 1) || (r > 8)) return false;

        return true;
    }
	
    public String toString() {
        return x + String.valueOf(y);
    }
	
	public boolean equals(Object o) {
		if(this == o) return true;
		if(!(o instanceof Position)) return false;
		
		Position other = (Position) o;
		return x == other.x && y == other.y;
	}
	
	public int hashCode() {
		int res = 1;
		res = 31 * res + x.hashCode();
		res = 31 * res + y.hashCode();
		return res;
	}
}

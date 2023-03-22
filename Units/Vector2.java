package Units;

public class Vector2 {
    protected int x, y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 opposit){
        if (opposit.y == y && opposit.x == x) return true;
        return false;
    }
    
    public double getDistance(BaseUnit unit){
        return Math.sqrt(Math.pow(this.x - unit.position.x,2) +
                        Math.pow(this.y - unit.position.y, 2));
    }
}
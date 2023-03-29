package Units;

import java.util.ArrayList;

public class Vector2 {
    protected int x, y;

    public Vector2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isEquals(Vector2 opposit) {
        if (opposit.y == y && opposit.x == x)
            return true;
        return false;
    }

    public boolean isY_Equals(Vector2 opposit) {
        if (opposit.y == y)
            return true;
        return false;
    }

    public boolean isX_Equals(Vector2 opposit) {
        if (opposit.x == x)
            return true;
        return false;
    }

    public double getDistance(BaseUnit unit) {
        return Math.sqrt(Math.pow(this.x - unit.position.x, 2) +
                Math.pow(this.y - unit.position.y, 2));
    }

    public Vector2 move(ArrayList<BaseUnit> list, BaseUnit enemy) {
        int indX = 0;
        if (this.x < enemy.position.x)
            indX = indX + 1;
        else if (this.x > enemy.position.x)
            indX = indX - 1;
        else indX = 0;

        int indY = 0;
        if (this.y < enemy.position.y)
            indY = indY + 1;
        else if (this.y > enemy.position.y)
            indY = indY - 1;
        else indY = 0;

        if (indX == 0) {
            if (NextEmpty(list, indX, indY)) {
                this.y = this.y + indY;
                return this;
            }
            else if (NextEmpty(list, indY, indX)){
                this.x = this.x + indY;
                return this;
            }
            else if (NextEmpty(list, indY*-1, indX)){
                this.x = this.x + indY*-1;
                return this;
            }
        }
        else if (indY == 0) {
            if (NextEmpty(list, indX, indY)) {
                this.x = this.x + indX;
                return this;
            }
            else if (NextEmpty(list, indY, indX)){
                this.y = this.y + indX;
                return this;
            }
            else if (NextEmpty(list, indY, indX*-1)){
                this.y = this.y + indX*-1;
                return this;
            }
        }
        else{
            if (NextEmpty(list, indX, 0)) {
                this.x = this.x + indX;
                return this;
            }
            else if (NextEmpty(list, 0, indY)) {
                this.y = this.y + indY;
                return this;
            }
            else if (NextEmpty(list, indX*-1, 0)) {
                this.x = this.x + indX*-1;
                return this;
            }
            else if (NextEmpty(list, 0, indY*-1)) {
                this.y = this.y + indY*-1;
                return this;
            }
        }
        return this;
    }

    public boolean NextEmpty(ArrayList<BaseUnit> list, int indX, int indY) {
        if (this.x + indX < 0 || this.x + indX == list.size())
            return false;
        if (this.y + indY < 0 || this.y + indY == list.size())
            return false;
        for (BaseUnit unit : list) {
            if (this.x + indX == unit.position.x & this.y + indY == unit.position.y) {
                return false;
            }
        }
        return true;
    }
}
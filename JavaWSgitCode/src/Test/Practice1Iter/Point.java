package Test.Practice1Iter;

import java.util.Objects;

public class Point {
    int x;
    int y;
    Point(int x, int y){
        this.x  = x;
        this.y = y;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o.getClass() != getClass()) return false;

        Point p  = (Point)o;
        return p.x == this.x && p.y == this.y;

    }


    @Override
    public int hashCode() {
        //return Objects.hash(x, y);
        return x+ y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

import java.util.*;

class point{
    int x,y;
    point(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        point point = (point) o;
        return x == point.x && y == point.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}


public class t3 {
    public static void main(String[] args) {
        HashMap<point,String> m = new HashMap<>();
        m.put(new point(1,1),"A");
        System.out.println(m.get(new point(1,1)));
    }
}

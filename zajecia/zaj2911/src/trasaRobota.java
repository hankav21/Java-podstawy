import java.awt.*;

public class trasaRobota {
    public static void main(String[] args) {

        char[][] sz = new char[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sz[i][j] = '.';
            }
        }


        char[] action = {'F', 'F', 'L', 'F','R','F'};

        GridPosition initialGridPosition = new GridPosition(50, 50);
        Orientation initialOrientation = Orientation.NORTH;


        Robot robot = new Robot(initialGridPosition, initialOrientation);

        sz[100 - robot.getGridPosition().y][robot.getGridPosition().x] = 's';
        for (char act : action) {
            robot.simulate(act);
            sz[100 - robot.getGridPosition().y][robot.getGridPosition().x] = 'x';
            System.out.print(robot.o);
        }


        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                System.out.print(sz[i][j]);
            }
            System.out.println();
        }
    }
}

class Robot{
    GridPosition gp;
    Orientation o;

    void ruch(){
        switch (o){
            case EAST:
                gp.x += 1;
                break;
            case WEST:
                gp.x -= 1;
                break;
            case NORTH:
                gp.y += 1;
                break;
            case SOUTH:
                gp.y -= 1;
                break;
        }
    }

    void simulate(char act){
        switch (act){
            case 'F':
                ruch();
                break;
            case 'L':
                o = o.turnLeft();
                break;
            case 'R':
                o = o.turnRight();
                break;
        }
    }

    public Robot(GridPosition gp, Orientation o) {
        this.gp = gp;
        this.o = o;
    }

    public GridPosition getGridPosition() {
        return gp;
    }

}

enum Orientation{
    NORTH, WEST, SOUTH, EAST;
//    GORA, DOL, PRAWO, LEWO

    public Orientation turnRight(){

        int i = this.ordinal();
        System.out.println(i);
        if(i==0) return Orientation.values()[Orientation.values().length-1];
        else return Orientation.values()[i-1];

    }

    public Orientation turnLeft(){

        int i = this.ordinal();
        System.out.println(i);
        if(i==Orientation.values().length-1) return Orientation.values()[0];
        else return Orientation.values()[i+1];

    }
}

class GridPosition{
    int x, y;

    public GridPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


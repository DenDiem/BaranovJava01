package dendiem.com;

public class Point implements Cloneable {


    private int _x;
    private int _y;

    public Point(){
        this._x = 0;
        this._y = 0;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Point(int _x, int _y) {
        this._x = _x;
        this._y = _y;
    }


    public String tellAboutU(){
        return "I am Point + ";
    }

    public int getX() {
        return _x;
    }

    public void setX(int _x) {
        this._x = _x;
    }

    public int getY() {
        return _y;
    }

    public void setY(int _y) {
        this._y = _y;
    }


    @Override
    public String toString() {
        return "Point{" +
                "_x=" + _x +
                ", _y=" + _y +
                '}';
    }
}

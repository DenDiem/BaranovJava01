package dendiem.com;

public class SingletonPoint extends Point {
    private static SingletonPoint _sinSingletonPoint;

    private SingletonPoint() {
    }

    private SingletonPoint(int _x, int _y) {
        super(_x, _y);
    }

    public static SingletonPoint  getInstance(){
        if(_sinSingletonPoint == null) {
            _sinSingletonPoint =  new SingletonPoint();
        }
        return _sinSingletonPoint;
    }
}

package ru.yandex.practicum;

public class Points {

    public static void main(String[] args) {
        final Point point1 = newPoint(1, 1);
        final Point point2 = newPoint(2, 2);
        final Point pointsSum = addPoints(point1, point2);
        System.out.println(
            "Сумма координат: х = " + pointsSum.getX() + ", y = " + pointsSum.getY()
        );
        System.out.println(point1.toString());

        final Point point3 = newPoint(2, 2);
        System.out.println(point2.equals(point3));
        System.out.print(point2.hashCode() + ":" + point3.hashCode());
    }

    public static Point addPoints(final Point point1, final Point point2) {
        final Point point = new Point();
        point.setX(point1.getX() + point2.getX());
        point.setY(point1.getY() + point2.getY());
        return point;
    }

    public static Point newPoint(final int x, final int y) {
        final Point point = new Point();
        point.setX(x);
        point.setY(y);
        return point;
    }
}


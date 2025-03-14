package bai6;

public class TestMoveablePoint {
    public static void main(String[] args) {
        // Tạo đối tượng Point
        Point point = new Point(3, 4);
        System.out.println("Initial Point: " + point);

        // Tạo đối tượng MoveablePoint
        MoveablePoint moveablePoint = new MoveablePoint(5, 6, 2, 3);
        System.out.println("MoveablePoint: " + moveablePoint);

        // Di chuyển điểm
        moveablePoint.move();
        System.out.println("sau khi di chuyển: " + moveablePoint);

        // Thay đổi tốc độ di chuyển
        moveablePoint.setXSpeed(4);
        moveablePoint.setYSpeed(1);
        System.out.println("sau khi thay đổi: " + moveablePoint);

        // Di chuyển tiếp
        moveablePoint.move();
        System.out.println("sau khi quay về: " + moveablePoint);
    }
}


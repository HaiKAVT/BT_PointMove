public class MoveablePointTest {
    public static void main(String[] args) {
        MoveablePoint moveablePoint = new MoveablePoint();
        System.out.println(moveablePoint);
        moveablePoint = new MoveablePoint(2.2f,2.2f ,2.3f,3.3f);
        moveablePoint.move();
        System.out.println(moveablePoint);
    }
}

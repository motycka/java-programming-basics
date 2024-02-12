public class Square extends Rectangle {

    public Square(double side) {
        super(side, side);
    }

    public Cuboid toCube() {
        return toCuboid(this.width);
    }

}


package domain;

public class Circle2 {
    public String identification;
    private Point pointPosition;
    private int size;

    public Circle2(String identification, int x, int y, int side) {
        this.identification = identification;
        pointPosition = new Point(x, y);
        this.size = side;
    }

    public Circle2(String identification, Point pointPosition, int side) {
        this.identification = identification;
        this.pointPosition = pointPosition;
        this.size = side;
    }


    /**
     * @return the pointPosition
     */
    public Point getPointPosition() {
        return pointPosition;
    }

    /**
     * @param pointPosition the pointPosition to set
     */
    public void setPointPosition(Point pointPosition) {
        this.pointPosition = pointPosition;
    }

    /**
     * @return the side
     */
    public int getSide() {
        return size;
    }

    /**
     * @param side the side to set
     */
    public void setSide(int side) {
        this.size = side;
    }
}

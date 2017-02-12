public class Robot {

    private int positionX;
    private int positionY;

    private String direction;

    public void buildRobot(String initialPosition) {
        this.positionX = Integer.parseInt(initialPosition.substring(0, 1));
        this.positionY = Integer.parseInt(initialPosition.substring(1, 2));
        this.direction = initialPosition.substring(2, 3);
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
    
    public void setPositionNorthY(){
        this.positionY= positionY + 1;
    }
    public void setPositionSouthY(){
        this.positionY = positionY - 1;
    }

    public void setPositionWestX(){
        this.positionX = positionX - 1;
    }

    public void setPositionEastX(){
        this.positionX = positionX + 1;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }
}

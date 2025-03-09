import java.awt.*;

public class Square extends Point{
    private double side;

    public Square(double x, double y, double side){
        super(x,y);
        this.side = side;
    }
    public double getSide(){
        return side;
    }
    public void setSide(){
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillRect((int)getX(), (int)getY(), (int)side, (int)side);
    }
}

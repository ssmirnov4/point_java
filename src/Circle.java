import java.awt.*;

public class Circle extends Point{
    private double radius;

    public Circle (double x, double y, double radius){
        super(x,y);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public boolean isInside(double x, double y){
        double dx = x - getX();
        double dy = y - getY();
        return dx * dx + dy * dy <= radius * radius;
    }

    public void draw(Graphics g){
        g.setColor(Color.GRAY);
        g.fillOval((int) getX(), (int) getY(), (int) (radius * 2), (int) (radius * 2));
    }
}

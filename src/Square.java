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
}

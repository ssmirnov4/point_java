import javax.swing.*;

public class Main {
    public static void main(String[] args){

        JFrame frame = new JFrame("rrr");
        DrawingApp panel = new DrawingApp();

        panel.addCircles(new Circle(50, 50, 40));
        panel.addSquares(new Square(150, 100, 60));

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}

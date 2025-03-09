import javax.swing.*;
import java.awt.*;
import java.util.List;
import java.util.ArrayList;

public class drawingApp extends JPanel {
    private final List<Circle> circles = new ArrayList<>();
    private final List<Square> squares = new ArrayList<>();

    public void addCircles(Circle a){
        circles.add(a);
    }
    public void addSquares(Square s){
        squares.add(s);
    }

    @Override
    public void paint(Graphics g){
        super.paint(g);

        for(Circle a : circles){
            a.draw(g);
        }

        for(Square s : squares){
             s.draw(g);
        }
    }
}

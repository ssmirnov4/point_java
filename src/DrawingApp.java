import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class DrawingApp extends JPanel {
    private final List<Circle> circles = new ArrayList<>();
    private final List<Square> squares = new ArrayList<>();
    private final Random random = new Random();

    public DrawingApp(){
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (SwingUtilities.isLeftMouseButton(e)) {
                    addCircles(new Circle(e.getX(), e.getY(), random.nextInt(30)+20));
                }
            }
        });
    }

    public void addCircles(Circle a){
        circles.add(a);
        repaint();
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

/**
 * Name - NidhiNidhi
 * Student ID - 991563808 
 * Assignment - 1 
 * Date - January 20,2020.
 */
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class SecondInitials extends Stage {
    
    private final Text text = new Text(30, 30, "Nidhi Nidhi");
    private Rectangle rect1 = new Rectangle(50, 60, 50, 280);
    private Rectangle rect2 = new Rectangle(220, 60, 50, 280);
    private Ellipse elp1 = new Ellipse(130, 120, 40, 50);
    private Ellipse elp2 = new Ellipse(160, 200, 40, 50);
    private Ellipse elp3 = new Ellipse(190, 280, 40, 50);
    private Pane pane = new Pane(rect1, rect2, elp1, elp2, elp3, text);
    private final Scene scene = new Scene(pane, 600, 400);

    public SecondInitials() {
        setTitle("Second Initials - Nidhi Nidhi");
        setHeight(500);
        setWidth(400);
        setY(100);
        setX(850);
        setScene(scene);
        setRectangle();
        setEllipse();
        setText();
    }

    private void setText() {
        text.setFill(Color.RED);
    }

    private void setRectangle() {
        rect1.setFill(Color.AQUA);
        rect1.setStroke(Color.HOTPINK);
        rect2.setFill(Color.AQUA);
        rect2.setStroke(Color.HOTPINK);
    }

    private void setEllipse() {
        elp1.setFill(Color.HOTPINK);
        elp1.setStroke(Color.HOTPINK);
        elp2.setFill(Color.YELLOW);
        elp2.setStroke(Color.BLUE);
        elp3.setFill(Color.HOTPINK);
        elp3.setStroke(Color.AQUA);
    }

}

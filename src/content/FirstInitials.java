/**
 * Name - NidhiNidhi 
 * Student ID - 991563808 
 * Assignment - 1 
 * Date - Jan 20,2020.
 */
package content;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FirstInitials extends Stage {

    int radius = 45;
    private final Text text = new Text(30, 30, "Nidhi Nidhi");
    private Rectangle ret1 = new Rectangle(50, 60, 50, 280);
    private Rectangle ret2 = new Rectangle(100, 70, 60, 80);
    private Circle cir3 = new Circle(160, 195, radius);
    private Rectangle ret4 = new Rectangle(160, 240, 60, 100);
    private Rectangle ret5 = new Rectangle(220, 60, 50, 280);
    private Pane pane = new Pane(ret1, ret2, cir3, ret4, ret5, text);
    private final Scene scene = new Scene(pane, 600, 400);

    public FirstInitials() {
        setTitle("First Initials - Nidhi Nidhi");
        setHeight(500);
        setWidth(400);
        setY(100);
        setX(450);
        setScene(scene);
        setRectangle();
        setCircle();
        setText();
    }

    private void setText() {
        text.setFill(Color.BLUE);
    }

    private void setRectangle() {
        ret1.setFill(Color.RED);
        ret1.setStroke(Color.BLUE);
        ret2.setFill(Color.ORANGE);
        ret2.setStroke(Color.GREEN);
        ret4.setFill(Color.ORANGE);
        ret4.setStroke(Color.GREEN);
        ret5.setFill(Color.RED);
        ret5.setStroke(Color.BLUE);
    }

    private void setCircle() {
        cir3.setFill(Color.BLUE);
        cir3.setStroke(Color.RED);
    }

}

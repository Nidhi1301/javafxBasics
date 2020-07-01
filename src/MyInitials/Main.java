/**
 * Name - NidhiNidhi 
 * Student ID - 991563808 
 * Assignment - 1
 * Date - January 20,2020.
 */
package MyInitials;

import content.FirstInitials;
import content.SecondInitials;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Main extends Application {

    private FirstInitials firstInitials = new FirstInitials();
    private SecondInitials secondInitials = new SecondInitials();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.show();
        ImageView shivu = new ImageView("images/shivu.JPG");
        shivu.setFitHeight(500);
        shivu.setFitWidth(400);
        Pane pane = new Pane(shivu);
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PrimaryStage - Nidhi Nidhi");
        primaryStage.setWidth(400);
        primaryStage.setHeight(500);
        primaryStage.setY(100);
        primaryStage.setX(50);
        firstInitials.show();
        secondInitials.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Oct 15, 2017 10:12:15 PM 
 */

package javafxcontrols;

 
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;

/**
 * Class TextAreaDemo
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */
public class TextAreaDemo extends Application {
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Declare and create a description pane
    DescriptionPane descriptionPane = new DescriptionPane();

    // Set title, text and image in the description pane
    descriptionPane.setTitle("Canada");
    String description = "The Canadian national flag ... \nCall me Ishmael. Some years ago- "+
            "never mind how long precisely- having little or no money in my purse, and nothing"+
            " particular to interest me on shore, I thought I would sail about a little and see"+
            " the watery part of the world." +
            "It is a way\n" +
"                I have of driving off the spleen and regulating the circulation."+
            " Whenever I find myself growing grim about the mouth; whenever it is a damp, drizzly "+
            "November in my soul; whenever I find myself involuntarily pausing before coffin warehouses ...";
    descriptionPane.setImageView(new ImageView("image/ca.gif"));
    descriptionPane.setDescription(description);

    // Create a scene and place it in the stage
    Scene scene = new Scene(descriptionPane, 450, 200);
    primaryStage.setTitle("TextAreaDemo"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }

  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}
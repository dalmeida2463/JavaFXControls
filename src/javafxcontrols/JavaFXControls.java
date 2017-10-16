/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Oct 7, 2017 11:37:36 AM 
 */
package javafxcontrols;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Daniel Liang
 */
public class JavaFXControls extends Application {
  public static final String CLASSNAME_ARG="--className=";
  public static final String DEFAULT_CLASSNAME="JavaFXControls";
  
  @Override
  public void start(Stage primaryStage) {
    Label lblInfo = new Label("This is the launcher program\n" +
            "Please set DEFAULT_CLASSNAME to JavaFx Application. ");
    Button btn = new Button();
    btn.setText("Say 'Hello World'");
    btn.setOnAction(new EventHandler<ActionEvent>() {
      
      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
    
    VBox root = new VBox();
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(lblInfo, btn);
    
    Scene scene = new Scene(root);
    
    primaryStage.setTitle("JavaFXControls Launcher!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  /**
   * Main method of this application. Takes an optional command line parameter --className=<name>
   * where <name> is the name of the class to test. Example:
   * <pre>java -jar JavaFXEventss.jar --className=ButtonInPane</pre>
   * @param args optional argument specifying the class to test. 
   */
  public static void main(String[] args) {
    String className = null;
    if (args.length > 0)
    {
      if (args[0].startsWith(CLASSNAME_ARG)) {
        className = args[0].substring(CLASSNAME_ARG.length());
      }
    }
    
    if (className == null)
    {
      className = DEFAULT_CLASSNAME;
    }
    if (!className.contains("."))
    {
      StringBuilder stringBuilder = new StringBuilder(JavaFXControls.class.getPackage().getName());
      stringBuilder.append('.').append(className);
      className = stringBuilder.toString();
    }
    try 
    {
      System.out.println("Launching " + className);
      launch((Class<? extends Application>)Class.forName(className), args);
    }
    catch(Exception ex)
    {
      System.out.println("Caught exception " + ex.toString());
      ex.printStackTrace();
    }
  }
}

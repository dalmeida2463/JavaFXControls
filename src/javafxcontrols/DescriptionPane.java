/*
 * Westfield State University: CAIS 220: Program Design II
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu) 
 * (c) 2017
 * Created: Oct 15, 2017 10:11:40 PM 
 */

package javafxcontrols;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;


/**
 * Class DescriptionPane
 * @author Ruth Kurniawati (rkurniawati@westfield.ma.edu)
 */ 
public class DescriptionPane extends BorderPane {
  /** Label for displaying an image and a title */
  private Label lblImageTitle = new Label();

  /** Text area for displaying text */
  private TextArea taDescription = new TextArea();
  
  public DescriptionPane() {
    // Center the icon and text and place the text under the icon
    lblImageTitle.setContentDisplay(ContentDisplay.TOP);
    lblImageTitle.setPrefSize(200,  100);
    
    // Set the font in the label and the text field
    lblImageTitle.setFont(new Font("SansSerif", 16));
    taDescription.setFont(new Font("Serif", 14));
    
    taDescription.setWrapText(true);
    taDescription.setEditable(false);

    // Place label and scroll pane in the border pane
    setLeft(lblImageTitle);
    setCenter(taDescription);
    setPadding(new Insets(5, 5, 5, 5));
  }
  
  /** Set the title */
  public void setTitle(String title) {
    lblImageTitle.setText(title);
  }

  /** Set the image view */
  public void setImageView(ImageView icon) {
    lblImageTitle.setGraphic(icon);
  }

  /** Set the text description */
  public void setDescription(String text) {
    taDescription.setText(text);
  }
}
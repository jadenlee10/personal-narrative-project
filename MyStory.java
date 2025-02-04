import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {


 private String[][] description;
  private ImageFilter[][] friend;
  
  // Constructor method
  public MyStory(String[][] description, ImageFilter[][] friend) {
    this.description = description;
    this.friend = friend;
  }

  // Calls all the parts of your animation, in order
  public void drawScene() {
    drawJustin();
    drawCooper();
    drawLandon();
    drawGabriel();
  }

  // Draws Justin Oh onto the theater. Calls the makeNegative method.
  public void drawJustin() {
    clear("green");
    drawImage(friend[0][0], 105,85,200);
    pause(1.0);
    friend[0][0].makeNegative();
    drawImage(friend[0][0], 105,85,200);
    pause(1.0);
    drawText(description[0][0], 90, 330);
    pause(1.0);
  }
  
  // Draws Cooper Kim onto the theater. Calls the adjustContrast method.
  public void drawCooper() {
    clear("blue");
    drawImage(friend[0][1],105,60,200);
    pause(1.0);
    friend[0][1].adjustContrast(2);
    drawImage(friend[0][1],105,60,200);
    pause(1.0);
    drawText(description[0][1], 85, 35);
    pause(1.0);
  }
  
  // Draws Landon Lee onto the theater. Calls the mirrorVertical method.
  public void drawLandon() {
    clear("white");
    drawImage(friend[1][0],105,85,200);
    pause(1.0);
    friend[1][0].mirrorVertical();
    drawImage(friend[1][0],105,85,200);
    pause(1.0);
    drawText(description[1][0], 75, 280);
    pause(1.0);
  }

  // Draws Gabriel Bonilla onto the theater. Calls the mirrorHorizontal method.
  public void drawGabriel() {
    clear("yellow");
    drawImage(friend[1][1],100,85,200);
    pause(1.0);
    friend[1][1].mirrorHorizontal();
    drawImage(friend[1][1],100,85,200);
    pause(1.0);
    drawText(description[1][1], 70, 280);
    pause(1.0);
  }

}
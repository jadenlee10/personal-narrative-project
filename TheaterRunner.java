import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

// 2D array that holds the value of the text that will be displayed on the theater
    String[][] friendDescription = {
      {"This is my friend Justin Oh", "This is my friend Cooper Kim"},
      {"This is my friend Landon Lee", "This is my friend Gabriel Bonilla"}
    };

//2D array that holds all of the images in. The myStory class uses these images to put filters on as well as print them.
    ImageFilter[][] friends = {
    { new ImageFilter("justin-oh-fine-shyt.jpg"), new ImageFilter("cooper-kim-fine-shyt.jpeg") },
    { new ImageFilter("IMG_0503.jpg"), new ImageFilter("IMG_0158.jpeg") },
   };

    // Creates a Scene object
    MyStory images = new MyStory(friendDescription, friends);

    images.drawScene();

    

    

    

    // Plays the scene
    Theater.playScenes(images);
    
  }
}
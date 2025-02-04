import org.code.theater.*;
import org.code.media.*;


public class ImageFilter extends ImagePlus {

  /*
   * Calls the superclass constructor to initialize pixels
   */
  public ImageFilter(String filename) {
    super(filename);
  }

  /*
   * Inverts the colors in the image by setting the red,
   * green, and blue color values of each Pixel object to
   * the result of 255 minus their current values
   */
  public void makeNegative() {
  Pixel[][] pixels = getImagePixels();
  for (int row = 0; row < pixels.length; row++){
    for (int col = 0; col < pixels[0].length; col++){
      Pixel currentPixel = pixels[row][col];
      int currentRed = currentPixel.getRed();
      int currentGreen = currentPixel.getGreen();
      int currentBlue = currentPixel.getBlue();

      int newRed = (int)((255 - currentRed));
      int newGreen = (int)((255 - currentGreen));
      int newBlue = (int)((255 - currentBlue));
                          
      currentPixel.setRed(newRed);
      currentPixel.setGreen(newGreen);
      currentPixel.setBlue(newBlue);
    }
  }
  }
  /*
   * Mirrors the image vertically by putting the left side of the pixels and putting 
   * it onto the right side
   */
   public void mirrorVertical() {
    Pixel[][] pixels = getImagePixels();
  for (int row = 0; row < pixels.length; row++) {
      for (int col = 0; col < pixels[0].length/2; col++) {
      Pixel leftPixel = pixels[row][col];
      Pixel rightPixel = pixels[row][pixels[0].length-col-1];

      leftPixel.setRed(rightPixel.getRed());
      leftPixel.setGreen(rightPixel.getGreen());
      leftPixel.setBlue(rightPixel.getBlue());
    }
  }
  }
  /*
   * Adjusts the contrast of the image by multiplying the
   * red, green, and blue values by the multiplier
   */
   public void adjustContrast(int multiplier) {
  Pixel[][] pixels = getImagePixels();
  for (int row = 0; row < pixels.length; row++){
    for (int col = 0; col < pixels[0].length; col++){
      Pixel currentPixel = pixels[row][col];
      
      int currentRed = currentPixel.getRed();
      int currentGreen = currentPixel.getGreen();
      int currentBlue = currentPixel.getBlue();
      
      int newRed = (int)(multiplier * currentRed);
      int newGreen = (int)(multiplier * currentGreen);
      int newBlue = (int)(multiplier * currentBlue);

        currentPixel.setRed(newRed);
        currentPixel.setGreen(newGreen);
        currentPixel.setBlue(newBlue);
    
  }
  }
  }

  /*
   * Mirrors the image horizontally by getting the top pixels and putting it onto the bottom.
   * It works the same as the mirrorVertical method, but instead of changing the columns,
   * it changes the rows.
   */
   public void mirrorHorizontal() {
    Pixel[][] pixels = getImagePixels();
    for (int row = 0; row < pixels.length / 2; row++) {
        for (int col = 0; col < pixels[0].length; col++) {
            Pixel topPixel = pixels[row][col];
            Pixel bottomPixel = pixels[pixels.length - row - 1][col];

            topPixel.setRed(bottomPixel.getRed());
            topPixel.setGreen(bottomPixel.getGreen());
            topPixel.setBlue(bottomPixel.getBlue());
        }
    }
}
}
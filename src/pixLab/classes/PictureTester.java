package pixLab.classes;
import java.awt.Color;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void testZeroRed()
  {
	  Picture arch  = new Picture("arch.jpg");
	  arch.explore();
	  arch.zeroRed();
	  arch.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture space = new Picture("spacePicSmall.jpg");
    space.explore();
    space.mirrorVertical();
    space.explore();
  }
  
  public static void testChromakey()
  {
	  Picture source = new Picture("camaro(small).jpg");
	  Picture background = new Picture("oculusQuest.jpg");
	  source.explore();
	  background.explore();
	  source.chromakey(background, Color.WHITE);
	  source.explore();
  }
  
  public static void testMirrorVerticalR2L()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.mirrorVerticalR2L();
    beach.explore();
  }
  
  public static void testGlitch()
  {
	  Picture source = new Picture("llamaStanding.jpg");
	  Picture background = new Picture("spacePicSmall.jpg");
	  source.chromakey(background, Color.GREEN);
	  background.shiftLeftRight(300);
	  background.glitch();
	  
  }
  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("spacePicSmall.jpg");
	  
	  Picture message = new Picture("trippy.jpg");
	  source.explore();
	  message.explore();
	  source.hidePicture(message);
	  source.explore();
	  source.revealPicture();
	  source.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	 testGlitch();
	  //testSteganography();
    //testZeroBlue();
   // testZeroRed();
    //testChromakey();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
   // testMirrorVerticalR2L();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}
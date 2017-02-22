import javax.swing.JFrame;

public class Saver1
{
   // execute application
   public static void main( String args[] )
   {
	  // create frame for Saver1JPanel
	  JFrame frame = new JFrame( " Line ScreenSaver " );
	  frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

	  // create Saver1JPanel
	  Saver1Panel saver1JPanel = new Saver1Panel();
	  frame.add( saver1JPanel ); // add saver1JPanel to frame
	  frame.setSize( 500, 500 ); // set frame size
	  frame.setVisible( true ); // display frame
   } // end main
} // end class Saver
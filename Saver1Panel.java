import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Saver1Panel extends JPanel
{
   private Random generator = new Random();
   
   // draw lines
   public void paintComponent( Graphics g )
   {
   	  super.paintComponent( g ); // call superclass's paintComponent
   	  int x1, y1, x2, y2;
	  
   	  // draw 100 random lines
	  for ( int i = 0; i < 100; i++ ) 
	  {
		 x1 = generator.nextInt( 500 );
		 y1 = generator.nextInt( 500 );
		 x2 = generator.nextInt( 500 );
		 y2 = generator.nextInt( 500 );
		 g.setColor( new Color( generator.nextInt( 256 ),
				 generator.nextInt( 256 ), generator.nextInt( 256 ) ) );
		 g.drawLine( x1, y1, x2, y2 );
		 } // end outer for
	  repaint(); // repaint component
	  } // end method paintComponent
} // end class Saver1JPanel
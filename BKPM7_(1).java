import java.awt.*;
import java.applet.*;

public class DrawShapes extends Applet {

Font font;
Color redColor;
Color blueColor;
Color backgroundColor;

public void init() {
//The Font is Arial size, 18 and is italicized
font = new Font("Arial",Font.ITALIC,18);

 

//Some colors are predefined in the Color class
redColor = Color.red;
backgroundColor = Color.orange;

//Colors can be created using Red, Green, Biue values
blueColor = new Color(0,0,122);

//Set tne background Color of tne applet
setBackground(backgroundColor);
}
public void stop() {
}

/**

* This method panis the shapes tone screen
*/

public void paint(Graphics graph){

// Set font
graph.setFont(font);
// Create a title
graph.drawString("Draw Shapes",90,20);
//Set the color for the first shape
graph.setColor(blueColor);

//Draw rectangie using drawRect(int x, int y, int width, int height)
graph.drawRect(120,120,120,120);

//This wil fila rectangle
graph.fillRect(115,115,90,90);

//Set the color for the next shape
graph.setColor(redColor);

//Draw a circle using drawArc(int x. int y, int width, int height, int startAngie, int arcAngle)
graph.fillArc(110,110,50,50,0,360);

//Set color for next shape
graph.setColor(Color.CYAN);

//Draw another rectangle
graph.drawRect(50,50,50,50);

//This wil fila rectangle
graph.fillRect(50,50,60,60);
}
}

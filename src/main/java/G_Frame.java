
import javax.swing.*;

public class G_Frame extends JFrame
{
  // ...ok...
  private static final long serialVersionUID = 2L;

  private G_Panel panel = null;	

  public G_Frame()
  { this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	this.setSize(1000,800);
	
	panel = new G_Panel();
	this.setContentPane(panel);
  }
  
  public G_Panel getPanel() {return panel;}
}

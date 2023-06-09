import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MiFrameM4 extends JFrame {
    
    JButton boton;
    
    MiFrameM4{
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        // Expresiones Lambda
            
        boton.addMouseListener(
                new MouseAdapter(){
                    @Override
                    public void mouseClicked(MouseEvent e) {
                        //
                        System.out.println("X="+e.getX()+" / Y="+e.getY());
                    }
                }
        );
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrameM4 frame = new MiFrameM4();  
        
        frame.setVisible(true);
    }
    
}

import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MiFrameM3 extends JFrame {
    
    JButton boton;
    
    MiFrameM3{
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        // Expresiones Lambda
            
        boton.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MiFrameM3 frame = new MiFrameM3();  
        
        frame.setVisible(true);
    }
    
}

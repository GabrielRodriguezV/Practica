import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author macpro2
 */
public class MyFrame extends JFrame {
    
    JButton boton;
    
    MyFrame(){
        this.setSize(320, 200);
        
        boton = new JButton("Cerrar");
        
        MyListener listener = new MyListener();
        
        boton.addActionListener(listener);
        
        this.add(boton);
    }
    
    public static void main(String[] args){
        MyFrame frame = new MyFrame();  
        
        frame.setVisible(true);
    }
    
}

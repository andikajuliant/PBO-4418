import java.awt.*; 
import java.awt.event.*;
public class textfield2{  
public static void main(String args[]){  
    Frame fr= new Frame("JavaAWT_IPUN");  
    fr.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
        TextField t1,t2;  
        t1=new TextField("Selamat datang di latihan TextField.");  
        t1.setBounds(60,100, 200,30);  
        t2=new TextField("AWT Tutorial TextField");  
        t2.setBounds(60,150, 200,30);  
        fr.add(t1); f.add(t2);  
        fr.setSize(400,400);  
        fr.setLayout(null);  
        fr.setVisible(true);  
    }  
}
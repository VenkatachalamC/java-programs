import java.awt.*;  
import java.awt.event.*; 
import java.swing.*; 
import javax.swing.JFrame;
public class KeyListenerExample2 extends Frame implements KeyListener{  
    Label l;
    TextArea area;  
    KeyListenerExample2(){  
        l=new Label();    
        l.setBounds(20,50,200,20);  
        area=new TextArea();  
        area.setBounds(20,80,300, 300);  
        area.addKeyListener(this);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
          
        add(l);
add(area);  
        setSize(400,400);  
        setLayout(null);  
        setVisible(true);  
    }  
    public void keyPressed(KeyEvent e) {}  
    public void keyReleased(KeyEvent e) {  
        String text=area.getText();
int digit=0;
int character=0;
char[] ch=text.toCharArray();
for(int i=0;i<text.length();i++)
{
char c=ch[i];
if(Character.isDigit(c))
{
digit++;
}
else{
character++;
}
}  
l.setText("Character count:"+character+"Digits Count:"+digit); 
    }  
    public void keyTyped(KeyEvent e) {}  
  
    public static void main(String[] args){  
        new KeyListenerExample2();  
    }  
}
import java.applet.*;
import java.awt.*;
public class window extends Applet{
   String n,a;
   public void init(){
       n=getParameter("name");
       a=getParameter("course");
   }
   public void paint(Graphics g)
   {
       g.drawString("welcome"+n+"to"+a,20,20);
   }
}    
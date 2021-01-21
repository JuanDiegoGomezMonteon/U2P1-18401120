
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 
 */
public class Lienzo extends Canvas {
Barras b1= new Barras(50,300,50,0);
Barras b2= new Barras(200,300,50,0);
Barras b3= new Barras(350,300,50,0);
TitulosX tx1=new TitulosX("Hombres",50,320);
TitulosX tx2=new TitulosX("Mujeres",200,320);
TitulosX tx3=new TitulosX("Otros",350,320);
TitulosY ty0=new TitulosY("0",15,300);
TitulosY ty1=new TitulosY("10",15,250);
TitulosY ty2=new TitulosY("20",15,200);
TitulosY ty3=new TitulosY("30",15,150);
TitulosY ty4=new TitulosY("40",15,100);
TitulosY ty5=new TitulosY("50",15,50);

BarraEstadistica puntero;
Color c;
public Lienzo(BarraEstadistica c){
  puntero=c;
}
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
    
        Graphics g2=(Graphics)g;
        int valorAlto1=b1.alto+puntero.getBarra1Y()*5;
        int valorY1=b1.y-puntero.getBarra1Y()*5;
        int valorAlto2=b2.alto+puntero.getBarra2Y()*5;
        int valorY2=b2.y-puntero.getBarra2Y()*5;
        int valorAlto3=b3.alto+puntero.getBarra3Y()*5;
        int valorY3=b3.y-puntero.getBarra3Y()*5;
        
        g.setFont(new Font("Arial",Font.PLAIN,15));
        g.setColor(Color.black);
        
        
        g.drawString(ty0.nombre,ty0.tx,ty0.ty);        
        g.drawString(ty1.nombre,ty1.tx,ty1.ty);
        g.drawString(ty2.nombre,ty2.tx,ty2.ty);
        g.drawString(ty3.nombre,ty3.tx,ty3.ty);
        g.drawString(ty4.nombre,ty4.tx,ty4.ty);
        g.drawString(ty5.nombre,ty5.tx,ty5.ty);
        
        
        g.drawString(tx1.nombre,tx1.tx,tx1.ty);
        g.drawString(tx2.nombre,tx2.tx,tx2.ty);
        g.drawString(tx3.nombre,tx3.tx,tx3.ty);
        
        g2.setColor(puntero.c1);
        g2.fillRect(b1.x, valorY1, b1.ancho, valorAlto1);
        
       
        g2.setColor(puntero.c2);
        g2.fillRect(b2.x, valorY2, b2.ancho, valorAlto2);
        
        
        g2.setColor(puntero.c3);
        g2.fillRect(b3.x, valorY3, b3.ancho, valorAlto3);
        
    }
    
}

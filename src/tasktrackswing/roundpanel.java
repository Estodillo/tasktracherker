/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tasktrackswing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;


public class roundpanel extends JButton {
    
    public boolean isOver(){
        return over;
    }
    public void setOver(boolean over){
        this.over = over;
        setBackground(color);
    }
    public Color getColor(){
        return color;
    }
    public void setColor(Color color){
        this.color = color;
    }
    public Color getColorover(){
        return colorOver;
    }
    public void setColorOver(Color colorOver){
        this.colorOver = colorOver; 
    }
    public Color getBorderColor(){
        return borderColor;
    }
    public void setBoarderColor(){
        this.borderColor = borderColor;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(){
        this.radius = radius;
    }
    
    public roundpanel(){
        // int Color
        
        setColor(Color.WHITE);
        colorOver= new Color(0,204,204);
        colorClick= new Color(50,85,86);
        borderColor= new Color(6,82,97);
        
        setContentAreaFilled(false);
        // Add event mouse
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                setBackground(colorOver);
               over=true;
            }

            @Override
            public void mouseExited(MouseEvent e) {
                setBackground(color);
               over=false;
            }

            @Override
            public void mousePressed(MouseEvent e) {
                setBackground(colorClick);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                if(over){
                    setBackground(colorOver);
                }else{
                    setBackground(color);
                }
        
            }
            
        });
        
    }
    private boolean over;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color borderColor;
    private int radius = 0;

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2=(Graphics2D) g.create();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        //Painr Border
        g2.setColor(borderColor);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g2.setColor(getBackground());
        // Boarder set 2 pix
        g2.fillRoundRect(2, 2, getWidth()-4, getHeight()-4, radius, radius);
        super.paintComponent(g); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
   
    
}

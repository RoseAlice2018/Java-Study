package my_game;

import java.awt.*;

public class bomb extends GameObject
{
    double degree;
    public bomb()
    {
        x=200;
        y=200;
        width=10;
        height=10;
        speed=4;
        degree=Math.random()*Math.PI*2;
    }
    public void draw(Graphics g)
    {
        Color c=g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval((int)x,(int)y,width,height);
        //炮弹沿着任一角度飞
        x+=speed*Math.cos(degree);
        y+=speed*Math.sin(degree);
        //边界
        if(x<0||x>constant.GAME_WIDTH-width)
        {
            degree=Math.PI-degree;
        }
        if(y<0||y>constant.GAME_WIDTH-height)
        {
            degree=-degree;
        }

        g.setColor(c);
    }
}

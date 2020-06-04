package my_game;

import java.awt.*;

public class GameObject {
    /**
     * 游戏物体的父类
     */
    Image image;
    double x, y;
    int speed=5;

    int width, height;

    public void drawself(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);

    }

    public GameObject(Image image, double x, double y, int speed, int width, int height)
    {
        this.image = image;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image image, double x, double y) {
        this.image = image;
        this.x = x;
        this.y = y;
    }
    public  GameObject()
    {

    }

    /**
     * 返回物体所在矩形，便于后续的碰撞检测
     * @return
     */
    public  Rectangle getRect()
    {
        return  new Rectangle((int)x,(int)y,width,height);
    }
}

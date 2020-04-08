package com.mashibing.tank.factroy;

import com.mashibing.tank.Dir;
import com.mashibing.tank.Group;

import java.awt.*;

/**
 * @Classname BaseTank
 * @Description 坦克抽象
 * @Date 2020/4/8 13:48
 * @Created by xjfu
 */
public abstract class BaseTank {
    public boolean living = true;
    public boolean moving = true;
    public Group group = Group.BAD;
    public Dir dir = Dir.DOWN;
    public Rectangle rect = new Rectangle();

    public abstract void paint(Graphics g);

    public abstract void fire();

    public abstract void setDir(Dir left);
    public abstract Dir getDir();

    public  Group getGroup(){
        return this.group;
    }

    public void die() {
        this.living = false;
    }

    public void setMoving(boolean b) {
        this.moving = b;
    }

    public boolean isMoving() {
        return moving;
    }


    public abstract int getX();

    public abstract int getY();
}

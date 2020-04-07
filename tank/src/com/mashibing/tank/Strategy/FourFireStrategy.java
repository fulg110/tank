package com.mashibing.tank.Strategy;

import com.mashibing.tank.Bullet;
import com.mashibing.tank.Dir;
import com.mashibing.tank.Group;
import com.mashibing.tank.Tank;

/**
 * @Classname FourFireStrategy
 * @Description 四个方向的子弹
 * @Date 2020/4/7 15:40
 * @Created by xjfu
 */
public class FourFireStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bx = t.getX() + Tank.WIDTH/2 - Bullet.WIDTH/2;
        int by = t.getY() + Tank.HEIGHT/2 - Bullet.HEIGHT/2;
        Dir[] values = Dir.values();
        for (Dir value : values) {
            new Bullet(bx, by, value, Group.GOOD, t.tf);
        }
    }
}

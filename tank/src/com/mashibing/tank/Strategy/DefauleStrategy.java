package com.mashibing.tank.Strategy;

import com.mashibing.tank.Bullet;
import com.mashibing.tank.Tank;

/**
 * @Classname DefauleStrategy
 * @Description 默认的策略
 * @Date 2020/4/7 15:27
 * @Created by xjfu
 */
public class DefauleStrategy implements FireStrategy {
    @Override
    public void fire(Tank t) {
        int bX = t.getX() + Tank.WIDTH/2 - Bullet.WIDTH/2;
        int bY = t.getY() + Tank.HEIGHT/2 - Bullet.HEIGHT/2;
        new Bullet(bX,bY,t.getDir(),t.getGroup(),t.tf);
    }
}

package com.mashibing.tank.factroy;

import java.awt.*;

/**
 * @Classname BaseBullet
 * @Description 子弹抽象类
 * @Date 2020/4/8 13:49
 * @Created by xjfu
 */
public abstract class BaseBullet {

    public abstract void paint(Graphics g);

    public abstract void collideWith(BaseTank baseTank);
}

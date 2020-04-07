package com.mashibing.tank.Strategy;

import com.mashibing.tank.Tank;

/**
 * @Classname FireStrategy
 * @Description 抽象的策略接口
 * @Date 2020/4/7 15:26
 * @Created by xjfu
 */
public interface FireStrategy {
    public void fire(Tank t);
}

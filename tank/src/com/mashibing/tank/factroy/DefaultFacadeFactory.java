package com.mashibing.tank.factroy;

import com.mashibing.tank.*;

/**
 * @Classname DefaultFacadeFactory
 * @Description TODO
 * @Date 2020/4/8 11:52
 * @Created by xjfu
 */
public class DefaultFacadeFactory extends FacadeFactory {

    @Override
    public BaseTank gettank(int x, int y, Dir dir, Group group, TankFrame tf) {
        return new Tank(x,y,dir,group,tf);
    }

    @Override
    public BaseBullet getBullet(int x, int y, Dir dir, Group group, TankFrame tf) {
        return null;
    }

    @Override
    public BaseExplode getExplode(int x, int y, TankFrame tf) {
        return null;
    }
}

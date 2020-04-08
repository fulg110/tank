package com.mashibing.tank.factroy;

import com.mashibing.tank.*;

/**
 * @Classname ColorFacadeFactory
 * @Description TODO
 * @Date 2020/4/8 11:54
 * @Created by xjfu
 */
public class ColorFacadeFactory extends FacadeFactory {


    @Override
    public BaseTank gettank(int x, int y, Dir dir, Group group, TankFrame tf) {
        return null;
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

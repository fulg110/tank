package com.mashibing.tank.factroy;

import com.mashibing.tank.Dir;
import com.mashibing.tank.Explode;
import com.mashibing.tank.Group;
import com.mashibing.tank.TankFrame;
import sun.security.jca.GetInstance;

/**
 * @Classname FacadeFactory
 * @Description 一键切换皮肤
 * @Date 2020/4/8 11:50
 * @Created by xjfu
 */
public abstract class FacadeFactory {


    public abstract BaseTank gettank(int x, int y, Dir dir, Group group, TankFrame tf);

    public abstract BaseBullet getBullet(int x, int y, Dir dir, Group group, TankFrame tf);

    public abstract BaseExplode getExplode(int x, int y, TankFrame tf);

}

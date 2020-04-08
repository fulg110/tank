package com.mashibing.tank.factroy;

/**
 * @Classname SingltonFactroy
 * @Description TODO
 * @Date 2020/4/8 16:27
 * @Created by xjfu
 */
public class SingltonFactroy {
    public static SingltonFactroy m_factroy = new SingltonFactroy();
    private static FacadeFactory m_facadeFactory;

    private SingltonFactroy() {
        m_facadeFactory = new DefaultFacadeFactory();
    }

    public static FacadeFactory getInstance()
    {
        return m_facadeFactory;
    }
}

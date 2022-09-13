package com.summary;

public class StaticProxy {
    public static void main(String[] args) {

        WenddingCompany wenddingCompany = new WenddingCompany(new You());
        wenddingCompany.HappyMarry();
    }
}

//共同接口
interface Marry{
    void HappyMarry();
}

//你,真实角色
class You implements Marry{
    @Override
    public void HappyMarry() {
        System.out.println("你要结婚了");
    }
}
//代理对象，帮助你结婚
class WenddingCompany implements Marry{


    private Marry target;

    //来一个构造器
    public WenddingCompany(Marry target) {
        this.target = target;
    }

    @Override
    public void HappyMarry() {

        before();
        this.target.HappyMarry();
        after();
    }

    private void before() {
        System.out.println("结婚之前，布置现场");

    }

    private void after() {
        System.out.println("结婚之后，收尾款");

    }


}


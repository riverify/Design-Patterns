package com.river.decorator;

/**
 * @Author River
 * @Date 2022 10 21 15 59
 **/
public class Test1 {
    public static void main(String[] args) {
        Component tv = new TextView();
        Component pv = new PictureView();

        Component tv1 = new BlackBorderDecorator(tv);
        tv1.display();
        Component tv2 = new ScrollBarDecorator(tv);
        tv2.display();

        Component pv1 = new BlackBorderDecorator(pv);
        pv1.display();
        Component pv2 = new ScrollBarDecorator(pv);
        pv2.display();

    }
}

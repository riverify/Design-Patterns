package com.river.memento;

/**
 * FileName: ChessMemento
 * Date: 2022/12/01
 * Time: 16:03
 * Author: river
 * <p/>
 * 棋子备忘录类
 */
public class ChessMemento {

    /**
     * 棋子名称
     */
    private String label;

    /**
     * 棋子横坐标
     */
    private int x;

    /**
     * 棋子纵坐标
     */
    private int y;

    /**
     * 构造方法
     *
     * @param label 棋子名称
     * @param x     棋子横坐标
     * @param y     棋子纵坐标
     */
    public ChessMemento(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }


    // 以下是getter和setter方法

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

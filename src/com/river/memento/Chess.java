package com.river.memento;

/**
 * FileName: Chess
 * Date: 2022/12/01
 * Time: 15:58
 * Author: river
 * <p/>
 * 棋子类
 */
public class Chess {

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
    public Chess(String label, int x, int y) {
        this.label = label;
        this.x = x;
        this.y = y;
    }

    /**
     * 保存棋子备忘录
     *
     * @return 棋子备忘录
     */
    public ChessMemento save() {
        return new ChessMemento(label, x, y);
    }

    /**
     * 恢复棋子备忘录
     *
     * @param memento 棋子备忘录
     */
    public void restore(ChessMemento memento) {
        this.label = memento.getLabel();
        this.x = memento.getX();
        this.y = memento.getY();
    }

    @Override
    public String toString() {
        return ("棋子[" + label + "]当前位置为：第" + x + "行，第" + y + "列。");
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

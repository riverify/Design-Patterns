package com.river.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName: MementoCaretaker
 * Date: 2022/12/01
 * Time: 16:05
 * Author: river
 * <p/>
 * 备忘录管理类
 */
public class MementoCaretaker {

    /**
     * 备忘录列表
     */
    private List<ChessMemento> mementoList = new ArrayList<>();

    /**
     * 获取备忘录信息
     *
     * @param i 备忘录索引
     * @return 棋盘棋子布局备忘录
     */
    public ChessMemento getMemento(int i) {
        return mementoList.get(i);
    }

    /**
     * 添加备忘录信息
     *
     * @param memento 棋盘棋子布局备忘录
     */
    public void setMemento(ChessMemento memento) {
        mementoList.add(memento);
    }

}

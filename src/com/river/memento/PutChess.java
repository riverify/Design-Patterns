package com.river.memento;

/**
 * FileName: putChess
 * Date: 2022/12/01
 * Time: 17:08
 * Author: river
 * <p/>
 * 棋子放置类
 */
public class PutChess {

    private int index;

    /**
     * 创建备忘录管理类
     */
    MementoCaretaker mementoCaretaker = new MementoCaretaker();

    public Chess start(String label, int x, int y) {
        Chess chess = new Chess(label, x, y);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[创建棋子]" + "\t" + " *" + (index + 1) + "* " + chess);
        index++;
        return chess;
    }


    public void put(Chess chess, int x, int y) {
        chess.setX(x);
        chess.setY(y);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;
    }

    public void regret(Chess chess) {
        index--;
        chess.restore(mementoCaretaker.getMemento(index - 1));
        System.out.println("[悔棋]" + "\t\t" + " 至 *" + (index) + "* ：" + chess);
    }

    public void cancelRegret(Chess chess) {
        chess.restore(mementoCaretaker.getMemento(index));
        System.out.println("[撤销悔棋]" + "\t" + " 至 *" + (index + 1) + "* ：" + chess);
        index++;
    }
}

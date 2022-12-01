package com.river.memento;


/**
 * FileName: Test1
 * Date: 2022/12/01
 * Time: 16:13
 * Author: river
 * <p/>
 * 备忘录模式测试类
 */
public class Test1 {
    public static void main(String[] args) {
        // 创建备忘录索引
        int index = 0;

        // 创建备忘录管理类
        MementoCaretaker mementoCaretaker = new MementoCaretaker();

        // 创建棋子
        Chess chess = new Chess("车", 1, 1);
        System.out.println("[创建棋子]" + "\t" + " *" + (index + 1) + "* " + chess);
        index++;
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录


        // 棋子移动 [车 4 5]
        chess.setX(4);
        chess.setY(5);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;

        // 棋子移动 [车 4 8]
        chess.setX(4);
        chess.setY(5);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;

        // 棋子移动 [车 6 8]
        chess.setX(6);
        chess.setY(8);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;

        // 悔棋
        index--;
        chess.restore(mementoCaretaker.getMemento(index - 1));
        System.out.println("[悔棋]" + "\t\t" + " 至 *" + (index) + "* ：" + chess);

        // 撤销悔棋
        chess.restore(mementoCaretaker.getMemento(index));
        System.out.println("[撤销悔棋]" + "\t" + " 至 *" + (index + 1) + "* ：" + chess);
        index++;

        // 棋子移动 [车 5 8]
        chess.setX(5);
        chess.setY(8);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;

        // 棋子移动 [车 5 1]
        chess.setX(5);
        chess.setY(1);
        mementoCaretaker.setMemento(chess.save());  // 保存棋子备忘录
        System.out.println("[下棋]" + "\t\t" + " *" + (index + 1) + "* " + chess);
        index++;

        // 悔棋
        index--;
        chess.restore(mementoCaretaker.getMemento(index - 1));
        System.out.println("[悔棋]" + "\t\t" + " 至 *" + (index) + "* ：" + chess);

        // 悔棋
        index--;
        chess.restore(mementoCaretaker.getMemento(index - 1));
        System.out.println("[悔棋]" + "\t\t" + " 至 *" + (index) + "* ：" + chess);


    }
}

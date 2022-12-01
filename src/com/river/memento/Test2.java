package com.river.memento;

/**
 * FileName: Test1
 * Date: 2022/12/01
 * Time: 16:13
 * Author: river
 * <p/>
 * 备忘录模式测试类2 整理方法，减少重复代码，增加更多棋子
 */
public class Test2 {
    public static void main(String[] args) {

        // 创建车棋子放置类
        PutChess putChess = new PutChess();

        // 创建棋子 [车]
        Chess chessCar = putChess.start("车", 1, 1);
        // 棋子移动 [车 4 5]
        putChess.put(chessCar, 4, 5);
        // 棋子移动 [车 4 8]
        putChess.put(chessCar, 4, 8);
        // 棋子移动 [车 6 8]
        putChess.put(chessCar, 6, 8);
        // 悔棋
        putChess.regret(chessCar);
        // 撤销悔棋
        putChess.cancelRegret(chessCar);
        // 棋子移动 [车 5 8]
        putChess.put(chessCar, 5, 8);
        // 棋子移动 [车 5 1]
        putChess.put(chessCar, 5, 1);
        // 悔棋
        putChess.regret(chessCar);
        // 悔棋
        putChess.regret(chessCar);

        // FIXME: 2021/12/1 其他的棋子未实现完全的备忘录模式，只是简单的实现了备忘录模式，后续会完善
        // 创建马棋子放置类
        PutChess putChess2 = new PutChess();
        // 创建棋子 [马]
        Chess chessHorse = putChess.start("马", 1, 1);
        // 棋子移动 [马 4 5]
        putChess2.put(chessHorse, 4, 5);
        // 棋子移动 [马 4 8]
        putChess2.put(chessHorse, 4, 8);


    }
}

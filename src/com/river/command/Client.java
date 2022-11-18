package com.river.command;

/**
 * @Author River
 * @Date 2022/11/18 16:12
 **/
public class Client {
    public static void main(String[] args) {
        // create function button
        FunctionButton fb = new FunctionButton("help");
        // set command -- help command
        fb.setCommand(new HelpCommand());
        fb.onClick(); // click function button

        // create function button
        FunctionButton fb2 = new FunctionButton("exit");
        // set command -- exit command
        fb2.setCommand(new ExitCommand());
        fb2.onClick(); // click function button
    }
}

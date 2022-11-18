package com.river.command;

/**
 * @Author River
 * @Date 2022/11/18 16:10
 **/
public class FunctionButton {

        /** command name */
        private String name;
        /** command */
        private AbstractCommand command;

        /**
         * constructor
         * @param name command name
         */
        public FunctionButton(String name) {
            this.name = name;
        }

        /**
         * set command
         * @param command command
         */
        public void setCommand(AbstractCommand command) {
            this.command = command;
        }


        /**
         * click button
         */
        public void onClick() {
            System.out.println("click function button");
            command.execute();
        }
}

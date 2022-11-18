package com.river.command;

/**
 * @Author River
 * @Date 2022/11/18 15:59
 **/
public class ExitCommand extends AbstractCommand {

        /** exit system */
        private SystemExitClass systemExitClass;

        /**
         * constructor
         */
        public ExitCommand() {
            systemExitClass = new SystemExitClass();
        }

        /**
         * execute command
        */
        @Override
        public void execute() {
            systemExitClass.exit();
        }
}

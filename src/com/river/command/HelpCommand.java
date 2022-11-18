package com.river.command;

/**
 * @Author River
 * @Date 2022/11/18 16:06
 **/
public class HelpCommand extends AbstractCommand {

        /** display help */
        private DisplayHelpClass displayHelpClass;

        /**
         * constructor
         */
        public HelpCommand() {
            displayHelpClass = new DisplayHelpClass();
        }

        /**
        * execute command
        */
        public void execute() {
            displayHelpClass.display();
        }
}

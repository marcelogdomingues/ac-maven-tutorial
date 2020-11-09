package org.academiadecodigo.bootcamp;

import com.googlecode.lanterna.TerminalFacade;
import com.googlecode.lanterna.gui.GUIScreen;
import com.googlecode.lanterna.gui.Window;

public class HelloWorld {

    public static void main(String[] args) {

        GUIScreen screen = TerminalFacade.createGUIScreen();

        screen.getScreen().startScreen();

        Window window = new Window("Hello World");
        screen.showWindow(window);

        screen.getScreen().stopScreen();

    }

}

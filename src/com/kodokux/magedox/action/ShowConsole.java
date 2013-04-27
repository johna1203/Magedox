package com.kodokux.magedox.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowAnchor;
import com.intellij.openapi.wm.ToolWindowId;
import com.intellij.openapi.wm.ToolWindowManager;
import com.kodokux.magedox.MagedoxModel;
import com.kodokux.magedox.console.MyConsole;

/**
 * Created with IntelliJ IDEA.
 * User: johna
 * Date: 13/04/27
 * Time: 2:25
 * To change this template use File | Settings | File Templates.
 */
public class ShowConsole extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent anActionEvent) {
        System.out.println("johna");
        MagedoxModel magedoxModel = new MagedoxModel(anActionEvent.getProject());
        MyConsole myConsole = new MyConsole(magedoxModel);
        Editor console = myConsole.createLogEditor();
    }
}

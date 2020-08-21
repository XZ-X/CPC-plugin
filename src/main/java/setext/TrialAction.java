package setext;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.LangDataKeys;
import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.NotNull;

/**
 * Description:
 *
 * @author xxz
 * Created on 08/19/2020
 */
public class TrialAction extends AnAction {
    /**
     * Implement this method to provide your action handler.
     *
     * @param e Carries information on the invocation place
     */
    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        System.out.println("Hello my plugin!");

        PsiFile psiFile = e.getData(LangDataKeys.PSI_FILE);
        psiFile.accept(new TrialVisitor());
        System.out.println("Bye my plugin!");
    }
}

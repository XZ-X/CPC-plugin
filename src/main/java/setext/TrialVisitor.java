package setext;

import com.intellij.psi.JavaRecursiveElementVisitor;
import com.intellij.psi.PsiMethod;

/**
 * Description:
 *
 * @author xxz
 * Created on 08/20/2020
 */
public class TrialVisitor extends JavaRecursiveElementVisitor {
    @Override
    public void visitMethod(PsiMethod method) {
        super.visitMethod(method);
    }
}

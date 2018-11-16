import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.CommonDataKeys;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class EditorBlankCheck extends AnAction {
    @Override
    public void actionPerformed(AnActionEvent e) {
        final Editor editor = e.getRequiredData(CommonDataKeys.EDITOR);
        final Project project = e.getProject();

        final Document document = editor.getDocument();
        String input = document.getText();
        if(input.contains("Hello World!")){
            Messages.showMessageDialog(project, "Hello world!", "Greeting", Messages.getInformationIcon());
        }
        else{
            Messages.showMessageDialog(project, "Sorry, I can't!", "Greeting", Messages.getInformationIcon());
        }
    }
    @Override
    public void update(AnActionEvent e) {
        //...
    }
}

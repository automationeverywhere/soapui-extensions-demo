package soapui.extensions;

import com.eviware.soapui.model.ModelItem;
import com.eviware.soapui.support.UISupport;
import com.eviware.soapui.support.action.support.AbstractSoapUIAction;

public class OpenEditorAction extends AbstractSoapUIAction {

public OpenEditorAction(){
    super("Custom Open","Custom Open Editor");
}
    public void perform(ModelItem modelItem, Object o) {
        UISupport.showDesktopPanel(modelItem);
    }
}

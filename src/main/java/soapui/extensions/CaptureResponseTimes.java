package soapui.extensions;

import com.eviware.soapui.SoapUI;
import com.eviware.soapui.model.support.TestRunListenerAdapter;
import com.eviware.soapui.model.testsuite.TestCaseRunContext;
import com.eviware.soapui.model.testsuite.TestCaseRunner;

public class CaptureResponseTimes extends TestRunListenerAdapter {
    public void afterRun( TestCaseRunner testRunner, TestCaseRunContext runContext )
    {
        long endTime = System.nanoTime();
        SoapUI.log("Status : "+testRunner.getStatus());
    }
}

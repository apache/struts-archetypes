package ${package}.actions;

import org.apache.struts2.StrutsTestCase;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class HelloActionTest extends StrutsTestCase {

    public void testHelloAction() throws Exception {
        HelloAction hello = new HelloAction();
        ActionContext.getContext().getContainer().inject(hello);
        String result = hello.execute();
        assertEquals("Expected a success result!", ActionSupport.SUCCESS, result);
        assertEquals("Expected the default message!", hello.getText(HelloAction.MESSAGE), hello.getMessage());
    }

}

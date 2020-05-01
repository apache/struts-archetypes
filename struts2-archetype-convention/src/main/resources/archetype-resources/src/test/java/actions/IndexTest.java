package ${package}.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.StrutsTestCase;

public class IndexTest extends StrutsTestCase {

    public void testIndex() {
        Index index = new Index();
        String result = index.execute();
        assertEquals("Expected a success result!", ActionSupport.SUCCESS, result);
        assertEquals("Expected the 'hello' action name!!", "hello", index.getRedirectName());
    }

}

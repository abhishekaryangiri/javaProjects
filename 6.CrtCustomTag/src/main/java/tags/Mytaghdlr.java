package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class Mytaghdlr extends TagSupport  {

	@Override
	public int doStartTag() throws JspException {
		try {
			
			JspWriter out = pageContext.getOut();
			out.println("<h6 >This is my custom tag</h6>");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}

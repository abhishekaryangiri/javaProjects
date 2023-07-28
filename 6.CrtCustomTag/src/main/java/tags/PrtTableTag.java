package tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class PrtTableTag extends TagSupport{
	
	public int number;
	//setter
	//key: alt+shift+s+r
	public void setNumber(int number) {
		this.number = number;
	}

	@Override
	public int doStartTag() throws JspException {
		
		try {
		JspWriter out = pageContext.getOut();
		//printing table
		out.print("<br>");
		for( int i=1;i<=10;i++)
		{
			out.print("      "+(i*number)+"<br>");
		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}

}

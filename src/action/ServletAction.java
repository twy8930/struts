package action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ServletAction extends ActionSupport implements
		ServletResponseAware, ServletRequestAware {

	private static final long serialVersionUID = -804972621414855505L;

	public void setServletResponse(HttpServletResponse arg0) {
		
	}

	public void setServletRequest(HttpServletRequest arg0) {

	}

	/**
	 * 通过ActionContext类获取
	 */
	public void method2() {
		HttpServletResponse response = (HttpServletResponse) ActionContext
				.getContext().get(
						org.apache.struts2.StrutsStatics.HTTP_RESPONSE);
		HttpServletRequest request = (HttpServletRequest) ActionContext
				.getContext()
				.get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
	}

	/**
	 * 通过ServletActionContext类获取
	 */
	public void method3() {
		HttpServletResponse response = ServletActionContext.getResponse();
		HttpServletRequest request = ServletActionContext.getRequest();
	}

}

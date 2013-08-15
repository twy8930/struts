package interceptor;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class MyInterceptor implements Interceptor{

	private static final long serialVersionUID = -2367989666496126005L;

	public void init() {
		System.out.println("MyInterceptor inited");
	}
	
	public void destroy() {
		System.out.println("MyInterceptor destroyed");
	}

	public String intercept(ActionInvocation invocation) throws Exception {
		HttpServletRequest request = (HttpServletRequest) ActionContext
		    .getContext().get(org.apache.struts2.StrutsStatics.HTTP_REQUEST);
        String token = request.getParameter("token");
        if(token==null){
        	return null;//不在继续向下执行
        }else{
        	if(token.equals("pass")){
        		return invocation.invoke();
        	}else{
        		return null;
        	}
        }
	}
	
}

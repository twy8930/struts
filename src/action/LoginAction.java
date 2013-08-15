package action;

import listener.MyListener;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {
	
	private static final long serialVersionUID = -5133185370536001518L;
	
	private String name;//用户名
	private String pass;//密码
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String login(){
		if(name.equals("admin")&&pass.equals("123")){
			
//			ActionContext c = ActionContext.getContext();  
//			MyListener myListener = new MyListener();  
//	        c.getActionInvocation().addPreResultListener(myListener);
			
//			ActionContext c = ActionContext.getContext();  
//	        c.getSession().put("name", "session中的"+name);  
//	        c.getApplication().put("name", "application中的"+name);  
	        
			return "success";
		}else{
			return "error";
		}
	}

}

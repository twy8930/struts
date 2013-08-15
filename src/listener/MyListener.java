package listener;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.PreResultListener;

public class MyListener implements PreResultListener {
	
	//在返回result之前做
	public void beforeResult(ActionInvocation actionInvocation, String result) {
		actionInvocation.getInvocationContext().getValueStack()
				.setValue("name", "匿名用户");
	}
}
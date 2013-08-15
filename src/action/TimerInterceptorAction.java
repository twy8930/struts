package action;

import com.opensymphony.xwork2.ActionSupport;

public class TimerInterceptorAction extends ActionSupport{
	
	private static final long serialVersionUID = 4400241577726937369L;
	private String info;
	
	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String execute(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("info:"+info);
		return SUCCESS;
	}

}

package action;

import com.opensymphony.xwork2.ActionSupport;

/**
 * 信息验证Action
 * 
 * @author twy
 * 
 */
public class ValidateAction extends ActionSupport {

	private static final long serialVersionUID = -4973235189612375535L;
	private String msg;

	public String execute() {
		return SUCCESS;
	}

	public void validate() {
		if (!msg.equalsIgnoreCase("hello")) {
			this.addFieldError("field.error", "必须输入hello!");
			this.addActionError("处理动作失败!");
		} else {
			this.addActionMessage("提交成功");
		}
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

}

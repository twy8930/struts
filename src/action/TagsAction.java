package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class TagsAction extends ActionSupport{

	private static final long serialVersionUID = -5054017581796235293L;
	private int age;
	private List<String> names;
	
	
	public String execute(){
		age=21;
		names=new ArrayList<String>();
		names.add("小张");
		names.add("小王");
		names.add("小李");
		names.add("小刘");
		return SUCCESS;
	}


	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public List<String> getNames() {
		return names;
	}

	public void setNames(List<String> names) {
		this.names = names;
	}

}

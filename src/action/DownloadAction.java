package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import com.opensymphony.xwork2.ActionSupport;

public class DownloadAction extends ActionSupport{

	private static final long serialVersionUID = 1823217579181896614L;
	private String fileName;
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public InputStream getInputStream() throws Exception {
		File file=new File("e:\\upload\\"+fileName);
		FileInputStream fileInputStream=new FileInputStream(file);
        return fileInputStream;   
    }   
  
    public String execute() throws Exception {   
        return SUCCESS;   
    }   

}

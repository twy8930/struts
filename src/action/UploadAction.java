package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	private static final long serialVersionUID = -8920466592471253212L;

	private File upload;
	private String uploadFileName;
	private String uploadContentType;

	public String getUploadFileName() {
		return uploadFileName;
	}

	public void setUploadFileName(String fileName) {
		this.uploadFileName = fileName;
	}

	public File getUpload() {
		return upload;
	}

	public void setUpload(File upload) {
		this.upload = upload;
	}

	public void setUploadContentType(String contentType) {
		this.uploadContentType = contentType;

	}

	public String getUploadContentType() {
		return this.uploadContentType;
	}

	public String execute() throws Exception {
		InputStream is = new FileInputStream(upload);
		OutputStream os = new FileOutputStream("e:\\upload\\"
				+ uploadFileName);
		byte buffer[] = new byte[8192];
		int count = 0;
		while ((count = is.read(buffer)) > 0) {
			os.write(buffer, 0, count);
		}
		os.close();
		is.close();
		return SUCCESS;
	}
}

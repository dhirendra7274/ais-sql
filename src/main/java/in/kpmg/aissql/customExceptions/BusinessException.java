package in.kpmg.aissql.customExceptions;

import org.springframework.stereotype.Component;



@Component

public class BusinessException extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	private String errorCode;
	private String errroMessage;
	public String getErrorCode() {
		return errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrroMessage() {
		return errroMessage;
	}
	public void setErrroMessage(String errroMessage) {
		this.errroMessage = errroMessage;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public BusinessException( ) {}
		
	
	public BusinessException(String errorCode, String errroMessage) {
		super();
		this.errorCode = errorCode;
		this.errroMessage = errroMessage;
	}
	
	
	

}

package cn.tedu.store.ex;
/**
 * 用户名冲突异常,例如尝试注册已经被占用的用户名
 * @author HP
 *
 */
public class UsernameDuplicateException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UsernameDuplicateException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsernameDuplicateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public UsernameDuplicateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public UsernameDuplicateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public UsernameDuplicateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	
}

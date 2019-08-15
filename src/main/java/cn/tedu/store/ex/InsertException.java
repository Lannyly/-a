package cn.tedu.store.ex;
/**
 * 插入数据异常,例如在插入数据时出现磁盘内存不足
 * @author HP
 *
 */
public class InsertException extends ServiceException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsertException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InsertException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

	public InsertException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public InsertException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public InsertException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	

}

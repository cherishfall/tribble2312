/**
 * 
 */
package com.tribble.tribblemybatis.entity.vo;

/**
 * 标准格式返回页面结果
 * 
 * @author Zongjie.Xia
 * 
 */
public class StandardResultVo<T> {

	public static String MSG_SUCCESS = "200";
	public static String MSG_LOGIC_ERR = "300";

	public static <T> StandardResultVo<T> errorResult(String message) {
		return errorResult(MSG_LOGIC_ERR, message);
	}

	public static <T> StandardResultVo<T> errorResult(String errorCode, String message) {
		return new StandardResultVo<T>(errorCode, message, null);
	}

	public static <T> StandardResultVo<T> successResult() {
		return successResult(null);
	}

	public static <T> StandardResultVo<T> successResult(T data) {
		return successResult(data, "success");
	}

	public static <T> StandardResultVo<T> successResult(T data, String message) {
		return new StandardResultVo<T>(MSG_SUCCESS, message, data);
	}

	public StandardResultVo() {
		super();
	}

	public StandardResultVo(String errorCode, String message, T data) {
		super();
		this.message = new StandardMessageVo(errorCode, message);
		this.data = data;
	}

	/**
	 * 返回结果信息
	 */
	private T data;
	/**
	 * 
	 */
	private StandardMessageVo message;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public StandardMessageVo getMessage() {
		return message;
	}

	public void setMessage(StandardMessageVo message) {
		this.message = message;
	}

	/**
	 * 标准格式信息返回
	 * 
	 * @author Zongjie.Xia
	 * 
	 */
	public class StandardMessageVo {

		public StandardMessageVo(String code, String message) {
			super();
			this.code = code;
			this.message = message;
		}

		public StandardMessageVo() {
			super();
		}

		/**
		 * 编码
		 */
		private String code;
		/**
		 * 信息内容
		 */
		private String message;

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

	}
}

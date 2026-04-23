/**
 * 
 */
package vn.fitly.domain.dto;

/**
 * 
 */
public class BaseResponse<T> {

    private final int status;

    private final String message;

    private final T data;

//    public BaseResponse(T data) {
//        this.status = 200;
//        this.message = null;
//        this.data = data;
//    }
//
//    public BaseResponse(int status, String message) {
//        this.status = status;
//        this.message = message;
//        this.data = null;
//    }

    private BaseResponse(int status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public T getData() {
        return data;
    }

    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(200, null, data);
    }
    
    public static <T> BaseResponse<T> error(int status, String message) {
        return new BaseResponse<T>(status, message, null);
    }

}

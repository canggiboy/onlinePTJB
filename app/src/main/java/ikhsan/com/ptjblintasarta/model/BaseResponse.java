package ikhsan.com.ptjblintasarta.model;

/**
 * Created by ikhsan on 16/11/17.
 */

public class BaseResponse {

    private boolean error;
    private String message;

    public BaseResponse() {
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

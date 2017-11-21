package ikhsan.com.ptjblintasarta.model;

/**
 * Created by ikhsan on 16/11/17.
 */

public class User extends BaseResponse {

    private UserData data;

    public User() {
    }

    public UserData getData() {
        return data;
    }

    public void setData(UserData data) {
        this.data = data;
    }
}

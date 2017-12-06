package ikhsan.com.ptjblintasarta.network;

import android.content.Context;

import ikhsan.com.ptjblintasarta.network.config.RetrofitBuilder;
import ikhsan.com.ptjblintasarta.network.interfaces.LoginInterface;
import retrofit2.Callback;

/**
 * Created by ikhsan on 16/11/17.
 */

public class LoginService {

    private LoginInterface loginInterface;

    public LoginService(Context context) {
        loginInterface = RetrofitBuilder.builder(context)
                .create(LoginInterface.class);
    }

    public void doLogin(String username, String password, String level, Callback callback) {
        loginInterface.login(username, password, level).enqueue(callback);
    }
}

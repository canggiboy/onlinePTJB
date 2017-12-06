package ikhsan.com.ptjblintasarta.network.interfaces;

import ikhsan.com.ptjblintasarta.model.User;
import ikhsan.com.ptjblintasarta.network.config.Config;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by ikhsan on 16/11/17.
 */

public interface LoginInterface {

    @FormUrlEncoded
    @POST(Config.API_LOGIN)
    Call<User> login(
            @Field("username") String username,
            @Field("password") String password,
            @Field("password") String level);
}
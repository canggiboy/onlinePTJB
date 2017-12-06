package ikhsan.com.ptjblintasarta.model;

/**
 * Created by ikhsan on 16/11/17.
 */

public class UserData {

    private String nik;
    private String fullname;
    private String username;
    private String level;

    public UserData() {
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String geLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

package cn.itcast.entity;

/**
 * 一些声明信息
 * Description: <br/>
 * date: 2020/6/30 13:49<br/>
 *
 * @author ${李佳乐}<br/>
 * @since JDK 1.8
 */
public class User {

    private String username;
    private String password;
    private String address;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

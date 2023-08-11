package sample3;

public class Member {
    private String username;
    private String userId;
    private String password;
    private int age;

    public Member(String username, String userId, String password, int age) {
        this.username = username;
        this.userId = userId;
        this.password = password;
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

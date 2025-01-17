public class RegisterPojo {
    private String name;
    private int userid;
    private String email;
    private String username;
    private String password;

    // Constructors
    public RegisterPojo() {
    }

    public RegisterPojo(String name, int userid, String email, String username, String password) {
        this.name = name;
        this.userid = userid;
        this.email = email;
        this.username = username;
        this.password = password;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    // toString method for debugging purposes
    @Override
    public String toString() {
        return "RegisterPojo{" +
                "name='" + name + '\'' +
                ", userid='" + userid + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

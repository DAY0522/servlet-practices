package jstlel;

public class UserVo {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String gender;
    private String joinDate;

    @Override
    public String toString() {
        return "UserVo [id=" + id + ", name=" + name + ", email=" + email + ", password=" + password + ", gender="
                + gender + ", joinDate=" + joinDate + "]";
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getJoinDate() {
        return joinDate;
    }
    public void setJoinDate(String joinDate) {
        this.joinDate = joinDate;
    }

}

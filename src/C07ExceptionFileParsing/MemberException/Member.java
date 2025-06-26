package C07ExceptionFileParsing.MemberException;

public class Member {
    private static Long staticId=0L; ///여기서 초기화 하는 것과 생성자에서 초기화하
    private Long id;
    private String name;
    private String email;
    private String password;

    public Member(String name, String email, String password) {
        this.id = staticId;
        this.name = name;
        this.email = email;
        this.password = password;
        staticId++;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

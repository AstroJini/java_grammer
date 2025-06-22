package C02ClassBasic;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C101BoardService {
    public static void main(String[] args) {
        ////        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
        ////        2.회원 전체 목록 조회 : id, email
        ////        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(author에 post)
        ////        4.게시글 작성 : id, title, contents, 작성자Email(Author객체 가능|가능하면이걸 추천)
        ////        5.게시물 목록 조회 : id(post), title
        ////        6.게시물 상세 조회 (id로 조회) : id(post), title, contents, 작성자email(작성자이름)
        ////        7.서비스 종료

        List<Author> authorList = new ArrayList<>();
        List<Post> postList = new ArrayList<>();

        while(true) {

            System.out.println("원하시는 서비스 번호를 입력해주세요" + "\n"
                                + "1.회원 가입 2.회원 전체목록 조회 3. 회원 상세조회" + "\n"
                                + "4.게시글 작성 5.게시물 목록 조회 6.게시물 상세조회 7.서비스 종료");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            if (input.equals("1")){
                System.out.println("회원 가입서비스 입니다");

                System.out.println("이름을 입력해주세요");
                String name = sc.nextLine();

                System.out.println("이메일을 입력해주세요");
                String email = sc.nextLine();

                System.out.println("비밀번호를 입력해주세요");
                String password = sc.nextLine();

                Author newUser = new Author(name, email, password);
                authorList.add(newUser);
                System.out.println(name + " 님의 회원가입이 성공하였습니다.");
            }else if (input.equals("2")){
                System.out.println("회원 전체 목록 조회서비스 입니다");

                for(Author a : authorList){
                    System.out.println("ID: " + a.getId() + "\nE-mail: " + a.getEmail());
                }
            } else if (input.equals("3")) {
                System.out.println("회원 상세 조회서비스 입니다");

                System.out.println("조회하고자 하는 USER의 ID를 입력해주세요");
                int id = sc.nextInt();

                System.out.println("조회하신 USER의 상세정보입니다.");
                for (Author a : authorList){
                    boolean ch= a.Check(a.getId());
                    if (ch){
                        System.out.println(a.AuthorDetails());
                    }else {
                        System.out.println("조회하신 유저는 존재하지 않습니다.");
                    }
                }

            } else if (input.equals("4")) {
                System.out.println("게시글 작성 서비스입니다.");

                System.out.print("제목을 입력해주세요: ");
                String title = sc.nextLine();

                System.out.print("내용을 입력해주세요: ");
                String contents = sc.nextLine();

                System.out.print("작성자 이메일을 입력해주세요: ");
                String emailInput = sc.nextLine();

                Author foundAuthor = null;
                for (Author a : authorList) {
                    if (a.getEmail().equalsIgnoreCase(emailInput.trim())) {
                        foundAuthor = a;
                        break;
                    }
                }
                if (foundAuthor == null) {
                    System.out.println("해당 이메일의 작성자가 존재하지 않습니다. 게시글 작성 실패.");
                } else {
                    Post newPost = new Post(title, contents, foundAuthor);
                    postList.add(newPost);
                    foundAuthor.getPostList().add(newPost);  // 작성자의 postList에도 추가

                    System.out.println("게시글이 성공적으로 작성되었습니다!");
                    System.out.println("작성자: " + foundAuthor.getName());
                    System.out.println("게시글 ID: " + newPost.getId());
                }
            } else if (input.equals("5")) {
                System.out.println("게시물 목록 조회서비스 입니다");
                for (Post p : postList){
                    System.out.println("POST_ID: " + p.getId() +"\ntitle: " + p.getTitle());
                }
            } else if (input.equals("6")) {
                System.out.println("게시물 상세 조회서비스 입니다.");

                System.out.println("찾고자하는 POST_ID를 입력하세요");
                int postId = Integer.parseInt(sc.nextLine());

                for (Post p: postList){
                    if (p.getId()==postId){
                        System.out.println(p.PostDetails());
                    }
                }

            } else if (input.equals("7")) {
                System.out.println("서비스 종료");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 숫자만 입력해주세요");
            }


        }




    }

}

class Author {
    List<Post> postList = new ArrayList<>();
    private static int idCounter = 1;
    private int id;
    private String name;
    private String email;
    private String password;

    public Author(String name,String email, String password) {
        this.name=name;
        this.email=email;
        this.password=password;
        this.id=idCounter++;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public List<Post> getPostList() {
        return postList;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Author{" +
                "postList=" + postList +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public String AuthorDetails(){
        return "ID: " + this.getId() +
                "\nE-mail: " + this.getEmail() +
                "\nPASSWORD: " + this.getPassword() +
                "\n작성횟수: " + this.getPostList().size();
    }

    public boolean Check(int id) {
        if (this.getId()==id){
            return true;
        }else {
            return false;
        }
    }


}

class Post {
    private static int idCounter = 1;
    private int id=0;
    private String title;
    private String contents;
    private Author author;

    public Post(String title, String contents, Author author){
        this.title=title;
        this.contents=contents;
        this.author=author;
        this.id=idCounter++;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContents() {
        return contents;
    }

    public Author getAuthor() {
        return author;
    }

    public String PostDetails(){
        return "POST_ID: " + this.getId() +
                "\ntitle: " + this.getTitle() +
                "\ncontents: " + this.getContents() +
                "\n작성자: " + this.getAuthor().getName();

    }



}

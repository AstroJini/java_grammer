//package C02ClassBasic;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class C10BoardServiceAi {
////        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
////        2.회원 전체 목록 조회 : id, email
////        3.회원 상세 조회(id로 조회) : id, email, name, password, 작성글수(author에 post)
////        4.게시글 작성 : id, title, contents, 작성자Email(Author객체 가능|가능하면이걸 추천)
////        5.게시물 목록 조회 : id(post), title
////        6.게시물 상세 조회 (id로 조회) : id(post), title, contents, 작성자email(작성자이름)
////        7.서비스 종료
//
////    회원가입 -> a1객체 생성
////    글쓰기 -> p1객체 생성, postList.add(p1)
////    a1.getPostList().add(p1);
//
//    public static void main(String[] args) {
//        List<Author> authorList = new ArrayList<>();
//        List<Post> postList = new ArrayList<>(); ///전체 글 리스트
//
//        while (true) {
//            //        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//            System.out.println("원하시는 서비스를 입력해주세요");
//            System.out.println("1.회원가입 2.회원전체목록조회 3.회원상세조회");
//            System.out.println("4.게시글작성 5.게시물목록조회 6.게시물상세조회 7.서비스종료");
//            Scanner sc = new Scanner(System.in);
//            String input = sc.nextLine();
//
//            if (input.equals("1")){
//                System.out.println("회원가입 서비스입니다.");
//
//                System.out.println("이름을 입력해주세요");
//                String name = sc.nextLine();
//
//                System.out.println("이메일을 입력해주세요");
//                String email = sc.nextLine();
//
//                System.out.println("비밀번호를 입력해주세요");
//                String password = sc.nextLine();
//
//                Author newUser = new Author(name, email, password);
//                authorList.add(newUser);
//                System.out.println("회원가입에 성공하였습니다.");
//
//            }else if (input.equals("2")) {
//                System.out.println("회원전체목록조회 서비스입니다");
//                for (Author a: authorList) {
//                    System.out.println("ID: " + a.getId() + ", Email: " + a.getEmail());
//                }
//            }else if (input.equals("3")) {
//                System.out.println("회원상세조회 서비스입니다");
//                System.out.println("조회 방식을 선택해주세요: 1.ID로 조회 2.이메일로 조회");
//                String searchType = sc.nextLine();
//
//                boolean found = false;
//                if (searchType.equals("1")) {
//                    System.out.println("조회하실 아이디를 입력해주세요");
//                    int id = Integer.parseInt(sc.nextLine());
//                    for (Author a: authorList){
//                        if (id == a.getId()){
//                            System.out.println(a.authorDetail());
//                            found = true;
//                            break;
//                        }
//                    }
//                } else if (searchType.equals("2")) {
//                    System.out.println("조회하실 이메일을 입력해주세요");
//                    String email = sc.nextLine();
//                    for (Author a: authorList){
//                        if (email.equals(a.getEmail())){
//                            System.out.println(a.authorDetail());
//                            found = true;
//                            break;
//                        }
//                    }
//                } else {
//                    System.out.println("잘못된 선택입니다.");
//                    continue;
//                }
//
//                if (!found) {
//                    System.out.println("해당 정보의 회원을 찾을 수 없습니다.");
//                }
//                //        4.게시글 작성 : id, title, contents, 작성자Email(Author객체 가능|가능하면이걸 추천)
//            }else if (input.equals("4")) {
//                System.out.println("게시글작성 서비스입니다.");
//                System.out.println("작성자 ID를 입력해주세요");
//                int authorId = Integer.parseInt(sc.nextLine());
//
//                Author author = null;
//                for (Author a : authorList) {
//                    if (a.getId() == authorId) {
//                        author = a;
//                        break;
//                    }
//                }
//
//                if (author == null) {
//                    System.out.println("해당 ID의 회원을 찾을 수 없습니다.");
//                    continue;
//                }
//
//                System.out.println("제목을 입력해주세요");
//                String title = sc.nextLine();
//
//                System.out.println("내용을 입력해주세요");
//                String contents = sc.nextLine();
//
//                Post newPost = new Post(title, contents, author);
//                postList.add(newPost);
//                author.getPostList().add(newPost);
//
//                System.out.println("게시글이 성공적으로 작성되었습니다.");
//
//            }else if (input.equals("5")) {
//                System.out.println("게시물목록조회 서비스입니다.");
//                if (postList.isEmpty()) {
//                    System.out.println("작성된 게시물이 없습니다.");
//                } else {
//                    for (Post p : postList) {
//                        System.out.println("ID: " + p.getId() + ", 제목: " + p.getTitle());
//                    }
//                }
//
//            }else if (input.equals("6")) {
//                System.out.println("게시물상세조회 서비스입니다.");
//                System.out.println("조회할 게시물 ID를 입력해주세요");
//                int postId = Integer.parseInt(sc.nextLine());
//
//                boolean found = false;
//                for (Post p : postList) {
//                    if (p.getId() == postId) {
//                        System.out.println(p.postDetail());
//                        found = true;
//                        break;
//                    }
//                }
//                if (!found) {
//                    System.out.println("해당 ID의 게시물을 찾을 수 없습니다.");
//                }
//
//            }else if (input.equals("7")) {
//                System.out.println("이용해주셔서 감사합니다. 서비스를 종료합니다");
//                break;
//            }else {
//                System.out.println("잘못된 입력방식 입니다. 숫자만 기입해주세요");
//            }
//        }
//    }
//}
//
////        1.회원가입 : 이름, 이메일, 비밀번호, id값(auto_increment)
//class Author {
//    List<Post> postList = new ArrayList<>(); ///각 id별 자신의 postList
//    private static int idCounter = 1;
//    private String name;
//    private String email;
//    private String password;
//    private int id;
//
//    public Author(String name, String email, String password) {
//        this.id = idCounter++;
//        this.name = name;
//        this.email = email;
//        this.password = password;
//    }
//
//    ///  getter
//    public List<Post> getPostList() {
//        return postList;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    //회원 상세 조회 메서드
//    public String authorDetail(){
//        return "ID: " + this.getId() +
//                "\nE-mail: " + this.getEmail() +
//                "\n이름: " + this.getName() +
//                "\n게시물작성횟수: " + this.getPostList().size();
//    }
//}
//
////        4.게시글 작성 : id, title, contents, 작성자Email(Author객체 가능|가능하면이걸 추천)
//class Post {
//    private static int idCounter = 1;
//    private int id;
//    private String title;
//    private String contents;
//    private Author author;
//
//    public Post(String title, String contents, Author author) {
//        this.id = idCounter++;
//        this.title = title;
//        this.contents = contents;
//        this.author = author;
//    }
//
//    public Author getAuthor() {
//        return author;
//    }
//
//    public String getContents() {
//        return contents;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    // 게시물 상세 조회 메서드
//    public String postDetail() {
//        return "게시물 ID: " + this.getId() +
//                "\n제목: " + this.getTitle() +
//                "\n내용: " + this.getContents() +
//                "\n작성자 이메일: " + this.getAuthor().getEmail() +
//                "\n작성자 이름: " + this.getAuthor().getName();
//    }
//}
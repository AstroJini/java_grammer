package C07ExceptionFileParsing.MemberException;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

//핵심 로직을 구현하는 계층
public class MemberService {
    private static MemberRepository memberRepository; ///이를 static으로 둬야할지 빼야할지 고민할 여지가 있다.
    public MemberService(){
        this.memberRepository = new MemberRepository();
    }

//    회원가입
    public void register(String name, String email, String password)throws IllegalArgumentException{
////        DB(List)에  이메일이 중복일 경우 예외 발생
//        if(memberRepository.findByEmail(email).isPresent()){
//            throw new IllegalArgumentException("해당 이메일은 이미 생성된 계정이 있습니다");
//        }
////        비밀번호가 너무 짧은 경우 예외 발생
//        if (password.length()<8){
//            throw new IllegalArgumentException("비밀번호의 자릿수가 8자 이상이어야 합니다.");
//        }
////        객체를 조립 후 repository를 통해 register
//        Member newMember = new Member(name,email, password);
//        memberRepository.register(newMember);


        if (memberRepository.findByEmail(email).isPresent()){
            throw new IllegalArgumentException("이메일 중복");
        }

        Member member = new Member(name, email, password);
        memberRepository.register(member);

    }


//    회원상세조회
    public Member findById(Long id) throws NoSuchElementException{
//        Optional 객체에 값이 없을 경우 예외 발생. 있으면 Member를 꺼내서 return
        return memberRepository.findById(id).orElseThrow(() -> new NoSuchElementException("해당 id의 회원은 존재하지 않습니다."));


    }

//    회원목록조회
    public List<Member> findAll(){
        return memberRepository.findAll();
    }

//    log in
    public void login(String email, String password) throws NoSuchElementException, IllegalArgumentException{
        Optional<Member> optionalMember = memberRepository.findByEmail(email);
        if (!optionalMember.isPresent()){
            throw new NoSuchElementException("잘못된 이메일입니다.");
        }
        if (optionalMember.get().getPassword().equals(password)){
            throw new IllegalArgumentException("비밀번호가 틀렸습니다");
        }
    }
}

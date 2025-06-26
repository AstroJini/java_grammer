package C07ExceptionFileParsing.MemberException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//저장소역할을 하는 계층
//나중에는 DB와 상호작용하는 계층이 될 것임 | DB에 CRUD를 수행하는 계층
public class MemberRepository {
    private static List<Member> memberList = new ArrayList<>();

//    회원가입
    public void register(Member member){ //회원가입
        memberList.add(member);
    }

//    회원상세조회
    public Optional<Member> findById(Long id){
//        for (Member member : memberList){
//            if (member.getId().equals(id)){
//                return Optional.ofNullable(member);
//            }
//        }
//        return Optional.empty();

        return memberList.stream().filter(member -> member.getId()==id).findFirst();
    }

    public Optional<Member> findByEmail(String email){
//        for (Member member : memberList){
//            if (member.getEmail().equals(email)){
//                return Optional.of(member);
//            }
//        }
//        return Optional.empty();
        return memberList.stream().filter(member -> member.getEmail()==email).findFirst();
    }

//    회원목록조회
    public List<Member> findAll(){
        return memberList;
    }

}

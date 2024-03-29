package ch11.sec01.exam03;

public class Member {
    public String id;

    public Member(String id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Member){
            Member member = (Member) obj;
            if(id.equals(member.id)){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return id.hashCode();
    } // id가 동일한 문자열인 경우 같은 해시 코드를 리턴
}

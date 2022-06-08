package ch06.sec04.quiz;

public class MemberService {
    String ID[] = new String[]{"hong", };
    boolean status = false;
    String loginID = "";
    boolean login(String id, String pw){
        for(int i=0; i<ID.length; i++){
            if(ID[i].equals(id)){
                status = true;
                loginID = id;
                break;
            }
        }
        return status;
    }

    void logout(String id){
        if(status){
            if(id.equals(loginID)){
                System.out.println("로그아웃 되었습니다.");
                status = false;
                loginID = "";
            }
            else{
                System.out.println("로그아웃 하려는 id가 아닙니다.");
            }
        }
        else{
            System.out.println("아직 로그인 하지 않았습니다.");
        }
    }
}

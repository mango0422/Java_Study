package ch11.sec01.verify.exam04;

public class Member {
    private String id;
    private String name;

    public Member(String id, String name){
        this.id = id;
        this.name = name;
    }

    //여기서 코드를 작성하시오.
    @Override
    public String toString(){
        return id + ": " + name;
    }
}

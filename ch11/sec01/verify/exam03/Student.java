package ch11.sec01.verify.exam03;

public class Student{
    private String studentNum;

    public Student(String studentNum){
        this.studentNum = studentNum;
    }
    public String getStudentNum(){
        return studentNum;
    }

    //여기서 코드를 작성하시오
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student){
            Student compareStudent = (Student) obj;
            if(this.studentNum == compareStudent.studentNum){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode(){
        return Integer.parseInt(studentNum);
    }
}
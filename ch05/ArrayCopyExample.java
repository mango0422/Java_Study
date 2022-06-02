package ch05;

public class ArrayCopyExample {
    public static void main(String[] args){
        String[] oldStrArray = { "java", "array", "copy" };
        String[] newStrArray = new String[5];

        System.arraycopy( oldStrArray, 0, newStrArray, 0, oldStrArray.length);

        for(int i=0; i<newStrArray.length; i++){
            System.out.print(newStrArray[i] + ", ");
        }
    }
}

/*
System.arraycopy() 메소드 사용법:

System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length);

src 매개값은 원본 배열이고, srcPos는 원본 배열에서 복사할 항목의 시작 인덱스이다.
dest 매개값은 새 배열이고, destPos는 새 배열에서 붙여넣을 시작 인덱스이다.
마지막으로 length는 복사할 개수이다.
예를 들어 원본 배열이 arr1이고 새 배열이 arr2일 경우 arr1의 모든 항목을 arr2에 복사하려면 다음과 같이 System.arraycopy() 메소드를 호출하면 된다.

System.arraycopy(arr1, 0, 0, arr2, arr1.length);
__________________________________________________________________________
복사되지 않은 항목은 String[] 배열의 초기값 null이 그대로 유지된다.
참조 타입 배열이 복사되면 복사되는 값이 객체의 번지이므로 새 배열의 항목은 이전 배열의 항목이 참조하는 객체와 동일하다.
*/
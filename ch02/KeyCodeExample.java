package ch02;
public class KeyCodeExample {
    public static void main(String[] args) throws Exception {
        int keyCode;

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);

        keyCode = System.in.read();
        System.out.println("keyCode: " + keyCode);
    }
}

/*
main() 메소드 끝에 throws Exception이 붙어 있는데, 이것은 System.in.read()에 대한 예외 처리 코드이다.
예외처리에 대해서는 10장에서 자세히 살펴 볼 예정.

A = 65
Z = 90
a = 97
z = 122

← = 37
↑ = 38
→ = 39
↓ = 40
*/
package ch09.sec02.exam03;

public class Button {
    OnClickListener listener; // 인터페이스 타입 필드

    void setOnClickListener(OnClickListener listener){ // 매개 변수의 다형성
        this.listener = listener;
    }

    void touch(){
        listener.onClick(); // 구현 객체의 onClick() 메소드 호출
    }

    static interface OnClickListener{ // 중첩 인터페이스
        void onClick();
    }
}

/*
 * Button 클래스의 내용을 보면 중첩 인터페이스(OnClickListener) 타입으로 필드(listener)를 선언하고 Setter 메소드(setOnClickListener())로 외부에서 구현 객체를 받아 필드에 대입한다.
 * 버튼 이벤트가 발생했을 때(touch() 메소드가 실행되었을 때) 인터페이스를 통해 구현 객체의 메소드를 호출(Listener.onClick())합니다.
 */
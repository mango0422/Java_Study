package ch08.sec01.exam04;

public class Audio implements RemoteControl{
    //필드 
    private int volume;
    //turnOn() 추상 메소드의 실체 메소드
    public void turnOn(){
        System.out.println("Audio를 켭니다.");
    }
    //turnOff() 추상 메소드의 실체 메소드
    public void turnOff(){
        System.out.println("Audio를 끕니다");
    }
    //setVolume() 추상 메소드의 실체 메소드
    public void setVolume(int volume){
        if(volume>RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if(volume<RemoteControl.MIN_VOLUME){
            this.volume = RemoteControl.MIN_VOLUME;
        } else{
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨: " + this.volume);
    }
}

/*
 * 구현 클래스가 작성되면 new 연산자로 객체를 생성할 수 있다.
 * 하지만 다음 코드는 인터페이스를 사용한 것이 아니다.
 * Television tv = new Television();
 * 인터페이스로 구현 객체를 사용하려면 다음과 같이 인터페이스 변수를 선언하고 구현 객체를 대입해야 한다.
 * 인터페이스 변수는 참조 타입이기 때문에 구현 객체가 대입될 경우 구현 객체의 번지를 저장한다.
 * RemoteControl 인터페이스로 구현 객체인 Televsion과 Audio를 사용하려면 다음 에제와 같이 RemoteControl 타입 변수 rc를 선언하고 구현 객체를 대입해야 한다.
 */
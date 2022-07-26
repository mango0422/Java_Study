package ch09.sec01.verify.exam05;

public class BackgroundChangeListener implements CheckBox.OnselectListener{
    @Override
    public void onSelect(){
        System.out.println("배경을 변경합니다.");
    }
}

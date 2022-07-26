package ch09.sec01.verify.exam04;

public class Chatting {
    void startChat(String chatId){
        // String nickName = null;
        // nickName = chatId;
        String nickName = chatId;

        class Chat{
            public void start(){
                while(true){
                    String inputData = "안녕하세요";
                    String message = "[" + nickName + "] " + inputData;
                    sendMessage(message);
                }
            }

            void sendMessage(String message){
            }
        }

        Chat chat = new Chat();
        chat.start();
    }
}

/*
 * nickName은 final특성을 갖고 있기 때문에 5라인에서 변경할 수 없다.
 * 수정 : 4,5라인을 없애고 String nickname = chatId;를 넣는다.
 */
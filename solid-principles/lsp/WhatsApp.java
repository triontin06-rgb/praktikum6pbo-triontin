package lsp;

public class WhatsApp implements VideoGroupManager {

    @Override
    public void chat() {
        System.out.println("fitur chat");
    }

    @Override
    public void sendPhotoAndVideo() {
        System.out.println("fitur kirim foto dan video");
    }

    @Override
    public void callGroupVideo() {
        System.out.println("fitur telpon grup wa");
    } 
    
}

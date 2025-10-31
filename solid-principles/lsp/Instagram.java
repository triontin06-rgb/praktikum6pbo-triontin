package lsp;

public class Instagram implements PostMediaManager {

    @Override
    public void chat() {
        System.out.println("fitur chat ig");
    }

    @Override
    public void sendPhotoAndVideo() {
        System.out.println("fitur kirm foto dan video");
    }

    @Override
    public void publishPost() {
        System.out.println("fitur publish postingan ig");
    }

}

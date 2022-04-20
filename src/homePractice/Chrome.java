package homePractice;

public class Chrome extends Browser implements Bookmark{


    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("Chrome is going to : " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Chrome is opening new tab and going " + url);
    }

    @Override
    public void addUrlToBookmark() {
        System.out.println("Adding current URL to the Bookmark in Chrome ");
    }

    @Override
    public void addUrlToBookmark(String url) {
        System.out.println("Adding URL to Chrome " + url);
    }

    @Override
    public void removeUrlFromBookmark() {
        System.out.println("Removing current Url from the Bookmark in Chrome");
    }
}

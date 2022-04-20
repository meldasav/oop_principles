package homePractice;

public class IE extends Browser{
    @Override
    public void openBrowser() {
        System.out.println("IE is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("IE is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("going to url on IE"  + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println( "IE is opening in new tab" + url);
    }
}

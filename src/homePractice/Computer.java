package homePractice;

public class Computer {
    public static void main(String[] args) {
        Chrome chrome=new Chrome();
        chrome.openBrowser();
        chrome.goToUrl("google.com");
        chrome.closeBrowser();
        chrome.addUrlToBookmark();
        chrome.closeBrowser();
    }
}

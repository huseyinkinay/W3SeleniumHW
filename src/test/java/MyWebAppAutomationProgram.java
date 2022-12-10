public class MyWebAppAutomationProgram {
    static Methodlarim mt = new Methodlarim();
    static Sabitler obje = new Sabitler();



    public static void main(String[] args) throws InterruptedException {
        mt.gotoURL(obje.URL);
        //mt.click_byLinkText();
        mt.aramaTerimi(obje.ARAMA);



    }
}

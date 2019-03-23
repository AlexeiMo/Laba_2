package sample;

public class User {
    static int film_cnt;
    private Browser expander;
    private Computer comp;
    private Video_Player player;
    private Program p;

    public User() {
        expander = new Browser("expander");
        comp = new Computer();
        player = new Video_Player("video player");
        p = new Program(" ");
    }
    public void downloadProgram() {
        expander.openWebPage();
        expander.downloadProgram();
    }
    public void installBrowser() {
        Browser fc = new Browser("firecat");
        comp.addProgram(fc);
    }
    public void deleteBrowser() {
        comp.deleteProgram();
    }
    public Program downloadFilm() {
        //p = comp.st.getLast();
        String name;
        Browser fc = new Browser("firecat");
        fc.openWebPage();
        fc.downloadProgram();
        name = "film" + film_cnt;
        film_cnt++;
        p.setName(name);
        return p;
    }
    public String watchFilm() {
        return player.PlayFilm(p);
    }
}
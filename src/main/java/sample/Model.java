package sample;

public class Model {
    private User user;
    private Program film;

    public Model() {
        user = new User();
        film = new Program(" ");
    }
    public void downloadBrowser(View view){
        user.downloadProgram();
        view.setGrid2();
    }

    public void installBrowser(View view) {
        user.installBrowser();
        view.setGrid3();
    }

    public void cancelInstallation(View view) {
        view.setGrid1();
    }

    public void downloadFilm(View view) {
        film = user.downloadFilm();
        view.setGrid4();
    }

    public void deleteBrowser(View view) {
        user.deleteBrowser();
        view.setGrid2();
    }

    public void watchFilm(View view) {
        view.setGrid5(film);
    }

    public void deleteFilm(View view) {
        view.setGrid3();
    }

    public void returnToPlayer(View view) {
        view.setGrid4();
    }
}


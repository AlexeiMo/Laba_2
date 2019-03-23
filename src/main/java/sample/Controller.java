package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class Controller {
    private sample.View view = new sample.View();
    private sample.Model model = new sample.Model();

    public void setGridPane() {
        view.setGrid1();
    }

    EventHandler<ActionEvent> downloadBrowserEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.downloadBrowser(view);
        }
    };

    EventHandler<ActionEvent> installBrowserEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.installBrowser(view);
        }
    };

    EventHandler<ActionEvent> ExitEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            Platform.exit();
        }
    };

    EventHandler<ActionEvent> cancelInstallationEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.cancelInstallation(view);
        }
    };

    EventHandler<ActionEvent> downloadFilmEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.downloadFilm(view);
        }
    };

    EventHandler<ActionEvent> deleteBrowserEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.deleteBrowser(view);
        }
    };

    EventHandler<ActionEvent> watchFilmEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.watchFilm(view);
        }
    };

    EventHandler<ActionEvent> deleteFilmEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.deleteFilm(view);
        }
    };

    EventHandler<ActionEvent> returnToPlayerEvent = new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
            model.returnToPlayer(view);
        }
    };

    public Controller() {
        view.setDownloadBrowserEvent(downloadBrowserEvent);
        view.setExitEvent(ExitEvent);
        view.setInstallBrowserEvent(installBrowserEvent);
        view.setCancelInstallationEvent(cancelInstallationEvent);
        view.setDownloadFilmEvent(downloadFilmEvent);
        view.setDeleteBrowserEvent(deleteBrowserEvent);
        view.setWatchFilmEvent(watchFilmEvent);
        view.setDeleteFilmEvent(deleteFilmEvent);
        view.setReturnToPlayerEvent(returnToPlayerEvent);
    }
}


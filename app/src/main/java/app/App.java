package app;

import logging.Logger;
import persistence.Repository;

public class App {

    private Repository repository;

    public App() {
        this.repository = new Repository();
        repository.set("message", "go go go");
    }

    public App(Repository repository) {
        this.repository = repository;
    }

    public String go() {
        return repository.get("message");
    }

    public static void main(String[] args) {
        Logger logger = new Logger();
        logger.log(new App().go());
    }
}

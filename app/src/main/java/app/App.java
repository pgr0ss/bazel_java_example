package app;

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
        System.out.println(new App().go());
    }
}

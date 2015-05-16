package app;

import persistence.Repository;

public class App {
    public String go() {
        Repository repository = new Repository();
        repository.set("message", "go go go");
        return repository.get("message");
    }

    public static void main(String[] args) {
        System.out.println(new App().go());
    }
}

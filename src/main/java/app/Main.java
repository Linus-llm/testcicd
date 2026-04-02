package app;

import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.showJavalinBanner = true;
        }).start(7070);

        app.get("/", ctx -> ctx.result("Server is running 🚀"));
        app.get("/health", ctx -> ctx.json("{\"status\":\"OK\"}"));
    }
}
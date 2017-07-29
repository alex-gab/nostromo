package com.alex.nostromo;

import static java.util.Objects.requireNonNull;

public final class Game {
    private final long id;
    private final String name;
    private final String platform;
    private String developer;
    private String publisher;

    Game(long id, String name, String platform) {
        this.id = id;
        this.name = requireNonNull(name);
        this.platform = requireNonNull(platform);
    }

    void setDeveloper(String developer) {
        this.developer = developer;
    }

    void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPlatform() {
        return platform;
    }

    public String getDeveloper() {
        return developer;
    }

    public String getPublisher() {
        return publisher;
    }
}

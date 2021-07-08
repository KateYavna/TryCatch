package com.example.trycatch;

public class Reaction {
    public int thumbsUp, oks, hearts;

    public Reaction(int thumbUp, int ok, int heart) {
        this.thumbsUp = thumbUp;
        this.oks = ok;
        this.hearts = heart;
    }

    public int getThumbsUp() { return thumbsUp;
    }

    public int getOks() {
        return oks;
    }

    public int getHearts() {
        return hearts;
    }

    public void setThumbsUp(int thumbsUp) {
        this.thumbsUp = thumbsUp;
    }

    public void setOks(int oks) {
        this.oks = oks;
    }

    public void setHearts(int hearts) {
        this.hearts = hearts;
    }
}

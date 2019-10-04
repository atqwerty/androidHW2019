package com.example.reddit;

public class Post {
    public String subReddit;
    public String user;
    public String postDate;
    public int upvotes;
    public int comments;
    public String postText;
//    private BufferedImage image;

    public Post(String subReddit, String user, String postDate, String postText) {
        this.subReddit = subReddit;
        this.user = user;
        this.postDate = postDate;
        this.postText = postText;
    }
}

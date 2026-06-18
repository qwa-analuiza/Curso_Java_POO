package domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
    private String id;
    private Date date;
    private String title;
    private String body;
    private String  author;

    private List<Comment> comments = new ArrayList<>();
}

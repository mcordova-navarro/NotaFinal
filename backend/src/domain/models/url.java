package domain.models;

//models means all the interfaces that could be exits based on the case
//in this oportunity we use java 

public class url {
    private String id;
    private String title;

    public url(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
}


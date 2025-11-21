package infrastructure.http.dto;

public class url {
    private  String id;
    private String title;
    private String Type;

    public url(String id, String titleString1, String Type ){
        this.id =id;
        this.title = titleString1;
        this.Type = Type;
    }
    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getType(){
        return Type;
    }
}




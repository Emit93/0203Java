package pl.teb.edukacja.projektjeden;

public class Greeting {
    public void setId(long id) {
        this.id = id;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private  long id;
    private  String content;

    public long getId (){
        return id;
    }
    public String getContent ()
    {return content;
    }
}

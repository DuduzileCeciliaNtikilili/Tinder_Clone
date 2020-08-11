public class Image {

     // I can create Instance variables and am able to use another class type variable in another class
    //Fields:
    private String url;
    private String description;
    private String title;
    private String tags; //Array

    // I am able to create contructors and understand what a constructor does
    //Constructor:
    public Image(String url, String description, String title, String tags) {
        this.url = url;
        this.description = description;
        this.title = title;
        this.tags = tags;

    }
     // I know how to create a toString() function
    // I know what a toString() function does
    //Methods:
    @Override
    public String toString() {
        return title + "\n" + description + "\nURL = " + url + "\nTags='" + tags;

    }
     // I know to create setters and gatters
     //I know why i am creatiing setters & gatter
    //Setters:
    public void setDescription(String description) {
        this.description = description;

    }

    public void setTitle(String title) {
        this.title = title;

    }
    
    public void setTags(String tags) {
        this.tags = tags;

    }


    //getters
    public String getUrl() {
        return url;

    }

    public String getDescription() {
        return description;

    }

    public String geTtitle() {
        return title;

    }

    public String getTags() {
       return tags;

    }
}
    
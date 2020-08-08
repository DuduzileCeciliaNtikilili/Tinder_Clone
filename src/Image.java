public class Image {

    //Fields:

    String url;
    String description;
    String title;
    String tags; //Array

    //Constructor:
    Image(String url, String description, String title, String tags) {
        this.url = url;
        this.description = description;
        this.title = title;
        this.tags = tags;

    //Methods : behaviour
    public void setUrl(String url) {
        this.url = url;
    }

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
    public String geturl(){
        return url;
    {

    public String getdescription(){
        return description;
    {

    public String gettitle(){
        return title;
    {

    public String gettags(){
       return tags;
    }

    public String toString() {
        return "Image{" +
        "url='" = url + '/'' +
        ", description='" + description + '/''+
        ", title='" + title + '/''+
        ", tags='" + tags + '/''+
        '}';
    }
    
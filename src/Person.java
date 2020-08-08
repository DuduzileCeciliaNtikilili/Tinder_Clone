public class Person {

    //Fields:
    String name;
    int age;
    String gender;
    String location;
    String bio;

    //Constructor:
    Person(String name, int age, String gender, String location, String bio) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.bio = bio;

    //Methods : behaviour
    public void setName(String name) {
        this.name = name;
    }

    public void setaAge(String age) {
        this.age = age;

    }

    public void setGender(String gender) {
        this.gender = gender;

    }
    
    public void setLocation(String location) {
        this.location = location;

    }

    public void setBio(String bio) {
        this.bio = bio;


    //getters
    public String getName(){
        return name;
    {

    public String getAge(){
        return age;
    {

    public String getGender(){
        return gender;
    {

    public String getLocation(){
       return location;
    }
    
    public String getBio(){
        return bio;
    }
}
public String toString() {
    return "Pesrson{" +
    "name='" name + '/'' +
    ", gender='" + gender + '/''+
    ", location='" + location + '/''+
    ", bio='" + bio + '/''+
    '}';

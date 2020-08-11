public class Person {
     
     // I can create Instance variables and am able to use another class type variable in another class
    //Fields:
    private String name;
    private String surname;
    private int age;
    private String gender;
    private String location;
    private String bio;
    
    // I am able to create contructors and understand what a constructor does
    //Constructor:
    Person(String name, String surname, int age, String gender, String location, String bio) {
        this.name = name;
        this.surname = surname
        this.age = age;
        this.gender = gender;
        this.location = location;
        this.bio = bio;

    }
     // I know how to create a toString() function
    // I know what a toString() function does
    //Methods:
    @Override 
    public String toString() {
        return name + ", " + surname +"," + age + "," + gender + '\n' + location + '\n' + bio;
    }
     // I know to create setters and gatters
     //I know why i am creatiing setters & gatters
    //Getters
    public String getName(){
        return name;
    }
    
    public String getSurname(){
        return Surname;

    }
    public int getAge(){
        return age;

    }

    public String getGender(){
        return gender;
    }

    public String getLocation(){
       return location;
    }
    
    public String getBio(){
        return bio;
    }
    
    //Setters:
    public void setName(String name) {
        this.name = name;

    }

    public void setSurname(String surname) {
        this.surname = surname;

    }

    public void setAge(int age) {
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

    }
}

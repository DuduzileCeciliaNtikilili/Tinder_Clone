public class Profile {

     // Ican create Instance variables and am able to use another class type variable in another class
    //Fields:
    private Person person;
    private Image[] images = new Image [3];
    private int imageNumber = 2;

    // I am able to create contructors and understand what a constructor does
    //Constructor:
    Profile(Person person, Image image1, Image image2, Image image3) {
        this.person = person;
        images[0] = image1;
        images[1] = image2;
        images[2] = image3;

    }
    // I know how to create a toString() function
    // I know what a toString() function does
    //Methods:
    @Override
    public String toString() {
        return person + "\n" + nextImage();
    
    }
    public Image nextImage() {
        if (imageNumber == 2) {
            imageNumber = 0;
        } else {
            imageNumber++;
        }
        return images[imageNumber];

        }

    //Setters:
    public void setPerson(Person person) {
        this.person = person;

    }

    public void setImages(Image[] images) {
        this.images = images;

    }

    public void setImageNumber(int imageNumber) {
        this.imageNumber = imageNumber;

    }

    // Getters:
    public Person getPerson() {
        return person;

    }
    
    public Image[] getImages() {
        return image;

    }

    public int getImageNumber() {
        return imageNumber;

    }
}
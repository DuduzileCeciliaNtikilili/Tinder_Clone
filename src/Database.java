import java.io.BufferedReader;
import java.io.FileReader;

public class Database {

    //Fields:
    int numberOfUsers;
    int numberOfMales;
    int numberOfFemales;
    Profile[] profiles;

    //contructor
    Database() {};

    //Methods:

    public int countLineIncCSV(String filesname) {
        int i = 0;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(filesname));
            String row = null;
            while ((row = csvReader.readLine()) !=null) {
                i++;
            }
            csvReader.close();
        } catch(Exception e) {
            System.out.println("Error: " = e.toString());

        }

        return i;

    }

    //Getters:
    public void getUserArray() {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("users.csv"));
            String row = null;
            int i 0;
            profiles = new Pro
        }
    }

        }
        
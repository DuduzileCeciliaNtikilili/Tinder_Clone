import java.io.BufferedReader;
import java.io.FileReader;

public class Database {

    // I can create Instance variables and am able to use another class type variable in another class
    //Fields:
    private int numberOfUsers;
    private int numberOfMales;
    private int numberOfFemales;
    private Profile[] profiles;

    // I am able to create contructors and understand what a constructor does
    //contructor
    Database() {};

     // I know how to create a toString() function
    // I know what a toString() function does
   //Methods:
    public int countLineIncCSV(String filesname) {
        int i = 0;
        try {
            BufferedReader csvReader = new BufferedReader(new FileReader(filesname));
            while (csvReader.readLine() != null) {
                i++;

            }

            csvReader.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.toString());

        }

        return i;

    }

    //Getters:
    // I know how to create setters and gatters
    // Iknow how to read and write to CSV
    public void getUserArray() {

        try {
            BufferedReader csvReader = new BufferedReader(new FileReader("users.csv"));
            String row = null;
            int i = 0;
            profiles = new Profile[countLinesInCSV("users.csv")-1];

            while ((row = csvReader.readLine()) != null) {
                if(i > 0) {
                    String[] data = row.split(",");
                    Image image1 = new Image(data[6].trim(), data[7].trim(), data[8].trim(), data[9].trim());
                    Image image2 = new Image(data[10].trim(), data[11].trim(), data[12].trim(), data[13].trim());
                    Image image3 = new Image(data[14].trim(), data[15].trim(), data[16].trim(), data[17].trim());
                    Person person = new Person(data[0].trim(), data[1].trim(), Integer.parseInt(data[2].trim()), data[3].trim(), data[4].trim(), data[5].trim());
                    Profile profile = new Profile(person, image1, image2, image3);

                    if(data[3].trim().equals("M")) {
                        numberOfMales++;
                    } else if(data[3].trim().equals("F")) {
                        numberOfFemales++;
                    }
                    numberOfUsers++;

                    profiles[i - 1] = profile;
                }

                i++;
            }

            csvReader.close();
        } catch(Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
    // I have the ability to call created class object 
    // I have the ability to add one class object to other new class object
    public Profile[] getArrayByGender(String gender) {

        Profile[] males = new Profile[numberOfMales];
        Profile[] females = new Profile[numberOfFemales];
        Profile[] users = new Profile[numberOfUsers];

        int mIndex = 0;
        int fIndex = 0;
        int uIndex = 0;


        for (int i = 0; i < profiles.length; i++) {
            if(profiles[i].getPerson().getGender().equals("M")) {
                males[mIndex] = profiles[i];
                mIndex++;
            } else if(profiles[i].getPerson().getGender().equals("F")) {
                females[fIndex] = profiles[i];
                fIndex++;
            }

            users[uIndex] = profiles[i];
            uIndex++;
        }

        if(gender.equals("M")) {
            return males;
        } else if(gender.equals("F")) {
            return females;
        }

        return users;
    }
}
        }
    }

        }
        
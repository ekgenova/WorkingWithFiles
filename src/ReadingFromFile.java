import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFile {

    private static final String filename = "C:\\Users\\Admin\\MyApps\\WorkingWithFiles\\workingWithFiles.txt";

    private ArrayList<Person> peopleList2 = new ArrayList<>();

    void readFromFile() {
        FileReader fileReader;
        BufferedReader bufferedReader;

        try {
            fileReader = new FileReader(filename);
            bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] personDetails = line.split(",");
                int age = Integer.parseInt(personDetails[2]);
                Person newPerson = new Person(personDetails[0], personDetails[1], age);
                peopleList2.add(newPerson);
            }

            for (Person person: peopleList2){
                System.out.println(person.toString());
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}

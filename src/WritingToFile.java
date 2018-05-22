import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WritingToFile {

    private static final String filename = "C:\\Users\\Admin\\MyApps\\WorkingWithFiles\\workingWithFiles.txt";

    private ArrayList<Person> peopleList = new ArrayList<>();

    private void populateArray() {
        peopleList.add(new Person("Ekaterina", "Consultant", 23));
        peopleList.add(new Person("Stanislav", "Artist", 25));
        peopleList.add(new Person("Benjamin", "Unemployed", 27));
        peopleList.add(new Person("Frankie", "Shop floor assistant", 23));
        peopleList.add(new Person("Antoniya", "Nurse", 47));
    }


    void writeToFile() {

        populateArray();
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;

        try {
            fileWriter = new FileWriter(filename);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Person person : peopleList) {
                bufferedWriter.write(person.toString());
                bufferedWriter.newLine();
            }

            System.out.println("Done!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //writers need to either close or flush at the end of a process for it to go through
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NullPointerException ne) {
                System.out.println("Null pointer exception.");
            }
        }
    }
}

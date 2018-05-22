public class Main {

    public static void main(String[] args) {

        WritingToFile write = new WritingToFile();
        ReadingFromFile read = new ReadingFromFile();

        write.writeToFile();
        read.readFromFile();
    }
}

import space.prv.library.io.Filereader;
import space.prv.library.text.PrvText;

public class TestClass {

    public static void main(String[] args){
        String[] array = Filereader.readAllLines("test.prv");
        PrvText.printArray(array);
    }

}

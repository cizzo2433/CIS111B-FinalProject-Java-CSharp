import com.javonet.Javonet;
import com.javonet.JavonetException;
import com.javonet.JavonetFramework;

public class Test {
    public static void main(String[] args) throws JavonetException {
        Javonet.activate(Constants.email, Constants.APIkey, JavonetFramework.v40);
        Javonet.addReference(Constants.filePath);
        Javonet.getType("Program").invoke("CheckForBlueCharm");
        //test
    }
}

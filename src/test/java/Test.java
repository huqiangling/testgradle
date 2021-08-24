import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/***************************************************************************************
 *功能介绍：
 *@date 2021/8/2121:30
 ***************************************************************************************/
public class Test extends ClassLoader {


    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        File f = new File("",name.replaceAll(".","/").concat(".class"));
        try {
            FileInputStream fileInputStream = new FileInputStream(f);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }
}

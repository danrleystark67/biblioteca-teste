package visao;
import java.util.Scanner;
public abstract class BaseMenu extends BaseUtil {
    public abstract int execuar();

    public BaseMenu(Scanner sc){
        super(sc);
    }
}

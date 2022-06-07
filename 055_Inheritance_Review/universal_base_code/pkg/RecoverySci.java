package pkg;
import java.util.Scanner;
import java.util.Random;


public class RecoverySci extends Science {
    
    public void setCred() {
        if(grade > 60) {
            cred = 4;
        }
        else {
            cred = 0;
        }
    }

}


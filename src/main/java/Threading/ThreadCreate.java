package Threading;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ThreadCreate {
    int x = 500;

    @Override
    public String toString() {
        return
                "x=" + x ;
    }

    public void zee(){
        int x = 100;
        List<String> li = Arrays.asList("bhaskar");
        Collections.sort(li);
        System.out.println(x);
        Thread t = Thread.currentThread();
        System.out.println(t);
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        ThreadCreate j = new ThreadCreate();
        j.zee();
    }
}

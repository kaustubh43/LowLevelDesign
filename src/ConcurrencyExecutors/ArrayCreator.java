package ConcurrencyExecutors;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class ArrayCreator implements Callable{
    private int n;

    public ArrayCreator(int n) {
        this.n = n;
    }

    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            result.add(i);
        }
        return result;
    }
}

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class JenerycsArray {

    public static <T> T[]convert(Class<T> clazz, List<T> values) {
        T[]array = (T[]) Array.newInstance(clazz, values.size());
        for(int i = 0; i < values.toArray().length; i++) {
            array[i] = values.get(i);
        }
        return array;
    }
    public static void main(String[] args) {

    }


}

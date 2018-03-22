package generics;

import java.util.ArrayList;
import java.util.List;

public class ListMarker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMarker<String> stringMarker = new ListMarker<String>();
        List<String> stringList = stringMarker.create();
    }
}

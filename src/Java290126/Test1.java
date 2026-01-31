package Java290126;

import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[]args) {
        Stream<Integer>strm1=List.of(10,8,14,25,20,6,19).stream();
        Stream<Integer>filtered=strm1.filter(n->n>10);
        filtered.forEach(System.out::println);
        Stream<String>names=Stream.of("amit","sumit","abhit","surjit");
        System.out.println(names.filter(s->s.endsWith("it")).map(s->{
                    return s.toUpperCase();
                })
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList()));



    }
}
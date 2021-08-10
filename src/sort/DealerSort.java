package sort;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * https://www.onlinegdb.com/ccVEW-qak
 */
public class DealerSort {

    public static void main(String[] args) {
        List<Person> result = sortPerson(getPersonsData());
        System.out.println("Sort by No with No 1 on top, then byDistance then byFee \n");
        result.forEach(System.out::println);
    }

    public static List<Person> sortPerson(List<Person> personList) {
        Comparator<Person> byNo = Comparator.comparing(p ->
                        Optional.ofNullable(p.getNo())
                                .map(i -> i == 1 ? -1 : 1).orElse(null)
                , Comparator.nullsLast(Comparator.naturalOrder())
        );

        Comparator<Person> byDistance = Comparator.comparing(p ->
                        Optional.ofNullable(p.getDistance()).orElse(null)
                , Comparator.nullsLast(Comparator.naturalOrder())
        );

        Comparator<Person> byFee = Comparator.comparing(p ->
                        Optional.ofNullable(p.getFee()).orElse(null)
                , Comparator.nullsLast(Comparator.naturalOrder())
        );

        return personList.stream()
                .sorted(byNo.thenComparing(byDistance).thenComparing(byFee))
                .collect(Collectors.toList());
    }

    public static List<Person> getPersonsData() {

        List<Person> psns = new ArrayList<>();
        psns.add(new Person(3, 90.0, 20.0));
        psns.add(new Person(2, 90.0, 30.0));
        psns.add(new Person(3, 70.0, 30.0));
        psns.add(new Person(2, 80.0, 30.0));
        psns.add(new Person(1, 90.0, 30.0));
        psns.add(new Person(1, 100.0, 30.0));

        return psns;
    }
}

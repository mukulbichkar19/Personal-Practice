import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.IntStream;

public class Streams {

  /**
   * convertCase : Convert list to stream and also process it
   * @author Mukul
   */
  private static void convertCase() {

    List<String> cities = new ArrayList<>(Arrays.asList("New York", "Boston",
     "Philadelphia", "San Diego", "Austin","Maryland", "Seattle", "Los Angeles"
     , "San Francisco", "San Jose"));


    List<String> CITIES = cities.stream().map(String::toUpperCase).collect(Collectors.toList());

    CITIES.stream().forEach(x -> System.out.println(x));

  }

  /**
   * filterCase : Filter operation applied on traditional list by converting
   *              it to streams and then closing the pipeline.
   * @author Mukul
   */
  private static void filterCase() {
    List<String> cities = new ArrayList<>(Arrays.asList("New York", "Boston",
     "Philadelphia", "San Diego", "Austin","Maryland", "Seattle", "Los Angeles"
     , "San Francisco", "San Jose"));

     List<String> citiesStartingWithS = cities.stream()
                                        .map(String::toLowerCase)
                                        .filter(city -> city.toCharArray()[0] == 's')
                                        .collect(Collectors.toList());


      citiesStartingWithS.stream().forEach(System.out::println);
  }

  /**
   * convertArraysToStream : Convert Primitive and Non-Primitve arrays to stream
   */
  private static void convertArraysToStream(){


    int[] array = {12, 35, 11, 89, 99, 154};

    String[] cities = {"New York", "Boston",
     "Philadelphia", "San Diego", "Austin","Maryland", "Seattle", "Los Angeles"
     , "San Francisco", "San Jose"};

    // For primitives data types actual stream of that data type is needed
    // Generic Stream does not work
    IntStream convertedStream = Arrays.stream(array);

    // Non-primitive data types can be converted to generic stream directly
    Stream<String> citiesStream = Arrays.stream(cities);

    // Stream.of
    // For non-primitve data types stream.of can be used directly
    Stream<String> citiesStream2 = Stream.of(cities);

    // For primives data type Stream.of cannnot be processed directly
    Stream<int[]> convertedStream2 = Stream.of(array);
    IntStream intStream = convertedStream2.flatMapToInt(x -> Arrays.stream(x));

    // intStream.forEach(System.out::println);
    // citiesStream2.forEach(System.out::println);
    // citiesStream.forEach(System.out::println);
    // convertedStream.forEach(System.out::println);

  }


  public static void main(String args[]) {

    convertCase();
    System.out.println("-----------------------------");
    filterCase();
    System.out.println("-----------------------------");
    convertArraysToStream();


  }

}

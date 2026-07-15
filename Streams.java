import java.util.stream.*;
import java.util.*;


public class Main
{  public static void main(String[] args) {
	    List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("Hello", "World"),
                Arrays.asList("Java", "Streams"),
                Arrays.asList("FlatMap", "Example")
        );
// Map
		Stream<Stream<String>> wordsStream = sentenceList.stream()
	                                                    .map((List<String>sentence) -> sentence.stream());
		wordsStream.forEach(stream->stream.forEach(System.out::println));
// FlatMap
		  Stream<String> wordsStream = sentenceList.stream()
                                               .flatMap((List<String>sentence) -> sentence.stream());
		  wordsStream.forEach(System.out::println);
		
		
      List<String> wordsStream = sentenceList.stream()
		                                         .flatMap((List<String>sentence) -> sentence.stream())
                                             .collect(Collectors.toList());
	    for (String word :wordsStream) {
	    System.out.println(word);
    	}

// Since Intermmediate operation is Lazy in natrue hence it is called only when terminal operation is applied
   List<Integer>numbers = Arrays.asList(1,2,3,4,5,6,7);
   Stream<Integer>numberStream = numbers.stream()
                                        .filter(n -> n>=3)
                                        .peek(n -> System.out.println(n));
    System.out.println("Count: " +numberStream.count());
    
		
		
	}
}

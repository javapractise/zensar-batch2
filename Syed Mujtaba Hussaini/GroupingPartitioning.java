import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class GroupPartition {

	public static void main(String[] args) {
		
		 Stream<Integer>
         s = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

     Map<Boolean, List<Integer> >
         map = s.collect(
        		 Collectors.partitioningBy(num -> num > 3));

   
     System.out.println("Elements in stream "
                        + "partitioned by "
                        + "less than equal to 3: \n"
                        + map);
     
  
     List<String> g
         = Arrays.asList("chocolate", "vanilla", "vanilla");

     Map<String, Long> result
         = g.stream().collect(
             Collectors.groupingBy(
                 Function.identity(),
                 Collectors.counting()));

      System.out.println(result);

	}

}

/**
Elements in stream partitioned by less than equal to 3: 
{false=[1, 2, 3], true=[4, 5, 6, 7, 8, 9, 10]}
{vanilla=2, chocolate=1}
**/
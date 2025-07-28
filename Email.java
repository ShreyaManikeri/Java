import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Email {
    public static void main(String[] args) {
        
        String[] email={"swati@yahoo.com","shreya@gmail.com","anisha@rediff.com","komal@gmail.com","tanuja@rediff.com"};

        String regex="[. @]";
  
            List<String> splitList =new ArrayList<>();

        for (String e : email) {
             List<String> parts = Arrays.stream(e.split(regex))
                                       .collect(Collectors.toCollection(ArrayList::new));
             splitList.addAll(0, parts);
        }

        long gmailCount = splitList.stream()
        .filter(e -> e.contains("gmail"))
        .count();

         long yahooCount = splitList.stream()
        .filter(e -> e.contains("yahoo"))
        .count();

         long rediffCount = splitList.stream()
        .filter(e -> e.contains("rediff"))
        .count();

        System.out.println("Gmail is used by "+gmailCount+" people");
        System.out.println("Yahoo is used by "+yahooCount+" people");
        System.out.println("Rediff is used by "+rediffCount+" people") ;

    }
    
}

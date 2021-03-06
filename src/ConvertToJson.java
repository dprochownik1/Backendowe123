
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ConvertToJson {
    public static void main(String[] arg) throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        User userObject = new User("John", 21);
        String userJson = objectMapper.writeValueAsString(userObject);

        System.out.println(userJson); // {"name":"John","age":21}
    }
}

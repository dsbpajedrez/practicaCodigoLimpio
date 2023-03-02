package co.com.sofka.mongo.document;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder(toBuilder = true)
@Document(collection = "Person")
public class PersonDocument {
    @Id
    private String id;
    private String name;
    private String email;
    private String avatar;
}

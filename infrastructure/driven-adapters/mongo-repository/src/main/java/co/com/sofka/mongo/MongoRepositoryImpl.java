package co.com.sofka.mongo;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
@Component
@AllArgsConstructor
public class MongoRepositoryImpl implements PersonRepository {
    private final MongoRepositoryAdapter mongoRepositoryAdapter;
    private MongoDBRepository mongoDBRepository;
    @Override
    public Mono<Person> create(Person person) {
        return mongoRepositoryAdapter.save(person);
    }
}

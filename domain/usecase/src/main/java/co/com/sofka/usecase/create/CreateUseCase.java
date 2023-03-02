package co.com.sofka.usecase.create;

import co.com.sofka.model.person.Person;
import co.com.sofka.model.person.gateways.PersonRepository;
import lombok.RequiredArgsConstructor;
import reactor.core.publisher.Mono;

@RequiredArgsConstructor
public class CreateUseCase {
    private final PersonRepository personRepository;
    public Mono<Person> create(Person person){
        return personRepository.create(person);
    }
}

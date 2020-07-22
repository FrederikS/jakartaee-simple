package codes.fdk.samples.jakartaee;

import java.util.Optional;

public interface FooRepository {

    Optional<Foo> findById(String id);
    void save(Foo foo);

}
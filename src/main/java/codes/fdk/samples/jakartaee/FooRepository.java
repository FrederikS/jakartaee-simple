package codes.fdk.samples.jakartaee;

import java.util.Collection;
import java.util.Optional;

public interface FooRepository {

    Collection<Foo> findAll();
    Optional<Foo> findById(String id);
    void save(Foo foo);

}
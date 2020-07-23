package codes.fdk.samples.jakartaee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class InMemoryFooRepository implements FooRepository {

    private final Map<String, Foo> store = new HashMap<>();

    @Override
    public Collection<Foo> findAll() {
        return store.values();
    }

    @Override
    public Optional<Foo> findById(String id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void save(Foo foo) {
        store.put(foo.getId(), foo);
    }

}

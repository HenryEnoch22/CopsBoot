package mx.uv.hefv.copsboot.repository.user;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


import mx.uv.hefv.copsboot.jpa.UniqueIdGenerator;
import mx.uv.hefv.copsboot.jpa.UserId;


@Component
public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> uniqueIdGenerator;

    @Autowired
    public UserRepositoryImpl(@Qualifier("inMemoryUniqueIdGenerator")UniqueIdGenerator<UUID> uniqueIdGenerator) {
        this.uniqueIdGenerator = uniqueIdGenerator;
    }
    
    @Override
    public UserId nextId() {
        return new UserId(uniqueIdGenerator.getNextUniqueId());
    }
    
    
}

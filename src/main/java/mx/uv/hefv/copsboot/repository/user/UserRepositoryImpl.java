package mx.uv.hefv.copsboot.repository.user;

import java.util.UUID;
import mx.uv.hefv.copsboot.jpa.UniqueIdGenerator;
import mx.uv.hefv.copsboot.jpa.UserId;


public class UserRepositoryImpl implements UserRepositoryCustom {
    private final UniqueIdGenerator<UUID> uniqueIdGenerator;

    public UserRepositoryImpl(UniqueIdGenerator<UUID> uniqueIdGenerator) {
        this.uniqueIdGenerator = uniqueIdGenerator;
    }
    
    @Override
    public UserId nextId() {
        return new UserId(uniqueIdGenerator.getNextUniqueId());
    }
    
    
}

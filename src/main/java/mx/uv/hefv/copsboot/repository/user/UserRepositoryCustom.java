package mx.uv.hefv.copsboot.repository.user;

import mx.uv.hefv.copsboot.jpa.UserId;

public interface UserRepositoryCustom {
    UserId nextId();
}

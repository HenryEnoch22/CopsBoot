package mx.uv.hefv.copsboot.repository.user;

import org.springframework.data.repository.CrudRepository;

import mx.uv.hefv.copsboot.jpa.UserId;
import mx.uv.hefv.copsboot.models.user.User;

public interface UserRepository extends CrudRepository<User, UserId>, UserRepositoryCustom{
}

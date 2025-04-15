package mx.uv.hefv.copsboot.jpa;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.MappedSuperclass;

import static com.google.common.base.MoreObjects.toStringHelper;

@MappedSuperclass
public abstract class AbstractEntity <T extends EntityId> implements Entity<T>{
    @EmbeddedId
    private T id;

    @ArtifactForFramework
    protected AbstractEntity() {
    }

    public AbstractEntity(T id) {
        this.id = Objects.requireNonNull(id);
    }

    @Override
    public T getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj){
        boolean result = false;
        if(this == obj){
            result = true;
        }else if(obj instanceof AbstractEntity){
            AbstractEntity other = (AbstractEntity) obj;
            result = id.equals(other.id);
        }
        return result;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return toStringHelper(this)
                .add("id", id)
                .toString();
    }

}

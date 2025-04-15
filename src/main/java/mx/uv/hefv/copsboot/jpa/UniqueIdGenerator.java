package mx.uv.hefv.copsboot.jpa;

public interface UniqueIdGenerator<T> {
    T getNextUniqueId();
}

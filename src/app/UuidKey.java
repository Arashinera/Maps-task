package app;

import java.util.Objects;
import java.util.UUID;

public class UuidKey {

    //UUID - стандарт ідентифікації 128 бітного номеру. Надає достатній рівень впевненості щодо збереження файлів
    //https://www.baeldung.com/java-uuid
    private final UUID uuid;

    public UuidKey(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public String toString() {
        return "Product Key: " + uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UuidKey uuidKey = (UuidKey) o;
        return Objects.equals(uuid, uuidKey.uuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuid);
    }
}

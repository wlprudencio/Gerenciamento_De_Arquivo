package gerenciamento_arquivo.Api.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.proxy.HibernateProxy;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "metadata")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Metadata {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer metadataid;

    private Integer videoid;

    private List<String> tags;

    private String description;


    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Metadata metadata = (Metadata) o;
        return getMetadataid() != null && Objects.equals(getMetadataid(), metadata.getMetadataid());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}

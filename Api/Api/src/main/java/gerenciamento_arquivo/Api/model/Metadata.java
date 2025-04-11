package gerenciamento_arquivo.Api.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "metadata")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Metadata {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer metadataid;

    private Integer videoid;

    private List<String> tags;

    private String description;


}



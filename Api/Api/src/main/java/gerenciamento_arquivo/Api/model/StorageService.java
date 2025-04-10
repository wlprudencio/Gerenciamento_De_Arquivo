package gerenciamento_arquivo.Api.model;

import jakarta.persistence.Table;
import lombok.*;

@Table(name = "storageservice")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class StorageService {

    private String serviceName;

    private String bucketName;

    private String apiKey;


}

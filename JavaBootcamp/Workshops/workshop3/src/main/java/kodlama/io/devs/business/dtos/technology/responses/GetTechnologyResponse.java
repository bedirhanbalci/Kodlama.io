package kodlama.io.devs.business.dtos.technology.responses;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetTechnologyResponse {
    private String name;
    private ProgrammingLanguage languageid;
}

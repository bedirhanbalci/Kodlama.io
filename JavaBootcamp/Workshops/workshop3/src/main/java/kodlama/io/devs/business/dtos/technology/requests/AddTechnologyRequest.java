package kodlama.io.devs.business.dtos.technology.requests;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddTechnologyRequest {
    private String name;
    private ProgrammingLanguage languageid;
}

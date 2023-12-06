package kodlama.io.devs.business.dtos.programmingLanguage.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllProgrammingLanguagesResponse {
    private int id;
    private String name;
}

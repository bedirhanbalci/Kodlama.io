package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateBrandRequest {

    @Size(min = 3, max = 20, message = "Brand en az 3 haneli olmalıdır!")
    private String name;
}

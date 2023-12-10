package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateModelRequest {

    @Size(min = 2, max = 20, message = "Model en az 2 haneli olmalıdır!")
    private String name;

    @Positive(message = "Doğru Brand id girişi yapınız!")
    private int brandId;
}

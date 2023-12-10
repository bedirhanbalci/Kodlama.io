package kodlama.io.rentACar.business.requests;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCarRequest {

    @Positive(message = "Doğru Car id girişi yapınız!")
    private int id;

    @Size(min = 7, max = 8, message = "Plaka 7 veya 8 haneli olmalıdır!")
    private String plate;

    @Min(value = 100, message = "Günlük kira fiyatı 100 ve üstü olmalıdır!")
    private double dailyPrice;

    @Min(value = 2013, message = "Araç yılı en az 2013 olmalıdır!")
    private int year;

    @Min(value = 0, message = "Durum 0 veya 1 olmalıdır")
    private int state;

    @Positive(message = "Doğru Model id girişi yapınız!")
    private int modelId;
}

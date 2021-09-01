package dev.patika.fourthhomeworkavemphract.exception;

import dev.patika.fourthhomeworkavemphract.model.BaseEntity;
import lombok.Data;

import java.time.LocalTime;

@Data
public class ErrorObject<T extends BaseEntity> {
    private int status;
    private String string;
    private LocalTime localTime;
    private T errorEntity;


}

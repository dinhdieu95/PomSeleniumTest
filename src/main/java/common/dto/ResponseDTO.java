package common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonFormat
public class ResponseDTO {
    @JsonProperty("code")
    private String code;
    @JsonProperty(value = "message")
    private String message;

    @Override
    public String toString() {
        return "ResponseDTO{" +
                "code='" + code + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}

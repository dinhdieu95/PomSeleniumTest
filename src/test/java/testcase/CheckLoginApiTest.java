package testcase;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.RequestAPI;
import common.dto.LoginDTO;
import common.dto.ResponseDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter2;

import java.util.HashMap;
import java.util.Map;

public class CheckLoginApiTest extends EmailableReporter2 {
    @Test
    public  void check_login(){
        Map<String, Object> request = new HashMap<>();
        LoginDTO loginDTO = new LoginDTO("105C056630","12345678");
        Response response = RequestAPI.post("https://apipub.tcbs.com.vn/authen/v1/login", request, loginDTO);
        Assert.assertEquals( response.getStatusCode() , 400, "Kết quả không khớp");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ResponseDTO rdt =  objectMapper.readValue(response.getBody().prettyPrint(), ResponseDTO.class);
            System.out.println(rdt.toString());
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

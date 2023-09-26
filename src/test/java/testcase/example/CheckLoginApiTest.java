package testcase.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import common.RequestAPI;
import common.dto.DeviceInfoDTO;
import common.dto.LoginDTO;
import common.dto.ResponseDTO;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.reporters.EmailableReporter2;

import java.util.HashMap;
import java.util.Map;

import static common.config.ApiConfig.API_LOGIN;
import static common.config.ApiConfig.KEY;

public class CheckLoginApiTest extends EmailableReporter2 {
    @Test
    public  void check_login(){
        Map<String, Object> request = new HashMap<>();// header : param , author, c
        request.put("page", 1);
        request.put("start", 0);
        request.put("limit", 5);
        request.put("Authorization", KEY);
        request.put("CompanyCode", "misast");
        request.put("Accept", "application/json");
        DeviceInfoDTO deviceInfoDTO = new DeviceInfoDTO("Windows", "Chrome", "116");


        LoginDTO loginDTO = new LoginDTO("105C056630","12345678"); // body
        loginDTO.setDevice_info(deviceInfoDTO);
        Response response = RequestAPI.post(API_LOGIN, request, loginDTO);
//      400, 200, 401, 403 , 500
//        response.getBody(); => body trả ra
//        response.getStatusCode(); => phản hồi status code
//        response.getCookies(); => thông tin cookie

        Assert.assertEquals( response.getStatusCode() , 400, "Kết quả không khớp");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            ResponseDTO rdt =  objectMapper.readValue(response.getBody().prettyPrint(), ResponseDTO.class);
            System.out.println(rdt.toString());
            Assert.assertTrue(rdt.toString().equals("ResponseDTO{code='203004', message='Username and password are not matched'}"));
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}

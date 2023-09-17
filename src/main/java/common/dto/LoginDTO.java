package common.dto;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class LoginDTO {
    private String username;
    private String password;
    private ArrayList<DeviceInfoDTO> device_info = new ArrayList<>();

    public LoginDTO() {
    }

    public LoginDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDevice_info(DeviceInfoDTO device_info) {
        this.device_info.add(device_info);

    }
}

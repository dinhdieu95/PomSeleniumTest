package common.dto;

public class DeviceInfoDTO {
    public String osName;
    public String browserName;
    public String osVersion;

    public DeviceInfoDTO(String osName, String browserName, String osVersion) {
        this.osName = osName;
        this.browserName = browserName;
        this.osVersion = osVersion;
    }
}

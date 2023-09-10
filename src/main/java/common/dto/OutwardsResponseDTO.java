package common.dto;

import java.util.ArrayList;

public class OutwardsResponseDTO {
    private float Code;
    ArrayList<DataDTO> Data = new ArrayList<DataDTO>();
    SummaryData SummaryDataObject;
    private float Total;
    private boolean Success;
    private String Environment;


    // Getter Methods

    public float getCode() {
        return Code;
    }

    public SummaryData getSummaryData() {
        return SummaryDataObject;
    }

    public float getTotal() {
        return Total;
    }

    public boolean getSuccess() {
        return Success;
    }

    public String getEnvironment() {
        return Environment;
    }

    // Setter Methods

    public void setCode(float Code) {
        this.Code = Code;
    }

    public void setSummaryData(SummaryData SummaryDataObject) {
        this.SummaryDataObject = SummaryDataObject;
    }

    public void setTotal(float Total) {
        this.Total = Total;
    }

    public void setSuccess(boolean Success) {
        this.Success = Success;
    }

    public void setEnvironment(String Environment) {
        this.Environment = Environment;
    }
}



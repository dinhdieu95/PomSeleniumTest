package common.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonFormat
@JsonIgnoreProperties
public class DataDTO {
    @JsonProperty("RefID")
    private String RefID;
    @JsonProperty("RefType")
    private float RefType;
    @JsonProperty("RefNo")
    private String RefNo;
    @JsonProperty("RefDate")
    private String RefDate;
    private String RefDateNoTime;
    private float ReasonType;
    private String BranchID;
    private String BranchName;
    private String Address;
    private String JournalMemo;
    private String AccountObjectID;
    private String AccountObjectName;
    private String EditVersion;
    private float TotalAmount;
    private float ReturnType;
    private String ReceiverName;
    private String PayerName;
    private String PayerAddress;
    private String CAJournalMemo;
    private String CARefNo;
    private String ParentID;
    private float Status;
    private String VoucherRefID;
    private float SMEStatus;
    private boolean ShowFromINInwardTransfer;
    private boolean IsAuditByValue;
    private float ACTStatus;
    private boolean IsFromBE;
    private float EditMode;
    private boolean IsAutoGenPrimaryKey;
    private float BakEditMode;


    // Getter Methods

    public String getRefID() {
        return RefID;
    }

    public float getRefType() {
        return RefType;
    }

    public String getRefNo() {
        return RefNo;
    }

    public String getRefDate() {
        return RefDate;
    }

    public String getRefDateNoTime() {
        return RefDateNoTime;
    }

    public float getReasonType() {
        return ReasonType;
    }

    public String getBranchID() {
        return BranchID;
    }

    public String getBranchName() {
        return BranchName;
    }

    public String getAddress() {
        return Address;
    }

    public String getJournalMemo() {
        return JournalMemo;
    }

    public String getAccountObjectID() {
        return AccountObjectID;
    }

    public String getAccountObjectName() {
        return AccountObjectName;
    }

    public String getEditVersion() {
        return EditVersion;
    }

    public float getTotalAmount() {
        return TotalAmount;
    }

    public float getReturnType() {
        return ReturnType;
    }

    public String getReceiverName() {
        return ReceiverName;
    }

    public String getPayerName() {
        return PayerName;
    }

    public String getPayerAddress() {
        return PayerAddress;
    }

    public String getCAJournalMemo() {
        return CAJournalMemo;
    }

    public String getCARefNo() {
        return CARefNo;
    }

    public String getParentID() {
        return ParentID;
    }

    public float getStatus() {
        return Status;
    }

    public String getVoucherRefID() {
        return VoucherRefID;
    }

    public float getSMEStatus() {
        return SMEStatus;
    }

    public boolean getShowFromINInwardTransfer() {
        return ShowFromINInwardTransfer;
    }

    public boolean getIsAuditByValue() {
        return IsAuditByValue;
    }

    public float getACTStatus() {
        return ACTStatus;
    }

    public boolean getIsFromBE() {
        return IsFromBE;
    }

    public float getEditMode() {
        return EditMode;
    }

    public boolean getIsAutoGenPrimaryKey() {
        return IsAutoGenPrimaryKey;
    }

    public float getBakEditMode() {
        return BakEditMode;
    }

    // Setter Methods

    public void setRefID(String RefID) {
        this.RefID = RefID;
    }

    public void setRefType(float RefType) {
        this.RefType = RefType;
    }

    public void setRefNo(String RefNo) {
        this.RefNo = RefNo;
    }

    public void setRefDate(String RefDate) {
        this.RefDate = RefDate;
    }

    public void setRefDateNoTime(String RefDateNoTime) {
        this.RefDateNoTime = RefDateNoTime;
    }

    public void setReasonType(float ReasonType) {
        this.ReasonType = ReasonType;
    }

    public void setBranchID(String BranchID) {
        this.BranchID = BranchID;
    }

    public void setBranchName(String BranchName) {
        this.BranchName = BranchName;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public void setJournalMemo(String JournalMemo) {
        this.JournalMemo = JournalMemo;
    }

    public void setAccountObjectID(String AccountObjectID) {
        this.AccountObjectID = AccountObjectID;
    }

    public void setAccountObjectName(String AccountObjectName) {
        this.AccountObjectName = AccountObjectName;
    }

    public void setEditVersion(String EditVersion) {
        this.EditVersion = EditVersion;
    }

    public void setTotalAmount(float TotalAmount) {
        this.TotalAmount = TotalAmount;
    }

    public void setReturnType(float ReturnType) {
        this.ReturnType = ReturnType;
    }

    public void setReceiverName(String ReceiverName) {
        this.ReceiverName = ReceiverName;
    }

    public void setPayerName(String PayerName) {
        this.PayerName = PayerName;
    }

    public void setPayerAddress(String PayerAddress) {
        this.PayerAddress = PayerAddress;
    }

    public void setCAJournalMemo(String CAJournalMemo) {
        this.CAJournalMemo = CAJournalMemo;
    }

    public void setCARefNo(String CARefNo) {
        this.CARefNo = CARefNo;
    }

    public void setParentID(String ParentID) {
        this.ParentID = ParentID;
    }

    public void setStatus(float Status) {
        this.Status = Status;
    }

    public void setVoucherRefID(String VoucherRefID) {
        this.VoucherRefID = VoucherRefID;
    }

    public void setSMEStatus(float SMEStatus) {
        this.SMEStatus = SMEStatus;
    }

    public void setShowFromINInwardTransfer(boolean ShowFromINInwardTransfer) {
        this.ShowFromINInwardTransfer = ShowFromINInwardTransfer;
    }

    public void setIsAuditByValue(boolean IsAuditByValue) {
        this.IsAuditByValue = IsAuditByValue;
    }

    public void setACTStatus(float ACTStatus) {
        this.ACTStatus = ACTStatus;
    }

    public void setIsFromBE(boolean IsFromBE) {
        this.IsFromBE = IsFromBE;
    }

    public void setEditMode(float EditMode) {
        this.EditMode = EditMode;
    }

    public void setIsAutoGenPrimaryKey(boolean IsAutoGenPrimaryKey) {
        this.IsAutoGenPrimaryKey = IsAutoGenPrimaryKey;
    }

    public void setBakEditMode(float BakEditMode) {
        this.BakEditMode = BakEditMode;
    }
}

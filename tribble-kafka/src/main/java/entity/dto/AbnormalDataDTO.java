package entity.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @version 1.0
 * @author: Fan
 * @date 2020.12.18 14:49
 */
@Data
@Accessors(chain = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AbnormalDataDTO {

  @JsonProperty(value = "iouid")
  private String ioUid;
  @JsonProperty(value =  "plate_no")
  private String plateNo;
  @JsonProperty(value =  "plate_color")
  private String plateColor;
  @JsonProperty(value =  "bucket_id")
  private String bucketId;
  @JsonProperty(value =  "parking_space_no")
  private String parkingSpaceNo;
  @JsonProperty(value =  "evidence_chain_id")
  private String evidenceChainId;
  @JsonProperty(value =  "detector")
  private String detector;
  @JsonProperty(value =  "detector_type")
  private String detectorType;
  @JsonProperty(value =  "car_park_id")
  private String carParkId;
  @JsonProperty(value =  "io_datetime")
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private LocalDateTime ioDatetime;
  @JsonProperty(value =  "data_source")
  private String dataSource;
  @JsonProperty(value =  "abnormal_index")
  private String abnormalIndex;
  @JsonProperty("picture_id")
  private String pictureId;

  @JsonProperty("group_id")
  private String groupId;

  /** 确认不在场时间*/
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  @JsonProperty("confirm_not_in_datetime")
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  private LocalDateTime confirmNotInDatetime;

  /** 疑似不在场时间*/
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
  @JsonProperty("maybe_not_in_datetime")
  @JsonDeserialize(using = LocalDateTimeDeserializer.class)
  @JsonSerialize(using = LocalDateTimeSerializer.class)
  private LocalDateTime maybeNotInDatetime;

  public String getIoUid() {
    return this.ioUid;
  }

  public AbnormalDataDTO setIoUid(String ioUid) {
    this.ioUid = ioUid;
    return this;
  }

  public String getPlateNo() {
    return this.plateNo;
  }

  public AbnormalDataDTO setPlateNo(String plateNo) {
    this.plateNo = plateNo;
    return this;
  }

  public String getPlateColor() {
    return this.plateColor;
  }

  public AbnormalDataDTO setPlateColor(String plateColor) {
    this.plateColor = plateColor;
    return this;
  }

  public String getBucketId() {
    return this.bucketId;
  }

  public AbnormalDataDTO setBucketId(String bucketId) {
    this.bucketId = bucketId;
    return this;
  }

  public String getParkingSpaceNo() {
    return this.parkingSpaceNo;
  }

  public AbnormalDataDTO setParkingSpaceNo(String parkingSpaceNo) {
    this.parkingSpaceNo = parkingSpaceNo;
    return this;
  }

  public String getEvidenceChainId() {
    return this.evidenceChainId;
  }

  public AbnormalDataDTO setEvidenceChainId(String evidenceChainId) {
    this.evidenceChainId = evidenceChainId;
    return this;
  }

  public String getDetector() {
    return this.detector;
  }

  public AbnormalDataDTO setDetector(String detector) {
    this.detector = detector;
    return this;
  }

  public String getDetectorType() {
    return this.detectorType;
  }

  public AbnormalDataDTO setDetectorType(String detectorType) {
    this.detectorType = detectorType;
    return this;
  }

  public String getCarParkId() {
    return this.carParkId;
  }

  public AbnormalDataDTO setCarParkId(String carParkId) {
    this.carParkId = carParkId;
    return this;
  }

  public LocalDateTime getIoDatetime() {
    return this.ioDatetime;
  }

  public AbnormalDataDTO setIoDatetime(LocalDateTime ioDatetime) {
    this.ioDatetime = ioDatetime;
    return this;
  }

  public String getDataSource() {
    return this.dataSource;
  }

  public AbnormalDataDTO setDataSource(String dataSource) {
    this.dataSource = dataSource;
    return this;
  }

  public String getAbnormalIndex() {
    return this.abnormalIndex;
  }

  public AbnormalDataDTO setAbnormalIndex(String abnormalIndex) {
    this.abnormalIndex = abnormalIndex;
    return this;
  }

  public String getPictureId() {
    return pictureId;
  }

  public void setPictureId(String pictureId) {
    this.pictureId = pictureId;
  }

  public LocalDateTime getConfirmNotInDatetime() {
    return confirmNotInDatetime;
  }

  public void setConfirmNotInDatetime(LocalDateTime confirmNotInDatetime) {
    this.confirmNotInDatetime = confirmNotInDatetime;
  }

  public LocalDateTime getMaybeNotInDatetime() {
    return maybeNotInDatetime;
  }

  public void setMaybeNotInDatetime(LocalDateTime maybeNotInDatetime) {
    this.maybeNotInDatetime = maybeNotInDatetime;
  }


}

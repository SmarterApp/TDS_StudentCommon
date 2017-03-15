/* ******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package tds.student.sql.data;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;


/**
 * @author temp_rreddy
 *
 */
public class OpportunityInfo
{
  private OpportunityStatusType _status;
  private UUID                  _browserKey;
  private UUID                  _oppKey;
  private UUID                  examBrowserKey;
  private UUID                  examId;
  private OpportunityStatusType examStatus;
  private String examClientName;

  @JsonProperty ("IsOpen")
  public boolean getIsOpen () {

    return (_status == OpportunityStatusType.Pending || _status == OpportunityStatusType.Suspended || _status == OpportunityStatusType.Approved);

  }

  @JsonProperty ("IsExamOpen")
  public boolean getIsExamOpen () {
    return (examStatus == OpportunityStatusType.Pending || examStatus == OpportunityStatusType.Suspended || examStatus == OpportunityStatusType.Approved);
  }

  public OpportunityInfo () {
  }

  public OpportunityInstance createOpportunityInstance (UUID sessionKey) {
    return new OpportunityInstance (_oppKey, sessionKey, _browserKey, examId, examBrowserKey, examClientName);
  }

  @JsonProperty ("Status")
  public OpportunityStatusType getStatus () {
    return _status;
  }

  public void setStatus (OpportunityStatusType _status) {
    this._status = _status;
  }

  @JsonProperty ("BrowserKey")
  public UUID getBrowserKey () {
    return _browserKey;
  }

  public void setBrowserKey (UUID _browserKey) {
    this._browserKey = _browserKey;
  }

  @JsonProperty ("OppKey")
  public UUID getOppKey () {
    return _oppKey;
  }

  public void setOppKey (UUID _oppKey) {
    this._oppKey = _oppKey;
  }

  @JsonProperty ("ExamBrowserKey")
  public UUID getExamBrowserKey() {
    return examBrowserKey;
  }

  public void setExamBrowserKey(UUID examBrowserKey) {
    this.examBrowserKey = examBrowserKey;
  }

  @JsonProperty ("ExamId")
  public UUID getExamId() {
    return examId;
  }

  public void setExamId(UUID examId) {
    this.examId = examId;
  }

  public void setExamStatus(OpportunityStatusType _status) {
    this.examStatus = _status;
  }

  @JsonProperty ("ExamStatus")
  public OpportunityStatusType getExamStatus() {
    return examStatus;
  }

  @JsonProperty ("ExamClientName")
  public String getExamClientName() {
    return examClientName;
  }

  public void setExamClientName(String examClientName) {
    this.examClientName = examClientName;
  }

  @Override
  public String toString() {
    return "OpportunityInfo{" +
      "_status=" + _status +
      ", _browserKey=" + _browserKey +
      ", _oppKey=" + _oppKey +
      ", examBrowserKey=" + examBrowserKey +
      ", examId=" + examId +
      ", examStatus=" + examStatus +
      ", examClientName=" + examClientName +
      '}';
  }
}

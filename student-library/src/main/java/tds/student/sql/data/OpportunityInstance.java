/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *     
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package tds.student.sql.data;

/**
 * @author temp_rreddy
 * 
 */

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class OpportunityInstance
{
  private final UUID _oppKey;
  private final UUID _sessionKey;
  private final UUID _browserKey;
  private final UUID examId;
  private final UUID examBrowserKey;
  private final String examClientName;

  @JsonProperty ("Key")
  public UUID getKey () {
    return _oppKey;
  }

  @JsonProperty ("SessionKey")
  public UUID getSessionKey () {
    return _sessionKey;
  }

  @JsonProperty ("BrowserKey")
  public UUID getBrowserKey () {
    return _browserKey;
  }

  @JsonProperty("ExamId")
  public UUID getExamId() {
    return examId;
  }

  @JsonProperty("ExamBrowswerKey")
  public UUID getExamBrowserKey() {
    return examBrowserKey;
  }

  @JsonProperty("ExamClientName")
  public String getExamClientName() {
    return examClientName;
  }

  public OpportunityInstance (UUID oppKey, UUID sessionKey, UUID browserKey) {
    this(oppKey, sessionKey, browserKey, UUID.randomUUID(), UUID.randomUUID(), "");
  }

  public OpportunityInstance(UUID oppKey, UUID sessionKey, UUID browserKey, UUID examId, UUID examBrowserKey, String examClientName) {
    _oppKey = oppKey;
    _sessionKey = sessionKey;
    _browserKey = browserKey;
    this.examClientName = examClientName;
    this.examId = examId != null ? examId : UUID.randomUUID();
    this.examBrowserKey = examBrowserKey != null ? examBrowserKey : UUID.randomUUID();
  }
}

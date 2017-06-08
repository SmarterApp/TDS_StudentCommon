/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package tds.student.sql.data;

import TDS.Shared.Data.ReturnStatus;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class OpportunityItem
{
  private long    _bankKey;
  private long    _itemKey;
  private int     _page;
  private int     _position;
  private int     _segment;
  private String  _segmentID;
  private String  _groupID;
  private int     _sequence;
  private String  _dateCreated;
  private String  _format;
  private String  _value;
  private boolean _markForReview;
  private boolean _isSelected;
  private boolean _isRequired;
  private boolean _isValid;

  private int     _groupItemsRequired;
  private String  _itemFile;
  private String  _stimulusFile;
  private boolean _isVisible;
  private boolean _isPrintable;
  private ReturnStatus _returnStatus = null;

  @JsonProperty ("BankKey")
  public long getBankKey () {
    return _bankKey;
  }

  @JsonProperty("BankKey")
  public void setBankKey (long bankKey) {
    _bankKey = bankKey;
  }

  @JsonProperty ("ItemKey")
  public long getItemKey () {
    return _itemKey;
  }

  @JsonProperty("ItemKey")
  public void setItemKey (long itemKey) {
    _itemKey = itemKey;
  }

  @JsonProperty ("Page")
  public int getPage () {
    return _page;
  }

  @JsonProperty ("Page")
  public void setPage (int page) {
    _page = page;
  }

  @JsonProperty ("Position")
  public int getPosition () {
    return _position;
  }

  @JsonProperty ("Position")
  public void setPosition (int position) {
    _position = position;
  }

  @JsonProperty ("Segment")
  public int getSegment () {
    return _segment;
  }

  @JsonProperty ("Segment")
  public void setSegment (int segment) {
    _segment = segment;
  }

  @JsonProperty ("SegmentID")
  public String getSegmentID () {
    return _segmentID;
  }

  @JsonProperty ("SegmentID")
  public void setSegmentID (String segmentID) {
    _segmentID = segmentID;
  }

  @JsonProperty ("GroupID")
  public String getGroupID () {
    return _groupID;
  }

  @JsonProperty ("GroupID")
  public void setGroupID (String groupID) {
    _groupID = groupID;
  }

  @JsonProperty ("Sequence")
  public int getSequence () {
    return _sequence;
  }

  @JsonProperty ("Sequence")
  public void setSequence (int sequence) {
    _sequence = sequence;
  }

  @JsonProperty ("DateCreated")
  public String getDateCreated () {
    return _dateCreated;
  }

  @JsonProperty ("DateCreated")
  public void setDateCreated (String dateCreated) {
    _dateCreated = dateCreated;
  }

  @JsonProperty ("Format")
  public String getFormat () {
    return _format;
  }

  @JsonProperty ("Format")
  public void setFormat (String format) {
    _format = format;
  }

  @JsonProperty ("Value")
  public String getValue () {
    return _value;
  }

  @JsonProperty ("Value")
  public void setValue (String value) {
    _value = value;
  }

  @JsonProperty ("MarkForReview")
  public boolean isMarkForReview () {
    return _markForReview;
  }

  @JsonProperty ("MarkForReview")
  public void setMarkForReview (boolean markForReview) {
    _markForReview = markForReview;
  }

  @JsonProperty ("IsSelected")
  public boolean getIsSelected () {
    return _isSelected;
  }

  @JsonProperty ("IsSelected")
  public void setIsSelected (boolean isSelected) {
    _isSelected = isSelected;
  }

  @JsonProperty ("IsRequired")
  public boolean isRequired () {
    return _isRequired;
  }

  @JsonProperty ("IsRequired")
  public void setIsRequired (boolean isRequired) {
    _isRequired = isRequired;
  }

  @JsonProperty ("IsValid")
  public boolean getIsValid () {
    return _isValid;
  }

  @JsonProperty ("IsValid")
  public void setIsValid (boolean isValid) {
    _isValid = isValid;
  }

  @JsonProperty ("GroupItemsRequired")
  public int getGroupItemsRequired () {
    return _groupItemsRequired;
  }

  @JsonProperty ("GroupItemsRequired")
  public void setGroupItemsRequired (int groupItemsRequired) {
    _groupItemsRequired = groupItemsRequired;
  }

  @JsonProperty ("ItemFile")
  public String getItemFile () {
    return _itemFile;
  }

  @JsonProperty ("ItemFile")
  public void setItemFile (String itemFile) {
    _itemFile = itemFile;
  }

  @JsonProperty ("StimulusFile")
  public String getStimulusFile () {
    return _stimulusFile;
  }

  @JsonProperty ("StimulusFile")
  public void setStimulusFile (String stimulusFile) {
    _stimulusFile = stimulusFile;
  }

  @JsonProperty ("IsVisible")
  public boolean isVisible () {
    return _isVisible;
  }

  @JsonProperty ("IsVisible")
  public void setIsVisible (boolean isVisible) {
    _isVisible = isVisible;
  }

  @JsonProperty ("IsPrintable")
  public boolean isPrintable () {
    return _isPrintable;
  }

  @JsonProperty ("IsPrintable")
  public void setIsPrintable (boolean isPrintable) {
    _isPrintable = isPrintable;
  }

  public class OpportunityItems extends ArrayList<OpportunityItem>
  {
    private ReturnStatus _returnStatus = null;
    /**
     * @return the _returnStatus
     */
    public ReturnStatus getReturnStatus () {
      return _returnStatus;
    }

    /**
     * @param _returnStatus the _returnStatus to set
     */
    public void setReturnStatus (ReturnStatus _returnStatus) {
      this._returnStatus = _returnStatus;
    }


  }

  /**
   * @return the _returnStatus
   */
  public ReturnStatus getReturnStatus () {
    return _returnStatus;
  }

  /**
   * @param _returnStatus the _returnStatus to set
   */
  public void setReturnStatus (ReturnStatus _returnStatus) {
    this._returnStatus = _returnStatus;
  }

}

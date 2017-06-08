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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;


public class TestProperties extends ITestRequirementsInput
{
  private String            _testKey;
  private String            _testID;
  private String            _grade;
  private String            _subject;
  private String            _accFamily;
  private String            _displayName;
  private int               _sortOrder;
  private boolean           _isSelectable;
  private boolean           _scoreByTDS;
  private boolean           _validateCompleteness;
  private int               _maxOpportunities;
  private int               _minItems;
  private int               _maxItems;
  private int               _prefetch;
  private List<TestSegment> _segments;
  private TestRequirements  _requirements;

  public TestProperties () {
    _segments = new ArrayList<TestSegment> ();
    _requirements = new TestRequirements ();
  }

  @JsonProperty ("key")
  public String getTestKey () {
    return _testKey;
  }

  @JsonProperty ("key")
  public void setTestKey (String _testKey) {
    this._testKey = _testKey;
  }

  @JsonProperty ("id")
  public String getTestID () {
    return _testID;
  }

  @JsonProperty ("id")
  public void setTestID (String _testID) {
    this._testID = _testID;
  }

  @JsonProperty ("gradeCode")
  public String getGrade () {
    return _grade;
  }

  @JsonProperty ("gradeCode")
  public void setGrade (String _grade) {
    this._grade = _grade;
  }

  @JsonProperty ("subject")
  public String getSubject () {
    return _subject;
  }

  @JsonProperty ("subject")
  public void setSubject (String _subject) {
    this._subject = _subject;
  }

  @JsonProperty ("family")
  public String getAccFamily () {
    return _accFamily;
  }

  @JsonProperty ("family")
  public void setAccFamily (String _accFamily) {
    this._accFamily = _accFamily;
  }

  @JsonProperty ("displayName")
  public String getDisplayName () {
    return _displayName;
  }

  @JsonProperty ("displayName")
  public void setDisplayName (String _displayName) {
    this._displayName = _displayName;
  }

  @JsonProperty ("SortOrder")
  public int getSortOrder () {
    return _sortOrder;
  }

  @JsonProperty ("SortOrder")
  public void setSortOrder (int _sortOrder) {
    this._sortOrder = _sortOrder;
  }

  @JsonProperty ("isSelectable")
  public boolean isSelectable () {
    return _isSelectable;
  }

  @JsonProperty ("isSelectable")
  public void setIsSelectable (boolean _isSelectable) {
    this._isSelectable = _isSelectable;
  }

  @JsonProperty ("ScoreByTDS")
  public boolean isScoreByTDS () {
    return _scoreByTDS;
  }

  @JsonProperty ("ScoreByTDS")
  public void setScoreByTDS (boolean _scoreByTDS) {
    this._scoreByTDS = _scoreByTDS;
  }

  @JsonProperty ("ValidateCompleteness")
  public boolean isValidateCompleteness () {
    return _validateCompleteness;
  }

  @JsonProperty ("ValidateCompleteness")
  public void setValidateCompleteness (boolean _validateCompleteness) {
    this._validateCompleteness = _validateCompleteness;
  }

  @JsonProperty ("maxOpportunities")
  public int getMaxOpportunities () {
    return _maxOpportunities;
  }

  @JsonProperty ("maxOpportunities")
  public void setMaxOpportunities (int _maxOpportunities) {
    this._maxOpportunities = _maxOpportunities;
  }

  @JsonProperty ("MinItems")
  public int getMinItems () {
    return _minItems;
  }

  @JsonProperty ("MinItems")
  public void setMinItems (int _minItems) {
    this._minItems = _minItems;
  }

  @JsonProperty ("MaxItems")
  public int getMaxItems () {
    return _maxItems;
  }

  @JsonProperty ("MaxItems")
  public void setMaxItems (int _maxItems) {
    this._maxItems = _maxItems;
  }

  @JsonProperty ("Prefetch")
  public int getPrefetch () {
    return _prefetch;
  }

  @JsonProperty ("Prefetch")
  public void setPrefetch (int _prefetch) {
    this._prefetch = _prefetch;
  }

  @JsonProperty ("Segments")
  public List<TestSegment> getSegments () {
    return _segments;
  }

  @JsonProperty ("Segments")
  private void setSegments (List<TestSegment> segments) {
    this._segments = segments;
  }

  @JsonProperty ("requirements")
  public TestRequirements getRequirements () {
    return _requirements;
  }

  @JsonProperty ("requirements")
  public void setRequirements (TestRequirements _requirements) {
    this._requirements = _requirements;
  }

  @Override
  public String toString () {
    return _testKey;
  }

}

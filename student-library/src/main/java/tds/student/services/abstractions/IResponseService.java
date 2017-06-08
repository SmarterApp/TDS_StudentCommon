/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package tds.student.services.abstractions;

import TDS.Shared.Exceptions.ReturnStatusException;

import tds.student.services.data.PageGroup;
import tds.student.services.data.PageList;
import tds.student.sql.data.AdaptiveGroup;
import tds.student.sql.data.OpportunityInstance;

/**
 * @author temp_rreddy
 */
public interface IResponseService {
  PageGroup insertItems(OpportunityInstance oppInstance, AdaptiveGroup adaptiveGroup, boolean isMsb) throws ReturnStatusException;

  PageList getOpportunityItems(OpportunityInstance oppInstance, boolean validate) throws ReturnStatusException;

  PageGroup getItemGroup(OpportunityInstance oppInstance, int page, String groupID, String dateCreated, boolean validate) throws ReturnStatusException;

  boolean isTestComplete(OpportunityInstance opportunityInstance) throws ReturnStatusException;

  void removeResponse(OpportunityInstance oppInstance, int position, String itemID, String dateCreated) throws ReturnStatusException;

  /**
   * Marks an item for review
   *
   * @param opportunityInstance the {@link tds.student.sql.data.OpportunityInstance} containing exam validation data
   * @param position            the item position of the item to mark
   * @param mark                a flag indicating whether the item should be marked or unmarked
   */
  void markItemForReview(final OpportunityInstance opportunityInstance, final int position, final boolean mark) throws ReturnStatusException;
}

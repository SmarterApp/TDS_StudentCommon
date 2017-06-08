/*******************************************************************************
 * Educational Online Test Delivery System 
 * Copyright (c) 2014 American Institutes for Research
 *     
 * Distributed under the AIR Open Source License, Version 1.0 
 * See accompanying file AIR-License-1_0.txt or at
 * http://www.smarterapp.org/documents/American_Institutes_for_Research_Open_Source_Software_License.pdf
 ******************************************************************************/
package tds.student.sql.data;

import TDS.Shared.Exceptions.ReadOnlyException;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.IteratorUtils;
import org.apache.commons.collections.Predicate;
import tds.itemrenderer.data.AccLookup;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AccList
{
  private static final long serialVersionUID = 1L;

  private final List<Data> data = new ArrayList<>();
  private List<Dependency> dependencies = new ArrayList<>();

  @SuppressWarnings ("unchecked")
  public Collection<Data> getSegment (final int position) {
    // TODO Ravi/Shiva figure out where to get to use version 4.0
    return CollectionUtils.select (data, new Predicate ()
    {
      public boolean evaluate (Object object) {
        Data data = (Data) object;
        return data.getSegmentPosition () == position;
      }
    });
  }

  public Accommodations createAccommodations (final int position, final String id, final String label) throws ReadOnlyException {
    //id = null;
    //label = null;
    final Accommodations accommodations = new Accommodations (position, id, label);

    // get all the acc data for this position
    for (final Data accData : getSegment (position)) {
      accommodations.create (accData.getType (), accData.getCode (), accData.getValue (), accData.isVisible (), accData.isSelectable (), accData.isAllowChange (), accData.isStudentControl (),
          accData.getDependsOnToolType (), accData.isDisableOnGuestSession (), accData.isDefault (), accData.isAllowCombine (), false);
    }

    // if this is position 0 then add dependencies (segments don't support
    // this)
    if (position == 0) {
      for (final Dependency accDepends : getDependencies ()) {
        accommodations.AddDependency (accDepends.getIfType (), accDepends.getIfValue (), accDepends.getThenType (), accDepends.getThenValue (), accDepends.isDefault ());
      }
    }

    return accommodations;
  }

  public List<Data> getData() {
    return data;
  }

  public boolean add(final Data newData) {
    return data.add(newData);
  }

  /**
   * @return the _dependencies
   */
  public List<Dependency> getDependencies () {
    return dependencies;
  }

  /**
   * @param dependencies the _dependencies to set
   */
  public void setDependencies (final List<Dependency> dependencies) {
    this.dependencies = dependencies;
  }

  public AccLookup createLookup (final int position) {
    // TODO
    final AccLookup accLookup = new AccLookup ();

    // get all the acc data for this position
    for (final Data accData : getSegment (position)) {
      final String[] strArray = new String[] { accData.getValue () };
      accLookup.add (accData.getType (), strArray);
    }

    return accLookup;
  }
}

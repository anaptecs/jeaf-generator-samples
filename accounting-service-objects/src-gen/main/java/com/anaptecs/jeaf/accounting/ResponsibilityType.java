/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import com.anaptecs.jeaf.core.api.AbstractObjectID;
import com.anaptecs.jeaf.core.api.Identifiable;
import com.anaptecs.jeaf.core.api.MessageConstants;
import com.anaptecs.jeaf.core.api.ServiceObject;
import com.anaptecs.jeaf.core.api.ServiceObjectID;
import com.anaptecs.jeaf.tools.api.Tools;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public class ResponsibilityType implements ServiceObject, Identifiable<ServiceObjectID> {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "type".
   */
  public static final String TYPE = "type";

  /**
   * Constant for the name of attribute "typeChar".
   */
  public static final String TYPECHAR = "typeChar";

  /**
   * Constant for the name of attribute "sortorder".
   */
  public static final String SORTORDER = "sortorder";

  /**
   * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
   */
  private final ServiceObjectID objectID;

  /**
   * 
   */
  private String type;

  /**
   * 
   */
  private Character typeChar;

  /**
   * 
   */
  private Byte sortorder;

  /**
   * Initialize object using the passed builder.
   * 
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected ResponsibilityType( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read object ID.
    AbstractObjectID<?> lObjectID = pBuilder.objectID;
    if (lObjectID != null) {
      objectID = new ServiceObjectID(pBuilder.objectID);
    }
    else {
      objectID = null;
    }
    // Read attribute values from builder.
    type = pBuilder.type;
    typeChar = pBuilder.typeChar;
    sortorder = pBuilder.sortorder;
  }

  /**
   * Class implements builder to create a new instance of class ResponsibilityType. As the class has readonly attributes
   * or associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder {
    /**
     * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
     */
    private AbstractObjectID<?> objectID;

    /**
     * 
     */
    private String type;

    /**
     * 
     */
    private Character typeChar;

    /**
     * 
     */
    private Byte sortorder;

    /**
     * Use {@link #newBuilder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link #newBuilder(ResponsibilityType)} instead of private constructor to create new builder.
     */
    protected Builder( ResponsibilityType pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        objectID = pObject.objectID;
        type = pObject.type;
        typeChar = pObject.typeChar;
        sortorder = pObject.sortorder;
      }
    }

    /**
     * Method returns a new builder.
     * 
     * @return {@link Builder} New builder that can be used to create new ImmutablePOJOParent objects.
     */
    public static Builder newBuilder( ) {
      return new Builder();
    }

    /**
     * Method creates a new builder and initialize it with the data from the passed object.
     * 
     * @param pObject Object that should be used to initialize the builder. The parameter may be null.
     * @return {@link Builder} New builder that can be used to create new ResponsibilityType objects. The method never
     * returns null.
     */
    public static Builder newBuilder( ResponsibilityType pObject ) {
      return new Builder(pObject);
    }

    /**
     * Method sets the identifier for the object created using the builder. The reference may be null since an id is not
     * mandatory.
     */
    public Builder setID( AbstractObjectID<?> pObjectID ) {
      objectID = pObjectID;
      return this;
    }

    /**
     * Method sets the attribute "type".
     * 
     * @param pType Value to which the attribute "type" should be set.
     */
    public Builder setType( String pType ) {
      // Assign value to attribute
      type = pType;
      return this;
    }

    /**
     * Method sets the attribute "typeChar".
     * 
     * @param pTypeChar Value to which the attribute "typeChar" should be set.
     */
    public Builder setTypeChar( Character pTypeChar ) {
      // Assign value to attribute
      typeChar = pTypeChar;
      return this;
    }

    /**
     * Method sets the attribute "sortorder".
     * 
     * @param pSortorder Value to which the attribute "sortorder" should be set.
     */
    public Builder setSortorder( Byte pSortorder ) {
      // Assign value to attribute
      sortorder = pSortorder;
      return this;
    }

    /**
     * Method creates a new instance of class ResponsibilityType. The object will be initialized with the values of the
     * builder.
     * 
     * @return ResponsibilityType Created object. The method never returns null.
     */
    public ResponsibilityType build( ) {
      return new ResponsibilityType(this);
    }

    /**
     * Method creates a new instance of class ResponsibilityType. The object will be initialized with the values of the
     * builder.
     * 
     * @param pValidate Parameter defines if the created POJO should be validated using Java Validation.
     * @return ResponsibilityType Created object. The method never returns null.
     */
    public ResponsibilityType build( boolean pValidate ) {
      ResponsibilityType lPOJO = this.build();
      if (pValidate == true) {
        Tools.getValidationTools().validateObject(lPOJO);
      }
      return lPOJO;
    }
  }

  /**
   * Method returns the id of this object.
   * 
   * @return {@link ServiceObjectID} ID of this object. Since an object must not have an id the method may also return
   * null.
   */
  @Override
  public final ServiceObjectID getID( ) {
    return objectID;
  }

  /**
   * Method returns the unversioned object id of this object.
   * 
   * @return {@link ServiceObjectID} ID of this object. Since an object must not have an id the method may also return
   * null.
   */
  @Override
  public final ServiceObjectID getUnversionedID( ) {
    ServiceObjectID lUnversionedID;
    if (objectID != null) {
      lUnversionedID = objectID.getUnversionedObjectID();
    }
    else {
      lUnversionedID = null;
    }
    return lUnversionedID;
  }

  /**
   * Method returns the attribute "type".
   * 
   * 
   * @return String Value to which the attribute "type" is set.
   */
  public String getType( ) {
    return type;
  }

  /**
   * Method sets the attribute "type".
   * 
   * 
   * @param pType Value to which the attribute "type" should be set.
   */
  public void setType( String pType ) {
    // Assign value to attribute
    type = pType;
  }

  /**
   * Method returns the attribute "typeChar".
   * 
   * 
   * @return Character Value to which the attribute "typeChar" is set.
   */
  public Character getTypeChar( ) {
    return typeChar;
  }

  /**
   * Method sets the attribute "typeChar".
   * 
   * 
   * @param pTypeChar Value to which the attribute "typeChar" should be set.
   */
  public void setTypeChar( Character pTypeChar ) {
    // Assign value to attribute
    typeChar = pTypeChar;
  }

  /**
   * Method returns the attribute "sortorder".
   * 
   * 
   * @return Byte Value to which the attribute "sortorder" is set.
   */
  public Byte getSortorder( ) {
    return sortorder;
  }

  /**
   * Method sets the attribute "sortorder".
   * 
   * 
   * @param pSortorder Value to which the attribute "sortorder" should be set.
   */
  public void setSortorder( Byte pSortorder ) {
    // Assign value to attribute
    sortorder = pSortorder;
  }

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. the returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  protected StringBuilder toStringBuilder( ) {
    StringBuilder lBuilder = new StringBuilder(256);
    lBuilder.append(XFun.getMessageRepository().getMessage(MessageConstants.OBJECT_INFO, this.getClass().getName()));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(MessageConstants.OBJECT_ATTRIBUTES_SECTION));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(MessageConstants.OBJECT_ATTRIBUTE, "type", "" + type));
    lBuilder.append('\n');
    lBuilder
        .append(XFun.getMessageRepository().getMessage(MessageConstants.OBJECT_ATTRIBUTE, "typeChar", "" + typeChar));
    lBuilder.append('\n');
    lBuilder
        .append(XFun.getMessageRepository().getMessage(MessageConstants.OBJECT_ATTRIBUTE, "sortorder", "" + sortorder));
    lBuilder.append('\n');
    return lBuilder;
  }

  /**
   * Method creates a new String with the values of all attributes of this class. All references to other objects will
   * be ignored.
   * 
   * @return {@link String} String representation of this object. The method never returns null.
   */
  @Override
  public String toString( ) {
    return this.toStringBuilder().toString();
  }
}
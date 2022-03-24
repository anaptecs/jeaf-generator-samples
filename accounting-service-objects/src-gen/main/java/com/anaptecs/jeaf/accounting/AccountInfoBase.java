/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.core.api.ServiceObject;
import com.anaptecs.jeaf.core.api.ServiceObjectID;
import com.anaptecs.jeaf.tools.api.Tools;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.XFunMessages;
import com.anaptecs.jeaf.xfun.api.checks.Check;
import com.anaptecs.jeaf.xfun.api.common.Identifiable;
import com.anaptecs.jeaf.xfun.api.common.ObjectIdentity;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public abstract class AccountInfoBase implements ServiceObject, Identifiable<ServiceObjectID> {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "iban".
   */
  public static final String IBAN = "iban";

  /**
   * Constant for the name of attribute "balance".
   */
  public static final String BALANCE = "balance";

  /**
   * Constant for the name of attribute "bankID".
   */
  public static final String BANKID = "bankID";

  /**
   * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
   */
  private final ServiceObjectID objectID;

  /**
   * 
   */
  private Long iban;

  /**
   * 
   */
  private Double balance;

  /**
   * 
   */
  private ServiceObjectID bankID;

  /**
   * Default constructor is only intended to be used for deserialization as many frameworks required that. For "normal"
   * object creation builder should be used instead.
   */
  protected AccountInfoBase( ) {
    objectID = null;
  }

  /**
   * Initialize object using the passed builder.
   * 
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected AccountInfoBase( BuilderBase pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read object ID.
    ObjectIdentity<?> lObjectID = pBuilder.objectID;
    if (lObjectID != null) {
      objectID = new ServiceObjectID(pBuilder.objectID);
    }
    else {
      objectID = null;
    }
    // Read attribute values from builder.
    iban = pBuilder.iban;
    balance = pBuilder.balance;
    bankID = pBuilder.bankID;
  }

  /**
   * Class implements builder to create a new instance of class AccountInfo. As the class has read only attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static abstract class BuilderBase {
    /**
     * Reference to the identifier of this object. The reference may be null since an id is not mandatory.
     */
    private ObjectIdentity<?> objectID;

    /**
     * 
     */
    private Long iban;

    /**
     * 
     */
    private Double balance;

    /**
     * 
     */
    private ServiceObjectID bankID;

    /**
     * Use {@link AccountInfo.Builder#newBuilder()} instead of protected constructor to create new builder.
     */
    protected BuilderBase( ) {
    }

    /**
     * Use {@link AccountInfo.Builder#newBuilder(AccountInfo)} instead of protected constructor to create new builder.
     */
    protected BuilderBase( AccountInfoBase pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        objectID = pObject.objectID;
        iban = pObject.iban;
        balance = pObject.balance;
        bankID = pObject.bankID;
      }
    }

    /**
     * Method sets the identifier for the object created using the builder. The reference may be null since an id is not
     * mandatory.
     */
    public BuilderBase setID( ObjectIdentity<?> pObjectID ) {
      objectID = pObjectID;
      return this;
    }

    /**
     * Method sets the attribute "iban".
     * 
     * @param pIban Value to which the attribute "iban" should be set.
     */
    public BuilderBase setIban( Long pIban ) {
      // Assign value to attribute
      iban = pIban;
      return this;
    }

    /**
     * Method sets the attribute "balance".
     * 
     * @param pBalance Value to which the attribute "balance" should be set.
     */
    public BuilderBase setBalance( Double pBalance ) {
      // Assign value to attribute
      balance = pBalance;
      return this;
    }

    /**
     * Method sets the attribute "bankID".
     * 
     * @param pBankID Value to which the attribute "bankID" should be set.
     */
    public BuilderBase setBankID( ServiceObjectID pBankID ) {
      // Assign value to attribute
      bankID = pBankID;
      return this;
    }

    /**
     * Method creates a new instance of class AccountInfo. The object will be initialized with the values of the
     * builder.
     * 
     * @return AccountInfo Created object. The method never returns null.
     */
    public AccountInfo build( ) {
      return new AccountInfo(this);
    }

    /**
     * Method creates a new validated instance of class AccountInfo. The object will be initialized with the values of
     * the builder and validated afterwards.
     * 
     * @return AccountInfo Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public AccountInfo buildValidated( ) throws ConstraintViolationException {
      AccountInfo lPOJO = this.build();
      Tools.getValidationTools().enforceObjectValidation(lPOJO);
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
   * Method returns the attribute "iban".
   * 
   * 
   * @return Long Value to which the attribute "iban" is set.
   */
  public Long getIban( ) {
    return iban;
  }

  /**
   * Method sets the attribute "iban".
   * 
   * 
   * @param pIban Value to which the attribute "iban" should be set.
   */
  public void setIban( Long pIban ) {
    // Assign value to attribute
    iban = pIban;
  }

  /**
   * Method returns the attribute "balance".
   * 
   * 
   * @return Double Value to which the attribute "balance" is set.
   */
  public Double getBalance( ) {
    return balance;
  }

  /**
   * Method sets the attribute "balance".
   * 
   * 
   * @param pBalance Value to which the attribute "balance" should be set.
   */
  public void setBalance( Double pBalance ) {
    // Assign value to attribute
    balance = pBalance;
  }

  /**
   * Method returns the attribute "bankID".
   * 
   * 
   * @return ServiceObjectID Value to which the attribute "bankID" is set.
   */
  public ServiceObjectID getBankID( ) {
    return bankID;
  }

  /**
   * Method sets the attribute "bankID".
   * 
   * 
   * @param pBankID Value to which the attribute "bankID" should be set.
   */
  public void setBankID( ServiceObjectID pBankID ) {
    // Assign value to attribute
    bankID = pBankID;
  }

  /**
   * 
   * @return {@link Double}
   */
  public abstract Double calclulateBalance( );

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. the returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  protected StringBuilder toStringBuilder( ) {
    StringBuilder lBuilder = new StringBuilder(256);
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_INFO, this.getClass().getName()));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTES_SECTION));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "iban", "" + iban));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "balance", "" + balance));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "bankID", "" + bankID));
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

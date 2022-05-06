/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.pojo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Currency;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.tools.api.Tools;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.XFunMessages;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public class Booking {
  /**
   * Constant for the name of attribute "sourceAccount".
   */
  public static final String SOURCEACCOUNT = "sourceAccount";

  /**
   * Constant for the name of attribute "targetAccount".
   */
  public static final String TARGETACCOUNT = "targetAccount";

  /**
   * Constant for the name of attribute "amount".
   */
  public static final String AMOUNT = "amount";

  /**
   * Constant for the name of attribute "currency".
   */
  public static final String CURRENCY = "currency";

  /**
   * Constant for the name of attribute "executionTimestamp".
   */
  public static final String EXECUTIONTIMESTAMP = "executionTimestamp";

  /**
   * 
   */
  private Account sourceAccount;

  /**
   * 
   */
  private Account targetAccount;

  /**
   * 
   */
  private BigDecimal amount;

  /**
   * 
   */
  private Currency currency;

  /**
   * 
   */
  private Calendar executionTimestamp;

  /**
   * Default constructor is only intended to be used for deserialization as many frameworks required that. For "normal"
   * object creation builder should be used instead.
   */
  protected Booking( ) {
    // Nothing to do.
  }

  /**
   * Initialize object using the passed builder.
   * 
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected Booking( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read attribute values from builder.
    sourceAccount = pBuilder.sourceAccount;
    targetAccount = pBuilder.targetAccount;
    amount = pBuilder.amount;
    currency = pBuilder.currency;
    executionTimestamp = pBuilder.executionTimestamp;
  }

  /**
   * Class implements builder to create a new instance of class Booking. As the class has read only attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder {
    /**
     * 
     */
    private Account sourceAccount;

    /**
     * 
     */
    private Account targetAccount;

    /**
     * 
     */
    private BigDecimal amount;

    /**
     * 
     */
    private Currency currency;

    /**
     * 
     */
    private Calendar executionTimestamp;

    /**
     * Use {@link #newBuilder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link #newBuilder(Booking)} instead of private constructor to create new builder.
     */
    protected Builder( Booking pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        sourceAccount = pObject.sourceAccount;
        targetAccount = pObject.targetAccount;
        amount = pObject.amount;
        currency = pObject.currency;
        executionTimestamp = pObject.executionTimestamp;
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
     * @return {@link Builder} New builder that can be used to create new Booking objects. The method never returns
     * null.
     */
    public static Builder newBuilder( Booking pObject ) {
      return new Builder(pObject);
    }

    /**
     * Method sets the association "sourceAccount".
     * 
     * @param pSourceAccount Account to which the association "sourceAccount" should be set.
     */
    public Builder setSourceAccount( Account pSourceAccount ) {
      sourceAccount = pSourceAccount;
      return this;
    }

    /**
     * Method sets the association "targetAccount".
     * 
     * @param pTargetAccount Account to which the association "targetAccount" should be set.
     */
    public Builder setTargetAccount( Account pTargetAccount ) {
      targetAccount = pTargetAccount;
      return this;
    }

    /**
     * Method sets the attribute "amount".
     * 
     * @param pAmount Value to which the attribute "amount" should be set.
     */
    public Builder setAmount( BigDecimal pAmount ) {
      // Assign value to attribute
      amount = pAmount;
      return this;
    }

    /**
     * Method sets the attribute "currency".
     * 
     * @param pCurrency Value to which the attribute "currency" should be set.
     */
    public Builder setCurrency( Currency pCurrency ) {
      // Assign value to attribute
      currency = pCurrency;
      return this;
    }

    /**
     * Method sets the attribute "executionTimestamp".
     * 
     * @param pExecutionTimestamp Value to which the attribute "executionTimestamp" should be set.
     */
    public Builder setExecutionTimestamp( Calendar pExecutionTimestamp ) {
      // Assign value to attribute
      executionTimestamp = pExecutionTimestamp;
      return this;
    }

    /**
     * Method creates a new instance of class Booking. The object will be initialized with the values of the builder.
     * 
     * @return Booking Created object. The method never returns null.
     */
    public Booking build( ) {
      return new Booking(this);
    }

    /**
     * Method creates a new validated instance of class Booking. The object will be initialized with the values of the
     * builder and validated afterwards.
     * 
     * @return Booking Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public Booking buildValidated( ) throws ConstraintViolationException {
      Booking lPOJO = this.build();
      Tools.getValidationTools().enforceObjectValidation(lPOJO);
      return lPOJO;
    }
  }

  /**
   * Method returns the association "sourceAccount".
   * 
   *
   * @return Account Account to which the association "sourceAccount" is set.
   */
  public Account getSourceAccount( ) {
    return sourceAccount;
  }

  /**
   * Method sets the association "sourceAccount".
   * 
   * 
   * @param pSourceAccount Account to which the association "sourceAccount" should be set.
   */
  public void setSourceAccount( Account pSourceAccount ) {
    sourceAccount = pSourceAccount;
  }

  /**
   * Method unsets the association "sourceAccount".
   * 
   */
  public final void unsetSourceAccount( ) {
    sourceAccount = null;
  }

  /**
   * Method returns the association "targetAccount".
   * 
   *
   * @return Account Account to which the association "targetAccount" is set.
   */
  public Account getTargetAccount( ) {
    return targetAccount;
  }

  /**
   * Method sets the association "targetAccount".
   * 
   * 
   * @param pTargetAccount Account to which the association "targetAccount" should be set.
   */
  public void setTargetAccount( Account pTargetAccount ) {
    targetAccount = pTargetAccount;
  }

  /**
   * Method unsets the association "targetAccount".
   * 
   */
  public final void unsetTargetAccount( ) {
    targetAccount = null;
  }

  /**
   * Method returns the attribute "amount".
   * 
   * 
   * @return BigDecimal Value to which the attribute "amount" is set.
   */
  public BigDecimal getAmount( ) {
    return amount;
  }

  /**
   * Method sets the attribute "amount".
   * 
   * 
   * @param pAmount Value to which the attribute "amount" should be set.
   */
  public void setAmount( BigDecimal pAmount ) {
    // Assign value to attribute
    amount = pAmount;
  }

  /**
   * Method returns the attribute "currency".
   * 
   * 
   * @return Currency Value to which the attribute "currency" is set.
   */
  public Currency getCurrency( ) {
    return currency;
  }

  /**
   * Method sets the attribute "currency".
   * 
   * 
   * @param pCurrency Value to which the attribute "currency" should be set.
   */
  public void setCurrency( Currency pCurrency ) {
    // Assign value to attribute
    currency = pCurrency;
  }

  /**
   * Method returns the attribute "executionTimestamp".
   * 
   * 
   * @return Calendar Value to which the attribute "executionTimestamp" is set.
   */
  public Calendar getExecutionTimestamp( ) {
    return executionTimestamp;
  }

  /**
   * Method sets the attribute "executionTimestamp".
   * 
   * 
   * @param pExecutionTimestamp Value to which the attribute "executionTimestamp" should be set.
   */
  public void setExecutionTimestamp( Calendar pExecutionTimestamp ) {
    // Assign value to attribute
    executionTimestamp = pExecutionTimestamp;
  }

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. the returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  protected StringBuilder toStringBuilder( ) {
    StringBuilder lBuilder = new StringBuilder();
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_INFO, this.getClass().getName()));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTES_SECTION));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "amount", "" + amount));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "currency", "" + currency));
    lBuilder.append('\n');
    lBuilder.append(XFun.getMessageRepository().getMessage(XFunMessages.OBJECT_ATTRIBUTE, "executionTimestamp",
        "" + executionTimestamp));
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

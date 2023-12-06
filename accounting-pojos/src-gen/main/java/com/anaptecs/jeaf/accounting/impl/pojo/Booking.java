/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.pojo;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Currency;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.tools.api.validation.ValidationTools;
import com.anaptecs.jeaf.xfun.api.checks.Check;

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

  private Account sourceAccount;

  private Account targetAccount;

  private BigDecimal amount;

  private Currency currency;

  private Calendar executionTimestamp;

  /**
   * Default constructor is only intended to be used for deserialization by tools like Jackson for JSON. For "normal"
   * object creation builder should be used instead.
   */
  protected Booking( ) {
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
   * Method returns a new builder.
   *
   * @return {@link Builder} New builder that can be used to create new Booking objects.
   */
  public static Builder builder( ) {
    return new Builder();
  }

  /**
   * Method creates a new builder and initializes it with the data from the passed object.
   *
   * @param pObject Object that should be used to initialize the builder. The parameter may be null.
   * @return {@link Builder} New builder that can be used to create new Booking objects. The method never returns null.
   * @deprecated Please use {@link #toBuilder()} instead.
   */
  @Deprecated
  public static Builder builder( Booking pObject ) {
    return new Builder(pObject);
  }

  /**
   * Class implements builder to create a new instance of class <code>Booking</code>.
   */
  public static class Builder {
    private Account sourceAccount;

    private Account targetAccount;

    private BigDecimal amount;

    private Currency currency;

    private Calendar executionTimestamp;

    /**
     * Use {@link Booking#builder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link Booking#builder(Booking)} instead of private constructor to create new builder.
     */
    protected Builder( Booking pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        this.setSourceAccount(pObject.sourceAccount);
        this.setTargetAccount(pObject.targetAccount);
        this.setAmount(pObject.amount);
        this.setCurrency(pObject.currency);
        this.setExecutionTimestamp(pObject.executionTimestamp);
      }
    }

    /**
     * Method sets association {@link #sourceAccount}.<br/>
     *
     * @param pSourceAccount Value to which {@link #sourceAccount} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setSourceAccount( Account pSourceAccount ) {
      sourceAccount = pSourceAccount;
      return this;
    }

    /**
     * Method sets association {@link #targetAccount}.<br/>
     *
     * @param pTargetAccount Value to which {@link #targetAccount} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setTargetAccount( Account pTargetAccount ) {
      targetAccount = pTargetAccount;
      return this;
    }

    /**
     * Method sets attribute {@link #amount}.<br/>
     *
     * @param pAmount Value to which {@link #amount} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setAmount( BigDecimal pAmount ) {
      // Assign value to attribute
      amount = pAmount;
      return this;
    }

    /**
     * Method sets attribute {@link #currency}.<br/>
     *
     * @param pCurrency Value to which {@link #currency} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
     */
    public Builder setCurrency( Currency pCurrency ) {
      // Assign value to attribute
      currency = pCurrency;
      return this;
    }

    /**
     * Method sets attribute {@link #executionTimestamp}.<br/>
     *
     * @param pExecutionTimestamp Value to which {@link #executionTimestamp} should be set.
     * @return {@link Builder} Instance of this builder to support chaining setters. Method never returns null.
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
      Booking lObject = this.build();
      ValidationTools.getValidationTools().enforceObjectValidation(lObject);
      return lObject;
    }
  }

  /**
   * Method returns association {@link #sourceAccount}.<br/>
   *
   * @return {@link Account} Value to which {@link #sourceAccount} is set.
   */
  public Account getSourceAccount( ) {
    return sourceAccount;
  }

  /**
   * Method sets association {@link #sourceAccount}.<br/>
   *
   * @param pSourceAccount Value to which {@link #sourceAccount} should be set.
   */
  public void setSourceAccount( Account pSourceAccount ) {
    sourceAccount = pSourceAccount;
  }

  /**
   * Method unsets {@link #sourceAccount}.
   */
  public final void unsetSourceAccount( ) {
    sourceAccount = null;
  }

  /**
   * Method returns association {@link #targetAccount}.<br/>
   *
   * @return {@link Account} Value to which {@link #targetAccount} is set.
   */
  public Account getTargetAccount( ) {
    return targetAccount;
  }

  /**
   * Method sets association {@link #targetAccount}.<br/>
   *
   * @param pTargetAccount Value to which {@link #targetAccount} should be set.
   */
  public void setTargetAccount( Account pTargetAccount ) {
    targetAccount = pTargetAccount;
  }

  /**
   * Method unsets {@link #targetAccount}.
   */
  public final void unsetTargetAccount( ) {
    targetAccount = null;
  }

  /**
   * Method returns attribute {@link #amount}.<br/>
   *
   * @return {@link BigDecimal} Value to which {@link #amount} is set.
   */
  public BigDecimal getAmount( ) {
    return amount;
  }

  /**
   * Method sets attribute {@link #amount}.<br/>
   *
   * @param pAmount Value to which {@link #amount} should be set.
   */
  public void setAmount( BigDecimal pAmount ) {
    // Assign value to attribute
    amount = pAmount;
  }

  /**
   * Method returns attribute {@link #currency}.<br/>
   *
   * @return {@link Currency} Value to which {@link #currency} is set.
   */
  public Currency getCurrency( ) {
    return currency;
  }

  /**
   * Method sets attribute {@link #currency}.<br/>
   *
   * @param pCurrency Value to which {@link #currency} should be set.
   */
  public void setCurrency( Currency pCurrency ) {
    // Assign value to attribute
    currency = pCurrency;
  }

  /**
   * Method returns attribute {@link #executionTimestamp}.<br/>
   *
   * @return {@link Calendar} Value to which {@link #executionTimestamp} is set.
   */
  public Calendar getExecutionTimestamp( ) {
    return executionTimestamp;
  }

  /**
   * Method sets attribute {@link #executionTimestamp}.<br/>
   *
   * @param pExecutionTimestamp Value to which {@link #executionTimestamp} should be set.
   */
  public void setExecutionTimestamp( Calendar pExecutionTimestamp ) {
    // Assign value to attribute
    executionTimestamp = pExecutionTimestamp;
  }

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. The returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  public StringBuilder toStringBuilder( String pIndent ) {
    StringBuilder lBuilder = new StringBuilder();
    lBuilder.append(pIndent);
    lBuilder.append(this.getClass().getName());
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("amount: ");
    lBuilder.append(amount);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("currency: ");
    lBuilder.append(currency);
    lBuilder.append(System.lineSeparator());
    lBuilder.append(pIndent);
    lBuilder.append("executionTimestamp: ");
    lBuilder.append(executionTimestamp);
    lBuilder.append(System.lineSeparator());
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
    return this.toStringBuilder("").toString();
  }

  /**
   * Method creates a new builder and initializes it with the data of this object.
   *
   * @return {@link Builder} New builder that can be used to create new Booking objects. The method never returns null.
   */
  public Builder toBuilder( ) {
    return new Builder(this);
  }
}

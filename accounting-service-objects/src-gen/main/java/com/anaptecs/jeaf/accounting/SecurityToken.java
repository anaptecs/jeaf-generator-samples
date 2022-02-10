/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import com.anaptecs.jeaf.core.api.MessageConstants;
import com.anaptecs.jeaf.core.api.ServiceObject;
import com.anaptecs.jeaf.tools.api.Tools;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public class SecurityToken implements ServiceObject {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "sessionKey".
   */
  public static final String SESSIONKEY = "sessionKey";

  /**
   * Constant for the name of attribute "booking".
   */
  public static final String BOOKING = "booking";

  /**
   * The attribute contains the session key of the security token that was used when the booking was executed.
   */
  private final byte[] sessionKey;

  /**
   * 
   */
  private Booking booking;

  /**
   * Default constructor is only intended to be used for deserialization as many frameworks required that. For "normal"
   * object creation builder should be used instead.
   */
  protected SecurityToken( ) {
    sessionKey = null;
  }

  /**
   * Initialize object using the passed builder.
   * 
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected SecurityToken( Builder pBuilder ) {
    // Ensure that builder is not null.
    Check.checkInvalidParameterNull(pBuilder, "pBuilder");
    // Read attribute values from builder.
    sessionKey = pBuilder.sessionKey;
    booking = pBuilder.booking;
  }

  /**
   * Class implements builder to create a new instance of class SecurityToken. As the class has readonly attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder {
    /**
     * The attribute contains the session key of the security token that was used when the booking was executed.
     */
    private byte[] sessionKey;

    /**
     * 
     */
    private Booking booking;

    /**
     * Use {@link #newBuilder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link #newBuilder(SecurityToken)} instead of private constructor to create new builder.
     */
    protected Builder( SecurityToken pObject ) {
      if (pObject != null) {
        // Read attribute values from passed object.
        sessionKey = pObject.sessionKey;
        booking = pObject.booking;
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
     * @return {@link Builder} New builder that can be used to create new SecurityToken objects. The method never
     * returns null.
     */
    public static Builder newBuilder( SecurityToken pObject ) {
      return new Builder(pObject);
    }

    /**
     * Method sets the attribute "sessionKey". The attribute contains the session key of the security token that was
     * used when the booking was executed.
     * 
     * @param pSessionKey Value to which the attribute "sessionKey" should be set.
     */
    public Builder setSessionKey( byte[] pSessionKey ) {
      // Assign value to attribute
      if (pSessionKey != null) {
        sessionKey = new byte[pSessionKey.length];
        System.arraycopy(pSessionKey, 0, sessionKey, 0, pSessionKey.length);
      }
      else {
        sessionKey = null;
      }
      return this;
    }

    /**
     * Method sets the association "booking".
     * 
     * @param pBooking Booking to which the association "booking" should be set.
     */
    public Builder setBooking( Booking pBooking ) {
      booking = pBooking;
      return this;
    }

    /**
     * Method creates a new instance of class SecurityToken. The object will be initialized with the values of the
     * builder.
     * 
     * @return SecurityToken Created object. The method never returns null.
     */
    public SecurityToken build( ) {
      return new SecurityToken(this);
    }

    /**
     * Method creates a new instance of class SecurityToken. The object will be initialized with the values of the
     * builder.
     * 
     * @param pValidate Parameter defines if the created POJO should be validated using Java Validation.
     * @return SecurityToken Created object. The method never returns null.
     */
    public SecurityToken build( boolean pValidate ) {
      SecurityToken lPOJO = this.build();
      if (pValidate == true) {
        Tools.getValidationTools().validateObject(lPOJO);
      }
      return lPOJO;
    }
  }

  /**
   * Method returns the attribute "sessionKey". The attribute contains the session key of the security token that was
   * used when the booking was executed.
   * 
   * @return byte Value to which the attribute "sessionKey" is set.
   */
  public byte[] getSessionKey( ) {
    byte[] lReturnValue;
    if (sessionKey != null) {
      lReturnValue = new byte[sessionKey.length];
      System.arraycopy(sessionKey, 0, lReturnValue, 0, sessionKey.length);
    }
    else {
      lReturnValue = null;
    }
    return lReturnValue;
  }

  /**
   * Method returns the association "booking".
   * 
   *
   * @return Booking Booking to which the association "booking" is set.
   */
  public Booking getBooking( ) {
    return booking;
  }

  /**
   * Method sets the association "booking".
   * 
   * 
   * @param pBooking Booking to which the association "booking" should be set.
   */
  public void setBooking( Booking pBooking ) {
    // Release already referenced object before setting a new association.
    if (booking != null) {
      booking.unsetToken();
    }
    booking = pBooking;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pBooking != null && this.equals(pBooking.getToken()) == false) {
      pBooking.setToken((SecurityToken) this);
    }
  }

  /**
   * Method unsets the association "booking".
   * 
   */
  public final void unsetBooking( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    Booking lBooking = booking;
    booking = null;
    if (lBooking != null && this.equals(lBooking.getToken()) == true) {
      lBooking.unsetToken();
    }
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
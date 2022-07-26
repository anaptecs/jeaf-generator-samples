/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import javax.validation.ConstraintViolationException;

import com.anaptecs.jeaf.tools.api.validation.ValidationTools;
import com.anaptecs.jeaf.xfun.api.common.ObjectIdentity;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public class Individual extends Customer {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for the name of attribute "person".
   */
  public static final String PERSON = "person";

  /**
   * 
   */
  private Person person;

  /**
   * Default constructor is only intended to be used for deserialization as many frameworks required that. For "normal"
   * object creation builder should be used instead.
   */
  protected Individual( ) {
    // Nothing to do.
  }

  /**
   * Initialize object using the passed builder.
   * 
   * @param pBuilder Builder that should be used to initialize this object. The parameter must not be null.
   */
  protected Individual( Builder pBuilder ) {
    // Call constructor of super class.
    super(pBuilder);
    // Read attribute values from builder.
    person = pBuilder.person;
  }

  /**
   * Class implements builder to create a new instance of class Individual. As the class has read only attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder extends Customer.Builder {
    /**
     * 
     */
    private Person person;

    /**
     * Use {@link #newBuilder()} instead of private constructor to create new builder.
     */
    protected Builder( ) {
      super();
    }

    /**
     * Use {@link #newBuilder(Individual)} instead of private constructor to create new builder.
     */
    protected Builder( Individual pObject ) {
      super(pObject);
      if (pObject != null) {
        // Read attribute values from passed object.
        person = pObject.person;
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
     * @return {@link Builder} New builder that can be used to create new Individual objects. The method never returns
     * null.
     */
    public static Builder newBuilder( Individual pObject ) {
      return new Builder(pObject);
    }

    /**
     * Method sets the identifier for the object created using the builder. The reference may be null since an id is not
     * mandatory.
     */
    @Override
    public Builder setID( ObjectIdentity<?> pObjectID ) {
      super.setID(pObjectID);
      return this;
    }

    /**
     * Method sets the attribute "active".
     * 
     * @param pActive Value to which the attribute "active" should be set.
     */
    @Override
    public Builder setActive( Boolean pActive ) {
      // Call super class implementation.
      super.setActive(pActive);
      return this;
    }

    /**
     * Method sets the attribute "street".
     * 
     * @param pStreet Value to which the attribute "street" should be set.
     */
    @Override
    public Builder setStreet( String pStreet ) {
      // Call super class implementation.
      super.setStreet(pStreet);
      return this;
    }

    /**
     * Method sets the attribute "zipCode".
     * 
     * @param pZipCode Value to which the attribute "zipCode" should be set.
     */
    @Override
    public Builder setZipCode( Integer pZipCode ) {
      // Call super class implementation.
      super.setZipCode(pZipCode);
      return this;
    }

    /**
     * Method sets the attribute "city".
     * 
     * @param pCity Value to which the attribute "city" should be set.
     */
    @Override
    public Builder setCity( String pCity ) {
      // Call super class implementation.
      super.setCity(pCity);
      return this;
    }

    /**
     * Method sets the attribute "country".
     * 
     * @param pCountry Value to which the attribute "country" should be set.
     */
    @Override
    public Builder setCountry( String pCountry ) {
      // Call super class implementation.
      super.setCountry(pCountry);
      return this;
    }

    /**
     * Method sets the association "person".
     * 
     * @param pPerson Person to which the association "person" should be set.
     */
    public Builder setPerson( Person pPerson ) {
      person = pPerson;
      return this;
    }

    /**
     * Method creates a new instance of class Individual. The object will be initialized with the values of the builder.
     * 
     * @return Individual Created object. The method never returns null.
     */
    public Individual build( ) {
      return new Individual(this);
    }

    /**
     * Method creates a new validated instance of class Individual. The object will be initialized with the values of
     * the builder and validated afterwards.
     * 
     * @return Individual Created and validated object. The method never returns null.
     * @throws ConstraintViolationException in case that one or more validations for the created object failed.
     */
    public Individual buildValidated( ) throws ConstraintViolationException {
      Individual lPOJO = this.build();
      ValidationTools.getValidationTools().enforceObjectValidation(lPOJO);
      return lPOJO;
    }
  }

  /**
   * Method returns the association "person".
   * 
   *
   * @return Person Person to which the association "person" is set.
   */
  public Person getPerson( ) {
    return person;
  }

  /**
   * Method sets the association "person".
   * 
   * 
   * @param pPerson Person to which the association "person" should be set.
   */
  public void setPerson( Person pPerson ) {
    // Release already referenced object before setting a new association.
    if (person != null) {
      person.unsetCustomer();
    }
    person = pPerson;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pPerson != null && this.equals(pPerson.getCustomer()) == false) {
      pPerson.setCustomer((Individual) this);
    }
  }

  /**
   * Method unsets the association "person".
   * 
   */
  public final void unsetPerson( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    Person lPerson = person;
    person = null;
    if (lPerson != null && this.equals(lPerson.getCustomer()) == true) {
      lPerson.unsetCustomer();
    }
  }

  /**
   * Method returns a StringBuilder that can be used to create a String representation of this object. the returned
   * StringBuilder also takes care about attributes of super classes.
   *
   * @return {@link StringBuilder} StringBuilder representing this object. The method never returns null.
   */
  protected StringBuilder toStringBuilder( ) {
    StringBuilder lBuilder = super.toStringBuilder();
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

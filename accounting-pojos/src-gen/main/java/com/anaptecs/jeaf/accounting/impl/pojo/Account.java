/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.pojo;

import java.math.BigDecimal;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public class Account extends AccountBase {
  /**
   * Initialize object. Nothing special to do.
   */
  protected Account( Account.BuilderBase pBuilder ) {
    super(pBuilder);
  }

  /**
   * Class implements builder to create a new instance of class Account. As the class has readonly attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder extends Account.BuilderBase {
    /**
     * Use {@link #newBuilder()} instead of protected constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link #newBuilder(Account)} instead of protected constructor to create new builder.
     */
    protected Builder( Account pObject ) {
      super(pObject);
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
     * @return {@link Builder} New builder that can be used to create new POJOWithIDnMethod objects. The method never
     * returns null.
     */
    public static Builder newBuilder( Account pObject ) {
      return new Builder(pObject);
    }
  }

  /**
   * 
   * @return {@link BigDecimal}
   */
  @Override
  public BigDecimal calcuateBalance( ) {
    // TODO: Implement business logic for method.
    return null;
  }
}
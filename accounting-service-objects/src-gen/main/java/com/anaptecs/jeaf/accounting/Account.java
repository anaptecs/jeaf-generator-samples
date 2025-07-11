/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import javax.validation.Valid;

@Valid
public class Account extends AccountBase {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Default constructor is only intended to be used for deserialization by tools like Jackson for JSON. For "normal"
   * object creation builder should be used instead.
   */
  protected Account( ) {
  }

  /**
   * Initialize object. Nothing special to do.
   */
  protected Account( Account.BuilderBase pBuilder ) {
    super(pBuilder);
  }

  /**
   * Method returns a new builder.
   *
   * @return {@link Builder} New builder that can be used to create new Account objects.
   */
  public static Builder builder( ) {
    return new Builder();
  }

  /**
   * Class implements builder to create a new instance of class Account. As the class has readonly attributes or
   * associations instances can not be created directly. Instead this builder class has to be used.
   */
  public static class Builder extends Account.BuilderBase {
    /**
     * Use {@link Account#builder()} instead of protected constructor to create new builder.
     */
    protected Builder( ) {
    }

    /**
     * Use {@link Account#builder(Account)} instead of protected constructor to create new builder.
     */
    protected Builder( Account pObject ) {
      super(pObject);
    }
  }

  /**
   * @return {@link Double}
   */
  @Override
  public Double calclulateBalance( ) {
    // TODO: Implement business logic for method.
    return null;
  }
}
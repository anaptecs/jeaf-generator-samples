/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.test;

import com.anaptecs.jeaf.accounting.AccountingBasicDataService;
import com.anaptecs.jeaf.core.annotations.JEAFService;
import com.anaptecs.jeaf.junit.JEAFTestCase;

/**
 * This is the base class of the test suite of service AccountingBasicDataService.
 *
 * @version $LastChangedRevision: 931 $
 */
public abstract class AccountingBasicDataServiceTestBase extends JEAFTestCase {
  /**
   * Service that should be tested by this test case.
   */
  @JEAFService
  protected AccountingBasicDataService accountingBasicDataService;

  /**
   * Initialize test case. Therefore the name of the test that should be executed must be provided.
   *
   * @param pName Name of the test method that should be executed by this test. The Parameter must not be null.
   */
  public AccountingBasicDataServiceTestBase( String pName ) {
    super(pName);
  }

  /**
   * Initialize test case. Therefore the name of the test that should be executed must be provided. The userId and the
   * password of a specific user can be given to this Constructor so this specific user can be logged in.
   *
   * @param pName Name of the test method that should be executed by this test. The Parameter must not be null.
   * @param pUserId UserId of the User who should be logged in for this Test.
   * @param pPassword Password of the User who should be logged in for this Test.
   */
  public AccountingBasicDataServiceTestBase( String pName, String pUserId, String pPassword ) {
    super(pName, pUserId, pPassword);
  }

  /**
   * Method test the implementation of service method createEmployee(...)
   *
   * @throws Exception if the test fails.
   */
  public abstract void testCreateEmployee( ) throws Exception;

  /**
   * Method test the implementation of service method createBank(...)
   *
   * @throws Exception if the test fails.
   */
  public abstract void testCreateBank( ) throws Exception;

  /**
   * Method test the implementation of service method createResponsibilityType(...)
   *
   * @throws Exception if the test fails.
   */
  public abstract void testCreateResponsibilityType( ) throws Exception;
}
/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.schufa.test;

import com.anaptecs.jeaf.accounting.impl.schufa.SchufaService;
import com.anaptecs.jeaf.core.annotations.JEAFService;
import com.anaptecs.jeaf.junit.JEAFTestCase;

/**
 * This is the base class of the test suite of service SchufaService.
 *
 * @version $LastChangedRevision: 931 $
 */
public abstract class SchufaServiceTestBase extends JEAFTestCase {
  /**
   * Service that should be tested by this test case.
   */
  @JEAFService
  protected SchufaService schufaService;

  /**
   * Initialize test case. Therefore the name of the test that should be executed must be provided.
   *
   * @param pName Name of the test method that should be executed by this test. The Parameter must not be null.
   */
  public SchufaServiceTestBase( String pName ) {
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
  public SchufaServiceTestBase( String pName, String pUserId, String pPassword ) {
    super(pName, pUserId, pPassword);
  }

  /**
   * Method test the implementation of service method performSchufaCheck(...)
   *
   * @throws Exception if the test fails.
   */
  public abstract void testPerformSchufaCheck( ) throws Exception;
}
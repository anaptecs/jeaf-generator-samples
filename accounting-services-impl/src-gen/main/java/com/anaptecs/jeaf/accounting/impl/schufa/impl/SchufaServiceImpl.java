/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.schufa.impl;

import com.anaptecs.jeaf.accounting.impl.SchufaRequest;
import com.anaptecs.jeaf.core.api.Component;
import com.anaptecs.jeaf.core.spi.CheckLevel;
import com.anaptecs.jeaf.core.spi.CheckResult;

/**
 * Implementation of SchufaService.
 */
final class SchufaServiceImpl extends SchufaServiceImplBase {
  /**
   * Initialize object.
   */
  SchufaServiceImpl( Component pComponent ) {
    super(pComponent);
  }

  /**
   * Method checks the current state of the service. Therefore JEAF defines three different check levels: internal
   * Checks, infrastructure checks and external checks. For further details about the check levels {@see CheckLevel}.
   * 
   * 
   * @param pLevel Check level on which the check should be performed. The parameter is never null.
   * @return {@link CheckResult} Object describing the result of the check. The method may return null. This means that
   * the service does not implement any checks. In order to use as less memory as possible the method should use the
   * constant CheckResult.CHECK_OK if no errors or warnings occurred during the check.
   * 
   * @see CheckResult#CHECK_OK
   */
  public CheckResult check( CheckLevel pLevel ) {
    // TODO Implement checks for this service
    return null;
  }

  /**
   * 
   * @param pRequest
   * @return {@link Boolean}
   */
  @Override
  public boolean performSchufaCheck( SchufaRequest pRequest ) {
    // TODO Implement method and return real result
    return false;
  }
}
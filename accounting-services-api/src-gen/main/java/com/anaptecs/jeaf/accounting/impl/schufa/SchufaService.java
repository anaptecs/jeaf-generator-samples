/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl.schufa;

import com.anaptecs.jeaf.accounting.impl.SchufaRequest;
import com.anaptecs.jeaf.core.api.Service;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public interface SchufaService extends Service {
  /**
   * 
   * @param pRequest
   * @return {@link Boolean}
   */
  boolean performSchufaCheck( SchufaRequest pRequest );
}
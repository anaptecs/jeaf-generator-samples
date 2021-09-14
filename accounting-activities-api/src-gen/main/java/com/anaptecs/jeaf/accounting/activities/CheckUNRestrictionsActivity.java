/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 * 
 * Copyright 2021. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.activities;

import com.anaptecs.jeaf.accounting.Account;
import com.anaptecs.jeaf.core.api.Activity;

/**
 * Interface of activity CheckUNRestrictionsActivity.
 *
 * 
 */
public interface CheckUNRestrictionsActivity extends Activity {
  /**
   * 
   * 
   * @param account
   */
  void execute( Account account );
}
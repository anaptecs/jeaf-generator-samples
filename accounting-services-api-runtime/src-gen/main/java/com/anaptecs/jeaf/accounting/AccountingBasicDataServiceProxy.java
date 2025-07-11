/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting;

import java.io.Serializable;
import java.lang.reflect.Method;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.anaptecs.jeaf.core.api.MessageConstants;
import com.anaptecs.jeaf.core.api.Service;
import com.anaptecs.jeaf.core.api.ServiceObjectID;
import com.anaptecs.jeaf.core.servicechannel.api.Command;
import com.anaptecs.jeaf.core.servicechannel.api.ServiceProxy;
import com.anaptecs.jeaf.core.spi.TransactionBehavior;
import com.anaptecs.jeaf.xfun.api.XFun;
import com.anaptecs.jeaf.xfun.api.errorhandling.ApplicationException;
import com.anaptecs.jeaf.xfun.api.errorhandling.JEAFSystemException;
import com.anaptecs.jeaf.xfun.api.trace.Trace;

/**
 * ServiceProxy class for JEAF service AccountingBasicDataService.
 */
public final class AccountingBasicDataServiceProxy extends ServiceProxy implements AccountingBasicDataService {
  /**
   * Serial version uid for the proxy class.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Initialize object.
   *
   * @param pTransactionBehavior Definition of transactional behavior. The Parameter must not be null.
   */
  public AccountingBasicDataServiceProxy( TransactionBehavior pTransactionBehavior ) {
    super(AccountingBasicDataService.class, pTransactionBehavior);
  }

  /**
   * Generated proxy implementation for method
   * {@link com.anaptecs.jeaf.accounting.AccountingBasicDataService#createResponsibilityType}
   */
  public ResponsibilityType createResponsibilityType( ResponsibilityType pType ) {
    try {
      Command lCommand = new CreateResponsibilityType_ResponsibilityType_AccountingBasicDataService_Command(pType);
      return (ResponsibilityType) this.executeCommand(lCommand);
    }
    catch (ApplicationException e) {
      throw new JEAFSystemException(e.getErrorCode(), e, e.getMessageParameters());
    }
  }

  /**
   * Generated proxy implementation for method
   * {@link com.anaptecs.jeaf.accounting.AccountingBasicDataService#createBank}
   */
  public Bank createBank( @Valid @NotNull Bank pBank ) {
    try {
      Command lCommand = new CreateBank_Bank_AccountingBasicDataService_Command(pBank);
      return (Bank) this.executeCommand(lCommand);
    }
    catch (ApplicationException e) {
      throw new JEAFSystemException(e.getErrorCode(), e, e.getMessageParameters());
    }
  }

  /**
   * Generated proxy implementation for method
   * {@link com.anaptecs.jeaf.accounting.AccountingBasicDataService#createEmployee}
   */
  public ServiceObjectID createEmployee( Person pPerson, ResponsibilityType pResponsibilityType, Bank pBank ) {
    try {
      Command lCommand = new CreateEmployee_Person_ResponsibilityType_Bank_AccountingBasicDataService_Command(pPerson,
          pResponsibilityType, pBank);
      return (ServiceObjectID) this.executeCommand(lCommand);
    }
    catch (ApplicationException e) {
      throw new JEAFSystemException(e.getErrorCode(), e, e.getMessageParameters());
    }
  }
}

/**
 * Generated command class for service method "createResponsibilityType".
 */
final class CreateResponsibilityType_ResponsibilityType_AccountingBasicDataService_Command extends Command {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for factor to convert nano seconds to milliseconds.
   */
  private static final int MILLISECONDS = 1000 * 1000;

  /**
   * Constant describes the service method that is called by this proxy class.
   */
  private static final Method SERVICE_METHOD;

  /**
   * Object array with all parameters that are passed to the service.
   */
  private final Object[] parameters;
  /**
   * Initializer is used to get the method object describing the called service method only once.
   */
  static {
    try {
      SERVICE_METHOD = AccountingBasicDataService.class.getMethod("createResponsibilityType", ResponsibilityType.class);
    }
    catch (NoSuchMethodException e) {
      throw new JEAFSystemException(MessageConstants.SERVICE_METHOD_DOES_NOT_EXIST, e,
          AccountingBasicDataService.class.getName(), "createResponsibilityType(ResponsibilityType.class)");
    }
  }

  /**
   * Attribute transports the method parameter "pType" to the service implementation via the service channel.
   */
  private final ResponsibilityType type;

  /**
   * Initialize object. All parameters from method "createResponsibilityType" have to be passed as parameters to this
   * command object.
   *
   * @param pType ResponsibilityType
   */
  CreateResponsibilityType_ResponsibilityType_AccountingBasicDataService_Command( ResponsibilityType pType ) {
    super(AccountingBasicDataService.class);
    type = pType;
    parameters = new Object[] { type };
  }

  /**
   * Method executes the service call represented by this command object via JEAFs service channel.
   *
   * @param pTargetService Reference to the service which should be called by this command. The parameter must not be
   * null.
   * @return Serializable Result object of the service call. Due to the fact that all returned objects of remote calls
   * in Java (EJBs e.g.) have to be serializable services always have to return serializable objects no matter if it
   * will be serialized or not. If a service method has no return type (void) then the method returns null. Service
   * methods also may return null as return value.
   */
  @Override
  public Serializable execute( Service pTargetService ) {
    // Execute service call.
    AccountingBasicDataService lService = (AccountingBasicDataService) pTargetService;
    // Trace service call.
    Trace lTrace = XFun.getTrace();
    lTrace.write(MessageConstants.EXECUTING_SERVICE_CALL, this.getCalledServiceMethod());
    long lStartTime = System.nanoTime();
    Serializable lResult = (Serializable) lService.createResponsibilityType(type);
    // Calculate duration of service call in milliseconds
    String lDuration = Long.toString((System.nanoTime() - lStartTime) / MILLISECONDS);
    // Trace result of service call.
    lTrace.write(MessageConstants.RETURNING_FROM_SERVICE_CALL, this.getCalledServiceMethod(), lDuration);
    return lResult;
  }

  /**
   * Method returns a method object describing the service method that will be called by this command object.
   *
   * @return {@link Method} Method object describing the called service method. The method never returns null.
   */
  @Override
  public final Method getServiceMethod( ) {
    return SERVICE_METHOD;
  }

  /**
   * Method returns all parameters that will be passed to the service.
   *
   * @return {@link Object} Object array with all parameters that will be passed to the service. The method may return
   * an empty array in case that the method has no parameters.
   */
  @Override
  public Object[] getParameters( ) {
    return parameters;
  }
}

/**
 * Generated command class for service method "createBank".
 */
final class CreateBank_Bank_AccountingBasicDataService_Command extends Command {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for factor to convert nano seconds to milliseconds.
   */
  private static final int MILLISECONDS = 1000 * 1000;

  /**
   * Constant describes the service method that is called by this proxy class.
   */
  private static final Method SERVICE_METHOD;

  /**
   * Object array with all parameters that are passed to the service.
   */
  private final Object[] parameters;
  /**
   * Initializer is used to get the method object describing the called service method only once.
   */
  static {
    try {
      SERVICE_METHOD = AccountingBasicDataService.class.getMethod("createBank", Bank.class);
    }
    catch (NoSuchMethodException e) {
      throw new JEAFSystemException(MessageConstants.SERVICE_METHOD_DOES_NOT_EXIST, e,
          AccountingBasicDataService.class.getName(), "createBank(Bank.class)");
    }
  }

  /**
   * Attribute transports the method parameter "pBank" to the service implementation via the service channel.
   */
  private final Bank bank;

  /**
   * Initialize object. All parameters from method "createBank" have to be passed as parameters to this command object.
   *
   * @param pBank Bank
   */
  CreateBank_Bank_AccountingBasicDataService_Command( Bank pBank ) {
    super(AccountingBasicDataService.class);
    bank = pBank;
    parameters = new Object[] { bank };
  }

  /**
   * Method executes the service call represented by this command object via JEAFs service channel.
   *
   * @param pTargetService Reference to the service which should be called by this command. The parameter must not be
   * null.
   * @return Serializable Result object of the service call. Due to the fact that all returned objects of remote calls
   * in Java (EJBs e.g.) have to be serializable services always have to return serializable objects no matter if it
   * will be serialized or not. If a service method has no return type (void) then the method returns null. Service
   * methods also may return null as return value.
   */
  @Override
  public Serializable execute( Service pTargetService ) {
    // Execute service call.
    AccountingBasicDataService lService = (AccountingBasicDataService) pTargetService;
    // Trace service call.
    Trace lTrace = XFun.getTrace();
    lTrace.write(MessageConstants.EXECUTING_SERVICE_CALL, this.getCalledServiceMethod());
    long lStartTime = System.nanoTime();
    Serializable lResult = (Serializable) lService.createBank(bank);
    // Calculate duration of service call in milliseconds
    String lDuration = Long.toString((System.nanoTime() - lStartTime) / MILLISECONDS);
    // Trace result of service call.
    lTrace.write(MessageConstants.RETURNING_FROM_SERVICE_CALL, this.getCalledServiceMethod(), lDuration);
    return lResult;
  }

  /**
   * Method returns a method object describing the service method that will be called by this command object.
   *
   * @return {@link Method} Method object describing the called service method. The method never returns null.
   */
  @Override
  public final Method getServiceMethod( ) {
    return SERVICE_METHOD;
  }

  /**
   * Method returns all parameters that will be passed to the service.
   *
   * @return {@link Object} Object array with all parameters that will be passed to the service. The method may return
   * an empty array in case that the method has no parameters.
   */
  @Override
  public Object[] getParameters( ) {
    return parameters;
  }
}

/**
 * Generated command class for service method "createEmployee".
 */
final class CreateEmployee_Person_ResponsibilityType_Bank_AccountingBasicDataService_Command extends Command {
  /**
   * Default serial version uid.
   */
  private static final long serialVersionUID = 1L;

  /**
   * Constant for factor to convert nano seconds to milliseconds.
   */
  private static final int MILLISECONDS = 1000 * 1000;

  /**
   * Constant describes the service method that is called by this proxy class.
   */
  private static final Method SERVICE_METHOD;

  /**
   * Object array with all parameters that are passed to the service.
   */
  private final Object[] parameters;
  /**
   * Initializer is used to get the method object describing the called service method only once.
   */
  static {
    try {
      SERVICE_METHOD = AccountingBasicDataService.class.getMethod("createEmployee", Person.class,
          ResponsibilityType.class, Bank.class);
    }
    catch (NoSuchMethodException e) {
      throw new JEAFSystemException(MessageConstants.SERVICE_METHOD_DOES_NOT_EXIST, e,
          AccountingBasicDataService.class.getName(),
          "createEmployee(Person.class, ResponsibilityType.class, Bank.class)");
    }
  }

  /**
   * Attribute transports the method parameter "pPerson" to the service implementation via the service channel.
   */
  private final Person person;

  /**
   * Attribute transports the method parameter "pResponsibilityType" to the service implementation via the service
   * channel.
   */
  private final ResponsibilityType responsibilityType;

  /**
   * Attribute transports the method parameter "pBank" to the service implementation via the service channel.
   */
  private final Bank bank;

  /**
   * Initialize object. All parameters from method "createEmployee" have to be passed as parameters to this command
   * object.
   *
   * @param pPerson Person
   * @param pResponsibilityType ResponsibilityType
   * @param pBank Bank
   */
  CreateEmployee_Person_ResponsibilityType_Bank_AccountingBasicDataService_Command( Person pPerson,
      ResponsibilityType pResponsibilityType, Bank pBank ) {
    super(AccountingBasicDataService.class);
    person = pPerson;
    responsibilityType = pResponsibilityType;
    bank = pBank;
    parameters = new Object[] { person, responsibilityType, bank };
  }

  /**
   * Method executes the service call represented by this command object via JEAFs service channel.
   *
   * @param pTargetService Reference to the service which should be called by this command. The parameter must not be
   * null.
   * @return Serializable Result object of the service call. Due to the fact that all returned objects of remote calls
   * in Java (EJBs e.g.) have to be serializable services always have to return serializable objects no matter if it
   * will be serialized or not. If a service method has no return type (void) then the method returns null. Service
   * methods also may return null as return value.
   */
  @Override
  public Serializable execute( Service pTargetService ) {
    // Execute service call.
    AccountingBasicDataService lService = (AccountingBasicDataService) pTargetService;
    // Trace service call.
    Trace lTrace = XFun.getTrace();
    lTrace.write(MessageConstants.EXECUTING_SERVICE_CALL, this.getCalledServiceMethod());
    long lStartTime = System.nanoTime();
    Serializable lResult = (Serializable) lService.createEmployee(person, responsibilityType, bank);
    // Calculate duration of service call in milliseconds
    String lDuration = Long.toString((System.nanoTime() - lStartTime) / MILLISECONDS);
    // Trace result of service call.
    lTrace.write(MessageConstants.RETURNING_FROM_SERVICE_CALL, this.getCalledServiceMethod(), lDuration);
    return lResult;
  }

  /**
   * Method returns a method object describing the service method that will be called by this command object.
   *
   * @return {@link Method} Method object describing the called service method. The method never returns null.
   */
  @Override
  public final Method getServiceMethod( ) {
    return SERVICE_METHOD;
  }

  /**
   * Method returns all parameters that will be passed to the service.
   *
   * @return {@link Object} Object array with all parameters that will be passed to the service. The method may return
   * an empty array in case that the method has no parameters.
   */
  @Override
  public Object[] getParameters( ) {
    return parameters;
  }
}
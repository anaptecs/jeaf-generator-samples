/*
 * anaptecs GmbH, Ricarda-Huch-Str. 71, 72760 Reutlingen, Germany
 *
 * Copyright 2024. All rights reserved.
 */
package com.anaptecs.jeaf.accounting.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import com.anaptecs.jeaf.core.servicechannel.api.ComponentFactory;
import com.anaptecs.jeaf.core.servicechannel.api.ServiceFactory;
import com.anaptecs.jeaf.core.spi.ComponentImplementation;

/**
 * Class is factory class to create new instances of the component AccountingComponent.
 */
@com.anaptecs.jeaf.core.annotations.ComponentFactory
public final class AccountingComponentFactory implements ComponentFactory {
  /**
   * Reference to component.
   */
  private final ComponentImplementation component;

  /**
   * Reference to the factories of all services that are provided by this component.
   */
  private final Collection<ServiceFactory> serviceFactories;

  /**
   * Initialize object. As defined by interface ComponentFactory the implementing class has to define a parameterless
   * public constructor.
   */
  public AccountingComponentFactory( ) {
    // Create new component.
    component = new AccountingComponent();
    // Create new collection for all service factories.
    Collection<ServiceFactory> lServiceFactories = new ArrayList<ServiceFactory>();
    lServiceFactories.add(new AccountingBasicDataServiceFactory(component));
    lServiceFactories.add(new AccountingServiceFactory(component));
    // Make sure that collection of service factories is unmodifiable.
    serviceFactories = Collections.unmodifiableCollection(lServiceFactories);
  }

  /**
   * Method creates a new instance of component AccountingComponent.
   *
   * @return Component Created AccountingComponent. The method never returns null.
   *
   * @see ComponentFactory#createComponent()
   */
  @Override
  public ComponentImplementation createComponent( ) {
    return component;
  }

  /**
   * Method returns the factories for all services of this component.
   *
   * @return Collection All Factories for the services of this component. The method never returns null and all objects
   * within this collection can be casted to interface ServiceFactory.
   *
   * @see com.anaptecs.jeaf.core.api.Component#getServiceFactories()
   */
  @Override
  public Collection<ServiceFactory> getServiceFactories( ) {
    // Return service factories.
    return serviceFactories;
  }
}
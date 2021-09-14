package com.anaptecs.jeaf.accounting.impl.domain;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.anaptecs.jeaf.spi.persistence.ClassID;
import com.anaptecs.jeaf.spi.persistence.PersistentObject;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public abstract class CustomerBOBase extends PersistentObject {
  /**
   * The class id is a unique id within the domain model of an application for every business object class.
   */
  public static final ClassID CLASS_ID = ClassID.createClassID(1104, CustomerBO.class);

  /**
   * Name of the database table that is used to store the data of objects of this class.
   */
  public static final String TABLE_NAME = "CUSTOMERBO";

  /**
   * Constant for the name of the row that is used to store the values of attribute "active".
   */
  public static final String ACTIVE_ROW = "ACTIVE";

  /**
   * Constant for the name of attribute "active".
   */
  public static final String ACTIVE_ATTRIBUTE = "active";

  /**
   * Constant for the name of role "accounts".
   */
  public static final String ACCOUNTS_ROLE = "accounts";

  /**
   * Constant for the name of role "attendingEmployees".
   */
  public static final String ATTENDINGEMPLOYEES_ROLE = "attendingEmployees";

  /**
   * Constant for the name of role "adress".
   */
  public static final String ADRESS_ROLE = "adress";

  /**
   * 
   */
  private Set<AccountBO> accounts = new HashSet<AccountBO>();

  /**
   * 
   */
  private Set<EmployeeBO> attendingEmployees = new HashSet<EmployeeBO>();

  /**
   * 
   */
  private Boolean active;

  /**
   * 
   */
  private MyAddressBO adress;

  /**
   * Initialize object. The constructor of the class has visibility protected in order to avoid creating business
   * objects not through JEAFs persistence service provider.
   */
  protected CustomerBOBase( ) {
    // Nothing to do.
  }

  /**
   * Method returns all instance of this class including potential subclasses.
   * 
   * @return {@link List} List with all objects of this class. The method never returns null.
   */
  public static List<CustomerBO> findAllCustomerBOs( ) {
    return PersistentObject.getPersistenceServiceProvider().findAll(CustomerBO.class);
  }

  /**
   * Method returns the association "accounts".
   * 
   *
   * @return Collection All AccountBO objects that belong to the association "accounts". The method never returns null
   * and the returned collection is unmodifiable.
   */
  public Set<AccountBO> getAccounts( ) {
    // Return all AccountBO objects as unmodifiable collection.
    return Collections.unmodifiableSet(accounts);
  }

  /**
   * Method sets the association "accounts" to the passed collection. All objects that formerly were part of the
   * association will be removed from it.
   * 
   * 
   * @param pAccounts Collection with objects to which the association should be set. The parameter must not be null.
   */
  void setAccounts( Set<AccountBO> pAccounts ) {
    // Check of parameter is not required.
    // Remove all objects from association "accounts".
    this.clearAccounts();
    // If the association is null, removing all entries is sufficient.
    if (pAccounts != null) {
      accounts = new HashSet<AccountBO>(pAccounts);
    }
  }

  /**
   * Method adds the passed AccountBO object to the association "accounts".
   * 
   * 
   * @param pAccounts Object that should be added to the association "accounts". The parameter must not be null.
   */
  public void addToAccounts( AccountBO pAccounts ) {
    // Check parameter "pAccounts" for invalid value null.
    Check.checkInvalidParameterNull(pAccounts, "pAccounts");
    // Since this is not a many-to-many association the association to which the passed object belongs, has to
    // be released.
    pAccounts.unsetCustomer();
    // Add passed object to collection of associated AccountBO objects.
    accounts.add(pAccounts);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAccounts != null && this.equals(pAccounts.getCustomer()) == false) {
      pAccounts.setCustomer((CustomerBO) this);
    }
  }

  /**
   * Method adds all passed objects to the association "accounts".
   * 
   * 
   * @param pAccounts Collection with all objects that should be added to the association "accounts". The parameter must
   * not be null.
   */
  public void addToAccounts( Collection<AccountBO> pAccounts ) {
    // Check parameter "pAccounts" for invalid value null.
    Check.checkInvalidParameterNull(pAccounts, "pAccounts");
    // Add all passed objects.
    for (AccountBO lNextObject : pAccounts) {
      this.addToAccounts(lNextObject);
    }
  }

  /**
   * Method removes the passed AccountBO object from the association "accounts".
   * 
   * 
   * @param pAccounts Object that should be removed from the association "accounts". The parameter must not be null.
   */
  public void removeFromAccounts( AccountBO pAccounts ) {
    // Check parameter for invalid value null.
    Check.checkInvalidParameterNull(pAccounts, "pAccounts");
    // Remove passed object from collection of associated AccountBO objects.
    accounts.remove(pAccounts);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (this.equals(pAccounts.getCustomer()) == true) {
      pAccounts.unsetCustomer();
    }
  }

  /**
   * Method removes all objects from the association "accounts".
   * 
   */
  public void clearAccounts( ) {
    // Remove all objects from association "accounts".
    Collection<AccountBO> lAccounts = new HashSet<AccountBO>(accounts);
    Iterator<AccountBO> lIterator = lAccounts.iterator();
    while (lIterator.hasNext()) {
      this.removeFromAccounts(lIterator.next());
    }
  }

  /**
   * Method returns the association "attendingEmployees".
   * 
   *
   * @return Collection All EmployeeBO objects that belong to the association "attendingEmployees". The method never
   * returns null and the returned collection is unmodifiable.
   */
  public Set<EmployeeBO> getAttendingEmployees( ) {
    // Return all EmployeeBO objects as unmodifiable collection.
    return Collections.unmodifiableSet(attendingEmployees);
  }

  /**
   * Method sets the association "attendingEmployees" to the passed collection. All objects that formerly were part of
   * the association will be removed from it.
   * 
   * 
   * @param pAttendingEmployees Collection with objects to which the association should be set. The parameter must not
   * be null.
   */
  void setAttendingEmployees( Set<EmployeeBO> pAttendingEmployees ) {
    // Check of parameter is not required.
    // Remove all objects from association "attendingEmployees".
    this.clearAttendingEmployees();
    // If the association is null, removing all entries is sufficient.
    if (pAttendingEmployees != null) {
      attendingEmployees = new HashSet<EmployeeBO>(pAttendingEmployees);
    }
  }

  /**
   * Method adds the passed EmployeeBO object to the association "attendingEmployees".
   * 
   * 
   * @param pAttendingEmployees Object that should be added to the association "attendingEmployees". The parameter must
   * not be null.
   */
  public void addToAttendingEmployees( EmployeeBO pAttendingEmployees ) {
    // Check parameter "pAttendingEmployees" for invalid value null.
    Check.checkInvalidParameterNull(pAttendingEmployees, "pAttendingEmployees");
    // Add passed object to collection of associated EmployeeBO objects.
    attendingEmployees.add(pAttendingEmployees);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAttendingEmployees != null && pAttendingEmployees.getAttendedCustomers().contains(this) == false) {
      pAttendingEmployees.addToAttendedCustomers((CustomerBO) this);
    }
  }

  /**
   * Method adds all passed objects to the association "attendingEmployees".
   * 
   * 
   * @param pAttendingEmployees Collection with all objects that should be added to the association
   * "attendingEmployees". The parameter must not be null.
   */
  public void addToAttendingEmployees( Collection<EmployeeBO> pAttendingEmployees ) {
    // Check parameter "pAttendingEmployees" for invalid value null.
    Check.checkInvalidParameterNull(pAttendingEmployees, "pAttendingEmployees");
    // Add all passed objects.
    for (EmployeeBO lNextObject : pAttendingEmployees) {
      this.addToAttendingEmployees(lNextObject);
    }
  }

  /**
   * Method removes the passed EmployeeBO object from the association "attendingEmployees".
   * 
   * 
   * @param pAttendingEmployees Object that should be removed from the association "attendingEmployees". The parameter
   * must not be null.
   */
  public void removeFromAttendingEmployees( EmployeeBO pAttendingEmployees ) {
    // Check parameter for invalid value null.
    Check.checkInvalidParameterNull(pAttendingEmployees, "pAttendingEmployees");
    // Remove passed object from collection of associated EmployeeBO objects.
    attendingEmployees.remove(pAttendingEmployees);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAttendingEmployees.getAttendedCustomers().contains(this) == true) {
      pAttendingEmployees.removeFromAttendedCustomers((CustomerBO) this);
    }
  }

  /**
   * Method removes all objects from the association "attendingEmployees".
   * 
   */
  public void clearAttendingEmployees( ) {
    // Remove all objects from association "attendingEmployees".
    Collection<EmployeeBO> lAttendingEmployees = new HashSet<EmployeeBO>(attendingEmployees);
    Iterator<EmployeeBO> lIterator = lAttendingEmployees.iterator();
    while (lIterator.hasNext()) {
      this.removeFromAttendingEmployees(lIterator.next());
    }
  }

  /**
   * Method returns the attribute "active".
   * 
   * 
   * @return Boolean Value to which the attribute "active" is set.
   */
  public Boolean getActive( ) {
    return active;
  }

  /**
   * Method sets the attribute "active".
   * 
   * 
   * @param pActive Value to which the attribute "active" should be set.
   */
  public void setActive( Boolean pActive ) {
    // Assign value to attribute
    active = pActive;
  }

  /**
   * Method returns the association "adress".
   * 
   *
   * @return MyAddressBO MyAddressBO to which the association "adress" is set.
   */
  public MyAddressBO getAdress( ) {
    adress = this.unproxy(adress);
    return adress;
  }

  /**
   * Method sets the association "adress".
   * 
   * 
   * @param pAdress MyAddressBO to which the association "adress" should be set.
   */
  public void setAdress( MyAddressBO pAdress ) {
    adress = pAdress;
  }

  /**
   * Method unsets the association "adress".
   * 
   */
  public final void unsetAdress( ) {
    adress = null;
  }

  /**
   * Method returns the class id of this business object class.
   * 
   * @return {@link ClassID} Class ID of this business object. The method never returns null.
   */
  public ClassID getClassID( ) {
    return CLASS_ID;
  }
}

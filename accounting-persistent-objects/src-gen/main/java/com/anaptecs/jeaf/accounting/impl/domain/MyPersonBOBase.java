package com.anaptecs.jeaf.accounting.impl.domain;

import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.validation.constraints.NotNull;

import com.anaptecs.jeaf.spi.persistence.ClassID;
import com.anaptecs.jeaf.spi.persistence.PersistentObject;
import com.anaptecs.jeaf.xfun.api.checks.Check;

/**
 * @author JEAF Generator
 * @version JEAF Release 1.6.x
 */
public abstract class MyPersonBOBase extends PersistentObject {
  /**
   * The class id is a unique id within the domain model of an application for every business object class.
   */
  public static final ClassID CLASS_ID = ClassID.createClassID(1107, MyPersonBO.class);

  /**
   * Name of the database table that is used to store the data of objects of this class.
   */
  public static final String TABLE_NAME = "SAMPLE_PERSON";

  /**
   * Constant for the name of the row that is used to store the values of attribute "name".
   */
  public static final String NAME_ROW = "NAME";

  /**
   * Constant for the name of attribute "name".
   */
  public static final String NAME_ATTRIBUTE = "name";

  /**
   * Constant for the name of the row that is used to store the values of attribute "firstName".
   */
  public static final String FIRSTNAME_ROW = "FIRSTNAME";

  /**
   * Constant for the name of attribute "firstName".
   */
  public static final String FIRSTNAME_ATTRIBUTE = "firstName";

  /**
   * Constant for the name of the row that is used to store the values of attribute "dateOfBirth".
   */
  public static final String DATEOFBIRTH_ROW = "DATEOFBIRTH";

  /**
   * Constant for the name of attribute "dateOfBirth".
   */
  public static final String DATEOFBIRTH_ATTRIBUTE = "dateOfBirth";

  /**
   * Constant for the name of role "accounts".
   */
  public static final String ACCOUNTS_ROLE = "accounts";

  /**
   * Constant for the name of role "employee".
   */
  public static final String EMPLOYEE_ROLE = "employee";

  /**
   * Constant for the name of role "customer".
   */
  public static final String CUSTOMER_ROLE = "customer";

  /**
   * 
   */
  private String name;

  /**
   * 
   */
  private String firstName;

  /**
   * 
   */
  private Calendar dateOfBirth;

  /**
   * 
   */
  private Set<AccountBO> accounts = new HashSet<AccountBO>();

  /**
   * 
   */
  private EmployeeBO employee;

  /**
   * 
   */
  private IndividualBO customer;

  /**
   * Initialize object. The constructor of the class has visibility protected in order to avoid creating business
   * objects not through JEAFs persistence service provider.
   */
  protected MyPersonBOBase( ) {
    // Nothing to do.
  }

  /**
   * Method returns all instance of this class including potential subclasses.
   * 
   * @return {@link List} List with all objects of this class. The method never returns null.
   */
  public static List<MyPersonBO> findAllMyPersonBOs( ) {
    return PersistentObject.getPersistenceServiceProvider().findAll(MyPersonBO.class);
  }

  /**
   * Method returns the attribute "name".
   * 
   * 
   * @return String Value to which the attribute "name" is set.
   */
  public String getName( ) {
    return name;
  }

  /**
   * Method sets the attribute "name".
   * 
   * 
   * @param pName Value to which the attribute "name" should be set.
   */
  public void setName( String pName ) {
    // Assign value to attribute
    name = pName;
  }

  /**
   * Method returns the attribute "firstName".
   * 
   * 
   * @return String Value to which the attribute "firstName" is set.
   */
  public String getFirstName( ) {
    return firstName;
  }

  /**
   * Method sets the attribute "firstName".
   * 
   * 
   * @param pFirstName Value to which the attribute "firstName" should be set.
   */
  public void setFirstName( String pFirstName ) {
    // Assign value to attribute
    firstName = pFirstName;
  }

  /**
   * Method returns the attribute "dateOfBirth".
   * 
   * 
   * @return Calendar Value to which the attribute "dateOfBirth" is set.
   */
  public Calendar getDateOfBirth( ) {
    return dateOfBirth;
  }

  /**
   * Method sets the attribute "dateOfBirth".
   * 
   * 
   * @param pDateOfBirth Value to which the attribute "dateOfBirth" should be set.
   */
  public void setDateOfBirth( Calendar pDateOfBirth ) {
    // Assign value to attribute
    dateOfBirth = pDateOfBirth;
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
    // Add passed object to collection of associated AccountBO objects.
    accounts.add(pAccounts);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAccounts != null && pAccounts.getAuthorizedPersons().contains(this) == false) {
      pAccounts.addToAuthorizedPersons((MyPersonBO) this);
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
    if (pAccounts.getAuthorizedPersons().contains(this) == true) {
      pAccounts.removeFromAuthorizedPersons((MyPersonBO) this);
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
   * Method returns the association "employee".
   * 
   *
   * @return EmployeeBO EmployeeBO to which the association "employee" is set.
   */
  public EmployeeBO getEmployee( ) {
    employee = this.unproxy(employee);
    return employee;
  }

  /**
   * Method sets the association "employee".
   * 
   * 
   * @param pEmployee EmployeeBO to which the association "employee" should be set.
   */
  public void setEmployee( EmployeeBO pEmployee ) {
    // Release already referenced object before setting a new association.
    if (employee != null) {
      employee.unsetPerson();
    }
    employee = pEmployee;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pEmployee != null && this.equals(pEmployee.getPerson()) == false) {
      pEmployee.setPerson((MyPersonBO) this);
    }
  }

  /**
   * Method unsets the association "employee".
   * 
   */
  public final void unsetEmployee( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    EmployeeBO lEmployeeBO = employee;
    employee = null;
    if (lEmployeeBO != null && this.equals(lEmployeeBO.getPerson()) == true) {
      lEmployeeBO.unsetPerson();
    }
  }

  /**
   * Method returns the association "customer".
   * 
   *
   * @return IndividualBO IndividualBO to which the association "customer" is set.
   */
  public IndividualBO getCustomer( ) {
    customer = this.unproxy(customer);
    return customer;
  }

  /**
   * Method sets the association "customer".
   * 
   * 
   * @param pCustomer IndividualBO to which the association "customer" should be set.
   */
  public void setCustomer( IndividualBO pCustomer ) {
    // Release already referenced object before setting a new association.
    if (customer != null) {
      customer.unsetPerson();
    }
    customer = pCustomer;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pCustomer != null && this.equals(pCustomer.getPerson()) == false) {
      pCustomer.setPerson((MyPersonBO) this);
    }
  }

  /**
   * Method unsets the association "customer".
   * 
   */
  public final void unsetCustomer( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    IndividualBO lIndividualBO = customer;
    customer = null;
    if (lIndividualBO != null && this.equals(lIndividualBO.getPerson()) == true) {
      lIndividualBO.unsetPerson();
    }
  }

  /**
   * 
   * @return {@link Integer}
   */
  public abstract Integer calculateAge( );

  /**
   * 
   * @return {@link String}
   */
  @NotNull
  public abstract String getFullName( );

  /**
   * Method returns the class id of this business object class.
   * 
   * @return {@link ClassID} Class ID of this business object. The method never returns null.
   */
  public ClassID getClassID( ) {
    return CLASS_ID;
  }
}

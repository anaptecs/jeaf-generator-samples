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
public abstract class BankBOBase extends PersistentObject {
  /**
   * The class id is a unique id within the domain model of an application for every business object class.
   */
  public static final ClassID CLASS_ID = ClassID.createClassID(1103, BankBO.class);

  /**
   * Name of the database table that is used to store the data of objects of this class.
   */
  public static final String TABLE_NAME = "BANK";

  /**
   * Constant for the name of the row that is used to store the values of attribute "name".
   */
  public static final String NAME_ROW = "NAME";

  /**
   * Constant for the name of attribute "name".
   */
  public static final String NAME_ATTRIBUTE = "name";

  /**
   * Constant for the name of the row that is used to store the values of attribute "code".
   */
  public static final String CODE_ROW = "CODE";

  /**
   * Constant for the name of attribute "code".
   */
  public static final String CODE_ATTRIBUTE = "code";

  /**
   * Constant for the name of the row that is used to store the values of attribute "type".
   */
  public static final String TYPE_ROW = "TYPE";

  /**
   * Constant for the name of attribute "type".
   */
  public static final String TYPE_ATTRIBUTE = "type";

  /**
   * Constant for the name of role "employees".
   */
  public static final String EMPLOYEES_ROLE = "employees";

  /**
   * Constant for the name of role "accounts".
   */
  public static final String ACCOUNTS_ROLE = "accounts";

  /**
   * 
   */
  public static short MUTUAL_SAVINGS = 1;

  /**
   * 
   */
  public static short PRIVATE_BANK = 2;

  /**
   * 
   */
  private Set<EmployeeBO> employees = new HashSet<EmployeeBO>();

  /**
   * 
   */
  private Set<AccountBO> accounts = new HashSet<AccountBO>();

  /**
   * 
   */
  private String name;

  /**
   * 
   */
  private Long code;

  /**
   * 
   */
  private Short type;

  /**
   * Initialize object. The constructor of the class has visibility protected in order to avoid creating business
   * objects not through JEAFs persistence service provider.
   */
  protected BankBOBase( ) {
    // Nothing to do.
  }

  /**
   * Method returns all instance of this class including potential subclasses.
   * 
   * @return {@link List} List with all objects of this class. The method never returns null.
   */
  public static List<BankBO> findAllBankBOs( ) {
    return PersistentObject.getPersistenceServiceProvider().findAll(BankBO.class);
  }

  /**
   * Method returns the association "employees".
   * 
   *
   * @return Collection All EmployeeBO objects that belong to the association "employees". The method never returns null
   * and the returned collection is unmodifiable.
   */
  public Set<EmployeeBO> getEmployees( ) {
    // Return all EmployeeBO objects as unmodifiable collection.
    return Collections.unmodifiableSet(employees);
  }

  /**
   * Method sets the association "employees" to the passed collection. All objects that formerly were part of the
   * association will be removed from it.
   * 
   * 
   * @param pEmployees Collection with objects to which the association should be set. The parameter must not be null.
   */
  void setEmployees( Set<EmployeeBO> pEmployees ) {
    // Check of parameter is not required.
    // Remove all objects from association "employees".
    this.clearEmployees();
    // If the association is null, removing all entries is sufficient.
    if (pEmployees != null) {
      employees = new HashSet<EmployeeBO>(pEmployees);
    }
  }

  /**
   * Method adds the passed EmployeeBO object to the association "employees".
   * 
   * 
   * @param pEmployees Object that should be added to the association "employees". The parameter must not be null.
   */
  public void addToEmployees( EmployeeBO pEmployees ) {
    // Check parameter "pEmployees" for invalid value null.
    Check.checkInvalidParameterNull(pEmployees, "pEmployees");
    // Since this is not a many-to-many association the association to which the passed object belongs, has to
    // be released.
    pEmployees.unsetBank();
    // Add passed object to collection of associated EmployeeBO objects.
    employees.add(pEmployees);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pEmployees != null && this.equals(pEmployees.getBank()) == false) {
      pEmployees.setBank((BankBO) this);
    }
  }

  /**
   * Method adds all passed objects to the association "employees".
   * 
   * 
   * @param pEmployees Collection with all objects that should be added to the association "employees". The parameter
   * must not be null.
   */
  public void addToEmployees( Collection<EmployeeBO> pEmployees ) {
    // Check parameter "pEmployees" for invalid value null.
    Check.checkInvalidParameterNull(pEmployees, "pEmployees");
    // Add all passed objects.
    for (EmployeeBO lNextObject : pEmployees) {
      this.addToEmployees(lNextObject);
    }
  }

  /**
   * Method removes the passed EmployeeBO object from the association "employees".
   * 
   * 
   * @param pEmployees Object that should be removed from the association "employees". The parameter must not be null.
   */
  public void removeFromEmployees( EmployeeBO pEmployees ) {
    // Check parameter for invalid value null.
    Check.checkInvalidParameterNull(pEmployees, "pEmployees");
    // Remove passed object from collection of associated EmployeeBO objects.
    employees.remove(pEmployees);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (this.equals(pEmployees.getBank()) == true) {
      pEmployees.unsetBank();
    }
  }

  /**
   * Method removes all objects from the association "employees".
   * 
   */
  public void clearEmployees( ) {
    // Remove all objects from association "employees".
    Collection<EmployeeBO> lEmployees = new HashSet<EmployeeBO>(employees);
    Iterator<EmployeeBO> lIterator = lEmployees.iterator();
    while (lIterator.hasNext()) {
      this.removeFromEmployees(lIterator.next());
    }
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
    pAccounts.unsetBank();
    // Add passed object to collection of associated AccountBO objects.
    accounts.add(pAccounts);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAccounts != null && this.equals(pAccounts.getBank()) == false) {
      pAccounts.setBank((BankBO) this);
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
    if (this.equals(pAccounts.getBank()) == true) {
      pAccounts.unsetBank();
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
   * Method returns the attribute "code".
   * 
   * 
   * @return Long Value to which the attribute "code" is set.
   */
  public Long getCode( ) {
    return code;
  }

  /**
   * Method sets the attribute "code".
   * 
   * 
   * @param pCode Value to which the attribute "code" should be set.
   */
  public void setCode( Long pCode ) {
    // Assign value to attribute
    code = pCode;
  }

  /**
   * Method returns the attribute "type".
   * 
   * 
   * @return Short Value to which the attribute "type" is set.
   */
  public Short getType( ) {
    return type;
  }

  /**
   * Method sets the attribute "type".
   * 
   * 
   * @param pType Value to which the attribute "type" should be set.
   */
  public void setType( Short pType ) {
    // Assign value to attribute
    type = pType;
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
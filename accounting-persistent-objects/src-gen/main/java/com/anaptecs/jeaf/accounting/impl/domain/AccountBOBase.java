package com.anaptecs.jeaf.accounting.impl.domain;

import java.math.BigDecimal;
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
public abstract class AccountBOBase extends PersistentObject {
  /**
   * The class id is a unique id within the domain model of an application for every business object class.
   */
  public static final ClassID CLASS_ID = ClassID.createClassID(1111, AccountBO.class);

  /**
   * Name of the database table that is used to store the data of objects of this class.
   */
  public static final String TABLE_NAME = "ACCOUNT";

  /**
   * Constant for the name of the row that is used to store the values of attribute "number".
   */
  public static final String NUMBER_ROW = "NUMBER";

  /**
   * Constant for the name of attribute "number".
   */
  public static final String NUMBER_ATTRIBUTE = "number";

  /**
   * Constant for the name of the row that is used to store the values of attribute "interestRate".
   */
  public static final String INTERESTRATE_ROW = "INTERESTRATE";

  /**
   * Constant for the name of attribute "interestRate".
   */
  public static final String INTERESTRATE_ATTRIBUTE = "interestRate";

  /**
   * Constant for the name of role "bank".
   */
  public static final String BANK_ROLE = "bank";

  /**
   * Constant for the name of role "customer".
   */
  public static final String CUSTOMER_ROLE = "customer";

  /**
   * Constant for the name of role "bookings".
   */
  public static final String BOOKINGS_ROLE = "bookings";

  /**
   * Constant for the name of role "authorizedPersons".
   */
  public static final String AUTHORIZEDPERSONS_ROLE = "authorizedPersons";

  /**
   * 
   */
  private Long number;

  /**
   * 
   */
  private BankBO bank;

  /**
   * 
   */
  private CustomerBO customer;

  /**
   * 
   */
  private Set<BookingBO> bookings = new HashSet<BookingBO>();

  /**
   * 
   */
  private Set<MyPersonBO> authorizedPersons = new HashSet<MyPersonBO>();

  /**
   * 
   */
  private Float interestRate;

  /**
   * Initialize object. The constructor of the class has visibility protected in order to avoid creating business
   * objects not through JEAFs persistence service provider.
   */
  protected AccountBOBase( ) {
    // Nothing to do.
  }

  /**
   * Method returns all instance of this class including potential subclasses.
   * 
   * @return {@link List} List with all objects of this class. The method never returns null.
   */
  public static List<AccountBO> findAllAccountBOs( ) {
    return PersistentObject.getPersistenceServiceProvider().findAll(AccountBO.class);
  }

  /**
   * Method returns the attribute "number".
   * 
   * 
   * @return Long Value to which the attribute "number" is set.
   */
  public Long getNumber( ) {
    return number;
  }

  /**
   * Method sets the attribute "number".
   * 
   * 
   * @param pNumber Value to which the attribute "number" should be set.
   */
  public void setNumber( Long pNumber ) {
    // Assign value to attribute
    number = pNumber;
  }

  /**
   * Method returns the association "bank".
   * 
   *
   * @return BankBO BankBO to which the association "bank" is set.
   */
  public BankBO getBank( ) {
    bank = this.unproxy(bank);
    return bank;
  }

  /**
   * Method sets the association "bank".
   * 
   * 
   * @param pBank BankBO to which the association "bank" should be set.
   */
  public void setBank( BankBO pBank ) {
    // Release already referenced object before setting a new association.
    if (bank != null) {
      bank.removeFromAccounts((AccountBO) this);
    }
    bank = pBank;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pBank != null && pBank.getAccounts().contains(this) == false) {
      pBank.addToAccounts((AccountBO) this);
    }
  }

  /**
   * Method unsets the association "bank".
   * 
   */
  public final void unsetBank( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    BankBO lBankBO = bank;
    bank = null;
    if (lBankBO != null && lBankBO.getAccounts().contains(this) == true) {
      lBankBO.removeFromAccounts((AccountBO) this);
    }
  }

  /**
   * Method returns the association "customer".
   * 
   *
   * @return CustomerBO CustomerBO to which the association "customer" is set.
   */
  public CustomerBO getCustomer( ) {
    customer = this.unproxy(customer);
    return customer;
  }

  /**
   * Method sets the association "customer".
   * 
   * 
   * @param pCustomer CustomerBO to which the association "customer" should be set.
   */
  public void setCustomer( CustomerBO pCustomer ) {
    // Release already referenced object before setting a new association.
    if (customer != null) {
      customer.removeFromAccounts((AccountBO) this);
    }
    customer = pCustomer;
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pCustomer != null && pCustomer.getAccounts().contains(this) == false) {
      pCustomer.addToAccounts((AccountBO) this);
    }
  }

  /**
   * Method unsets the association "customer".
   * 
   */
  public final void unsetCustomer( ) {
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    CustomerBO lCustomerBO = customer;
    customer = null;
    if (lCustomerBO != null && lCustomerBO.getAccounts().contains(this) == true) {
      lCustomerBO.removeFromAccounts((AccountBO) this);
    }
  }

  /**
   * Method returns the association "bookings".
   * 
   *
   * @return Collection All BookingBO objects that belong to the association "bookings". The method never returns null
   * and the returned collection is unmodifiable.
   */
  public Set<BookingBO> getBookings( ) {
    // Return all BookingBO objects as unmodifiable collection.
    return Collections.unmodifiableSet(bookings);
  }

  /**
   * Method sets the association "bookings" to the passed collection. All objects that formerly were part of the
   * association will be removed from it.
   * 
   * 
   * @param pBookings Collection with objects to which the association should be set. The parameter must not be null.
   */
  void setBookings( Set<BookingBO> pBookings ) {
    // Check of parameter is not required.
    // Remove all objects from association "bookings".
    this.clearBookings();
    // If the association is null, removing all entries is sufficient.
    if (pBookings != null) {
      bookings = new HashSet<BookingBO>(pBookings);
    }
  }

  /**
   * Method adds the passed BookingBO object to the association "bookings".
   * 
   * 
   * @param pBookings Object that should be added to the association "bookings". The parameter must not be null.
   */
  public void addToBookings( BookingBO pBookings ) {
    // Check parameter "pBookings" for invalid value null.
    Check.checkInvalidParameterNull(pBookings, "pBookings");
    // Since this is not a many-to-many association the association to which the passed object belongs, has to
    // be released.
    pBookings.unsetAccount();
    // Add passed object to collection of associated BookingBO objects.
    bookings.add(pBookings);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pBookings != null && this.equals(pBookings.getAccount()) == false) {
      pBookings.setAccount((AccountBO) this);
    }
  }

  /**
   * Method adds all passed objects to the association "bookings".
   * 
   * 
   * @param pBookings Collection with all objects that should be added to the association "bookings". The parameter must
   * not be null.
   */
  public void addToBookings( Collection<BookingBO> pBookings ) {
    // Check parameter "pBookings" for invalid value null.
    Check.checkInvalidParameterNull(pBookings, "pBookings");
    // Add all passed objects.
    for (BookingBO lNextObject : pBookings) {
      this.addToBookings(lNextObject);
    }
  }

  /**
   * Method removes the passed BookingBO object from the association "bookings".
   * 
   * 
   * @param pBookings Object that should be removed from the association "bookings". The parameter must not be null.
   */
  public void removeFromBookings( BookingBO pBookings ) {
    // Check parameter for invalid value null.
    Check.checkInvalidParameterNull(pBookings, "pBookings");
    // Remove passed object from collection of associated BookingBO objects.
    bookings.remove(pBookings);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (this.equals(pBookings.getAccount()) == true) {
      pBookings.unsetAccount();
    }
  }

  /**
   * Method removes all objects from the association "bookings".
   * 
   */
  public void clearBookings( ) {
    // Remove all objects from association "bookings".
    Collection<BookingBO> lBookings = new HashSet<BookingBO>(bookings);
    Iterator<BookingBO> lIterator = lBookings.iterator();
    while (lIterator.hasNext()) {
      this.removeFromBookings(lIterator.next());
    }
  }

  /**
   * Method returns the association "authorizedPersons".
   * 
   *
   * @return Collection All MyPersonBO objects that belong to the association "authorizedPersons". The method never
   * returns null and the returned collection is unmodifiable.
   */
  public Set<MyPersonBO> getAuthorizedPersons( ) {
    // Return all MyPersonBO objects as unmodifiable collection.
    return Collections.unmodifiableSet(authorizedPersons);
  }

  /**
   * Method sets the association "authorizedPersons" to the passed collection. All objects that formerly were part of
   * the association will be removed from it.
   * 
   * 
   * @param pAuthorizedPersons Collection with objects to which the association should be set. The parameter must not be
   * null.
   */
  void setAuthorizedPersons( Set<MyPersonBO> pAuthorizedPersons ) {
    // Check of parameter is not required.
    // Remove all objects from association "authorizedPersons".
    this.clearAuthorizedPersons();
    // If the association is null, removing all entries is sufficient.
    if (pAuthorizedPersons != null) {
      authorizedPersons = new HashSet<MyPersonBO>(pAuthorizedPersons);
    }
  }

  /**
   * Method adds the passed MyPersonBO object to the association "authorizedPersons".
   * 
   * 
   * @param pAuthorizedPersons Object that should be added to the association "authorizedPersons". The parameter must
   * not be null.
   */
  public void addToAuthorizedPersons( MyPersonBO pAuthorizedPersons ) {
    // Check parameter "pAuthorizedPersons" for invalid value null.
    Check.checkInvalidParameterNull(pAuthorizedPersons, "pAuthorizedPersons");
    // Add passed object to collection of associated MyPersonBO objects.
    authorizedPersons.add(pAuthorizedPersons);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAuthorizedPersons != null && pAuthorizedPersons.getAccounts().contains(this) == false) {
      pAuthorizedPersons.addToAccounts((AccountBO) this);
    }
  }

  /**
   * Method adds all passed objects to the association "authorizedPersons".
   * 
   * 
   * @param pAuthorizedPersons Collection with all objects that should be added to the association "authorizedPersons".
   * The parameter must not be null.
   */
  public void addToAuthorizedPersons( Collection<MyPersonBO> pAuthorizedPersons ) {
    // Check parameter "pAuthorizedPersons" for invalid value null.
    Check.checkInvalidParameterNull(pAuthorizedPersons, "pAuthorizedPersons");
    // Add all passed objects.
    for (MyPersonBO lNextObject : pAuthorizedPersons) {
      this.addToAuthorizedPersons(lNextObject);
    }
  }

  /**
   * Method removes the passed MyPersonBO object from the association "authorizedPersons".
   * 
   * 
   * @param pAuthorizedPersons Object that should be removed from the association "authorizedPersons". The parameter
   * must not be null.
   */
  public void removeFromAuthorizedPersons( MyPersonBO pAuthorizedPersons ) {
    // Check parameter for invalid value null.
    Check.checkInvalidParameterNull(pAuthorizedPersons, "pAuthorizedPersons");
    // Remove passed object from collection of associated MyPersonBO objects.
    authorizedPersons.remove(pAuthorizedPersons);
    // The association is set in both directions because within the UML model it is defined to be bidirectional.
    // In case that one side will be removed from the association the other side will also be removed.
    if (pAuthorizedPersons.getAccounts().contains(this) == true) {
      pAuthorizedPersons.removeFromAccounts((AccountBO) this);
    }
  }

  /**
   * Method removes all objects from the association "authorizedPersons".
   * 
   */
  public void clearAuthorizedPersons( ) {
    // Remove all objects from association "authorizedPersons".
    Collection<MyPersonBO> lAuthorizedPersons = new HashSet<MyPersonBO>(authorizedPersons);
    Iterator<MyPersonBO> lIterator = lAuthorizedPersons.iterator();
    while (lIterator.hasNext()) {
      this.removeFromAuthorizedPersons(lIterator.next());
    }
  }

  /**
   * Method returns the attribute "interestRate".
   * 
   * 
   * @return Float Value to which the attribute "interestRate" is set.
   */
  public Float getInterestRate( ) {
    return interestRate;
  }

  /**
   * Method sets the attribute "interestRate".
   * 
   * 
   * @param pInterestRate Value to which the attribute "interestRate" should be set.
   */
  public void setInterestRate( Float pInterestRate ) {
    // Assign value to attribute
    interestRate = pInterestRate;
  }

  /**
   * Method calculates the current balance of the account. Therefore the the amount of every booking is accumulated.
   * 
   * 
   * @return {@link BigDecimal}
   */
  public abstract BigDecimal calculateBalance( );

  /**
   * Method returns the class id of this business object class.
   * 
   * @return {@link ClassID} Class ID of this business object. The method never returns null.
   */
  public ClassID getClassID( ) {
    return CLASS_ID;
  }
}

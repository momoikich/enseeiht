/**
 * generated by Xtext 2.23.0
 */
package fr.n7.gAME.impl;

import fr.n7.gAME.Choix;
import fr.n7.gAME.Condition;
import fr.n7.gAME.GAMEPackage;
import fr.n7.gAME.Interaction;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gAME.impl.InteractionImpl#getChoixDebut <em>Choix Debut</em>}</li>
 *   <li>{@link fr.n7.gAME.impl.InteractionImpl#getChoixInter <em>Choix Inter</em>}</li>
 *   <li>{@link fr.n7.gAME.impl.InteractionImpl#getChoixFin <em>Choix Fin</em>}</li>
 *   <li>{@link fr.n7.gAME.impl.InteractionImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction
{
  /**
   * The cached value of the '{@link #getChoixDebut() <em>Choix Debut</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoixDebut()
   * @generated
   * @ordered
   */
  protected Choix choixDebut;

  /**
   * The cached value of the '{@link #getChoixInter() <em>Choix Inter</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoixInter()
   * @generated
   * @ordered
   */
  protected EList<Choix> choixInter;

  /**
   * The cached value of the '{@link #getChoixFin() <em>Choix Fin</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getChoixFin()
   * @generated
   * @ordered
   */
  protected Choix choixFin;

  /**
   * The cached value of the '{@link #getCondition() <em>Condition</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCondition()
   * @generated
   * @ordered
   */
  protected Condition condition;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InteractionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return GAMEPackage.Literals.INTERACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choix getChoixDebut()
  {
    return choixDebut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoixDebut(Choix newChoixDebut, NotificationChain msgs)
  {
    Choix oldChoixDebut = choixDebut;
    choixDebut = newChoixDebut;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CHOIX_DEBUT, oldChoixDebut, newChoixDebut);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChoixDebut(Choix newChoixDebut)
  {
    if (newChoixDebut != choixDebut)
    {
      NotificationChain msgs = null;
      if (choixDebut != null)
        msgs = ((InternalEObject)choixDebut).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CHOIX_DEBUT, null, msgs);
      if (newChoixDebut != null)
        msgs = ((InternalEObject)newChoixDebut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CHOIX_DEBUT, null, msgs);
      msgs = basicSetChoixDebut(newChoixDebut, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CHOIX_DEBUT, newChoixDebut, newChoixDebut));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<Choix> getChoixInter()
  {
    if (choixInter == null)
    {
      choixInter = new EObjectContainmentEList<Choix>(Choix.class, this, GAMEPackage.INTERACTION__CHOIX_INTER);
    }
    return choixInter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choix getChoixFin()
  {
    return choixFin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetChoixFin(Choix newChoixFin, NotificationChain msgs)
  {
    Choix oldChoixFin = choixFin;
    choixFin = newChoixFin;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CHOIX_FIN, oldChoixFin, newChoixFin);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setChoixFin(Choix newChoixFin)
  {
    if (newChoixFin != choixFin)
    {
      NotificationChain msgs = null;
      if (choixFin != null)
        msgs = ((InternalEObject)choixFin).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CHOIX_FIN, null, msgs);
      if (newChoixFin != null)
        msgs = ((InternalEObject)newChoixFin).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CHOIX_FIN, null, msgs);
      msgs = basicSetChoixFin(newChoixFin, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CHOIX_FIN, newChoixFin, newChoixFin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition getCondition()
  {
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCondition(Condition newCondition, NotificationChain msgs)
  {
    Condition oldCondition = condition;
    condition = newCondition;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CONDITION, oldCondition, newCondition);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCondition(Condition newCondition)
  {
    if (newCondition != condition)
    {
      NotificationChain msgs = null;
      if (condition != null)
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.INTERACTION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.INTERACTION__CONDITION, newCondition, newCondition));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case GAMEPackage.INTERACTION__CHOIX_DEBUT:
        return basicSetChoixDebut(null, msgs);
      case GAMEPackage.INTERACTION__CHOIX_INTER:
        return ((InternalEList<?>)getChoixInter()).basicRemove(otherEnd, msgs);
      case GAMEPackage.INTERACTION__CHOIX_FIN:
        return basicSetChoixFin(null, msgs);
      case GAMEPackage.INTERACTION__CONDITION:
        return basicSetCondition(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case GAMEPackage.INTERACTION__CHOIX_DEBUT:
        return getChoixDebut();
      case GAMEPackage.INTERACTION__CHOIX_INTER:
        return getChoixInter();
      case GAMEPackage.INTERACTION__CHOIX_FIN:
        return getChoixFin();
      case GAMEPackage.INTERACTION__CONDITION:
        return getCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GAMEPackage.INTERACTION__CHOIX_DEBUT:
        setChoixDebut((Choix)newValue);
        return;
      case GAMEPackage.INTERACTION__CHOIX_INTER:
        getChoixInter().clear();
        getChoixInter().addAll((Collection<? extends Choix>)newValue);
        return;
      case GAMEPackage.INTERACTION__CHOIX_FIN:
        setChoixFin((Choix)newValue);
        return;
      case GAMEPackage.INTERACTION__CONDITION:
        setCondition((Condition)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.INTERACTION__CHOIX_DEBUT:
        setChoixDebut((Choix)null);
        return;
      case GAMEPackage.INTERACTION__CHOIX_INTER:
        getChoixInter().clear();
        return;
      case GAMEPackage.INTERACTION__CHOIX_FIN:
        setChoixFin((Choix)null);
        return;
      case GAMEPackage.INTERACTION__CONDITION:
        setCondition((Condition)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case GAMEPackage.INTERACTION__CHOIX_DEBUT:
        return choixDebut != null;
      case GAMEPackage.INTERACTION__CHOIX_INTER:
        return choixInter != null && !choixInter.isEmpty();
      case GAMEPackage.INTERACTION__CHOIX_FIN:
        return choixFin != null;
      case GAMEPackage.INTERACTION__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

} //InteractionImpl
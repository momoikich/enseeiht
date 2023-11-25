/**
 * generated by Xtext 2.23.0
 */
package fr.n7.gAME.impl;

import fr.n7.gAME.Condition;
import fr.n7.gAME.GAMEPackage;
import fr.n7.gAME.Qualification;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Qualification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.n7.gAME.impl.QualificationImpl#getTexte <em>Texte</em>}</li>
 *   <li>{@link fr.n7.gAME.impl.QualificationImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QualificationImpl extends MinimalEObjectImpl.Container implements Qualification
{
  /**
   * The default value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected static final String TEXTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTexte() <em>Texte</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTexte()
   * @generated
   * @ordered
   */
  protected String texte = TEXTE_EDEFAULT;

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
  protected QualificationImpl()
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
    return GAMEPackage.Literals.QUALIFICATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getTexte()
  {
    return texte;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTexte(String newTexte)
  {
    String oldTexte = texte;
    texte = newTexte;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.QUALIFICATION__TEXTE, oldTexte, texte));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GAMEPackage.QUALIFICATION__CONDITION, oldCondition, newCondition);
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
        msgs = ((InternalEObject)condition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.QUALIFICATION__CONDITION, null, msgs);
      if (newCondition != null)
        msgs = ((InternalEObject)newCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GAMEPackage.QUALIFICATION__CONDITION, null, msgs);
      msgs = basicSetCondition(newCondition, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, GAMEPackage.QUALIFICATION__CONDITION, newCondition, newCondition));
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
      case GAMEPackage.QUALIFICATION__CONDITION:
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
      case GAMEPackage.QUALIFICATION__TEXTE:
        return getTexte();
      case GAMEPackage.QUALIFICATION__CONDITION:
        return getCondition();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case GAMEPackage.QUALIFICATION__TEXTE:
        setTexte((String)newValue);
        return;
      case GAMEPackage.QUALIFICATION__CONDITION:
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
      case GAMEPackage.QUALIFICATION__TEXTE:
        setTexte(TEXTE_EDEFAULT);
        return;
      case GAMEPackage.QUALIFICATION__CONDITION:
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
      case GAMEPackage.QUALIFICATION__TEXTE:
        return TEXTE_EDEFAULT == null ? texte != null : !TEXTE_EDEFAULT.equals(texte);
      case GAMEPackage.QUALIFICATION__CONDITION:
        return condition != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (texte: ");
    result.append(texte);
    result.append(')');
    return result.toString();
  }

} //QualificationImpl

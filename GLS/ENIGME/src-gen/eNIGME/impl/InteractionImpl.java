/**
 */
package eNIGME.impl;

import eNIGME.Choix;
import eNIGME.ENIGMEPackage;
import eNIGME.Interaction;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eNIGME.impl.InteractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eNIGME.impl.InteractionImpl#getChoix <em>Choix</em>}</li>
 *   <li>{@link eNIGME.impl.InteractionImpl#getChoixFin <em>Choix Fin</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends JeuElementImpl implements Interaction {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getChoix() <em>Choix</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoix()
	 * @generated
	 * @ordered
	 */
	protected Choix choix;

	/**
	 * The cached value of the '{@link #getChoixFin() <em>Choix Fin</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoixFin()
	 * @generated
	 * @ordered
	 */
	protected Choix choixFin;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ENIGMEPackage.Literals.INTERACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.INTERACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix getChoix() {
		if (choix != null && choix.eIsProxy()) {
			InternalEObject oldChoix = (InternalEObject) choix;
			choix = (Choix) eResolveProxy(oldChoix);
			if (choix != oldChoix) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ENIGMEPackage.INTERACTION__CHOIX,
							oldChoix, choix));
			}
		}
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix basicGetChoix() {
		return choix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoix(Choix newChoix) {
		Choix oldChoix = choix;
		choix = newChoix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.INTERACTION__CHOIX, oldChoix, choix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix getChoixFin() {
		if (choixFin != null && choixFin.eIsProxy()) {
			InternalEObject oldChoixFin = (InternalEObject) choixFin;
			choixFin = (Choix) eResolveProxy(oldChoixFin);
			if (choixFin != oldChoixFin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ENIGMEPackage.INTERACTION__CHOIX_FIN,
							oldChoixFin, choixFin));
			}
		}
		return choixFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Choix basicGetChoixFin() {
		return choixFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoixFin(Choix newChoixFin) {
		Choix oldChoixFin = choixFin;
		choixFin = newChoixFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.INTERACTION__CHOIX_FIN, oldChoixFin,
					choixFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ENIGMEPackage.INTERACTION__NAME:
			return getName();
		case ENIGMEPackage.INTERACTION__CHOIX:
			if (resolve)
				return getChoix();
			return basicGetChoix();
		case ENIGMEPackage.INTERACTION__CHOIX_FIN:
			if (resolve)
				return getChoixFin();
			return basicGetChoixFin();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ENIGMEPackage.INTERACTION__NAME:
			setName((String) newValue);
			return;
		case ENIGMEPackage.INTERACTION__CHOIX:
			setChoix((Choix) newValue);
			return;
		case ENIGMEPackage.INTERACTION__CHOIX_FIN:
			setChoixFin((Choix) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case ENIGMEPackage.INTERACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ENIGMEPackage.INTERACTION__CHOIX:
			setChoix((Choix) null);
			return;
		case ENIGMEPackage.INTERACTION__CHOIX_FIN:
			setChoixFin((Choix) null);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case ENIGMEPackage.INTERACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ENIGMEPackage.INTERACTION__CHOIX:
			return choix != null;
		case ENIGMEPackage.INTERACTION__CHOIX_FIN:
			return choixFin != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //InteractionImpl
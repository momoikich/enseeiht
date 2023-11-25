/**
 */
package eNIGME.impl;

import eNIGME.Chemin;
import eNIGME.ENIGMEPackage;
import eNIGME.Lieu;
import eNIGME.Territoire;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Territoire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eNIGME.impl.TerritoireImpl#getName <em>Name</em>}</li>
 *   <li>{@link eNIGME.impl.TerritoireImpl#getLieuDebut <em>Lieu Debut</em>}</li>
 *   <li>{@link eNIGME.impl.TerritoireImpl#getLieuxintermediaires <em>Lieuxintermediaires</em>}</li>
 *   <li>{@link eNIGME.impl.TerritoireImpl#getLieuxFin <em>Lieux Fin</em>}</li>
 *   <li>{@link eNIGME.impl.TerritoireImpl#getChemins <em>Chemins</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TerritoireImpl extends JeuElementImpl implements Territoire {
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
	 * The cached value of the '{@link #getLieuDebut() <em>Lieu Debut</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuDebut()
	 * @generated
	 * @ordered
	 */
	protected Lieu lieuDebut;

	/**
	 * The cached value of the '{@link #getLieuxintermediaires() <em>Lieuxintermediaires</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuxintermediaires()
	 * @generated
	 * @ordered
	 */
	protected EList<Lieu> lieuxintermediaires;

	/**
	 * The cached value of the '{@link #getLieuxFin() <em>Lieux Fin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuxFin()
	 * @generated
	 * @ordered
	 */
	protected EList<Lieu> lieuxFin;

	/**
	 * The cached value of the '{@link #getChemins() <em>Chemins</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChemins()
	 * @generated
	 * @ordered
	 */
	protected EList<Chemin> chemins;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TerritoireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ENIGMEPackage.Literals.TERRITOIRE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.TERRITOIRE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu getLieuDebut() {
		return lieuDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLieuDebut(Lieu newLieuDebut, NotificationChain msgs) {
		Lieu oldLieuDebut = lieuDebut;
		lieuDebut = newLieuDebut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					ENIGMEPackage.TERRITOIRE__LIEU_DEBUT, oldLieuDebut, newLieuDebut);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieuDebut(Lieu newLieuDebut) {
		if (newLieuDebut != lieuDebut) {
			NotificationChain msgs = null;
			if (lieuDebut != null)
				msgs = ((InternalEObject) lieuDebut).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - ENIGMEPackage.TERRITOIRE__LIEU_DEBUT, null, msgs);
			if (newLieuDebut != null)
				msgs = ((InternalEObject) newLieuDebut).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - ENIGMEPackage.TERRITOIRE__LIEU_DEBUT, null, msgs);
			msgs = basicSetLieuDebut(newLieuDebut, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.TERRITOIRE__LIEU_DEBUT, newLieuDebut,
					newLieuDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lieu> getLieuxintermediaires() {
		if (lieuxintermediaires == null) {
			lieuxintermediaires = new EObjectContainmentEList<Lieu>(Lieu.class, this,
					ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES);
		}
		return lieuxintermediaires;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Lieu> getLieuxFin() {
		if (lieuxFin == null) {
			lieuxFin = new EObjectContainmentEList<Lieu>(Lieu.class, this, ENIGMEPackage.TERRITOIRE__LIEUX_FIN);
		}
		return lieuxFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Chemin> getChemins() {
		if (chemins == null) {
			chemins = new EObjectContainmentEList<Chemin>(Chemin.class, this, ENIGMEPackage.TERRITOIRE__CHEMINS);
		}
		return chemins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case ENIGMEPackage.TERRITOIRE__LIEU_DEBUT:
			return basicSetLieuDebut(null, msgs);
		case ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES:
			return ((InternalEList<?>) getLieuxintermediaires()).basicRemove(otherEnd, msgs);
		case ENIGMEPackage.TERRITOIRE__LIEUX_FIN:
			return ((InternalEList<?>) getLieuxFin()).basicRemove(otherEnd, msgs);
		case ENIGMEPackage.TERRITOIRE__CHEMINS:
			return ((InternalEList<?>) getChemins()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ENIGMEPackage.TERRITOIRE__NAME:
			return getName();
		case ENIGMEPackage.TERRITOIRE__LIEU_DEBUT:
			return getLieuDebut();
		case ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES:
			return getLieuxintermediaires();
		case ENIGMEPackage.TERRITOIRE__LIEUX_FIN:
			return getLieuxFin();
		case ENIGMEPackage.TERRITOIRE__CHEMINS:
			return getChemins();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case ENIGMEPackage.TERRITOIRE__NAME:
			setName((String) newValue);
			return;
		case ENIGMEPackage.TERRITOIRE__LIEU_DEBUT:
			setLieuDebut((Lieu) newValue);
			return;
		case ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES:
			getLieuxintermediaires().clear();
			getLieuxintermediaires().addAll((Collection<? extends Lieu>) newValue);
			return;
		case ENIGMEPackage.TERRITOIRE__LIEUX_FIN:
			getLieuxFin().clear();
			getLieuxFin().addAll((Collection<? extends Lieu>) newValue);
			return;
		case ENIGMEPackage.TERRITOIRE__CHEMINS:
			getChemins().clear();
			getChemins().addAll((Collection<? extends Chemin>) newValue);
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
		case ENIGMEPackage.TERRITOIRE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ENIGMEPackage.TERRITOIRE__LIEU_DEBUT:
			setLieuDebut((Lieu) null);
			return;
		case ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES:
			getLieuxintermediaires().clear();
			return;
		case ENIGMEPackage.TERRITOIRE__LIEUX_FIN:
			getLieuxFin().clear();
			return;
		case ENIGMEPackage.TERRITOIRE__CHEMINS:
			getChemins().clear();
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
		case ENIGMEPackage.TERRITOIRE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ENIGMEPackage.TERRITOIRE__LIEU_DEBUT:
			return lieuDebut != null;
		case ENIGMEPackage.TERRITOIRE__LIEUXINTERMEDIAIRES:
			return lieuxintermediaires != null && !lieuxintermediaires.isEmpty();
		case ENIGMEPackage.TERRITOIRE__LIEUX_FIN:
			return lieuxFin != null && !lieuxFin.isEmpty();
		case ENIGMEPackage.TERRITOIRE__CHEMINS:
			return chemins != null && !chemins.isEmpty();
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

} //TerritoireImpl

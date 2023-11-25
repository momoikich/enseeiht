/**
 */
package eNIGME.impl;

import eNIGME.ENIGMEPackage;
import eNIGME.EtatPossession;
import eNIGME.EtatVisibilite;
import eNIGME.Objet;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Objet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eNIGME.impl.ObjetImpl#getName <em>Name</em>}</li>
 *   <li>{@link eNIGME.impl.ObjetImpl#getNomObjet <em>Nom Objet</em>}</li>
 *   <li>{@link eNIGME.impl.ObjetImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link eNIGME.impl.ObjetImpl#getTaille <em>Taille</em>}</li>
 *   <li>{@link eNIGME.impl.ObjetImpl#getEtatv <em>Etatv</em>}</li>
 *   <li>{@link eNIGME.impl.ObjetImpl#getEtatp <em>Etatp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjetImpl extends JeuElementImpl implements Objet {
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
	 * The default value of the '{@link #getNomObjet() <em>Nom Objet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomObjet()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_OBJET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomObjet() <em>Nom Objet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomObjet()
	 * @generated
	 * @ordered
	 */
	protected String nomObjet = NOM_OBJET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected static final int OCCURRENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected int occurrence = OCCURRENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTaille() <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaille()
	 * @generated
	 * @ordered
	 */
	protected static final int TAILLE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTaille() <em>Taille</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaille()
	 * @generated
	 * @ordered
	 */
	protected int taille = TAILLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatv() <em>Etatv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatv()
	 * @generated
	 * @ordered
	 */
	protected static final EtatVisibilite ETATV_EDEFAULT = EtatVisibilite.VISIBLE;

	/**
	 * The cached value of the '{@link #getEtatv() <em>Etatv</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatv()
	 * @generated
	 * @ordered
	 */
	protected EtatVisibilite etatv = ETATV_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtatp() <em>Etatp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatp()
	 * @generated
	 * @ordered
	 */
	protected static final EtatPossession ETATP_EDEFAULT = EtatPossession.POSSEDE;

	/**
	 * The cached value of the '{@link #getEtatp() <em>Etatp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtatp()
	 * @generated
	 * @ordered
	 */
	protected EtatPossession etatp = ETATP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ENIGMEPackage.Literals.OBJET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNomObjet() {
		return nomObjet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomObjet(String newNomObjet) {
		String oldNomObjet = nomObjet;
		nomObjet = newNomObjet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__NOM_OBJET, oldNomObjet,
					nomObjet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence(int newOccurrence) {
		int oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__OCCURRENCE, oldOccurrence,
					occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTaille() {
		return taille;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaille(int newTaille) {
		int oldTaille = taille;
		taille = newTaille;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__TAILLE, oldTaille, taille));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtatVisibilite getEtatv() {
		return etatv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatv(EtatVisibilite newEtatv) {
		EtatVisibilite oldEtatv = etatv;
		etatv = newEtatv == null ? ETATV_EDEFAULT : newEtatv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__ETATV, oldEtatv, etatv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EtatPossession getEtatp() {
		return etatp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtatp(EtatPossession newEtatp) {
		EtatPossession oldEtatp = etatp;
		etatp = newEtatp == null ? ETATP_EDEFAULT : newEtatp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ENIGMEPackage.OBJET__ETATP, oldEtatp, etatp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case ENIGMEPackage.OBJET__NAME:
			return getName();
		case ENIGMEPackage.OBJET__NOM_OBJET:
			return getNomObjet();
		case ENIGMEPackage.OBJET__OCCURRENCE:
			return getOccurrence();
		case ENIGMEPackage.OBJET__TAILLE:
			return getTaille();
		case ENIGMEPackage.OBJET__ETATV:
			return getEtatv();
		case ENIGMEPackage.OBJET__ETATP:
			return getEtatp();
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
		case ENIGMEPackage.OBJET__NAME:
			setName((String) newValue);
			return;
		case ENIGMEPackage.OBJET__NOM_OBJET:
			setNomObjet((String) newValue);
			return;
		case ENIGMEPackage.OBJET__OCCURRENCE:
			setOccurrence((Integer) newValue);
			return;
		case ENIGMEPackage.OBJET__TAILLE:
			setTaille((Integer) newValue);
			return;
		case ENIGMEPackage.OBJET__ETATV:
			setEtatv((EtatVisibilite) newValue);
			return;
		case ENIGMEPackage.OBJET__ETATP:
			setEtatp((EtatPossession) newValue);
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
		case ENIGMEPackage.OBJET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case ENIGMEPackage.OBJET__NOM_OBJET:
			setNomObjet(NOM_OBJET_EDEFAULT);
			return;
		case ENIGMEPackage.OBJET__OCCURRENCE:
			setOccurrence(OCCURRENCE_EDEFAULT);
			return;
		case ENIGMEPackage.OBJET__TAILLE:
			setTaille(TAILLE_EDEFAULT);
			return;
		case ENIGMEPackage.OBJET__ETATV:
			setEtatv(ETATV_EDEFAULT);
			return;
		case ENIGMEPackage.OBJET__ETATP:
			setEtatp(ETATP_EDEFAULT);
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
		case ENIGMEPackage.OBJET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case ENIGMEPackage.OBJET__NOM_OBJET:
			return NOM_OBJET_EDEFAULT == null ? nomObjet != null : !NOM_OBJET_EDEFAULT.equals(nomObjet);
		case ENIGMEPackage.OBJET__OCCURRENCE:
			return occurrence != OCCURRENCE_EDEFAULT;
		case ENIGMEPackage.OBJET__TAILLE:
			return taille != TAILLE_EDEFAULT;
		case ENIGMEPackage.OBJET__ETATV:
			return etatv != ETATV_EDEFAULT;
		case ENIGMEPackage.OBJET__ETATP:
			return etatp != ETATP_EDEFAULT;
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
		result.append(", nomObjet: ");
		result.append(nomObjet);
		result.append(", occurrence: ");
		result.append(occurrence);
		result.append(", taille: ");
		result.append(taille);
		result.append(", etatv: ");
		result.append(etatv);
		result.append(", etatp: ");
		result.append(etatp);
		result.append(')');
		return result.toString();
	}

} //ObjetImpl

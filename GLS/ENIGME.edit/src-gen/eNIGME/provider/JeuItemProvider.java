/**
 */
package eNIGME.provider;

import eNIGME.ENIGMEFactory;
import eNIGME.ENIGMEPackage;
import eNIGME.Jeu;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link eNIGME.Jeu} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JeuItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JeuItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Jeu_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Jeu_name_feature", "_UI_Jeu_type"),
						ENIGMEPackage.Literals.JEU__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ENIGMEPackage.Literals.JEU__JEUELEMENT);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Jeu.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Jeu"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Jeu) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_Jeu_type")
				: getString("_UI_Jeu_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Jeu.class)) {
		case ENIGMEPackage.JEU__NAME:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case ENIGMEPackage.JEU__JEUELEMENT:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createJeuElement()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createJoueur()));

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createConnaissance()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createObjet()));

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createTerritoire()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createChoix()));

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createPersonne()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createLieu()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createChemin()));

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createQualification()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createAction()));

		newChildDescriptors.add(
				createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT, ENIGMEFactory.eINSTANCE.createReponse()));

		newChildDescriptors.add(createChildParameter(ENIGMEPackage.Literals.JEU__JEUELEMENT,
				ENIGMEFactory.eINSTANCE.createCondition()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return ENIGMEEditPlugin.INSTANCE;
	}

}

/**
 * generated by Xtext 2.23.0
 */
package fr.n7.gAME.impl;

import fr.n7.gAME.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GAMEFactoryImpl extends EFactoryImpl implements GAMEFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static GAMEFactory init()
  {
    try
    {
      GAMEFactory theGAMEFactory = (GAMEFactory)EPackage.Registry.INSTANCE.getEFactory(GAMEPackage.eNS_URI);
      if (theGAMEFactory != null)
      {
        return theGAMEFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new GAMEFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GAMEFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case GAMEPackage.GAME: return createGame();
      case GAMEPackage.EXPLORATEUR: return createExplorateur();
      case GAMEPackage.OBJET: return createObjet();
      case GAMEPackage.CONNAISSANCE: return createConnaissance();
      case GAMEPackage.LIEU: return createLieu();
      case GAMEPackage.TERRITOIRE: return createTerritoire();
      case GAMEPackage.CONDITION: return createCondition();
      case GAMEPackage.CHEMIN: return createChemin();
      case GAMEPackage.PERSONNE: return createPersonne();
      case GAMEPackage.INTERACTION: return createInteraction();
      case GAMEPackage.CHOIX: return createChoix();
      case GAMEPackage.TYPE: return createType();
      case GAMEPackage.ACTION: return createAction();
      case GAMEPackage.QUALIFICATION: return createQualification();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GAMEPackage.ETAT_VISIBILITE:
        return createEtatVisibiliteFromString(eDataType, initialValue);
      case GAMEPackage.ETAT_OBLIGATION:
        return createEtatObligationFromString(eDataType, initialValue);
      case GAMEPackage.ETAT_CHEMIN:
        return createEtatCheminFromString(eDataType, initialValue);
      case GAMEPackage.ACTIVITE:
        return createActiviteFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case GAMEPackage.ETAT_VISIBILITE:
        return convertEtatVisibiliteToString(eDataType, instanceValue);
      case GAMEPackage.ETAT_OBLIGATION:
        return convertEtatObligationToString(eDataType, instanceValue);
      case GAMEPackage.ETAT_CHEMIN:
        return convertEtatCheminToString(eDataType, instanceValue);
      case GAMEPackage.ACTIVITE:
        return convertActiviteToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Game createGame()
  {
    GameImpl game = new GameImpl();
    return game;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Explorateur createExplorateur()
  {
    ExplorateurImpl explorateur = new ExplorateurImpl();
    return explorateur;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Objet createObjet()
  {
    ObjetImpl objet = new ObjetImpl();
    return objet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Connaissance createConnaissance()
  {
    ConnaissanceImpl connaissance = new ConnaissanceImpl();
    return connaissance;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Lieu createLieu()
  {
    LieuImpl lieu = new LieuImpl();
    return lieu;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Territoire createTerritoire()
  {
    TerritoireImpl territoire = new TerritoireImpl();
    return territoire;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Condition createCondition()
  {
    ConditionImpl condition = new ConditionImpl();
    return condition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Chemin createChemin()
  {
    CheminImpl chemin = new CheminImpl();
    return chemin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Personne createPersonne()
  {
    PersonneImpl personne = new PersonneImpl();
    return personne;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Interaction createInteraction()
  {
    InteractionImpl interaction = new InteractionImpl();
    return interaction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Choix createChoix()
  {
    ChoixImpl choix = new ChoixImpl();
    return choix;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Qualification createQualification()
  {
    QualificationImpl qualification = new QualificationImpl();
    return qualification;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EtatVisibilite createEtatVisibiliteFromString(EDataType eDataType, String initialValue)
  {
    EtatVisibilite result = EtatVisibilite.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEtatVisibiliteToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EtatObligation createEtatObligationFromString(EDataType eDataType, String initialValue)
  {
    EtatObligation result = EtatObligation.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEtatObligationToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EtatChemin createEtatCheminFromString(EDataType eDataType, String initialValue)
  {
    EtatChemin result = EtatChemin.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertEtatCheminToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Activite createActiviteFromString(EDataType eDataType, String initialValue)
  {
    Activite result = Activite.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertActiviteToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public GAMEPackage getGAMEPackage()
  {
    return (GAMEPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static GAMEPackage getPackage()
  {
    return GAMEPackage.eINSTANCE;
  }

} //GAMEFactoryImpl
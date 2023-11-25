/*
 * generated by Xtext 2.23.0
 */
package fr.n7.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import fr.n7.ide.contentassist.antlr.internal.InternalENIGMEParser;
import fr.n7.services.ENIGMEGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ENIGMEParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ENIGMEGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ENIGMEGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getJeuElementAccess().getAlternatives(), "rule__JeuElement__Alternatives");
			builder.put(grammarAccess.getEtatReponseAccess().getAlternatives(), "rule__EtatReponse__Alternatives");
			builder.put(grammarAccess.getEtatPossessionAccess().getAlternatives(), "rule__EtatPossession__Alternatives");
			builder.put(grammarAccess.getEtatVisibiliteAccess().getAlternatives(), "rule__EtatVisibilite__Alternatives");
			builder.put(grammarAccess.getEtatObligationAccess().getAlternatives(), "rule__EtatObligation__Alternatives");
			builder.put(grammarAccess.getEtatCheminAccess().getAlternatives(), "rule__EtatChemin__Alternatives");
			builder.put(grammarAccess.getJeuAccess().getGroup(), "rule__Jeu__Group__0");
			builder.put(grammarAccess.getJoueurAccess().getGroup(), "rule__Joueur__Group__0");
			builder.put(grammarAccess.getConnaissanceAccess().getGroup(), "rule__Connaissance__Group__0");
			builder.put(grammarAccess.getObjetAccess().getGroup(), "rule__Objet__Group__0");
			builder.put(grammarAccess.getTerritoireAccess().getGroup(), "rule__Territoire__Group__0");
			builder.put(grammarAccess.getChoixAccess().getGroup(), "rule__Choix__Group__0");
			builder.put(grammarAccess.getInteractionAccess().getGroup(), "rule__Interaction__Group__0");
			builder.put(grammarAccess.getPersonneAccess().getGroup(), "rule__Personne__Group__0");
			builder.put(grammarAccess.getLieuAccess().getGroup(), "rule__Lieu__Group__0");
			builder.put(grammarAccess.getLieuAccess().getGroup_3(), "rule__Lieu__Group_3__0");
			builder.put(grammarAccess.getCheminAccess().getGroup(), "rule__Chemin__Group__0");
			builder.put(grammarAccess.getQualificationAccess().getGroup(), "rule__Qualification__Group__0");
			builder.put(grammarAccess.getActionAccess().getGroup(), "rule__Action__Group__0");
			builder.put(grammarAccess.getReponseAccess().getGroup(), "rule__Reponse__Group__0");
			builder.put(grammarAccess.getConditionAccess().getGroup(), "rule__Condition__Group__0");
			builder.put(grammarAccess.getJeuAccess().getNameAssignment_1(), "rule__Jeu__NameAssignment_1");
			builder.put(grammarAccess.getJeuAccess().getJeuelementAssignment_3(), "rule__Jeu__JeuelementAssignment_3");
			builder.put(grammarAccess.getJoueurAccess().getNameAssignment_1(), "rule__Joueur__NameAssignment_1");
			builder.put(grammarAccess.getJoueurAccess().getLimiteAssignment_4(), "rule__Joueur__LimiteAssignment_4");
			builder.put(grammarAccess.getJoueurAccess().getObjetsAssignment_7(), "rule__Joueur__ObjetsAssignment_7");
			builder.put(grammarAccess.getJoueurAccess().getConnaissancesAssignment_11(), "rule__Joueur__ConnaissancesAssignment_11");
			builder.put(grammarAccess.getConnaissanceAccess().getNameAssignment_1(), "rule__Connaissance__NameAssignment_1");
			builder.put(grammarAccess.getConnaissanceAccess().getNomConnaissanceAssignment_2(), "rule__Connaissance__NomConnaissanceAssignment_2");
			builder.put(grammarAccess.getConnaissanceAccess().getQualificationAssignment_3(), "rule__Connaissance__QualificationAssignment_3");
			builder.put(grammarAccess.getConnaissanceAccess().getEtatvAssignment_5(), "rule__Connaissance__EtatvAssignment_5");
			builder.put(grammarAccess.getConnaissanceAccess().getEtatpAssignment_6(), "rule__Connaissance__EtatpAssignment_6");
			builder.put(grammarAccess.getObjetAccess().getNameAssignment_1(), "rule__Objet__NameAssignment_1");
			builder.put(grammarAccess.getObjetAccess().getNomObjetAssignment_2(), "rule__Objet__NomObjetAssignment_2");
			builder.put(grammarAccess.getObjetAccess().getOccurrenceAssignment_4(), "rule__Objet__OccurrenceAssignment_4");
			builder.put(grammarAccess.getObjetAccess().getTailleAssignment_8(), "rule__Objet__TailleAssignment_8");
			builder.put(grammarAccess.getObjetAccess().getEtatvAssignment_10(), "rule__Objet__EtatvAssignment_10");
			builder.put(grammarAccess.getObjetAccess().getEtatpAssignment_11(), "rule__Objet__EtatpAssignment_11");
			builder.put(grammarAccess.getTerritoireAccess().getNameAssignment_1(), "rule__Territoire__NameAssignment_1");
			builder.put(grammarAccess.getTerritoireAccess().getLieuDebutAssignment_4(), "rule__Territoire__LieuDebutAssignment_4");
			builder.put(grammarAccess.getTerritoireAccess().getLieuxintermediairesAssignment_7(), "rule__Territoire__LieuxintermediairesAssignment_7");
			builder.put(grammarAccess.getTerritoireAccess().getLieuxFinAssignment_11(), "rule__Territoire__LieuxFinAssignment_11");
			builder.put(grammarAccess.getTerritoireAccess().getCheminsAssignment_15(), "rule__Territoire__CheminsAssignment_15");
			builder.put(grammarAccess.getChoixAccess().getNameAssignment_1(), "rule__Choix__NameAssignment_1");
			builder.put(grammarAccess.getChoixAccess().getReponsesAssignment_3(), "rule__Choix__ReponsesAssignment_3");
			builder.put(grammarAccess.getChoixAccess().getConditionsAssignment_6(), "rule__Choix__ConditionsAssignment_6");
			builder.put(grammarAccess.getInteractionAccess().getNameAssignment_1(), "rule__Interaction__NameAssignment_1");
			builder.put(grammarAccess.getInteractionAccess().getChoixAssignment_3(), "rule__Interaction__ChoixAssignment_3");
			builder.put(grammarAccess.getInteractionAccess().getChoixFinAssignment_4(), "rule__Interaction__ChoixFinAssignment_4");
			builder.put(grammarAccess.getPersonneAccess().getNameAssignment_1(), "rule__Personne__NameAssignment_1");
			builder.put(grammarAccess.getPersonneAccess().getEtatoAssignment_2(), "rule__Personne__EtatoAssignment_2");
			builder.put(grammarAccess.getPersonneAccess().getConditionoAssignment_3(), "rule__Personne__ConditionoAssignment_3");
			builder.put(grammarAccess.getPersonneAccess().getEtatvAssignment_4(), "rule__Personne__EtatvAssignment_4");
			builder.put(grammarAccess.getPersonneAccess().getConditionvAssignment_5(), "rule__Personne__ConditionvAssignment_5");
			builder.put(grammarAccess.getPersonneAccess().getTexteAssignment_7(), "rule__Personne__TexteAssignment_7");
			builder.put(grammarAccess.getPersonneAccess().getInteractionAssignment_8(), "rule__Personne__InteractionAssignment_8");
			builder.put(grammarAccess.getLieuAccess().getNameAssignment_1(), "rule__Lieu__NameAssignment_1");
			builder.put(grammarAccess.getLieuAccess().getPersonnesAssignment_3_2(), "rule__Lieu__PersonnesAssignment_3_2");
			builder.put(grammarAccess.getCheminAccess().getEtatcAssignment_1(), "rule__Chemin__EtatcAssignment_1");
			builder.put(grammarAccess.getCheminAccess().getConditioncAssignment_2(), "rule__Chemin__ConditioncAssignment_2");
			builder.put(grammarAccess.getCheminAccess().getEtatoAssignment_3(), "rule__Chemin__EtatoAssignment_3");
			builder.put(grammarAccess.getCheminAccess().getConditionoAssignment_4(), "rule__Chemin__ConditionoAssignment_4");
			builder.put(grammarAccess.getCheminAccess().getEtatvAssignment_5(), "rule__Chemin__EtatvAssignment_5");
			builder.put(grammarAccess.getCheminAccess().getConditionvAssignment_6(), "rule__Chemin__ConditionvAssignment_6");
			builder.put(grammarAccess.getCheminAccess().getPrecedentAssignment_8(), "rule__Chemin__PrecedentAssignment_8");
			builder.put(grammarAccess.getCheminAccess().getSuivantAssignment_10(), "rule__Chemin__SuivantAssignment_10");
			builder.put(grammarAccess.getQualificationAccess().getIdAssignment_0(), "rule__Qualification__IdAssignment_0");
			builder.put(grammarAccess.getQualificationAccess().getQualificationAssignment_1(), "rule__Qualification__QualificationAssignment_1");
			builder.put(grammarAccess.getActionAccess().getNameAssignment_1(), "rule__Action__NameAssignment_1");
			builder.put(grammarAccess.getActionAccess().getObjetsconsommablesAssignment_6(), "rule__Action__ObjetsconsommablesAssignment_6");
			builder.put(grammarAccess.getActionAccess().getObjetsattribuablesAssignment_11(), "rule__Action__ObjetsattribuablesAssignment_11");
			builder.put(grammarAccess.getActionAccess().getConnaissancesattribuablesAssignment_16(), "rule__Action__ConnaissancesattribuablesAssignment_16");
			builder.put(grammarAccess.getReponseAccess().getNameAssignment_2(), "rule__Reponse__NameAssignment_2");
			builder.put(grammarAccess.getReponseAccess().getEtatAssignment_3(), "rule__Reponse__EtatAssignment_3");
			builder.put(grammarAccess.getReponseAccess().getTexteAssignment_6(), "rule__Reponse__TexteAssignment_6");
			builder.put(grammarAccess.getReponseAccess().getActionAssignment_8(), "rule__Reponse__ActionAssignment_8");
			builder.put(grammarAccess.getConditionAccess().getNameAssignment_1(), "rule__Condition__NameAssignment_1");
			builder.put(grammarAccess.getConditionAccess().getObjetsRequisAssignment_5(), "rule__Condition__ObjetsRequisAssignment_5");
			builder.put(grammarAccess.getConditionAccess().getConnaissancesRequisesAssignment_9(), "rule__Condition__ConnaissancesRequisesAssignment_9");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private ENIGMEGrammarAccess grammarAccess;

	@Override
	protected InternalENIGMEParser createParser() {
		InternalENIGMEParser result = new InternalENIGMEParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public ENIGMEGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ENIGMEGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}

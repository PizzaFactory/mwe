/*
* generated by Xtext
*/
package org.eclipse.emf.mwe.di.parser.packrat.consumers;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.AbstractRule;

import org.eclipse.xtext.parser.packrat.IMarkerFactory.IMarker;
import org.eclipse.xtext.parser.packrat.consumers.ITerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.NonTerminalConsumer;
import org.eclipse.xtext.parser.packrat.consumers.INonTerminalConsumerConfiguration;
import org.eclipse.xtext.parser.packrat.consumers.ConsumeResult;
import org.eclipse.xtext.parser.packrat.matching.ICharacterClass;
import org.eclipse.xtext.parser.packrat.matching.ISequenceMatcher;

import org.eclipse.emf.mwe.di.services.MWEGrammarAccess.ComplexValueElements;

import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEAssignmentConsumer;
import org.eclipse.xtext.builtin.parser.packrat.consumers.XtextBuiltinIDConsumer;
import org.eclipse.emf.mwe.di.parser.packrat.consumers.MWEQualifiedNameConsumer;

@SuppressWarnings("unused")
public final class MWEComplexValueConsumer extends NonTerminalConsumer {

	private ComplexValueElements rule;
	
	private INonTerminalConsumer assignmentConsumer;
	private ITerminalConsumer idConsumer;
	private INonTerminalConsumer qualifiedNameConsumer;

	private ICharacterClass keyword$8$Delimiter;
	
	private ICharacterClass keyword$12$Delimiter;
	
	private ICharacterClass keyword$15$Delimiter;
	
	private ISequenceMatcher ruleCall$10$Delimiter;
	
	public MWEComplexValueConsumer(INonTerminalConsumerConfiguration configuration, ITerminalConsumer[] hiddenTokens) {
		super(configuration, hiddenTokens);
		keyword$8$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$12$Delimiter = ICharacterClass.Factory.nullClass();
		keyword$15$Delimiter = ICharacterClass.Factory.nullClass();
		ruleCall$10$Delimiter = ISequenceMatcher.Factory.nullMatcher();
	}
	
	@Override
	protected int doConsume(int entryPoint) throws Exception {
		return consumeGroup$1(entryPoint);
	}

	protected int consumeGroup$1(int entryPoint) throws Exception {
		announceNextLevel();
		final IMarker marker = mark();
		int result = ConsumeResult.SUCCESS;
		switch(entryPoint) {
			case -1: // use fall through semantics of switch case
				result = ConsumeResult.EMPTY_MATCH;
			case 0:
				announceNextStep();
				result = consumeAssignment$5(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele0000AssignmentClassName());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 1:
				announceNextStep();
				result = consumeGroup$7(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele0001Group());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 2:
				announceNextStep();
				result = consumeAssignment$11(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele001AssignmentFooBar());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 3:
				announceNextStep();
				result = consumeAssignment$13(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele01AssignmentAssignments());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 4:
				announceNextStep();
				result = consumeKeyword$15(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele1KeywordRightCurlyBracket());
					marker.commit();
					announceLevelFinished();
					return result;
				}
		}
		marker.commit();
		announceLevelFinished();
		return result;
	}

	protected int consumeAssignment$5(int entryPoint) throws Exception {
		IMarker marker = mark();
		int result = doConsumeAssignment$5(entryPoint);
		if (result != ConsumeResult.SUCCESS)
			marker.rollback();
		else
			marker.commit();
		return ConsumeResult.SUCCESS;
	}

	protected int doConsumeAssignment$5(int entryPoint) throws Exception {
		return consumeRuleCall$6(entryPoint);
	}

	protected int consumeRuleCall$6(int entryPoint) throws Exception {
		return consumeNonTerminal(qualifiedNameConsumer, "className", false, false, false, getRule().ele00000ParserRuleCallQualifiedName());
	}

	protected int consumeGroup$7(int entryPoint) throws Exception {
		IMarker marker = mark();
		int result = doConsumeGroup$7(entryPoint);
		if (result != ConsumeResult.SUCCESS)
			marker.rollback();
		else
			marker.commit();
		return ConsumeResult.SUCCESS;
	}

	protected int doConsumeGroup$7(int entryPoint) throws Exception {
		announceNextLevel();
		final IMarker marker = mark();
		int result = ConsumeResult.SUCCESS;
		switch(entryPoint) {
			case -1: // use fall through semantics of switch case
				result = ConsumeResult.EMPTY_MATCH;
			case 0:
				announceNextStep();
				result = consumeKeyword$8(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele00010KeywordColon());
					marker.commit();
					announceLevelFinished();
					return result;
				}
			case 1:
				announceNextStep();
				result = consumeAssignment$9(nextEntryPoint());
				if (result!=ConsumeResult.SUCCESS) {
					error("Another token expected.", getRule().ele00011AssignmentId());
					marker.commit();
					announceLevelFinished();
					return result;
				}
		}
		marker.commit();
		announceLevelFinished();
		return result;
	}

	protected int consumeKeyword$8(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele00010KeywordColon(), null, false, false, getKeyword$8$Delimiter());
	}

	protected int consumeAssignment$9(int entryPoint) throws Exception {
		return consumeRuleCall$10(entryPoint);
	}

	protected int consumeRuleCall$10(int entryPoint) throws Exception {
		return consumeTerminal(idConsumer, "id", false, false, getRule().ele000110LexerRuleCallID(), getRuleCall$10$Delimiter());
	}

	protected int consumeAssignment$11(int entryPoint) throws Exception {
		return consumeKeyword$12(entryPoint);
	}

	protected int consumeKeyword$12(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele0010KeywordLeftCurlyBracket(), "fooBar", false, true, getKeyword$12$Delimiter());
	}

	protected int consumeAssignment$13(int entryPoint) throws Exception {
		IMarker marker = mark();
		while(doConsumeAssignment$13(entryPoint) == ConsumeResult.SUCCESS) {
			marker.flush();
		}
		marker.rollback();
		return ConsumeResult.SUCCESS;
	}

	protected int doConsumeAssignment$13(int entryPoint) throws Exception {
		return consumeRuleCall$14(entryPoint);
	}

	protected int consumeRuleCall$14(int entryPoint) throws Exception {
		return consumeNonTerminal(assignmentConsumer, "assignments", true, false, false, getRule().ele010ParserRuleCallAssignment());
	}

	protected int consumeKeyword$15(int entryPoint) throws Exception {
		return consumeKeyword(getRule().ele1KeywordRightCurlyBracket(), null, false, false, getKeyword$15$Delimiter());
	}

	public ComplexValueElements getRule() {
		return rule;
	}
	
	public void setRule(ComplexValueElements rule) {
		this.rule = rule;
	}
	
	@Override
	protected AbstractRule getGrammarElement() {
		return getRule().getRule();
	}

	@Override
	protected EClassifier getDefaultType() {
		return getGrammarElement().getType().getType();
	}
	
	public void setAssignmentConsumer(INonTerminalConsumer assignmentConsumer) {
		this.assignmentConsumer = assignmentConsumer;
	}
	
	public void setIdConsumer(ITerminalConsumer idConsumer) {
		this.idConsumer = idConsumer;
	}
	
	public void setQualifiedNameConsumer(INonTerminalConsumer qualifiedNameConsumer) {
		this.qualifiedNameConsumer = qualifiedNameConsumer;
	}
	
	public ICharacterClass getKeyword$8$Delimiter() {
		return keyword$8$Delimiter;
	}
	
	public void setKeyword$8$Delimiter(ICharacterClass characterClass) {
		keyword$8$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$12$Delimiter() {
		return keyword$12$Delimiter;
	}
	
	public void setKeyword$12$Delimiter(ICharacterClass characterClass) {
		keyword$12$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ICharacterClass getKeyword$15$Delimiter() {
		return keyword$15$Delimiter;
	}
	
	public void setKeyword$15$Delimiter(ICharacterClass characterClass) {
		keyword$15$Delimiter = characterClass != null ? characterClass : ICharacterClass.Factory.nullClass();
	}
	
	public ISequenceMatcher getRuleCall$10$Delimiter() {
		return ruleCall$10$Delimiter;
	}
	
	public void setRuleCall$10$Delimiter(ISequenceMatcher matcher) {
		ruleCall$10$Delimiter = matcher != null ? matcher : ISequenceMatcher.Factory.nullMatcher();
	}
	
}
/*
 * Copyright (c) 2008 committers of openArchitectureWare and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    committers of openArchitectureWare - initial API and implementation
 */

package org.eclipse.emf.mwe.ui.internal.editor.contentassist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.mwe.ui.internal.editor.editor.WorkflowEditor;
import org.eclipse.emf.mwe.ui.internal.editor.scanners.WorkflowTagScanner;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.ICompletionProposal;

/**
 * @author Patrick Schoenbach
 * @version $Revision: 1.1 $
 */

public class AttributeContentProposalComputer extends
		AbstractContentProposalComputer {

	public AttributeContentProposalComputer(final WorkflowEditor editor,
			final IDocument document, final WorkflowTagScanner tagScanner) {
		super(editor, document, tagScanner);
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>computeProposals</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#computeProposals(int)
	 */
	public Set<ICompletionProposal> computeProposals(final int offset) {
		final TextInfo currentText = currentText(document, offset);
		final List allAttributes = editor.getAttributeList();

		final Set<ICompletionProposal> result =
				new HashSet<ICompletionProposal>();
		final int i = 0;
		for (final Iterator iter = allAttributes.iterator(); iter.hasNext();) {
			final String name = (String) iter.next();

			String text = null;

			if (currentText.isWhiteSpace()) {
				text = name + "= \"\" ";
			} else {
				text = name;
			}

			result.add(new ExtendedCompletionProposal(text, currentText
					.getDocumentOffset(), currentText.getText().length(), text
					.length()));
		}
		return result;
	}

	/**
	 * This automatically generated method overrides the implementation of
	 * <code>isApplicable</code> inherited from the superclass.
	 * 
	 * @see org.eclipse.emf.mwe.ui.internal.editor.contentassist.IContentProposalComputer#isApplicable(int)
	 */
	public boolean isApplicable(final int offset) {
		return isAttribute(offset, document);
	}

}
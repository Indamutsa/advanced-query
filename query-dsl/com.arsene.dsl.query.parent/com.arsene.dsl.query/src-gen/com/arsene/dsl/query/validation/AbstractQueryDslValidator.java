/*
 * generated by Xtext 2.25.0
 */
package com.arsene.dsl.query.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractQueryDslValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(com.arsene.dsl.query.queryDsl.QueryDslPackage.eINSTANCE);
		return result;
	}
}


/*
 * generated by Xtext
 */
 
package org.eclipse.emf.mwe.di;

import org.apache.log4j.Logger;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.Status;
import org.osgi.framework.Bundle;

/**
 * generated
 */
public class MWEExecutableExtensionFactory implements IExecutableExtensionFactory, IExecutableExtension {

	private Logger log = Logger.getLogger(MWEExecutableExtensionFactory.class);
	private String clazzName;

	public void setInitializationData(IConfigurationElement config, String propertyName, Object data)
		throws CoreException {
		if (data instanceof String) {
			clazzName = (String) data;
		}
		else {
			throw new IllegalArgumentException("couldn't handle passed data : "+data);
		}
	}
	
	public Object create() throws CoreException {
		Bundle bundle = org.eclipse.emf.mwe.di.Activator.getInstance().getBundle();
		try {
			Class<?> class1 = bundle.loadClass(clazzName);
			return org.eclipse.emf.mwe.di.Activator.getInstance().getInjector("org.eclipse.emf.mwe.di.MWE").getInstance(class1);
		}
		catch (Exception e) {
			log.error(e);
			throw new CoreException(new Status(Status.ERROR, bundle.getSymbolicName(), e.getMessage(),e));
		}
	}
}
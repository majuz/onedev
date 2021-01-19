package io.onedev.server.web.page.project.blob.render.renderers.source;

import org.apache.wicket.request.resource.IResource;
import org.apache.wicket.request.resource.ResourceReference;

class AnnotationInfoResourceReference extends ResourceReference {

	public static final String NAME = "annotationInfo";
	
	public AnnotationInfoResourceReference() {
		super(NAME);
	}

	private static final long serialVersionUID = 1L;

	@Override
	public IResource getResource() {
		return new AnnotationInfoResource();
	}

}
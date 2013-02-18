package org.jbpm.designer.client.markdown.viewer;

import javax.enterprise.context.ApplicationScoped;

import com.google.gwt.user.client.ui.IsWidget;
import org.uberfire.backend.vfs.Path;
import org.uberfire.client.workbench.file.ResourceType;

@ApplicationScoped
public class Bpmn2Type implements ResourceType {

    @Override
    public String getDescription() {
        return "Markdown file";
    }

    @Override
    public IsWidget getIcon() {
        return null;
    }

    @Override
    public String getPrefix() {
        return "";
    }

    @Override
    public String getSuffix() {
        return "bpmn2";
    }

    @Override
    public boolean accept( final Path path ) {
        return ( path.getFileName().endsWith( "." + getSuffix() )  || path.getFileName().endsWith( ".bpmn" ) );
    }
}
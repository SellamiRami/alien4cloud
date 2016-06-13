package org.alien4cloud.tosca.editor.exception;

/**
 * Exception thrown if an operation is breaching the bounds of a requirement.
 */
public class RequirementBoundException extends Exception {
    private String nodeTemplateName;
    private String requirementName;

    public RequirementBoundException(String nodeTemplateName, String requirementName) {
        super("UpperBound reached on requirement <" + requirementName + "> on node <" + nodeTemplateName + ">.");
        this.nodeTemplateName = nodeTemplateName;
        this.requirementName = requirementName;
    }
}

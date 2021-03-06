/*
 * The Jira Cloud platform REST API
 * Jira Cloud platform REST API documentation
 *
 * The version of the OpenAPI document: 1001.0.0-SNAPSHOT
 * Contact: ecosystem@atlassian.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datengaertnerei.jira.rest.client.api;

import com.datengaertnerei.jira.rest.client.ApiException;
import com.datengaertnerei.jira.rest.client.model.FieldConfigurationSchemeProjectAssociation;
import com.datengaertnerei.jira.rest.client.model.PageBeanFieldConfiguration;
import com.datengaertnerei.jira.rest.client.model.PageBeanFieldConfigurationIssueTypeItem;
import com.datengaertnerei.jira.rest.client.model.PageBeanFieldConfigurationItem;
import com.datengaertnerei.jira.rest.client.model.PageBeanFieldConfigurationScheme;
import com.datengaertnerei.jira.rest.client.model.PageBeanFieldConfigurationSchemeProjects;
import java.util.Set;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssueFieldConfigurationsApi
 */
@Ignore
public class IssueFieldConfigurationsApiTest {

    private final IssueFieldConfigurationsApi api = new IssueFieldConfigurationsApi();

    
    /**
     * Assign field configuration scheme to project
     *
     * Assigns a field configuration scheme to a project. If the field configuration scheme ID is &#x60;null&#x60;, the operation assigns the default field configuration scheme.  Field configuration schemes can only be assigned to classic projects.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void assignFieldConfigurationSchemeToProjectTest() throws ApiException {
        FieldConfigurationSchemeProjectAssociation fieldConfigurationSchemeProjectAssociation = null;
        Object response = api.assignFieldConfigurationSchemeToProject(fieldConfigurationSchemeProjectAssociation);

        // TODO: test validations
    }
    
    /**
     * Get all field configuration schemes
     *
     * Returns a [paginated](#pagination) list of field configuration schemes.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFieldConfigurationSchemesTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> id = null;
        PageBeanFieldConfigurationScheme response = api.getAllFieldConfigurationSchemes(startAt, maxResults, id);

        // TODO: test validations
    }
    
    /**
     * Get all field configurations
     *
     * Returns a [paginated](#pagination) list of all field configurations.  Only field configurations used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllFieldConfigurationsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> id = null;
        Boolean isDefault = null;
        String query = null;
        PageBeanFieldConfiguration response = api.getAllFieldConfigurations(startAt, maxResults, id, isDefault, query);

        // TODO: test validations
    }
    
    /**
     * Get field configuration items
     *
     * Returns a [paginated](#pagination) list of all fields for a configuration.  Only the fields from configurations used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldConfigurationItemsTest() throws ApiException {
        Long id = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanFieldConfigurationItem response = api.getFieldConfigurationItems(id, startAt, maxResults);

        // TODO: test validations
    }
    
    /**
     * Get field configuration issue type items
     *
     * Returns a [paginated](#pagination) list of field configuration issue type items.  Only items used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldConfigurationSchemeMappingsTest() throws ApiException {
        Long startAt = null;
        Integer maxResults = null;
        Set<Long> fieldConfigurationSchemeId = null;
        PageBeanFieldConfigurationIssueTypeItem response = api.getFieldConfigurationSchemeMappings(startAt, maxResults, fieldConfigurationSchemeId);

        // TODO: test validations
    }
    
    /**
     * Get field configuration schemes for projects
     *
     * Returns a [paginated](#pagination) list of field configuration schemes and, for each scheme, a list of the projects that use it.  The list is sorted by field configuration scheme ID. The first item contains the list of project IDs assigned to the default field configuration scheme.  Only field configuration schemes used in classic projects are returned.  **[Permissions](#permissions) required:** *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getFieldConfigurationSchemeProjectMappingTest() throws ApiException {
        Set<Long> projectId = null;
        Long startAt = null;
        Integer maxResults = null;
        PageBeanFieldConfigurationSchemeProjects response = api.getFieldConfigurationSchemeProjectMapping(projectId, startAt, maxResults);

        // TODO: test validations
    }
    
}

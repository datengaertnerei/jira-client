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
import com.datengaertnerei.jira.rest.client.model.BulkIssuePropertyUpdateRequest;
import com.datengaertnerei.jira.rest.client.model.EntityProperty;
import com.datengaertnerei.jira.rest.client.model.ErrorCollection;
import com.datengaertnerei.jira.rest.client.model.IssueEntityProperties;
import com.datengaertnerei.jira.rest.client.model.IssueFilterForBulkPropertyDelete;
import com.datengaertnerei.jira.rest.client.model.PropertyKeys;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IssuePropertiesApi
 */
@Ignore
public class IssuePropertiesApiTest {

    private final IssuePropertiesApi api = new IssuePropertiesApi();

    
    /**
     * Bulk delete issue property
     *
     * Deletes a property value from multiple issues. The issues to be updated can be specified by filter criteria.  The criteria the filter used to identify eligible issues are:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  If both criteria is specified, they are joined with the logical *AND*: only issues that satisfy both criteria are considered eligible.  If no filter criteria are specified, all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either the property is deleted from all eligible issues or, when errors occur, no properties are deleted.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [ project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkDeleteIssuePropertyTest() throws ApiException {
        String propertyKey = null;
        IssueFilterForBulkPropertyDelete issueFilterForBulkPropertyDelete = null;
        api.bulkDeleteIssueProperty(propertyKey, issueFilterForBulkPropertyDelete);

        // TODO: test validations
    }
    
    /**
     * Bulk set issue property
     *
     * Sets a property value on multiple issues.  The value set can be a constant or determined by a [Jira expression](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/). Expressions must be computable with constant complexity when applied to a set of issues. Expressions must also comply with the [restrictions](https://developer.atlassian.com/cloud/jira/platform/jira-expressions/#restrictions) that apply to all Jira expressions.  The issues to be updated can be specified by a filter.  The filter identifies issues eligible for update using these criteria:   *  &#x60;entityIds&#x60; Only issues from this list are eligible.  *  &#x60;currentValue&#x60; Only issues with the property set to this value are eligible.  *  &#x60;hasProperty&#x60;:           *  If *true*, only issues with the property are eligible.      *  If *false*, only issues without the property are eligible.  If more than one criteria is specified, they are joined with the logical *AND*: only issues that satisfy all criteria are eligible.  If an invalid combination of criteria is provided, an error is returned. For example, specifying a &#x60;currentValue&#x60; and &#x60;hasProperty&#x60; as *false* would not match any issues (because without the property the property cannot have a value).  The filter is optional. Without the filter all the issues visible to the user and where the user has the EDIT\\_ISSUES permission for the issue are considered eligible.  This operation is:   *  transactional, either all eligible issues are updated or, when errors occur, none are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for each project containing issues.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.  *  *Edit issues* [project permission](https://confluence.atlassian.com/x/yodKLg) for each issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkSetIssuePropertyTest() throws ApiException {
        String propertyKey = null;
        BulkIssuePropertyUpdateRequest bulkIssuePropertyUpdateRequest = null;
        api.bulkSetIssueProperty(propertyKey, bulkIssuePropertyUpdateRequest);

        // TODO: test validations
    }
    
    /**
     * Bulk set issues properties
     *
     * Sets the values of entity properties on issues. It can set up to 10 entity properties on up to 10,000 issues.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON. The maximum length of single issue property value is 32768 characters. This operation can be accessed anonymously.  This operation is:   *  transactional, either all properties are updated in all eligible issues or, when errors occur, no properties are updated.  *  [asynchronous](#async). Follow the &#x60;location&#x60; link in the response to determine the status of the task and use [Get task](#api-rest-api-3-task-taskId-get) to obtain subsequent updates.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void bulkSetIssuesPropertiesTest() throws ApiException {
        IssueEntityProperties issueEntityProperties = null;
        api.bulkSetIssuesProperties(issueEntityProperties);

        // TODO: test validations
    }
    
    /**
     * Delete issue property
     *
     * Deletes an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteIssuePropertyTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        api.deleteIssueProperty(issueIdOrKey, propertyKey);

        // TODO: test validations
    }
    
    /**
     * Get issue property
     *
     * Returns the key and value of an issue&#39;s property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuePropertyTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        EntityProperty response = api.getIssueProperty(issueIdOrKey, propertyKey);

        // TODO: test validations
    }
    
    /**
     * Get issue property keys
     *
     * Returns the URLs and keys of an issue&#39;s properties.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** Property details are only returned where the user has:   *  *Browse projects* [project permission](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIssuePropertyKeysTest() throws ApiException {
        String issueIdOrKey = null;
        PropertyKeys response = api.getIssuePropertyKeys(issueIdOrKey);

        // TODO: test validations
    }
    
    /**
     * Set issue property
     *
     * Sets the value of an issue&#39;s property. Use this resource to store custom data against an issue.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:**   *  *Browse projects* and *Edit issues* [project permissions](https://confluence.atlassian.com/x/yodKLg) for the project containing the issue.  *  If [issue-level security](https://confluence.atlassian.com/x/J4lKLg) is configured, issue-level security permission to view the issue.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void setIssuePropertyTest() throws ApiException {
        String issueIdOrKey = null;
        String propertyKey = null;
        Object body = null;
        Object response = api.setIssueProperty(issueIdOrKey, propertyKey, body);

        // TODO: test validations
    }
    
}
